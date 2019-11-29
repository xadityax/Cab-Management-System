
package oop_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
    

public class AddMoney extends javax.swing.JFrame {

    Connection con;
    public AddMoney() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Money");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Enter Amount:");

        Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/check-mark-icon-transparent-background-21-28.png"))); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/pre28.png"))); // NOI18N
        previous.setText("Previous Menu");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/Webp.net-resizeimage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(previous)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(Confirm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previous)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Confirm)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        try {
            int amt=0;
            Statement stmt=con.createStatement();
            int m=Integer.parseInt(amount.getText());
            if(m<=0)
            {
                JOptionPane.showMessageDialog(null, 
                              "Amount must be greater than zero", 
                              "Error", 
                              JOptionPane.WARNING_MESSAGE);
            }
            else{
            String querycheck="SELECT money FROM users WHERE username='"+Current_User.username+"' ";
            ResultSet rs = stmt.executeQuery(querycheck);
            while(rs.next())
            {
                amt = rs.getInt("money");
                amt += m;
            }
            Current_User.umoney=String.valueOf(amt);
            String query="UPDATE users SET money='"+amt+"' WHERE username='"+Current_User.username+"' ";
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, 
                              "Money added to wallet successfully", 
                              "Success", 
                              JOptionPane.INFORMATION_MESSAGE);
                FrontPage fpuz= new FrontPage();
                fpuz.setVisible(true);
                fpuz.setLocationRelativeTo(null);
                fpuz.pack();
                fpuz.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
            }
        }  
        catch (SQLException ex) {
            Logger.getLogger(AddMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_ConfirmActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        FrontPage fpuy= new FrontPage();
                fpuy.setVisible(true);
                fpuy.setLocationRelativeTo(null);
                fpuy.pack();
                fpuy.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_previousActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
