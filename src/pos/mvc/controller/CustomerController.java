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
    
    public String saveCustomer(CustomerModel customer)throws SQLException{
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
}
