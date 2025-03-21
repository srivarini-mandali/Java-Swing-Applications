/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.StudentWorkArea;

import Business.Business;
import Business.UserAccount;
import UI.main.MainJFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author renuka
 */
public class StudentLoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentLoginJFrame
     */
    Business business;
    UserAccount useraccount;
    public StudentLoginJFrame() {
        initComponents();
    }
       public StudentLoginJFrame(Business business,UserAccount useraccount) {
        initComponents();
         this.setVisible(true);
        this.business = business;
        this.useraccount = useraccount;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStudentLogin = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudentLogin.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        lblStudentLogin.setForeground(new java.awt.Color(30, 76, 216));
        lblStudentLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentLogin.setText("STUDENT LOGIN");
        jPanel1.add(lblStudentLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 800, 40));

        lblUserName.setFont(new java.awt.Font("Baskerville", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(30, 76, 216));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("User Name :");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 150, -1));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 290, 30));

        lblPassword.setFont(new java.awt.Font("Baskerville", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(30, 76, 216));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password :");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 150, 30));

        btnLogin.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(30, 76, 216));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 130, 40));

        btnBack.setFont(new java.awt.Font("Charter", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(30, 76, 216));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 120, 40));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Newsletter+++Blog+Post+(1).gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
               char[] passwordChars = txtPassword.getPassword(); // Retrieve the entered password
               String password = new String(passwordChars); 
        
                if(this.business.getCommonUserAccountDirectory().authenticateUser(txtUserName.getText(), password) != null) 
                {         UserAccount user = this.business.getCommonUserAccountDirectory().authenticateUser(txtUserName.getText(), password);
                        
//             user.getRole().getWorkArea(business, user);
            this.setVisible(false) ;
           new StudentJFrame(business, user);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Enter correct credentials");
                }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new MainJFrame(this.business,this.useraccount) ;
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
            java.util.logging.Logger.getLogger(StudentLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStudentLogin;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
