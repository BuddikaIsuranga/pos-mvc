/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.model.CustomerModel;

/**
 *
 * @author Buddika Isuranga
 */
public class CustomerView extends javax.swing.JFrame {

    private CustomerController customerController;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        customerController = new CustomerController();
        initComponents();
        loadAllCustomers();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        custidLabel = new javax.swing.JLabel();
        custidText = new javax.swing.JTextField();
        custTitalLabel = new javax.swing.JLabel();
        custTitleText = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custDOBLabel = new javax.swing.JLabel();
        custDOBText = new javax.swing.JTextField();
        custAddressLabel = new javax.swing.JLabel();
        custAddressText = new javax.swing.JTextField();
        custCityLabel = new javax.swing.JLabel();
        custCityText = new javax.swing.JTextField();
        custProvinceLabel = new javax.swing.JLabel();
        custProvinceText = new javax.swing.JTextField();
        custZipLabel = new javax.swing.JLabel();
        custZipText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        addButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        custSalaryLabel = new javax.swing.JLabel();
        custSalaryText = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerPanel.setText("Manage Customer");

        custidLabel.setText("Customer id");

        custTitalLabel.setText("Customer Title");

        custNameLabel.setText("Customer Name");

        custDOBLabel.setText("Customer DOB");

        custAddressLabel.setText("Address");

        custCityLabel.setText("City");

        custProvinceLabel.setText("Province");

        custZipLabel.setText("Postal Code");

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update Customer");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton1.setText("Save Customer");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setText("Delete Customer");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        custSalaryLabel.setText("Salary");

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(custidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                        .addComponent(custTitalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(custDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custDOBText)))
                .addGap(27, 27, 27)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(custSalaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(custNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addGap(194, 194, 194))
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custAddressText)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addComponent(custZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(custProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(custZipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custidLabel)
                    .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custTitalLabel)
                    .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custNameLabel)
                    .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custDOBLabel)
                    .addComponent(custDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custSalaryLabel)
                    .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custAddressLabel)
                    .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCityLabel)
                    .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custProvinceLabel)
                    .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custZipLabel)
                    .addComponent(custZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(addButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        saveCustomer();        // TODO add your handling code here:
    }//GEN-LAST:event_addButton1ActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        searchCustomer();

    }//GEN-LAST:event_CustomerTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton addButton1;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel custAddressLabel;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JLabel custCityLabel;
    private javax.swing.JTextField custCityText;
    private javax.swing.JLabel custDOBLabel;
    private javax.swing.JTextField custDOBText;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextField custNameText;
    private javax.swing.JLabel custProvinceLabel;
    private javax.swing.JTextField custProvinceText;
    private javax.swing.JLabel custSalaryLabel;
    private javax.swing.JTextField custSalaryText;
    private javax.swing.JLabel custTitalLabel;
    private javax.swing.JTextField custTitleText;
    private javax.swing.JLabel custZipLabel;
    private javax.swing.JTextField custZipText;
    private javax.swing.JLabel custidLabel;
    private javax.swing.JTextField custidText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JLabel headerPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
private void saveCustomer() {
        CustomerModel customer = new CustomerModel(
                custidText.getText(),
                custTitleText.getText(),
                custNameText.getText(),
                custDOBText.getText(),
                custSalaryText.getText(),
                custAddressText.getText(),
                custCityText.getText(),
                custProvinceText.getText(),
                custZipText.getText());

        try {
            String resp = customerController.saveCustomer(customer);
            JOptionPane.showInputDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showInputDialog(this, ex.getMessage());
        }

    }

    private void clear() {
        custidText.setText("");
        custTitleText.setText("");
        custNameText.setText("");
        custDOBText.setText("");
        custSalaryText.setText("");
        custAddressText.setText("");
        custCityText.setText("");
        custProvinceText.setText("");
        custZipText.setText("");
    }

    private void loadAllCustomers() {
        try {
            String[] collumns = {"Id", "Name", "Address", "Salary", "Postal Code"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;

                }

            };
            CustomerTable.setModel(dtm);

            ArrayList<CustomerModel> customers = customerController.getAllCustomers();

            for (CustomerModel customer : customers) {
                Object[] rowData = {customer.getCustId(), customer.getTitle() + customer.getName(), customer.getAddress() + "," + customer.getCity(), customer.getSalary(), customer.getZip()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showInputDialog(this, ex.getMessage());
        }
    }

    private void searchCustomer() {
        try {
            String custId = CustomerTable.getValueAt(CustomerTable.getSelectedRow(), 0).toString();
            CustomerModel customerModel = customerController.getCustomer(custId);

            if (customerModel != null) {

                custidText.setText(customerModel.getCustId());
                custTitleText.setText(customerModel.getTitle());
                custNameText.setText(customerModel.getName());
                custDOBText.setText(customerModel.getDob());
                custSalaryText.setText(customerModel.getSalary());
                custAddressText.setText(customerModel.getAddress());
                custCityText.setText(customerModel.getCity());
                custProvinceText.setText(customerModel.getProvince());
                custZipText.setText(customerModel.getZip());

            } else {
                JOptionPane.showInputDialog(this, "Customer Not Found");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showInputDialog(this, ex.getMessage());
        }

    }

    public void updateCustomer() {

        try {
            CustomerModel customer = new CustomerModel(
                    custidText.getText(),
                    custTitleText.getText(),
                    custNameText.getText(),
                    custDOBText.getText(),
                    custSalaryText.getText(),
                    custAddressText.getText(),
                    custCityText.getText(),
                    custProvinceText.getText(),
                    custZipText.getText());

            String resp = customerController.updateCustomer(customer);
            JOptionPane.showInputDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showInputDialog(this, ex.getMessage());
        }
    }

    private void deleteCustomer() {
        try {
            String custId = custidText.getText();
            String resp = customerController.deleteCustomer(custId);
            JOptionPane.showInputDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showInputDialog(this, ex.getMessage());
        }
    }

}
