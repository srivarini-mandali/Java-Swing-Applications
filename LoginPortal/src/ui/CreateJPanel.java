/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.ListofUsers;
import model.Login;
import model.PasswordHasher;

/**
 *
 * @author srivarinimandali
 */
public class CreateJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private ListofUsers listofUsers;   

    CreateJPanel(JPanel workArea, ListofUsers listofUsers) {
                initComponents();
                this.workArea=workArea;
                this.listofUsers=listofUsers;
                // Set the initial state of the NUID field based on the initial role
    String initialRole = (String) txtRoleCombo.getSelectedItem();
    if ("Admin".equals(initialRole)) {
        txtNUID.setEnabled(false);
    } else {
        txtNUID.setEnabled(true);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        lblTitle = new javax.swing.JLabel();
        lblNUID = new javax.swing.JLabel();
        txtNUID = new javax.swing.JTextField();
        lblStudentName = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCreateUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtRoleCombo = new javax.swing.JComboBox<>();
        lblRole = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(207, 151, 106));

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitle.setText("                                       CREATE USER");

        lblNUID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblNUID.setText("NUID :");

        lblStudentName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblStudentName.setText("Student Name :");

        lblEmailID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblEmailID.setText("Email ID :");

        lblUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblUsername.setText("Username :");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblPassword.setText("Password :");

        btnCreateUser.setText("Create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtRoleCombo.setEditable(true);
        txtRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular User", "Admin" }));
        txtRoleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoleComboActionPerformed(evt);
            }
        });

        lblRole.setText("Role:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 151, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailID)
                            .addComponent(lblStudentName)
                            .addComponent(lblUsername)
                            .addComponent(lblNUID)
                            .addComponent(lblPassword)
                            .addComponent(lblRole))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmailID, lblNUID, lblPassword, lblRole, lblStudentName, lblUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmailID, txtNUID, txtPassword, txtStudentName, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(txtRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNUID))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentName))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateUser)
                    .addComponent(btnBack))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEmailID, lblNUID, lblPassword, lblRole, lblStudentName, lblUsername});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmailID, txtNUID, txtPassword, txtStudentName, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
    String nuid = txtNUID.getText();
    String studentName = txtStudentName.getText();
    String emailId = txtEmailID.getText();
    String userName = txtUsername.getText();
    String password = txtPassword.getText();

    // Validate the fields
     if (!isValidNUID(nuid)&& txtRoleCombo.getSelectedItem().equals("Regular User")) {
        JOptionPane.showMessageDialog(this, "Invalid NU ID. It should be 6 digits.", "Invalid NU ID", JOptionPane.ERROR_MESSAGE);
    } 
     else if (!isValidStudentName(studentName)) {
        JOptionPane.showMessageDialog(this, "Invalid student name. It should contain alphabets and spaces only, and be at least 2 characters long.", "Invalid Student Name", JOptionPane.ERROR_MESSAGE);
    } else if (!isValidEmail(emailId)) {
        JOptionPane.showMessageDialog(this, "Invalid email ID format.", "Invalid Email ID", JOptionPane.ERROR_MESSAGE);
    } else if (!isValidUsername(userName)) {
        JOptionPane.showMessageDialog(this, "Invalid username. It should be between 6 and 20 characters.", "Invalid Username", JOptionPane.ERROR_MESSAGE);
    } else if (listofUsers.isPasswordInHistory(password)) {
            JOptionPane.showMessageDialog(this, "Password cannot be one of the previous passwords.", "Invalid Password", JOptionPane.ERROR_MESSAGE);
        } else {
        String hashedPassword = PasswordHasher.hashPassword(password);

        // Add the new user
        Login addUser = listofUsers.addUser(hashedPassword);
         if ("Admin".equals(txtRoleCombo.getSelectedItem())) {
            addUser.setNuid(0); // Set NUID to null when Admin is selected
        } else {
            addUser.setNuid(Integer.parseInt(nuid));
        }
        addUser.setStudentName(studentName);
        addUser.setEmailID(emailId);
        addUser.setUsername(userName);
        addUser.setOriginalPassword(password);
        // Set the hashed password
        addUser.setPassword(hashedPassword);
        addUser.setRole((String)txtRoleCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null, "User added");

        // Clear the input fields
        txtNUID.setText("");
        txtStudentName.setText("");
        txtEmailID.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    // Helper method to validate username
private boolean isValidUsername(String username) {
    // Add your username validation logic here
    // For example, you can check if the username meets your criteria (e.g., length, characters allowed)
    return username.length() >= 6 && username.length() <= 20;
}

// Helper method to validate password
private boolean isValidPassword(String password) {
    // Add your password validation logic here
    // For example, you can check if the password meets your criteria (e.g., length)
    return password.length() >= 8;
}
// Helper method to validate NU ID
private boolean isValidNUID(String nuid) {
    // NU ID format: 8 digits
    return nuid.matches("\\d{6}");
}

// Helper method to validate student name
private boolean isValidStudentName(String studentName) {
    // Student name format: Alphabets and spaces only, at least 2 characters
    return studentName.matches("[a-zA-Z\\s]{2,}");
}

// Helper method to validate email ID
private boolean isValidEmail(String email) {
    // Email validation regex pattern
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(emailRegex);
}
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRoleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoleComboActionPerformed
        // TODO add your handling code here:
        String selectedRole = (String) txtRoleCombo.getSelectedItem();
    
    if ("Admin".equals(selectedRole)) {
        txtNUID.setEditable(false);
    } else {
        txtNUID.setEditable(true);
        txtNUID.setText(""); 
    }
    }//GEN-LAST:event_txtRoleComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblNUID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtNUID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JComboBox<String> txtRoleCombo;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
