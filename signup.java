/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;
import java.sql.*;




public class signup extends javax.swing.JFrame {


   static Connection cnx;
   static String Username;
   static String Name;
   static char[] passwordChars;
   static String password;
   static   String insertQuery;
   static String SelectQuery;
     

  
     
   public signup() {
        initComponents();
        
             cnx = dbconnection.Getconnection();
             insertQuery = "INSERT INTO logint (NameData, UserNameData, PasswordData) VALUES (?, ?, ?)";
             SelectQuery = "SELECT UserNameData, PasswordData FROM logint WHERE UserNameData = ?" ;
           
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Registerbtn = new javax.swing.JButton();
        UserNameInput = new javax.swing.JTextField();
        NameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbpass = new javax.swing.JCheckBox();
        PasswordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Select a Username");

        jLabel2.setText("Select a password");

        Registerbtn.setText("Register");
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Select a name");

        cbpass.setBackground(new java.awt.Color(255, 255, 255));
        cbpass.setText("show");
        cbpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserNameInput)
                            .addComponent(NameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(PasswordInput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Registerbtn)
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbpass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbpass)
                    .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(Registerbtn)
                .addGap(71, 71, 71))
        );

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

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed

try {
                  
                 
                  Name = NameInput.getText();
                  passwordChars = PasswordInput.getPassword();
                  password =  new String(passwordChars);
                  Username = UserNameInput.getText();
                  PreparedStatement prp2 = cnx.prepareStatement(SelectQuery);
                  prp2.setString(1, Username);
                  ResultSet result = prp2.executeQuery();
                  
                  if (result.next() == true ) {
          
                    JOptionPane.showMessageDialog(this, "Username already exists");
                } else {
        
            senddata();
            dispose();
            loginframe();
            JOptionPane.showMessageDialog(this, "Thank you for registering.");
            
                  }
                  
                 
                  
                
                  
                  
                  
              
                  
                  
                    
                  
                  
                   

                  
               
            }  catch (Exception e) {JOptionPane.showMessageDialog(this, "errr " + e.getMessage());}
      
       


        
        



    }//GEN-LAST:event_RegisterbtnActionPerformed

    private void cbpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpassActionPerformed
        
        showpassword.show(PasswordInput, cbpass);
    }//GEN-LAST:event_cbpassActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
        
       
    }

     public void senddata() {
        
         try {
                
             PreparedStatement prp = cnx.prepareStatement(insertQuery);
                   prp.setString(1, Name );
                   prp.setString(2, Username);
                   prp.setString(3, password);
                   prp.executeUpdate();
                   prp.close();
                   
                   cnx.close();
                  
             
             
         } catch (Exception e) {  JOptionPane.showMessageDialog(this, "err " + e.getMessage());
         }
                   
        
        
        }
      
    public void loginframe(){
    
     loginframe lf =new loginframe();
           lf.pack();
           lf.setVisible(true);
           lf.setLocationRelativeTo(null);
    
    }
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameInput;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JButton Registerbtn;
    private javax.swing.JTextField UserNameInput;
    private javax.swing.JCheckBox cbpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
