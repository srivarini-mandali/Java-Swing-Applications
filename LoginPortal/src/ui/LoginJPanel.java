/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.ListofUsers;
import model.Login;

/**
 *
 * @author srivarinimandali
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private ListofUsers listofUsers;
    private Login login;
    private ManageUserJPanel manageUserPanel;

    LoginJPanel(JPanel workArea, ListofUsers listofUsers) {
        initComponents();
        this.workArea = workArea;
        this.listofUsers = listofUsers;
        this.manageUserPanel = new ManageUserJPanel(workArea, listofUsers); // Initialize the ManageUserJPanel

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtPwdField = new javax.swing.JPasswordField();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(171, 188, 207));

        lblUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        btnSubmit.setBackground(new java.awt.Color(204, 204, 204));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitle.setText("                                   LOGIN USER");

        txtPwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(lblUsername))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit))
                        .addGap(0, 145, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPassword, lblUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblTitle)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(69, 69, 69)
                .addComponent(btnSubmit)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPassword, lblUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        // Get the user input
        String username = txtUsername.getText();
        String password = new String(txtPwdField.getPassword());

        // Validate the fields
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password are required.");
        } else if (username.length() < 6 || username.length() > 20) {
            JOptionPane.showMessageDialog(this, "Username must be between 6 and 20 characters.");
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters.");
        } else {
            // Perform login logic here
            boolean result = false;
            Login loggedInUser = new Login();

            // Iterate through the list of users to check for a valid login
            for (int i = 0; i < listofUsers.getListOfUsers().size(); i++) {
                String storedUsername = listofUsers.getListOfUsers().get(i).getUsername();
                String storedPassword = listofUsers.getListOfUsers().get(i).getOriginalPassword();
                String role = listofUsers.getListOfUsers().get(i).getRole();
                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    if ("Regular User".equals(role)) { // Check if the role is "admin"
                        result = true;
                        loggedInUser.setUsername(username);
                        loggedInUser.setPassword(password); // Convert char[] to String
                        loggedInUser.setNuid(listofUsers.getListOfUsers().get(i).getNuid());
                        loggedInUser.setStudentName(listofUsers.getListOfUsers().get(i).getStudentName());
                        loggedInUser.setEmailID(listofUsers.getListOfUsers().get(i).getEmailID());
                        loggedInUser.setRole(listofUsers.getListOfUsers().get(i).getRole());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Admin users are not allowed to log in.");

                    }

                }
            }

            if (result) {
                JOptionPane.showMessageDialog(this, "Login Success");

                // Create the ViewJPanel with the initialized login object
                ViewJPanel viewJPanel = new ViewJPanel(workArea, loggedInUser, manageUserPanel, listofUsers);

                // Add the panel to the work area
                workArea.add("ViewJPanel", viewJPanel);

                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);

            } else {
                JOptionPane.showMessageDialog(this, "Login failed");
            }

            // Clear the input fields
            txtUsername.setText("");
            txtPwdField.setText("");
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwdFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPwdFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPwdField;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
