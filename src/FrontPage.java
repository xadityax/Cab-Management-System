
package oop_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FrontPage extends javax.swing.JFrame {
    

    Connection con;String pick,drop,shm="Shamirpet";
    public FrontPage() {
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
        Logout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        go = new javax.swing.JButton();
        WalletBal = new javax.swing.JLabel();
        addmoney = new javax.swing.JButton();
        balance = new javax.swing.JLabel();
        Settings = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pickup = new javax.swing.JComboBox<>();
        dropp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRAP Cabs");
        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        Logout.setBackground(new java.awt.Color(255, 51, 51));
        Logout.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/exit_45px.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Enter Pickup Point :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enter Drop Point :");

        go.setBackground(new java.awt.Color(255, 51, 51));
        go.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/taxi_service_35px.png"))); // NOI18N
        go.setText("  Go!");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        WalletBal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WalletBal.setText("Wallet Balance :");

        addmoney.setBackground(new java.awt.Color(255, 51, 51));
        addmoney.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        addmoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/dollar30.png"))); // NOI18N
        addmoney.setText(" Add Money");
        addmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmoneyActionPerformed(evt);
            }
        });

        String bal=Current_User.umoney;
        balance.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        balance.setText(bal);

        Settings.setBackground(new java.awt.Color(255, 51, 51));
        Settings.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/s30.png"))); // NOI18N
        Settings.setText("    Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Welcome to DRAP Cabs.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/Webp.net-resizeimage.png"))); // NOI18N

        pickup.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        pickup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hussain Sagar", "Thumkunta", "Banjara Hills", "Jubilee Hills", "Secunderabad" }));
        pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupActionPerformed(evt);
            }
        });

        dropp.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        dropp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hussain Sagar", "Thumkunta", "Banjara Hills", "Jubilee Hills", "Secunderabad" }));
        dropp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                droppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(229, 229, 229)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(dropp, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WalletBal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addmoney, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WalletBal))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        //go to MainMenu
                MainMenu mym= new MainMenu();
                mym.setVisible(true);
                mym.setLocationRelativeTo(null);
                mym.pack();
                mym.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
       
        try {
            pick=pickup.getSelectedItem().toString();
            drop=dropp.getSelectedItem().toString();
            if(pick.equals(drop))
            {
                JOptionPane.showMessageDialog(null, 
                              "Starting Point and Ending Point can't be same", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            }
            else
            {
            int amt=0;
            Statement stmt=con.createStatement();
            String querycheck="SELECT money FROM users WHERE username='"+Current_User.username+"' ";
            ResultSet rs = stmt.executeQuery(querycheck);
            while(rs.next())
            {
                amt = rs.getInt("money");
            }
            if(amt<300)
            {
                JOptionPane.showMessageDialog(null, 
                              "Insufficient balance in the Wallet."
                                      + "Please add Money", 
                              "WALLET BALANCE INSUFFICIENT", 
                              JOptionPane.WARNING_MESSAGE);
            }
            else
            {
            //proceed with cab booking and driver allocation 
            String query="SELECT *FROM ld WHERE location='"+pick+"' ORDER BY rating DESC LIMIT 1";
            ResultSet rs1 = stmt.executeQuery(query);             
             if (!rs1.next() ) {
            JOptionPane.showMessageDialog(null, 
                              "REQUEST TIMED OUT!! No Cab available right now.Try after some time", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            
            
            //code for reallotment of drivers
            String rquery="SELECT *FROM ld WHERE location='"+shm+"' ORDER BY rating DESC LIMIT 1";
            ResultSet rshs = stmt.executeQuery(rquery);  
            String nl="",dn="";
            while(rshs.next())
            {
                dn =rshs.getString("drivername");
            }
            String ipsquery="UPDATE ld SET location='"+pick+"' WHERE drivername='"+dn+"' ";
            stmt.execute(ipsquery);
            }
             else
             {
                 Current_User.vehicle_id=String.valueOf(rs1.getInt("vehicle_id"));
                
                String query3="UPDATE ld SET location='"+drop+"' WHERE vehicle_id='"+Current_User.vehicle_id+"' ";               
                stmt.execute(query3);
                
                //updating wallet balance of user
                String query4="SELECT ctime FROM jtime WHERE startl='"+pick+"' AND dropl='"+drop+"' ";
                ResultSet rs2=stmt.executeQuery(query4);
                int am=0,mo=0;
                while(rs2.next())
                {
                am = rs2.getInt("ctime");
                }
                String query5="SELECT money FROM users WHERE username='"+Current_User.username+"' ";
                ResultSet rs3=stmt.executeQuery(query5);
                while(rs3.next())
                {
                mo = rs3.getInt("money");
                }
                mo=mo-2*am;
                Current_User.umoney=String.valueOf(mo);
                String query6="UPDATE users SET money='"+mo+"' WHERE username='"+Current_User.username+"' ";
                stmt.execute(query6);
                 
                String a="";
                
                String query7="SELECT vehicle FROM ld WHERE vehicle_id='"+Current_User.vehicle_id+"' ";
                ResultSet rs4=stmt.executeQuery(query7);
                while(rs4.next())
                {
                a = rs4.getString("vehicle");
                }
                Current_User.vehicle=a;
                
                String query8="SELECT drivername FROM ld WHERE vehicle_id='"+Current_User.vehicle_id+"' ";
                ResultSet rs5=stmt.executeQuery(query8);
                while(rs5.next())
                {
                a = rs5.getString("drivername");
                }
                Current_User.driver_name=a;
                
                int fr=0,ti=0;
                String query9="SELECT ctime FROM jtime WHERE startl='"+pick+"'  AND dropl='"+drop+"' ";
                ResultSet rs6=stmt.executeQuery(query9);
                while(rs6.next())
                {
                ti=rs6.getInt("ctime");
                fr=2*ti;
                }
                Current_User.fare=String.valueOf(fr);
                Current_User.est_time=String.valueOf(ti);

                CabBooked cbb= new CabBooked();
                cbb.setVisible(true);
                cbb.setLocationRelativeTo(null);
                cbb.pack();
                cbb.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
                 
             }
            }
        }
        }
        catch (SQLException ex) {
            Logger.getLogger(FrontPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_goActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        //go to page 2_1
                Page2_1 fpu= new Page2_1();
                fpu.setVisible(true);
                fpu.setLocationRelativeTo(null);
                fpu.pack();
                fpu.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_SettingsActionPerformed

    private void addmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmoneyActionPerformed
        // go to AddMoney
                AddMoney fpuu= new AddMoney();
                fpuu.setVisible(true);
                fpuu.setLocationRelativeTo(null);
                fpuu.pack();
                fpuu.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
        
    }//GEN-LAST:event_addmoneyActionPerformed

    private void pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupActionPerformed
        
    }//GEN-LAST:event_pickupActionPerformed

    private void droppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_droppActionPerformed
        
    }//GEN-LAST:event_droppActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton Settings;
    private javax.swing.JLabel WalletBal;
    private javax.swing.JButton addmoney;
    private javax.swing.JLabel balance;
    private javax.swing.JComboBox<String> dropp;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pickup;
    // End of variables declaration//GEN-END:variables
}
