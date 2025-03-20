/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Main.WorkSpaceProfiles.OrderManagement;

import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.Order;
import TheBusiness.SalesManagement.SalesPersonProfile;
import UserInterface.Main.WorkSpaceProfiles.SalesPersonWorkAreaJPanel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srivarinimandali
 */
public class CheckOrderStatus extends javax.swing.JPanel {
    private SalesPersonProfile loggedInSalesperson;
    javax.swing.JPanel CardSequencePanel;
    Business business;
    /**
     * Creates new form CheckOrderStatus
     */
    public CheckOrderStatus(Business business,JPanel CardSequencePanel,SalesPersonProfile loggedInSalesperson) {
        this.business = business;
        this.CardSequencePanel= CardSequencePanel;
        this.loggedInSalesperson = loggedInSalesperson;
        initComponents();
        loadSalespersonOrders();
    }
      private void loadSalespersonOrders() {
        // Assuming you have a method to get all orders
        if (loggedInSalesperson != null) {
        ArrayList<Order> salespersonOrders = loggedInSalesperson.salesorders;
        populateTable(salespersonOrders);
    } else {
        // Handle the case when loggedInSalesperson is null
        JOptionPane.showMessageDialog(this, "Salesperson data is not available.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    public void populateTable(ArrayList<Order> orderList) {
        DefaultTableModel model = (DefaultTableModel) tblCheckorderStatus.getModel();
        model.setRowCount(0); // Clear existing data

        for (Order order : orderList) {
            Object[] row = new Object[5];
            row[0] = order.getModelNumber();
            row[1] = formatDate(order.getIssueDate());
            row[2] = formatDate(order.getShippingDate());
            row[3] = formatDate(order.getCompletionDate());
            row[4] = order.getStatus();

            model.addRow(row);
        }
    }
    private String formatDate(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCheckorderStatus = new javax.swing.JTable();
        btnUpdateOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Check Order Status");

        tblCheckorderStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Date Started", "Shipping Date", "Date Completed", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCheckorderStatus);

        btnUpdateOrder.setText("Update Order");
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateOrder))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SalesPersonWorkAreaJPanel salesPersonWorkAreaPanel = new SalesPersonWorkAreaJPanel(business, loggedInSalesperson, CardSequencePanel);
     CardSequencePanel.add("SalesPersonWorkAreaJPanel", salesPersonWorkAreaPanel);
     ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
            int selectedRow = tblCheckorderStatus.getSelectedRow();
        if (selectedRow >= 0) {
            Order selectedOrder = loggedInSalesperson.salesorders.get(selectedRow);
            UpdateOrderJPanel updateOrderPanel = new UpdateOrderJPanel(loggedInSalesperson, selectedOrder, this::loadSalespersonOrders, CardSequencePanel, business);
            CardSequencePanel.add("UpdateOrderJPanel", updateOrderPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an order to update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCheckorderStatus;
    // End of variables declaration//GEN-END:variables
}
