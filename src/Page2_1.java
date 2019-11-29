package oop_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Page2_1 extends javax.swing.JFrame {

    Connection con;
    public Page2_1() {
        initComponents();
        createConnection();
    }

        void createConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/oop_project","root","Thunder@123");
           
            System.out.println("Database Connection Successful");
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(OOP_GUI.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(OOP_GUI.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        currentuser = new javax.swing.JTextField();
        newuser = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        npassword = new javax.swing.JPasswordField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/pre28.png"))); // NOI18N
        jButton2.setText("Previous Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Current Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Current Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("New Username");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("New Password");

        currentuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentuserActionPerformed(evt);
            }
        });

        newuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserActionPerformed(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/check-mark-icon-transparent-background-21-28.png"))); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Need Help? Contact Us : f20171100@hyderabad.bits-pilani.ac.in | +91-7080607014");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/Webp.net-resizeimage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel3)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(currentuser)
                            .addComponent(newuser)
                            .addComponent(newpass)
                            .addComponent(npassword, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirm)
                .addGap(267, 267, 267))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(npassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(42, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            String name=currentuser.getText();
            String cpassword=newpass.getText();
            String nuser=newuser.getText();
            String npass=npassword.getText();
            if(name.equals("") || cpassword.equals("") || nuser.equals("") || npass.equals("") )
            {
                JOptionPane.showMessageDialog(null, 
                              "Please enter all the fields. Field cannot be empty", 
                              "Error", 
                              JOptionPane.WARNING_MESSAGE);
            }
            else
            {
            Statement stmt=con.createStatement();
            String querycheck="SELECT * FROM users WHERE username='"+name+"' AND upassword='"+cpassword+"' ";
            ResultSet rs = stmt.executeQuery(querycheck);
            if (!rs.next() ) {
            JOptionPane.showMessageDialog(null, 
                              "Invalid Credentials", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                ResultSet rs1=stmt.executeQuery("SELECT * FROM users WHERE username='"+nuser+"' ");
                if(!rs1.next())
                {
                String query="UPDATE users SET username='"+nuser+"',upassword='"+npass+"' WHERE username='"+name+"' AND upassword='"+cpassword+"' ";
                stmt.execute(query);
                JOptionPane.showMessageDialog(null, 
                              "Username and Password changed Successfully", 
                              "Success", 
                              JOptionPane.INFORMATION_MESSAGE);
                MainMenu fp2= new MainMenu();
                fp2.setVisible(true);
                fp2.setLocationRelativeTo(null);
                fp2.pack();
                fp2.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, 
                              "Username already Taken. Enter new Username", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                }
            }
            stmt.close();
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Page2_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_confirmActionPerformed

    private void currentuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentuserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                FrontPage fp1= new FrontPage();
                fp1.setVisible(true);
                fp1.setLocationRelativeTo(null);
                fp1.pack();
                fp1.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void newuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserActionPerformed

    }//GEN-LAST:event_newuserActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JTextField currentuser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JTextField newuser;
    private javax.swing.JPasswordField npassword;
    // End of variables declaration//GEN-END:variables
}
