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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author HP
 */
public class TIMETABLE extends Frame implements ActionListener
{
    
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
    
    private JLabel lblNUmber;
    private JLabel lblPadding2;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;
    
    private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4,panelBlank6,panelBlank7, panelBlank5;
    
    private Font ft1, ft2, ft3, ft4;
     
    private JLabel lblEmail;
    private JLabel Emai;
    private JLabel txtEmail;
    private JLabel Email;
    private JLabel lblErrorEmail;
    private JLabel ErrorEmail;
    
    private JLabel Surname;
    private JLabel txtSurname;
    private JLabel lblErrorSurname;
    
    private JLabel lblAdress;
    private JLabel cboAdress;
    private JLabel lblErrorAdress;
    
    private JLabel lblGender;
    private JLabel cboGender;
    private JLabel lblErrortxtDob;
    
    private JLabel lblAmount;
    private JLabel Amount;
    private JLabel lAmount;
    
    public JLabel lblPassword;
    private JLabel txtPassword;
    private JLabel lblErrorPassword;


    private JFrame MainFrame;
    JLabel label;

   
    
    private JButton btnLogin, button;
    private JButton btnForgot;
    private JButton btnNext;
    private JButton btnSearchv;
    

    private JButton btnBack;
    
    public TIMETABLE()
    {
        
        main= new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(Color.WHITE);
       
        panelWest = new JPanel();
        panelWest.setBackground(new Color(84, 153, 199));

        main.setPreferredSize(new Dimension(450, 315));
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
        
        lblCompanyName = new JLabel("CONTENT     ");
        lblPassword= new JLabel();
        lblCompanyName.setForeground(Color.BLACK);
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
        Emai = new JLabel();
        txtEmail = new JLabel();
        Email = new JLabel();
        lblErrorEmail = new JLabel();
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);
        
        ErrorEmail = new JLabel();
        ErrorEmail.setForeground(Color.red);
        ErrorEmail.setVisible(false);
        Email.setBackground(Color.WHITE);
        Email.setForeground(Color.BLACK);
        
        lblPassword = new JLabel();;
        lblPassword.setHorizontalAlignment(JLabel.RIGHT);
        txtPassword= new JLabel();
        lblErrorPassword= new JLabel();
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        

        lblPadding0 = new JLabel("");
        lblPadding01 = new JLabel("");
        lblPadding1 = new JLabel("");
        lblPadding03 = new JLabel("");
        lblPadding04 = new JLabel("YEAR");
        lblPadding04.setForeground(new Color(84, 153, 199));
        lblPadding5 = new JLabel("SUBJECT");
        lblPadding5.setForeground(new Color(84, 153, 199));
        lblPadding2 = new JLabel();
        lb1Welcome = new JLabel("DATE");
        lb1Welcome.setForeground(new Color(84, 153, 199));
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        button = new JButton();
        button.setBounds(300,300,100,40);
        label = new JLabel();
        lblNUmber= new JLabel();
        
        
        Surname = new JLabel();
        txtSurname = new JLabel("");
        lblErrorSurname = new JLabel();
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel();
        cboGender = new JLabel();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel();

        
        lblAmount = new JLabel();
        Amount = new JLabel();

        lAmount = new JLabel();
        lAmount.setForeground(Color.red);
        
        
         ft1 = new Font("Arial", Font.BOLD, 16);
        
        btnLogin = new JButton("Member");
        btnLogin.setBackground(Color.white);
        btnLogin.setForeground(Color.BLACK);
        btnNext = new JButton("Student");
        btnNext.setBackground(Color.white);
        btnNext.setForeground(Color.BLACK);
        
        lblAdress = new JLabel(" Adress: ");
        cboAdress = new JLabel();
        lblErrorAdress = new JLabel("*required");
        lblErrorAdress.setForeground(Color.red);
        lblErrorAdress.setVisible(false);
        lblAdress.setForeground(Color.BLACK);

        btnBack= new JButton("Back");
        btnBack.setBackground(Color.white);

        
        btnForgot= new JButton("Forgot Password");
        btnForgot.setBackground(new Color(204, 204, 255));

        btnInventory = new JButton("Time table");
        btnInventory.setBackground(Color.WHITE);
        

        btnPersonnel = new JButton("Announcement");
        btnPersonnel.setBackground(Color.WHITE);
       

        btnSchedule = new JButton("Back");
        btnSchedule.setBackground(Color.WHITE);
      

        btnCriminal = new JButton("Mark");
        btnCriminal.setBackground(Color.WHITE);


        btnJailCell = new JButton("Exams");
        btnJailCell.setBackground(Color.WHITE);
        
        btnSearchv= new JButton("Test Result");
        btnSearchv.setBackground(Color.WHITE);
        

        
        
        btnJailCell.addActionListener(this);
        btnSearchv.addActionListener(this);
        btnLogin.addActionListener(this);
        btnNext.addActionListener(this);
        btnForgot.addActionListener(this);
        btnBack.addActionListener(this);
        button.addActionListener(this);
        btnInventory.addActionListener(this);
        btnPersonnel.addActionListener(this);
    }
    public void Time() 
{ 
        panelCenter.setLayout(new GridLayout(8, 3));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(1, 3));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        //main.add(panelWest, BorderLayout.WEST);
        SEARCHTIMECLASSES();
        MECLASSES();
        panelNorth.add(lblPassword);
        panelCenter.add(lblPadding04);
        panelCenter.add(lblPadding5);  
        panelCenter.add(lb1Welcome);
        
        panelCenter.add(panelBlank4);
        panelCenter.add(panelBlank7);  
        panelCenter.add(panelBlank5);
        
        panelCenter.add(label);
        panelCenter.add(lblNUmber);  
        panelCenter.add(Surname);
        
        panelCenter.add(txtSurname);
        panelCenter.add(lblPadding01);
        panelCenter.add(Emai);
        
        panelCenter.add(lblAmount);
        panelCenter.add(Amount);
        panelCenter.add(lAmount);
        
        panelCenter.add(lblPadding2);
        panelCenter.add(lblPadding03);
        panelCenter.add(lblPadding0);
        
        panelCenter.add(lblPadding07);
        panelCenter.add(lblPadding8);
        panelCenter.add(lblPadding9);
        
        panelCenter.add(panelBlank6);
        panelCenter.add(panelBlank1);
        panelCenter.add(panelBlank2);
        
        panelSouth.add(panelBlank3);
        panelSouth.add(btnBack);
        panelSouth.add(lblPadding1);
       
        
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
    public void SEARCHTIMECLASSES()
    {
        String pid ="First Year";
              String Sear="SELECT * FROM APP.FIRSTYEAR where firstyear= ?";
             try 
                {
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
              
             if ( rs.next() == true )
                {
                 
                 
                 String YEAR=rs.getString("firstyear");
                 String YEAR2=rs.getString("firstyear");
                 String YEAR3=rs.getString("firstyear");
                 String PROGRAM=rs.getString("Math");
                 String DATE=rs.getString("dateMath");
                 String PROGRAM2=rs.getString("Physic");
                 String DATE2=rs.getString("PhysicDate");
                 String PROGRAM3=rs.getString("Marketing");
                 String DATE3=rs.getString("MarkingDate");
                 
                 
                 label.setText(YEAR);
                 lblNUmber.setText(PROGRAM);
                 Surname.setText(DATE);
                 
                 txtSurname.setText(YEAR2);
                 lblPadding01.setText(PROGRAM2);
                 Emai.setText(DATE2);
                 
                 lblAmount.setText(YEAR3);
                 Amount.setText(PROGRAM3);
                 lAmount.setText(DATE3);
                 

        
         
                }
             else
             {
                 System.out.print("Correct Surname");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
    }
    
    public void MECLASSES()
    {
        String pid ="Second Year";
              String Sear="SELECT * FROM APP.SECONDYEAR where Secondyear= ?";
             try 
                {
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
              
             if ( rs.next() == true )
                {
                 
                 
                 String YEAR=rs.getString("Secondyear");
                 String YEAR1=rs.getString("Secondyear");
                 String YEAR2=rs.getString("Secondyear");
                 String ADF=rs.getString("ADF");
                 String ADFDATE=rs.getString("dateADF");
                 String NETWORK=rs.getString("NETwork");
                 String NETWORKDATE=rs.getString("NETworkDate");
                 String ADP=rs.getString("ADP");
                 String ADPDATE=rs.getString("ADPDate");
                 
                 
                 
                 lblPadding2.setText(YEAR);
                 lblPadding03.setText(ADF);
                 lblPadding0.setText(ADFDATE);
                 
                 lblPadding07.setText(YEAR1);
                 lblPadding8.setText(NETWORK);
                 lblPadding9.setText(NETWORKDATE);
                 
                 panelBlank6.setText(YEAR2);
                 panelBlank1.setText(ADP);
                 panelBlank2.setText(ADPDATE);
                 
                
                 

        
         
                }
             else
             {
                  System.out.print("Correct Surname");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
    }
    
  @Override
  public void actionPerformed(ActionEvent e) 
  {

       if (e.getSource() == btnBack) 
        {
            main.setVisible(false);
             //new CONTENT().SUBB() ;
             CONTENT gg=new CONTENT();
            gg.SurnameE.setText(lblPassword.getText());
            gg.SUBB();
        }
          
      
    }

}
