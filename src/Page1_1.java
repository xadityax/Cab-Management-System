package oop_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Page1_1 extends javax.swing.JFrame {


    Connection con;
    public Page1_1() {
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

        jSpinner1 = new javax.swing.JSpinner();
        PreviousMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inputsecurity = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputanswer = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputpassword = new javax.swing.JPasswordField();
        inputre = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputusername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");

        PreviousMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PreviousMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/pre28.png"))); // NOI18N
        PreviousMenu.setText("Previous Menu");
        PreviousMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousMenuActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Password :");

        inputsecurity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        inputsecurity.setText("Enter your Pet's Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Name :");

        Confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/check-mark-icon-transparent-background-21-28.png"))); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Re-enter Password : ");

        inputre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Security Question :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Answer :");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Please enter your details.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Username :");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop_gui/Webp.net-resizeimage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputsecurity)
                                            .addComponent(inputanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputusername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confirm)
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputsecurity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(inputanswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Confirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PreviousMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PreviousMenu)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        try {
            Statement stmt=con.createStatement();
            String name=inputname.getText();
            String username=inputusername.getText();
            String password=inputpassword.getText();
            String re=inputre.getText();
            String answer=inputanswer.getText();
             if(name.equals("") || username.equals("") || password.equals("") || re.equals("") || answer.equals(""))
               {
                  JOptionPane.showMessageDialog(null, 
                              "Please enter all the fields. Field cannot be empty", 
                              "Error", 
                              JOptionPane.WARNING_MESSAGE); 
               }
             else
             {
            ResultSet rs=stmt.executeQuery("SELECT * FROM users WHERE username='"+username+"' ");
            if(!rs.next())
            {
            if(!re.equals(password))
            {
               JOptionPane.showMessageDialog(null, 
                              "Passwords do not match,please Enter again", 
                              "Error", 
                              JOptionPane.WARNING_MESSAGE); 
            }
            else
            {  
                String dbop ="INSERT INTO users(usname,username,upassword,answer) VALUES ('"+name+"','"+username+"','"+password+"','"+answer+"')";  
                stmt.execute(dbop);
               JOptionPane.showMessageDialog(null, 
                              "Signed Up Successfully", 
                              "SUCCESS", 
                              JOptionPane.INFORMATION_MESSAGE);
               
               
                MainMenu fph= new MainMenu();
                fph.setVisible(true);
                fph.setLocationRelativeTo(null);
                fph.pack();
                fph.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
            }
            }
            else
            {
                    JOptionPane.showMessageDialog(null, 
                              "Username taken,Enter a new username", 
                              "TITLE", 
                              JOptionPane.WARNING_MESSAGE); 
            }
           stmt.close();
            }
        }
         
         catch (SQLException ex) {
            Logger.getLogger(Page1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void PreviousMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousMenuActionPerformed
     //go back to MainMenu
                MainMenu fpm= new MainMenu();
                fpm.setVisible(true);
                fpm.setLocationRelativeTo(null);
                fpm.pack();
                fpm.setDefaultCloseOperation(MainMenu.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_PreviousMenuActionPerformed

    private void inputreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputreActionPerformed
        
    }//GEN-LAST:event_inputreActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JButton PreviousMenu;
    private javax.swing.JTextField inputanswer;
    private javax.swing.JTextField inputname;
    private javax.swing.JPasswordField inputpassword;
    private javax.swing.JPasswordField inputre;
    private javax.swing.JLabel inputsecurity;
    private javax.swing.JTextField inputusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
