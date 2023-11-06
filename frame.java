///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package javaapplication1;
//
//import java.awt.Frame;
//import javax.swing.*;
//
///**
// *
// * @author Origin Systems
// */
//public class frame extends JFrame {
//  
//    
//    public  frame(String franamename) {
//
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 300);
//        setTitle(franamename);
//        setLocationRelativeTo(null);
//        setVisible(true);
//      
//    }
//    
//    /**
//     *
//     * @param framename
//     */
//    public static void create(String framename) {
//        SwingUtilities.invokeLater(() -> {
//            frame frame = new frame(framename);
//        });
//    }
//}
