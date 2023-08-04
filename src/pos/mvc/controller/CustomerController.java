/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import pos.mvc.model.CustomerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import pos.mvc.db.DBConnection;

/**
 *
 * @author Buddika Isuranga
 */
public class CustomerController {

    public String saveCustomer(CustomerModel customer) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        String query = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setNString(1, customer.getCustId());
        preparedStatement.setNString(2, customer.getTitle());
        preparedStatement.setNString(3, customer.getName());
        preparedStatement.setNString(4, customer.getDob());
        preparedStatement.setNString(5, customer.getSalary());
        preparedStatement.setNString(6, customer.getAddress());
        preparedStatement.setNString(7, customer.getCity());
        preparedStatement.setNString(8, customer.getProvince());
        preparedStatement.setNString(9, customer.getZip());

        if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public ArrayList<CustomerModel> getAllCustomers() throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "Select * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet rst = statement.executeQuery();

        ArrayList<CustomerModel> customerModels = new ArrayList<>();

        while (rst.next()) {
            CustomerModel cm = new CustomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            customerModels.add(cm);
        }
        return customerModels;
    }

    public CustomerModel getCustomer(String custId) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "Select * FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, custId);

        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            CustomerModel cm = new CustomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            return cm;

        }
        return null;
    }

    public String updateCustomer(CustomerModel customerModel) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "UPDATE Customer SET CustTitle =?, CustName=?, DOB=?, salary = ?, custAddress=?, City=?, Province=?, PostalCode=? WHERE CustID=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setNString(1, customerModel.getTitle());
        preparedStatement.setNString(2, customerModel.getName());
        preparedStatement.setNString(3, customerModel.getDob());
        preparedStatement.setNString(4, customerModel.getSalary());
        preparedStatement.setNString(5, customerModel.getAddress());
        preparedStatement.setNString(6, customerModel.getCity());
        preparedStatement.setNString(7, customerModel.getProvince());
        preparedStatement.setNString(8, customerModel.getZip());
        preparedStatement.setNString(9, customerModel.getCustId());
        
          if (preparedStatement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }

    }
}
