/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

/**
 *
 * @author Origin Systems
 */
public class showpassword {
    
    public static void show(JPasswordField PasswordInput, JCheckBox cbpass ) {
    
          if (cbpass.isSelected()) {
  
                PasswordInput.setEchoChar((char)0);
    
} else {
          PasswordInput.setEchoChar('\u2022');
        }
    
    }
    
    
    
}


