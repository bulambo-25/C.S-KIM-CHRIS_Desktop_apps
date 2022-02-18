/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import kim.chris.college.Lecture.LECTUREMENU;
import kim.chris.college.server.Database;
import org.apache.commons.validator.routines.EmailValidator;

public class LOGINPAGE extends Frame implements ActionListener
{
    Database DB= new  Database();
    private JFrame mainFrame;
    private JFrame main;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest;

    private JLabel lblPicture;
    
    private JLabel lblPicture1;
    private JLabel lblPicture2;
    private JLabel lblCenter;

    private JButton btnInventory;
    private JButton btnPersonnel;
    private JButton btnSchedule;
    private JButton btnCriminal;
    private JButton btnJailCell;

    private JLabel lblCompanyName;
    
    private JLabel lblProfile;
    
    private JTextField lblNUmber;
    private JTextField lblPadding2;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;
    
    private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4,panelBlank6,panelBlank7, panelBlank5;
    
    private Font ft1, ft2, ft3, ft4;
     
    private JLabel lblEmail;
    private JLabel Emai;
    private JTextField txtEmail;
    private JLabel Email;
    private JLabel lblErrorEmail;
    private JLabel ErrorEmail;
    
    private JLabel Surname;
    private JLabel txtSurname;
    private JLabel lblErrorSurname;
    
    private JLabel lblAdress;
    private JTextField cboAdress;
    private JLabel lblErrorAdress;
    
    private JLabel lblGender;
    private JLabel cboGender;
    private JLabel lblErrortxtDob;
    
    private JLabel lblAmount;
    private JLabel Amount;
    private JLabel lAmount;
    
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JLabel lblErrorPassword;


    private JFrame MainFrame;
    JLabel label;

   
    
    private JButton btnLogin, button;
    private JButton btnForgot;
    private JButton btnNext;
    private JButton btnSearchv;
    

    private JButton btnBack;

public LOGINPAGE()
{
        mainFrame = new JFrame("made by Dray");
        main= new JFrame("made by Hilary");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(34, 139, 34));

       
        panelWest = new JPanel();
        panelWest.setBackground(new Color(34, 139, 34));
        mainFrame.setPreferredSize(new Dimension(620, 370));
        main.setPreferredSize(new Dimension(660, 400));
        lblPicture = new JLabel(new ImageIcon("supplier.png"), SwingConstants.LEFT);
        lblPicture.setPreferredSize(new Dimension(100,100));
        lblPicture.setOpaque(false);
        lblPicture.setBackground(Color.green);
        
        lblPicture1 = new JLabel(new ImageIcon("university.png"));
        lblPicture1.setHorizontalAlignment(JLabel.CENTER);
        lblPicture1.setPreferredSize(new Dimension(100,100));
        lblPicture1.setOpaque(false);
        lblPicture1.setBackground(Color.green);
        lblCenter= new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("user.png").getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon Icon = new ImageIcon(new ImageIcon("door-key.png").getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon eIcon = new ImageIcon(new ImageIcon("Message.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon on = new ImageIcon(new ImageIcon("log-out.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon Book = new ImageIcon(new ImageIcon("Book.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon writing= new ImageIcon(new ImageIcon("writing.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon smartphone= new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        lblCompanyName = new JLabel("PROFILE     ");
        lblCompanyName.setForeground(new Color(253, 245, 104));
        panelBlank1 = new JLabel();
        panelBlank6= new JLabel();
        panelBlank2 = new JLabel();
        panelBlank3 = new JLabel();
        panelBlank4 = new JLabel("");
        panelBlank7 = new JLabel();
        panelBlank5 = new JLabel();
       

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 300);
        
        
        lblEmail = new JLabel();
        Emai = new JLabel("Email:  ");
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        lblEmail.setIcon(imageIcon);
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail = new JTextField("Student Number");
        Email = new JLabel();
        lblErrorEmail = new JLabel("*Please enter a valid");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);
        
        ErrorEmail = new JLabel("* Email must be fill");
        ErrorEmail.setForeground(Color.red);
        ErrorEmail.setVisible(false);
        Email.setBackground(Color.WHITE);
        Email.setForeground(Color.BLACK);
        
        lblPassword = new JLabel();
        lblPassword.setIcon(Icon);
        lblPassword.setHorizontalAlignment(JLabel.RIGHT);
        txtPassword= new JPasswordField("Password");
        lblErrorPassword= new JLabel("*Password must be filled");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        

        lblPadding0 = new JLabel("");
        lblPadding01 = new JLabel("");
        lblPadding1 = new JLabel("");
        lblPadding03 = new JLabel("");
        lblPadding04 = new JLabel("");
        lblPadding5 = new JLabel("");
        lblPadding2 = new JTextField("Forgot Password");
        lblPadding2.setBackground(new Color(0, 255, 255));
        lb1Welcome = new JLabel("");
        lb1Welcome.setForeground(new Color(0, 205, 179));
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        button = new JButton("Add picture");
        button.setBounds(300,300,100,40);
        label = new JLabel();
        lblNUmber= new JTextField(15);
        
        
        Surname = new JLabel("Surname:  ");
        txtSurname = new JLabel("");
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel("Gender:  ");
        cboGender = new JLabel();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
        
        lblAmount = new JLabel("You owe the institution:  R");
        Amount = new JLabel();
        lblAmount.setHorizontalAlignment(JLabel.RIGHT);
        lAmount = new JLabel("R");
        lAmount.setForeground(Color.red);
        lAmount.setVisible(false);
        
         ft1 = new Font("Arial", Font.BOLD, 16);
        
        btnLogin = new JButton("Member");
        btnLogin.setBackground(Color.white);
        btnLogin.setForeground(Color.BLACK);
        btnNext = new JButton("Student");
        btnNext.setBackground(Color.white);
        btnNext.setForeground(Color.BLACK);
        
        lblAdress = new JLabel(" Adress: ");
        cboAdress = new JTextField(15);
        lblErrorAdress = new JLabel("*required");
        lblErrorAdress.setForeground(Color.red);
        lblErrorAdress.setVisible(false);
        lblAdress.setForeground(Color.BLACK);

        btnBack= new JButton("Back");
        btnBack.setBackground(Color.white);

        
        btnForgot= new JButton("Forgot Password");
        btnForgot.setBackground(new Color(204, 204, 255));

        btnInventory = new JButton("Add Picture");
        btnInventory.setBackground(Color.WHITE);
        btnInventory.setIcon(smartphone);

        btnPersonnel = new JButton("Attendance");
        btnPersonnel.setBackground(Color.WHITE);
        btnPersonnel.setIcon(Book);

        btnSchedule = new JButton("Sign Out");
        btnSchedule.setBackground(Color.WHITE);
        btnSchedule.setIcon(on );

        btnCriminal = new JButton("Mark");
        btnCriminal.setBackground(Color.WHITE);
        btnCriminal.setIcon(writing);

        btnJailCell = new JButton("Message");
        btnJailCell.setIcon(eIcon);
        btnJailCell.setBackground(Color.WHITE);
        
        btnSearchv= new JButton("Search");
        btnSearchv.setBackground(Color.WHITE);
        

        
        
        btnJailCell.addActionListener(this);
        btnSearchv.addActionListener(this);
        btnLogin.addActionListener(this);
        btnNext.addActionListener(this);
        btnForgot.addActionListener(this);
        btnBack.addActionListener(this);
        lblPadding2.addActionListener(this);
        button.addActionListener(this);
        btnInventory.addActionListener(this);
        btnPersonnel.addActionListener(this);
        btnSchedule.addActionListener(this);
}

public void setGUI() 
{
  
        panelSouth.setLayout(new GridLayout(1, 3));
        panelCenter.setLayout(new GridLayout(7, 3));
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);  
        
        panelCenter.add(lblPadding06);
        panelCenter.add(lblPadding07);
        panelCenter.add(lblPadding8);
      
        panelCenter.add(lblPadding0);
        panelCenter.add(lblPicture1);
        panelCenter.add(lblPadding01);
        
        panelCenter.add(lblPadding03);
        panelCenter.add(lblPadding04);
        panelCenter.add(lblPadding5);
        
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(lblErrorEmail);
        
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(lblErrorPassword);
        
        panelCenter.add(lblPadding1);
        panelCenter.add(btnForgot);
        panelCenter.add(lb1Welcome);
        
        panelCenter.add(btnLogin);
        panelCenter.add(btnNext);
        panelCenter.add(btnBack);
       
        

        
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
 } 
public void validationLOgin() throws SQLException
  {
         String url="jdbc:derby://localhost:1527/KIM-CHRIS";
         String username = "KIM";
         String password = "CHRIS";
         
         String Email=txtEmail.getText();
         String Password=txtPassword.getText();
        try
        {
         Connection con= DriverManager.getConnection(url, username, password);
         String query=" select *from APP.STUDENTSS where StudentID=? and  Student_password=?";
         PreparedStatement ps=con.prepareStatement(query);
         ps.setString(1,Email);
         ps.setString(2,Password);
          ResultSet rs=ps.executeQuery();
         if(txtEmail.getText().isEmpty() && txtPassword.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(this,"Student ID and Password must be fill");
             //mainFrame.setVisible(false);
             
         }
          
         else if (rs.next())
         {
           STUDENTPR EE= new STUDENTPR();
           EE.lblNUmber.setText(txtEmail.getText());
          
           JOptionPane.showMessageDialog(this, "Welcome Login successfully");
                   
                Surname.setText(rs.getString("Student_Name"));
                Emai.setText(rs.getString("Student_Email"));
                cboGender.setText(rs.getString("Student_Gender"));
                
                 mainFrame.setVisible(false);
                  EE.profil();
              
         }else {
             JOptionPane.showMessageDialog(null,"Email and Password does not match");
         }
        }catch(SQLException g)
        {
           JOptionPane.showMessageDialog(null, g.getMessage());
         }
     
  }

  public void LECTURESLOgin() throws SQLException
  {
         String url="jdbc:derby://localhost:1527/KIM-CHRIS";
         String username = "KIM";
         String password = "CHRIS";
         
         String Email=txtEmail.getText();
         String Password=txtPassword.getText();
        try
        {
         Connection con= DriverManager.getConnection(url, username, password);
         String query=" select *from APP.LECTURES where Lectures=? and  Lecture_password=?";
         PreparedStatement ps=con.prepareStatement(query);
         ps.setString(1,Email);
         ps.setString(2,Password);
          ResultSet rs=ps.executeQuery();
         if(txtEmail.getText().isEmpty() && txtPassword.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(this,"Lectures ID and Password must be fill");
             //mainFrame.setVisible(false);
             
         }
          
         else if (rs.next())
         {
         
          
           JOptionPane.showMessageDialog(this, "Welcome Login successfully");
              
                
                 mainFrame.setVisible(false);
                  new LECTUREMENU().LECT() ;
         }else {
             JOptionPane.showMessageDialog(null,"Lectures ID and Password does not match");
         }
        }catch(SQLException g)
        {
           JOptionPane.showMessageDialog(null, g.getMessage());
         }
     
  }
  @Override
   
      public void actionPerformed(ActionEvent e) {

        if (e.getSource() ==btnBack )
        {  
             mainFrame.setVisible(false);
            new OPENPAGE().setGUI();
            

        } 
       
         if (e.getSource() ==btnForgot )
        {  
             mainFrame.setVisible(false);  
            new FORGETPASSWORD().setGUI();
            
         
        } 
          if (e.getSource() ==btnLogin )
        {  
            try {
                mainFrame.setVisible(false);
                LECTURESLOgin();
            } catch (SQLException ex) {
                Logger.getLogger(LOGINPAGE.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
       
       
         if (e.getSource() ==btnNext )
        {   
            try {
                validationLOgin();
            } catch (SQLException ex) {
                Logger.getLogger(LOGINPAGE.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         

    }
    
}
