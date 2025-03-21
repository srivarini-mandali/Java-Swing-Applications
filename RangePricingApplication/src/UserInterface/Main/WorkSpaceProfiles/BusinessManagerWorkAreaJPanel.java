/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.Main.WorkSpaceProfiles;

import MarketAnalytics.AnalysisHelper;
import TheBusiness.Business.Business;
import UserInterface.Main.WorkSpaceProfiles.OrderManagement.PerformanceReportsJPanel;
import UserInterface.ManageTheBusiness.ManageTheBusinessJPanel;
import UserInterface.ProductManagement.AdminPerformanceReportsJPanel;
import UserInterface.ProductManagement.ManageCustomersJPanel;
import UserInterface.ProductManagement.ManagePriceJPanel;
import UserInterface.ProductManagement.ManageSalesJPanel;
import UserInterface.ProductManagement.ManageSuppliersJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class BusinessManagerWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    AnalysisHelper helper;

    /**
     * Creates new form UnitRiskWorkArea
     */

    public BusinessManagerWorkAreaJPanel(Business b, JPanel clp, AnalysisHelper helper) {

        this.business = b;
        this.CardSequencePanel = clp;
        this.helper = helper;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageSalesPersonnel = new javax.swing.JButton();
        btnManageSuppliers = new javax.swing.JButton();
        btnManagePrice = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        btnPerformanceReports = new javax.swing.JButton();

        setForeground(new java.awt.Color(51, 51, 51));

        btnManageSalesPersonnel.setBackground(new java.awt.Color(102, 153, 255));
        btnManageSalesPersonnel.setFont(getFont());
        btnManageSalesPersonnel.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSalesPersonnel.setText("Manage Sales Personnel");
        btnManageSalesPersonnel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSalesPersonnel.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageSalesPersonnel.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageSalesPersonnel.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageSalesPersonnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSalesPersonnelActionPerformed(evt);
            }
        });

        btnManageSuppliers.setBackground(new java.awt.Color(102, 153, 255));
        btnManageSuppliers.setFont(getFont());
        btnManageSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSuppliers.setText("Manage Suppliers");
        btnManageSuppliers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSuppliers.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageSuppliers.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageSuppliers.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        btnManagePrice.setBackground(new java.awt.Color(102, 153, 255));
        btnManagePrice.setFont(getFont());
        btnManagePrice.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePrice.setText("Manage Prices");
        btnManagePrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePrice.setMaximumSize(new java.awt.Dimension(145, 40));
        btnManagePrice.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManagePrice.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManagePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePriceIdentifyEventsActionPerformed(evt);
            }
        });

        btnManageCustomers.setBackground(new java.awt.Color(102, 153, 255));
        btnManageCustomers.setFont(getFont());
        btnManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCustomers.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageCustomers.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageCustomers.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnPerformanceReports.setBackground(new java.awt.Color(102, 153, 255));
        btnPerformanceReports.setFont(getFont());
        btnPerformanceReports.setForeground(new java.awt.Color(255, 255, 255));
        btnPerformanceReports.setText("Performance Reports");
        btnPerformanceReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPerformanceReports.setMaximumSize(new java.awt.Dimension(200, 40));
        btnPerformanceReports.setMinimumSize(new java.awt.Dimension(20, 20));
        btnPerformanceReports.setPreferredSize(new java.awt.Dimension(240, 25));
        btnPerformanceReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformanceReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageSalesPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManagePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageSalesPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManagePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSalesPersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSalesPersonnelActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.removeAll();
         ManageSalesJPanel manageSales = new ManageSalesJPanel(business, CardSequencePanel, helper);

        CardSequencePanel.add("ManageSalesJPanel", manageSales);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnManageSalesPersonnelActionPerformed

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
        // TODO add your handling code here:
               CardSequencePanel.removeAll();

        ManageSuppliersJPanel iet = new ManageSuppliersJPanel(business, CardSequencePanel, helper);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnManagePriceIdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePriceIdentifyEventsActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
          ManagePriceJPanel managePrice = new ManagePriceJPanel(business, CardSequencePanel, helper);

        CardSequencePanel.add("ManagePriceJPanel", managePrice);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnManagePriceIdentifyEventsActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();

        ManageCustomersJPanel manageCustomers = new ManageCustomersJPanel(business,CardSequencePanel, helper);
        CardSequencePanel.add("ManageCustomers",manageCustomers);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnPerformanceReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformanceReportsActionPerformed
        // TODO add your handling code here:
       CardSequencePanel.removeAll();

        AdminPerformanceReportsJPanel performanceReport = new AdminPerformanceReportsJPanel(business,CardSequencePanel, helper);
        CardSequencePanel.add("AdminPerformanceReportsJPanel",performanceReport);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnPerformanceReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManagePrice;
    private javax.swing.JButton btnManageSalesPersonnel;
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnPerformanceReports;
    // End of variables declaration//GEN-END:variables

}
