/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main.WorkSpaceProfiles.OrderManagement;


import TheBusiness.Business.Business;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderSummary;
import TheBusiness.ProductManagement.Product;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.Supplier.Supplier;
import UserInterface.Main.WorkSpaceProfiles.BusinessManagerWorkAreaJPanel;
import UserInterface.Main.WorkSpaceProfiles.SalesPersonWorkAreaJPanel;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kal bugrara
 */
public class ManageSalesPersonOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    SalesPersonProfile salesperson;


    public ManageSalesPersonOrders(Business bz, SalesPersonProfile spp, JPanel jp) {
        this.CardSequencePanel = jp;
        this.business = bz;
        this.salesperson = spp; // Store the salesperson profile.

        initComponents();
        populateOrderTable();

    }
    
    private void populateOrderTable() {
     DefaultTableModel model = (DefaultTableModel) SupplierCatalogTable.getModel();
        model.setRowCount(0); // Clear existing rows

        // Fetch order information specific to the logged-in salesperson
        List<Order> salesPersonOrders = salesperson.salesorders; // Assuming SalesPersonProfile has a method getSalesOrders

        for (Order order : salesPersonOrders) {
            OrderSummary summary = new OrderSummary(order);
            Object[] row = {
                order.getModelNumber(),
                order.getStatus(),
                summary.getSalesvolume(),
                order.getCustomer().getPerson()
            };
            model.addRow(row);
        }
    
}
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order id", "Status", "Sales Volume", "Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierCatalogTable);

        jScrollPane2.setViewportView(jScrollPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 123, 580, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Browse Orders");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 550, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Orders");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

     SalesPersonWorkAreaJPanel salesPersonWorkAreaPanel = new SalesPersonWorkAreaJPanel(business, salesperson, CardSequencePanel);

    CardSequencePanel.removeAll();
    CardSequencePanel.add("SalesPersonWorkAreaJPanel", salesPersonWorkAreaPanel);
    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_BackActionPerformed
 
    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed
        // TODO add your handling code 
    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
