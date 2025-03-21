/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.SystemAdmin;

import Business.Business;
import Business.UserAccount;
import Degree.Degree;
import UI.main.MainJFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 18572
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    Business business;
    UserAccount useraccount;
    public AddStudent() {
        initComponents();
    }

    public AddStudent(Business business,UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
        this.useraccount = useraccount;
        populateDegreeComboBox() ;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblDegree = new javax.swing.JLabel();
        comboBoxDegree = new javax.swing.JComboBox<>();
        lblAddStudent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblUserName.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("UserName :");

        lblPassword.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password :");

        btnAdd.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(30, 76, 216));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("ID :");

        lblFirstName.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name :");

        lblLastName.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name :");

        lblEmail.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email :");

        btnLogout.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(30, 76, 216));
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(30, 76, 216));
        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblDegree.setFont(new java.awt.Font("Baskerville", 1, 18)); // NOI18N
        lblDegree.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDegree.setText("Degree :");

        lblAddStudent.setBackground(new java.awt.Color(255, 255, 255));
        lblAddStudent.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        lblAddStudent.setForeground(new java.awt.Color(32, 78, 216));
        lblAddStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddStudent.setText("ADD STUDENT");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/f46c4f0c2842ed57ac3670e35faaa411.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnLogout)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtId)
                                    .addComponent(txtLastName)
                                    .addComponent(txtEmail)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword)
                                    .addComponent(comboBoxDegree, 0, 280, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(157, 157, 157))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDegree)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comboBoxDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnLogout))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateDegreeComboBox()
    {
     comboBoxDegree.removeAllItems();
        
      for(Degree b:this.business.getDegreeDirectory().getDegreeList())
      {
        comboBoxDegree.addItem(b.getName()) ;
      }
    
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    // Retrieve user input from text fields and combo box
    String username = txtUserName.getText();
    String password = txtPassword.getText();
    String firstName = txtFirstName.getText();
    String lastName = txtLastName.getText();
    String email = txtEmail.getText();
    String degreeName = comboBoxDegree.getSelectedItem().toString();
    long id;

    // Check if the ID is a valid number
    try {
        id = Long.parseLong(txtId.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid ID.");
        return; // Exit the method.
    }

    // Check for empty fields
    if (username.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
        return; // Exit the method.
    }

    // Validate the email address
    if (!isValidEmail(email)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
        return; // Exit the method.
    }

    // Password strength validation (you can customize this)
    if (!isStrongPassword(password)) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long and contain letters, numbers, and special characters.");
        return; // Exit the method.
    }

    // Username and password format validations (customize as needed)
    if (!isValidUsername(username)) {
        JOptionPane.showMessageDialog(null, "Username format is invalid.");
        return; // Exit the method.
    }

    // Check if the combination of username and password is unique
    if (this.business.isAccountUniquecommondir(username, password)) {
        // Find the selected degree object by name
        Degree degree = this.business.getDegreeDirectory().findByName(degreeName);

        // Create a new user account
        UserAccount user = this.business.getCommonUserAccountDirectory().createUserAccount(username, password);

        // Create a student object and add it to the directory
        this.business.getStudentDirectory().addStudent(username, password, id, firstName, lastName, email, degree);
        JOptionPane.showMessageDialog(null, "Student registered successfully.");
    } else {
        JOptionPane.showMessageDialog(null, "Create a unique Username and Password.");
    }
    
}

// Helper method to validate email using regular expressions
private boolean isValidEmail(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}

// Helper method for password strength validation (customize as needed)
private boolean isStrongPassword(String password) {
    // Customize this method to implement your password strength requirements
    return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");
}

// Helper method for username format validation (customize as needed)
private boolean isValidUsername(String username) {
    // Customize this method to implement your username format requirements
    return username.matches("^[a-zA-Z0-9_-]{3,20}$");


        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    // Retrieve user input from text fields and combo box
    String username = txtUserName.getText();
    String password = txtPassword.getText();
    String firstName = txtFirstName.getText();
    String lastName = txtLastName.getText();
    String email = txtEmail.getText();
    String degreeName = comboBoxDegree.getSelectedItem().toString();
    long id;

    // Check if the ID is a valid number
    try {
        id = Long.parseLong(txtId.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid ID.");
        return; // Exit the method.
    }

    // Check for empty fields
    if (username.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
        return; // Exit the method.
    }

    // Validate the email address
    if (!isValidEmail(email)) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
        return; // Exit the method.
    }

    // Password strength validation (you can customize this)
    if (!isStrongPassword(password)) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long and contain letters, numbers, and special characters.");
        return; // Exit the method.
    }

    // Username and password format validations (customize as needed)
    if (!isValidUsername(username)) {
        JOptionPane.showMessageDialog(null, "Username format is invalid.");
        return; // Exit the method.
    }

    // Check if the combination of username and password is unique
    if (this.business.isAccountUniquecommondir(username, password)) {
        // Find the selected degree object by name
        Degree degree = this.business.getDegreeDirectory().findByName(degreeName);

        // Create a new user account
        UserAccount user = this.business.getCommonUserAccountDirectory().createUserAccount(username, password);

        // Create a student object and add it to the directory
        this.business.getStudentDirectory().addStudent(username, password, id, firstName, lastName, email, degree);
        JOptionPane.showMessageDialog(null, "Student registered successfully.");

        // Clear the input fields and reset the combo box
        txtUserName.setText("");
        txtPassword.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtId.setText("");
        comboBoxDegree.setSelectedIndex(0); // Reset to the first item
    } else {
        JOptionPane.showMessageDialog(null, "Create a unique Username and Password.");
    }


    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new CRUDstudent(business, useraccount) ;
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> comboBoxDegree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddStudent;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
