/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author Jordan
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class SchoolClass implements ActionListener {
    
   JFrame TeacherPage = new JFrame("Teacher");
   
   JLabel Title = new JLabel("Class of 2022");
   JLabel Greet = new JLabel("Welcome back!");
   JLabel Email = new JLabel("EMAIL");
   JLabel Password = new JLabel("PASSWORD");
   JLabel Account = new JLabel("Need an account?");
   
   JTextField TeacherLogin = new JTextField("");
   JTextField TeacherPassword = new JTextField("");
   
   JButton Login = new JButton("Log in");
   JButton Register = new JButton("Register");
   
   SchoolClass() {
       
    //------------------------ Frame ------------------------\\
    
       TeacherPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       TeacherPage.setTitle("Class of 2022");
       TeacherPage.setResizable(false);
       TeacherPage.setSize(900, 600);
       TeacherPage.setLayout(null);
       TeacherPage.setVisible(true);
       TeacherPage.getContentPane().setBackground(new Color(0x088F8F));
       
    //------------------------ Labels ------------------------\\
       TeacherPage.add(Title);
       Title.setFont(new Font("Arial Nova", Font.BOLD, 25));
       Title.setBounds(370, 85, 800, 90);
       
       TeacherPage.add(Greet);
       Greet.setFont(new Font("Arial Nova", Font.PLAIN, 15));
       Greet.setBounds(400, 130, 800, 90);
       
       TeacherPage.add(Email);
       Email.setFont(new Font("Arial Nova", Font.PLAIN, 12));
       Email.setBounds(330,165, 200, 90);
       
       TeacherPage.add(Password);
       Password.setFont(new Font("Arial Nova", Font.PLAIN, 12));
       Password.setBounds(330,225, 200, 90);
               
       TeacherPage.add(Account);
       Account.setFont(new Font("Arial Nova", Font.PLAIN, 12));
       Account.setBounds(330, 325, 180, 90);
       
    //------------------------ Text Fields ------------------------\\
    
       TeacherPage.add(TeacherLogin);
       TeacherLogin.setOpaque(true);
       TeacherLogin.setForeground(Color.WHITE);
       TeacherLogin.setBounds(330, 220, 250, 24);
       
       TeacherPage.add(TeacherPassword);
       TeacherPassword.setBounds(330, 280, 250, 24);
       
    //------------------------ Buttons ------------------------\\
    
       TeacherPage.add(Login);
       Login.setFont(new Font("Arial Nova", Font.BOLD, 15));
       Login.setBackground(Color.BLUE);
       Login.setForeground(Color.WHITE);
       Login.setBounds(330, 330, 250, 28);
       
       TeacherPage.add(Register);
       Register.setFont(new Font("Arial Nova", Font.PLAIN, 12));
       Register.setOpaque(false);
       Register.setContentAreaFilled(false);
       Register.setBorderPainted(false);
       Register.setForeground(Color.BLUE);
       Register.setBounds(415, 360, 90, 20);
   }
   
   @Override
   public void actionPerformed(ActionEvent jy) {
       
   }
}
