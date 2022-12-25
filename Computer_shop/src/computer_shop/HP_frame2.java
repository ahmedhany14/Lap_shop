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

/**
 *
 * @author ahmed hany
 */
public class HP_frame2 extends javax.swing.JFrame {

    /**
     * Creates new form HP_frame2
     */
    static Connection con;
    static String hostuser = "root";
    static String hostpass = "root";  
    static String add = "jdbc:mysql://localhost:3306/lapshop";
    user_Login ob = new user_Login();
    boolean is_avalap1 = false;
    boolean is_avalap2 = false;
    int hpprice3 , hpprice4;
    
    int counterlaps1 = 0,numberoflapsishere1 = 0;
    int counterlaps2 = 0,numberoflapsishere2 = 0;
    
    int totalprice = 0,totallaps = 0;
    public HP_frame2() {
        initComponents();
        this.setLocationRelativeTo(null);
        String text="<html>";
        text+="HP 15.6in Laptop (Intel Pentium Quad-Core N5000<br>";
        text+=",4GB RAM, 128GB SSD, HDMI, WiFi,<br>";
        text+="Bluetooth, HD Webcam, Windows 10 S)<br>";
        lab1.setText(text);
        String text2="<html>";
        text2+="HP Victus 15-fa0031dx Gaming Laptop - 12th<br>";
        text2+="i5-12450H 8-Cores , 8GB RAM, 512GB SSD,<br>";
        text2+="Nvidia GeForce GTX 1650 4GB GDDR6<br>";
        text2+="Graphics, 15.6, FHD ( 1920x1080) 144Hz,<br>";
        text2+="Backlit Keyboard, Windows 11 - Mica Silver<br>";
        lab2.setText(text2);
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from laptops");
            ResultSet res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(res.getInt(1) == 3){
                    is_avalap1 = res.getInt(4) > 0;
                    hpprice3 = res.getInt(3);
                    numberoflapsishere1 = res.getInt(4);
                    counterlaps1 = res.getInt(5);
                }
                if(res.getInt(1) == 4){
                    is_avalap2 = res.getInt(4) > 0;
                    hpprice4 = res.getInt(3);
                    numberoflapsishere2 = res.getInt(4);
                    counterlaps2 = res.getInt(5);
                }
            }
            stmt_for_check_user = con.prepareStatement("select *from operation_table");
            res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(res.getInt(3) == 3 && res.getBoolean(6) == true && res.getString(2).equals(ob.username)){
                    save1.setSelected(true);  
                }
                if(res.getInt(3) == 4 && res.getBoolean(6) == true && res.getString(2).equals(ob.username)){
                    save2.setSelected(true);  
                }
            }
            stmt_for_check_user = con.prepareStatement("select *from usertable");
            res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(ob.username .equals(res.getString(1))){
                    totalprice = res.getInt(7);
                    totallaps = res.getInt(8);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(is_avalap1 == true)avalap1.setText("Avalible");
        else avalap1.setText("Not Avalible");
        if(is_avalap2 == true)avalap2.setText("Avalible");
        else avalap2.setText("Not Avalible");
        Price1.setText("Price " + hpprice3 + " $");
        Price2.setText("Price " + hpprice4 + " $");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        save1 = new javax.swing.JCheckBox();
        Buy1 = new javax.swing.JButton();
        Buy2 = new javax.swing.JButton();
        save2 = new javax.swing.JCheckBox();
        Back1 = new javax.swing.JButton();
        avalap1 = new javax.swing.JLabel();
        avalap2 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1014, 672));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(101, 153, 255));

        lab.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lab.setText("HP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed hany\\OneDrive\\Desktop\\resized photos\\hp3.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed hany\\OneDrive\\Desktop\\resized photos\\hp4.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        lab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lab1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        save1.setBackground(new java.awt.Color(101, 153, 255));
        save1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        Buy1.setBackground(new java.awt.Color(101, 153, 255));
        Buy1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buy1.setText("Buy");
        Buy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy1ActionPerformed(evt);
            }
        });

        Buy2.setBackground(new java.awt.Color(101, 153, 255));
        Buy2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buy2.setText("Buy");
        Buy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy2ActionPerformed(evt);
            }
        });

        save2.setBackground(new java.awt.Color(101, 153, 255));
        save2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save2.setText("Save");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(101, 153, 255));
        Back1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        avalap1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avalap1.setText("Avalible");

        avalap2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avalap2.setText("Avalible");

        Price1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price1.setText("Price");

        Price2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price2.setText("Price");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Buy1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avalap1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avalap2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Buy2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avalap1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avalap2))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buy1)
                    .addComponent(save1)
                    .addComponent(Buy2)
                    .addComponent(save2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        this.setVisible(false);
        new HP_fram().setVisible(true);
    }//GEN-LAST:event_Back1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        boolean statu = save1.isSelected(); 
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from operation_table");
            ResultSet res = stmt_for_check_user.executeQuery();
            int theopraion = 0 ;
            while(res.next()){
                 if(res.getInt(3) == 3 && res.getString(2).equals(ob.username)){
                    theopraion = res.getInt(1);
                    break;
                }
            }
            if(theopraion == 0){ // insert
                stmt_for_check_user = con.prepareStatement("insert into operation_table (user_name,lap_id,price,bought,saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 3);
                stmt_for_check_user.setInt(3, hpprice3);
                stmt_for_check_user.setBoolean(4, false);
                stmt_for_check_user.setBoolean(5, true);
                stmt_for_check_user.executeUpdate();
                save1.setSelected(true);
            }
            else { // update
                    String Quere = "update operation_table set saved = ? where operation = ?" ;
                    stmt_for_check_user = con.prepareStatement(Quere);
                    stmt_for_check_user.setBoolean(1, statu);
                    stmt_for_check_user.setInt(2, theopraion);
                    stmt_for_check_user.executeUpdate();
                    save1.setSelected(statu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        boolean statu = save2.isSelected(); 
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from operation_table");
            ResultSet res = stmt_for_check_user.executeQuery();
            int theopraion = 0 ;
            while(res.next()){
                 if(res.getInt(3) == 4 && res.getString(2).equals(ob.username)){
                    theopraion = res.getInt(1);
                    break;
                }
            }
            if(theopraion == 0){ // insert
                stmt_for_check_user = con.prepareStatement("insert into operation_table (user_name,lap_id,price,bought,saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 4);
                stmt_for_check_user.setInt(3, hpprice4);
                stmt_for_check_user.setBoolean(4, false);
                stmt_for_check_user.setBoolean(5, true);
                stmt_for_check_user.executeUpdate();
                save2.setSelected(true);
            }
            else { // update
                    String Quere = "update operation_table set saved = ? where operation = ?" ;
                    stmt_for_check_user = con.prepareStatement(Quere);
                    stmt_for_check_user.setBoolean(1, statu);
                    stmt_for_check_user.setInt(2, theopraion);
                    stmt_for_check_user.executeUpdate();
                    save2.setSelected(statu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save2ActionPerformed

    private void Buy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy1ActionPerformed
        if(is_avalap1){
            try {
                con = DriverManager.getConnection(add,hostuser, hostpass);
                PreparedStatement stmt_for_check_user =
                    con.prepareStatement("insert into operation_table (user_name , lap_id , price , bought , saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 3);
                stmt_for_check_user.setInt(3, hpprice3);
                stmt_for_check_user.setInt(4, 1);
                stmt_for_check_user.setInt(5, 0);
                stmt_for_check_user.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success , the cost is " + hpprice3);
                String Quere = "update laptops set lap_counter = ? , saledcnt = ?  where lap_id = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,numberoflapsishere1 - 1);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setInt(3, 3);
                stmt_for_check_user.executeUpdate();
                Quere = "update usertable set total = ? , lapcnt = ?  where username = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,totalprice + hpprice3);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setString(3, ob.username);
                stmt_for_check_user.executeUpdate();
                this.setVisible(false);
                new Products().setVisible(true);
                this.setVisible(false);
                new Products().setVisible(true);
            }
            catch (SQLException ex) {
                Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Sorry this laptop is Not avalible");
        }
    }//GEN-LAST:event_Buy1ActionPerformed

    private void Buy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy2ActionPerformed
        if(is_avalap2){
            try {
                con = DriverManager.getConnection(add,hostuser, hostpass);
                PreparedStatement stmt_for_check_user =
                    con.prepareStatement("insert into operation_table (user_name , lap_id , price , bought , saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 4);
                stmt_for_check_user.setInt(3, hpprice4);
                stmt_for_check_user.setInt(4, 1);
                stmt_for_check_user.setInt(5, 0);
                stmt_for_check_user.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success , the cost is " + hpprice4);
                String Quere = "update laptops set lap_counter = ? , saledcnt = ?  where lap_id = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,numberoflapsishere2 - 1);
                stmt_for_check_user.setInt(2,counterlaps2 + 1);
                stmt_for_check_user.setInt(3, 4);
                stmt_for_check_user.executeUpdate();
                Quere = "update usertable set total = ? , lapcnt = ?  where username = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,totalprice + hpprice4);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setString(3, ob.username);
                stmt_for_check_user.executeUpdate();
                this.setVisible(false);
                new Products().setVisible(true);
                this.setVisible(false);
                new Products().setVisible(true);
            }
            catch (SQLException ex) {
                Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Sorry this laptop is Not avalible");
        }
    }//GEN-LAST:event_Buy2ActionPerformed
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
            java.util.logging.Logger.getLogger(HP_frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HP_frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HP_frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HP_frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HP_frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Buy1;
    private javax.swing.JButton Buy2;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel avalap1;
    private javax.swing.JLabel avalap2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JCheckBox save1;
    private javax.swing.JCheckBox save2;
    // End of variables declaration//GEN-END:variables
}