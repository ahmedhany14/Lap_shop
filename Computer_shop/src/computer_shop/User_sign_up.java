/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package computer_shop;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
data base done 
*/
/**
 *
 * @author ahmed hany
 */
public class User_sign_up extends javax.swing.JFrame {

    /**
     * Creates new form User_sign_up
     */
    static Connection con;
    static String hostuser = "root";
    static String hostpass = "root";
    static String add = "jdbc:mysql://localhost:3306/lapshop";
    public User_sign_up() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "feild to connect");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Phone_feild = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Email_Feild = new javax.swing.JTextField();
        User_name_feild1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirm_Password_feild = new javax.swing.JPasswordField();
        Password_feild1 = new javax.swing.JPasswordField();
        Creating_account = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();
        First_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Last_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(101, 153, 255));
        jLabel1.setText("Uesr name");

        jLabel2.setForeground(new java.awt.Color(101, 153, 255));
        jLabel2.setText("Email");

        jLabel3.setForeground(new java.awt.Color(101, 153, 255));
        jLabel3.setText("Phone number");

        jLabel4.setForeground(new java.awt.Color(101, 153, 255));
        jLabel4.setText("Password");

        jLabel5.setForeground(new java.awt.Color(101, 153, 255));
        jLabel5.setText("Confirm Password");

        Creating_account.setBackground(new java.awt.Color(101, 153, 255));
        Creating_account.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Creating_account.setText("Create new account");
        Creating_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Creating_accountActionPerformed(evt);
            }
        });

        Back_button.setBackground(new java.awt.Color(101, 153, 255));
        Back_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back_button.setText("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(101, 153, 255));
        jLabel6.setText("First name ");

        jLabel7.setForeground(new java.awt.Color(101, 153, 255));
        jLabel7.setText("Last name ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Creating_account, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(User_name_feild1)
                                    .addComponent(First_name)
                                    .addComponent(Phone_feild)
                                    .addComponent(Password_feild1)
                                    .addComponent(confirm_Password_feild)
                                    .addComponent(Email_Feild)
                                    .addComponent(Last_name, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email_Feild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User_name_feild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(First_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Phone_feild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_feild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm_Password_feild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Creating_account)
                .addGap(22, 22, 22)
                .addComponent(Back_button)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("empty-statement")
    private void Creating_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Creating_accountActionPerformed
        String mail = Email_Feild.getText();
        String user = User_name_feild1.getText();
        String First= First_name.getText();
        String Last = Last_name.getText();
        String Pass = Password_feild1.getText();
        String confirm_Password = confirm_Password_feild.getText();
        String Phone = Phone_feild.getText();
        if(mail.length() != 0 && user.length() != 0 && First.length() != 0 && Last.length() != 0 && Pass .length() != 0 && confirm_Password.length() != 0 && Phone.length() != 0 ){
            if(Pass.equals(confirm_Password)){                
                PreparedStatement stmt;
                PreparedStatement stmt_for_check_user = null;
                try {
                    stmt_for_check_user = con.prepareStatement("select *from usertable");
                } catch (SQLException ex) {
                    Logger.getLogger(User_sign_up.class.getName()).log(Level.SEVERE, null, ex);
                }
                ResultSet res = null;
                try {
                    res = stmt_for_check_user.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(User_sign_up.class.getName()).log(Level.SEVERE, null, ex);
                }
                boolean is_found = false;
                try {
                    while(res.next()){
                        if(res.getString(1).equals(user)){
                            is_found = true;
                        }
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(User_sign_up.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(is_found == true){
                    JOptionPane.showMessageDialog(this, "this user is used before please try again");
                }
                else {
                    try {
                        stmt = con.prepareStatement("insert into usertable (username,password,first_name ,last_name,email,telephone,total,lapcnt) values(?,?,?,?,?,?,?,?)");
                        stmt.setString(1, user);
                        stmt.setString(2, Pass);
                        stmt.setString(3, First);
                        stmt.setString(4, Last);
                        stmt.setString(5, mail);
                        stmt.setString(6, Phone);
                        stmt.setInt(7, 0);
                        stmt.setInt(8, 0);
                        stmt.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(User_sign_up.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Success");
                    this.setVisible(false);
                    new user_Login().setVisible(true);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Confirm password is not the same as password please try again");
             }
        }
        else {
            JOptionPane.showMessageDialog(this, "valid data please try again");
        }  
    }//GEN-LAST:event_Creating_accountActionPerformed
    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        this.setVisible(false);
        new user_Login().setVisible(true);
    }//GEN-LAST:event_Back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(User_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton Creating_account;
    private javax.swing.JTextField Email_Feild;
    private javax.swing.JTextField First_name;
    private javax.swing.JTextField Last_name;
    private javax.swing.JPasswordField Password_feild1;
    private javax.swing.JTextField Phone_feild;
    private javax.swing.JTextField User_name_feild1;
    private javax.swing.JPasswordField confirm_Password_feild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}