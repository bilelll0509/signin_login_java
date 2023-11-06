package javaapplication1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbconnection {


        
      public static  Connection Getconnection(){
        
        Connection cnx = null;
        
          try {
              
             Class.forName("com.mysql.cj.jdbc.Driver");
             
             cnx = DriverManager.getConnection("jdbc:mysql://localhost:3307/logintest", "root", "0000");
      
          } catch (Exception e) { e.printStackTrace();}
        
        
        
        
        return cnx;
        
        
        
          
        
    }
      
    
     
}
