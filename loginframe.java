/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class loginframe extends javax.swing.JFrame {
    private ResultSet resultSet ;
   private Connection cnx;
   private String username ;
   private char[] passwordchar ;
   private String password ;
   private String SelectQuery;
   private PreparedStatement preparedStatement;
   private String dbUsername;
   private String dbpass;
   private String dbname;
   
   
    public loginframe() {
        initComponents();
        cnx = dbconnection.Getconnection();
        SelectQuery = "SELECT NameData, UserNameData, PasswordData FROM logint WHERE UserNameData = ?" ;
      
        
    }

  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ConnectBTN = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        CheckBoxpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        ConnectBTN.setText("Connect");
        ConnectBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectBTNActionPerformed(evt);
            }
        });

        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITEEM");
        jLabel3.setMaximumSize(new java.awt.Dimension(33, 16));

        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });

        CheckBoxpass.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxpass.setText("SHOW");
        CheckBoxpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBoxpass, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ConnectBTN)
                .addGap(71, 71, 71)
                .addComponent(CloseBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CheckBoxpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConnectBTN)
                    .addComponent(CloseBtn))
                .addGap(70, 70, 70))
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

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextFieldActionPerformed
     
        
        
        
        
        
        
    }//GEN-LAST:event_UserNameTextFieldActionPerformed

    private void CheckBoxpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxpassActionPerformed
        
     showpassword.show(PasswordField, CheckBoxpass);
        
        
    }//GEN-LAST:event_CheckBoxpassActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed



dispose();
        
   
            
       
        
        
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void ConnectBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectBTNActionPerformed
       
       
         try {
             preparedStatement = cnx.prepareStatement(SelectQuery);
             username = UserNameTextField.getText();
             preparedStatement.setString(1, username);
             passwordchar = PasswordField.getPassword();
             password = new String(passwordchar);
             
             
             resultSet   = preparedStatement.executeQuery();
             
             if(resultSet.next()) {
             dbname = resultSet.getString("NameData");
             dbUsername = resultSet.getString("UserNameData");
             dbpass = resultSet.getString("PasswordData");
             
      
             
             
             
             if(dbpass != null && dbpass.equals(password) ) {
                 
                 if (dbUsername !=null && dbUsername.equals(username) ) {
                 
            
                    JOptionPane.showMessageDialog(this,"welcome" +" " +  dbname);
                 
                 
                     }
          
                 } else { JOptionPane.showMessageDialog(this, "WRONG BITCH");  }
         
             }else { JOptionPane.showMessageDialog(this, "WRONG BITCH");  }
             
            } catch (Exception e) { JOptionPane.showMessageDialog(this,e);}
        
         
         
         
         
        

    }//GEN-LAST:event_ConnectBTNActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxpass;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton ConnectBTN;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
