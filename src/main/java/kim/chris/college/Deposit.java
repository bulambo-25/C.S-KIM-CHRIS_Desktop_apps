
package kim.chris.college;


import java.awt.*;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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

        


public class Deposit extends Frame implements ActionListener
{

    private JFrame main;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest;

    private JLabel lblCenter;


    private JLabel lblCompanyName;
    
    private JLabel lblProfile;
    
    private JTextField lblPadding2;
    

    
    private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4,panelBlank6,panelBlank7, panelBlank5;

     
    private JLabel lblEmail;
    private JTextField Emai;
    private JTextField txtEmail;
    
    private JLabel Deposite;
    private JLabel lblErrorEmail;
    private JLabel ErrorEmail;
    
    private JLabel Surname;
    private JTextField txtSurname;
    private JLabel lblErrorSurname;
    
    private JLabel lblBankName;
    private JTextField cboBankName;
    private JLabel lblErrorAdress;
    
    private JLabel lblGender;
    public  JTextField cboGender;
    private JLabel lblErrortxtDob;
    
    private JLabel lblAmount;
    private JTextField Amount;
    private JLabel lAmount;
    
    private JLabel lblACCount;
    private JTextField txtAccountNumber;
    
    private JLabel lblPIN;
    private JTextField txtPIN;
    
    private JLabel lblMoney;
    private JTextField txtMoney;
    
    private JLabel lblTotal;
    private JTextField txtTotal;
    
    private JLabel lblErrorPassword;


    private JFrame MainFrame;
    JLabel label;

   
    
    private JButton btnSearch, button;
    private JButton btnForgot;
    private JButton btnNext;
    

    private JButton btnBack;
    public Deposit()
    {
        
        main= new JFrame("made by dray");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(84, 153, 199));;

       
        panelWest = new JPanel();
        panelWest.setBackground(new Color(34, 139, 34));
        main.setPreferredSize(new Dimension(500, 280));
        
        lblCenter= new JLabel();
        
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
        
        
        lblEmail = new JLabel("Email");
        Emai = new JTextField();
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail = new JTextField();
        Deposite = new JLabel("Deposite");
        lblErrorEmail = new JLabel("*Please enter a valid");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);
        
        ErrorEmail = new JLabel("* Email must be fill");
        ErrorEmail.setForeground(Color.red);
        ErrorEmail.setVisible(false);

        
        lblACCount = new JLabel("Account N");

        lblACCount.setHorizontalAlignment(JLabel.RIGHT);
        txtAccountNumber= new JTextField();
        lblErrorPassword= new JLabel("*Password must be filled");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        
        lblPIN = new JLabel("Pin");
        txtPIN= new JTextField();
        lblPIN.setHorizontalAlignment(JLabel.RIGHT);
        
        lblMoney = new JLabel("Deposite");
        txtMoney= new JTextField();
        lblMoney.setHorizontalAlignment(JLabel.RIGHT);
        
        lblTotal = new JLabel("You own now KIM-CHRIS");
        txtTotal= new  JTextField();
        lblTotal.setHorizontalAlignment(JLabel.RIGHT);
        
        button = new JButton("Show");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.BLACK);
        button.setBounds(300,300,100,40);
        label = new JLabel();
        
        
        Surname = new JLabel("Surname ");
        txtSurname = new JTextField();
        Surname.setHorizontalAlignment(JLabel.RIGHT);
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel("Mobile ");
        cboGender = new JTextField();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
        
        lblAmount = new JLabel("You owe KIM-CHRIS");
        Amount = new JTextField();
        lblAmount.setHorizontalAlignment(JLabel.RIGHT);
        lAmount = new JLabel("*required");
        lAmount.setForeground(Color.red);
        lAmount.setVisible(false);
        
        
        btnSearch = new JButton("Search");
        btnSearch.setBackground(Color.BLUE);
        btnSearch.setForeground(Color.BLACK);
        btnNext = new JButton("Save");
        btnNext.setBackground(Color.BLUE);
        btnNext.setForeground(Color.BLACK);
        btnNext.setBackground(Color.white);
        btnNext.setForeground(Color.BLACK);
        
        lblBankName = new JLabel(" BankName ");
        lblBankName.setHorizontalAlignment(JLabel.RIGHT);
        cboBankName = new JTextField(15);
        lblErrorAdress = new JLabel("*required");
        lblErrorAdress.setForeground(Color.red);
        lblErrorAdress.setVisible(false);
        lblBankName.setBackground(Color.BLUE);

        btnBack= new JButton("Back");
        btnBack.setBackground(Color.GREEN);

        
        
        btnForgot= new JButton("Forgot Password");
        btnForgot.setBackground(new Color(204, 204, 255));

       

        
        
        
        cboBankName.addActionListener(this);
        btnSearch.addActionListener(this);
        btnNext.addActionListener(this);
        btnForgot.addActionListener(this);
        btnBack.addActionListener(this);
        button.addActionListener(this);
        
        
}
    public void DEP() 
{       panelCenter.setBackground(new Color(84, 153, 199));
        panelCenter.setLayout(new GridLayout(7, 4));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(12, 1));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        main.add(panelWest, BorderLayout.WEST);
        
        
        
        panelCenter.add(lblEmail);  
        panelCenter.add(txtEmail);
        panelCenter.add(btnSearch);
        panelCenter.add(panelBlank1);
        
        panelCenter.add(Surname);
        panelCenter.add(txtSurname);
        panelCenter.add(lblBankName);
        panelCenter.add(cboBankName);
        
        
        
        
        panelCenter.add(lblGender);
        panelCenter.add(cboGender);
        panelCenter.add(lblACCount);
        panelCenter.add(txtAccountNumber);
  
       //Surname.setHorizontalAlignment(JLabel.RIGHT);
        panelCenter.add(lblAmount);
        panelCenter.add(Amount);
        panelCenter.add(lblPIN);
        panelCenter.add(txtPIN);
        
        panelCenter.add(panelBlank2);
        panelCenter.add(button);
        panelCenter.add(lblMoney);
        panelCenter.add(txtMoney);
        
        panelCenter.add(panelBlank3);
        panelCenter.add(btnNext);
        panelCenter.add(lblTotal);
        panelCenter.add(txtTotal);
        
        panelCenter.add(panelBlank4);
        panelCenter.add(panelBlank5);
        
        panelCenter.add(btnBack);
        panelCenter.add(panelBlank6);
       
        
        
        /*panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(lblErrorEmail);
        */
        
       
        
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
     public void sendMain() 
     {
      if(cboBankName.getText().equals("FBN"))
      {
          panelBlank1.setText("ssss");
          
      }
       
    }
    private void REA()
{                                        
              String pid =  txtEmail.getText();
              String Sear="SELECT * FROM APP.STUDENTSS where Student_Email= ?";
             try
                {
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
               if(txtEmail.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(this, "Fill your Surname ");
               }
             if ( rs.next() == true )
                {
                 
                 
                 String Se=rs.getString("Student_Surname");
                 String Ge=rs.getString("Student_mobile");
                 String AM=rs.getString("Student_fees");
                 txtSurname.setText(Se);
                 cboGender.setText(Ge);
                 Amount.setText(AM);
                 

        
         
                }
             else
             {
                 JOptionPane.showMessageDialog(this, "Enter Correct Surname");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
    }
    public void total()
    {
        try {
            String r1=Amount.getText();
            String r2=txtMoney.getText();
            int Sum=Integer.parseInt(r1)-Integer.parseInt(r2);
            String sum1=String.valueOf(Sum);
            txtTotal.setText(sum1);
        } catch 
                ( Exception e )
                {
                e.printStackTrace();
                }  
    }
     
     public void sen() throws SQLException {
        
        String from = "kimchrisschool@gmail.com";
        String toEmail = txtEmail.getText();
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "kimchrisschool@gmail.com";
        String password = "Kim@7767";    //  Your email password here
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
                 String query = "select StudentID from APP.STUDENTSS where Student_Email LIKE '"+txtEmail.getText().trim()+"'";
                 String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                 String userna = "KIM";
                 String passwo = "CHRIS";
                 Connection con= DriverManager.getConnection(url, userna, passwo);  
                 PreparedStatement statmnt = con.prepareStatement(query);
                 ResultSet result = statmnt.executeQuery(); 
                 
            if(txtEmail.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(null, " Email Empty");
            }
            if (result.next())
            {   
               
                String fetchedPassword = result.getString("StudentID"); 
                
               
       
                
           
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                message.setSubject("CONGRATILATION");
                message.setText("Congratulations Your registration has been recorded. Our Admissions has sent you\n" +fetchedPassword
                                 +"  has Your student number. Looking forward to seeing you!");
                Transport.send(message);
                 Save();
            System.out.println("ssssss");
            
            }else
            {
                 System.out.println("active less security your email");
            }
        } catch (MessagingException e) {
          
                System.out.println("Invalid email"+e.getMessage());
            
        }
       
    }
    public void VadFBN()
    {
        if (cboBankName.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Fill Bank Name ");
        }
        if (txtAccountNumber.getText().equals("")) {
            
             JOptionPane.showMessageDialog(this, "Fill THE Account Number");
        }
        if (txtPIN.getText().equals("")) {
            
             JOptionPane.showMessageDialog(this, "Fill THE PIN");
        }
         if (txtMoney.getText().equals("")) {
            
             JOptionPane.showMessageDialog(this, "Enter The Amount");
        }else
         {
             total();
         }
    }
    
    public void Number()
    {
        
        try {
                 String query = "select StudentID from APP.STUDENTSS where Student_Email LIKE '"+txtEmail.getText().trim()+"'";
                 String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                 String username = "KIM";
                 String password = "CHRIS";
                 Connection con= DriverManager.getConnection(url, username, password);  
            PreparedStatement statmnt = con.prepareStatement(query);
            ResultSet result = statmnt.executeQuery(); 
            if(txtEmail.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(null, " Email Empty");
            }
            else if (result.next())
            {   
               
                String fetchedPassword = result.getString("StudentID"); 
                
               
       
                JOptionPane.showMessageDialog(null, " your Student Number:"   + fetchedPassword);
                 Save();
            }
        } catch (Exception k) {
  
            JOptionPane.showMessageDialog(null, "Email Address not found"+k.getMessage());
        }
                     
    }
    public void Save()
    {
       if (txtTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill Everything");
       }else{
       try {
            String SUR=txtSurname.getText();
            String DEP=txtTotal.getText();
            String Update="update APP.STUDENTSS set Student_fees='"+DEP +"'where Student_Surname='"+SUR+"'";
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url, username, password);
            PreparedStatement statmnt = con.prepareStatement(Update); 
            statmnt.execute();
            
            JOptionPane.showMessageDialog(null, "Deposite Successfully");
            main.setVisible(false);
            new LOGINPAGE().setGUI() ;
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
       }         
    }
  
@Override
   

      public void actionPerformed(ActionEvent e) {

        if (e.getSource() ==btnSearch )
        {    
          REA();
        } 
         if (e.getSource() ==button )
        {   
            VadFBN();

        }  if (e.getSource() ==btnNext )
        {   
            try { 
                sen();
                        } catch (SQLException ex) {
                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
         
          if (e.getSource() ==btnBack )
        {   
          main.setVisible(false);
          new REGISTRACTION().setGui();

        } 
           
         if (e.getSource() ==cboBankName )
        {   
           sendMain() ;

        } 
    }
     
     
}
