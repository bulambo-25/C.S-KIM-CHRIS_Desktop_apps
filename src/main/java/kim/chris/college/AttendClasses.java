/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import kim.chris.college.server.Database;

/**
 *
 * @author HP
 */
public class AttendClasses extends Frame implements ActionListener{
    Database DB= new Database();
    private JFrame mainFrame;
    private JFrame main;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest;
     
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    
    private JLabel Surname;
    private JTextField txtSurname;
    private JLabel lblErrorSurname;
    
    private JLabel AttendanceCode;
    private JLabel txtCode;
    
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JLabel lblErrorPassword;


    private JFrame MainFrame;
    private JLabel label;
    
    private JLabel label1;
    private JLabel label2;

   
    
    private JButton  button;
    private JButton btnSubmit;
    private JButton btnNext;
    private JButton btnSearchv;
    
    String Number;
    String At1;
    String At2;
    private JButton btnBack;


public AttendClasses()
{
        
        main= new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelNorth.setBackground(new Color(179,205,224));
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(34, 139, 34));

       
        panelWest = new JPanel();
        panelWest.setBackground(new Color(34, 139, 34));
        main.setPreferredSize(new Dimension(440, 250));
        

        
        
        
        lblPassword = new JLabel("Attendance Code");
        lblPassword.setHorizontalAlignment(JLabel.RIGHT);
        txtPassword= new JPasswordField();
        lblErrorPassword= new JLabel("*Password must be filled");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        

        
        button = new JButton("Reset");
        button.setBounds(300,300,100,40);
        label1 = new JLabel();
        label2 = new JLabel();
        At1="100";
        At2="1";
        label1.setText(At1);
        label2.setText(At2);
        
        label = new JLabel("Incorrect Code");
        label.setForeground(Color.red);
        label.setVisible(false);
        
        AttendanceCode = new JLabel("Code:  ");
        AttendanceCode.setHorizontalAlignment(JLabel.RIGHT);
        txtCode= new JLabel();
        Number="56322";
        txtCode.setText(Number);
                
        Surname = new JLabel("Email");
        Surname.setHorizontalAlignment(JLabel.RIGHT);
        txtSurname = new JTextField("");
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblPadding0 = new JLabel("");
        lblPadding01 = new JLabel("");
        lblPadding1 = new JLabel("");
        lblPadding03 = new JLabel("");
        lblPadding04 = new JLabel("");
        lblPadding5 = new JLabel("");
        
      
        btnBack= new JButton("Back");
        
        btnSubmit= new JButton("Submit");
        
        btnBack.addActionListener(this);
        button.addActionListener(this);
        btnSubmit.addActionListener(this);
        
}
public void RESET() 
{
    txtSurname.setText("");
    txtPassword.setText("");
    lblErrorSurname.setText("");
    lblErrorPassword.setText("");

}
public void ATT() 
{
    String NAM = txtSurname.getText();
    String SURN= label1.getText();
    String EMAI= label2.getText();
    
    Attendance a= new Attendance(NAM,SURN,EMAI);
    DB.Update(a);
    
}
public void total()
    {
        
    }
public void CHECKATTEND() 
{
                                
              String pid =  txtSurname.getText();
              String NAM = txtSurname.getText();
              String Sear="SELECT * FROM APP.StudentsAttendance where StudentName= ?";
             try
                {
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
               if(txtSurname.getText().equals(""))
               {
                   lblErrorSurname.setVisible(true);
               }
                if(txtPassword.getText().equals("") )
               {
                   lblErrorPassword.setVisible(true);
               }
                if(!txtPassword.getText().equals(Number) )
               {
                   JOptionPane.showMessageDialog(this, "Incorrect Code");
               } 
             if ( rs.next() == true && txtPassword.getText().equals(Number))
                {
                 
                 At1="100";
                 At2="1";
                 String APS=rs.getString("Attendance");
                 String ABs=rs.getString("NOtAttended");
                 
                 int Sum=Integer.parseInt(At1)+Integer.parseInt(APS);
                 int Ab=Integer.parseInt(At2)+Integer.parseInt(ABs);
                 String AV=String.valueOf(Sum);
                 String AB=String.valueOf(Ab);
                 Attendance a= new Attendance(NAM,AV,AB);
                 
                 DB.Update(a);
                 
                 
                   System.out.println("Email Found");
                   //ATT() ;
                   RESET();
                  JOptionPane.showMessageDialog(this, "Sucessully");
                  new STUDENTPR().profil();

        
         
                }
            
             else
             {
                 JOptionPane.showMessageDialog(this, "Incorrect Email or Code");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
}
public void ATTEND() 
{       panelCenter.setBackground(new Color(179,205,224));
        panelCenter.setLayout(new GridLayout(5, 3));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(14, 1));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        main.add(panelWest, BorderLayout.WEST);
        
        panelCenter.add(lblPadding0);
        panelCenter.add(AttendanceCode);
        panelCenter.add(txtCode);
        
        panelCenter.add(lblPadding01);
        panelCenter.add(lblPadding03);
        panelCenter.add(lblPadding1);
        
        panelCenter.add(Surname);
        panelCenter.add(txtSurname);
        panelCenter.add(lblErrorSurname);
        
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(lblErrorPassword);
        
        panelCenter.add(button);
        panelCenter.add(btnSubmit);
        panelCenter.add(btnBack);
        
        
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        main.pack();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
}

   
    @Override
      public void actionPerformed(ActionEvent e) {
          
          if (e.getSource() ==button )
        {   
          RESET() ;
        }    if (e.getSource() ==btnBack)
        {   
              try { 
                  new STUDENTPR().profil();
              } catch (SQLException ex) {
                  Logger.getLogger(AttendClasses.class.getName()).log(Level.SEVERE, null, ex);
              }
        }if (e.getSource() ==btnSubmit )
        {   
          CHECKATTEND();
        }
        
      }
     
   
}


