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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class ANNOUNCEMENT extends Frame implements ActionListener{
    
      
    private JFrame main;
    private JPanel panelNorth,Sud,panelCenter,panelSouth,panelWest,panen;
    
    private JLabel lblPicture;
    
    private JLabel lblPicture1;
    private JLabel lblPicture2;
    private JLabel lblCenter;

    private JButton btnInventory;
    private JButton btnPersonnel;
    private JButton btnSchedule;
    private JButton btnCriminal;
    private JButton btnJailCell;

    public JLabel lblCompanyName;
    
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
    //private JLabel Amount;
    private JLabel lAmount;
    
    private JLabel lblPassword;
    private JLabel txtPassword;
    private JLabel lblErrorPassword;
    private JTextArea Amount;
    private JScrollPane jscrollPane;
    private JFrame MainFrame;
    JLabel label;

   
    
    private JButton btnLogin, button;
    private JButton btnForgot;
    private JButton btnNext;
    private JButton btnSearchv;
    

    private JButton btnBack;
    
    public ANNOUNCEMENT()
    {
        
        main= new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panen = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(Color.WHITE);
        Sud= new JPanel();
        panelWest = new JPanel();
        panelWest.setBackground(new Color(84, 153, 199));

        main.setPreferredSize(new Dimension(650, 370));
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
        
        lblCompanyName = new JLabel();
        lblCompanyName.setForeground(new Color(84, 153, 199));
        panelBlank1 = new JLabel();
        panelBlank6= new JLabel();
        panelBlank2 = new JLabel();
        panelBlank3 = new JLabel();
        panelBlank4 = new JLabel("");
        panelBlank7 = new JLabel();
        panelBlank5 = new JLabel();
       

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 300);
        
        
        lblEmail = new JLabel(       "");
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
        lblPadding04 = new JLabel();
        lblPadding04.setForeground(new Color(84, 153, 199));
        lblPadding5 = new JLabel("Announcement");
        lblPadding5.setForeground(new Color(84, 153, 199));
        lblPadding2 = new JLabel();
        lb1Welcome = new JLabel();
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
        txtSurname = new JLabel();
        lblErrorSurname = new JLabel();
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel();
        cboGender = new JLabel();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel();

        
        lblAmount = new JLabel();
        Amount = new JTextArea();

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
        jscrollPane=new JScrollPane(lblPadding03,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        btnForgot= new JButton("Forgot Password");
        btnForgot.setBackground(new Color(204, 204, 255));

        btnInventory = new JButton("Time table");
        btnInventory.setBackground(Color.WHITE);
        

        btnPersonnel = new JButton("Announcement");
        btnPersonnel.setBackground(Color.WHITE);
       

        btnSchedule = new JButton("");
        btnSchedule.setBackground(Color.WHITE);
      

        btnCriminal = new JButton("Mark");
        btnCriminal.setBackground(Color.WHITE);


        btnJailCell = new JButton("Back");
        btnJailCell.setBackground(Color.WHITE);
        
        btnSearchv= new JButton("");
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
    public void ANNOU() 
{       Sud.setLayout(new GridLayout(1, 3));
        panelCenter.setLayout(new GridLayout(3, 1));
        main.add(panelNorth, BorderLayout.NORTH);
        main.add(Sud, BorderLayout.SOUTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(1, 2));
        panen.setLayout(new GridLayout(1, 2));
        main.add(panelCenter, BorderLayout.CENTER);
        //main.add(panelSouth, BorderLayout.SOUTH);
        //main.add(panelWest, BorderLayout.WEST);
        MECLASSES();
        SEARCHTIMECLASSES();
        SES();
        
        lblPadding03.setHorizontalAlignment(JLabel.LEFT);
        panelNorth.add(lblCompanyName);
        panelWest.add(lblEmail);
        panelWest.add(lblPadding1);
        panelCenter.add(panelWest);
        panelCenter.add(lblPadding03);
        
        panelSouth.add(Surname);
        panelSouth.add(txtSurname);
        panelCenter.add(panelSouth);
        panelCenter.add(lblGender);
        lblGender.setHorizontalAlignment(JLabel.LEFT);
        panelSouth.setBackground(new Color(84, 153, 199));
        
        panen.add(lblPadding06);
        panen.add(lblPadding07);
        panelCenter.add(panen);
        panelCenter.add(lblPadding8);
        
        Sud.add(btnSearchv);
        Sud.add(btnJailCell );
        Sud.add(btnSchedule);
        panen.setBackground(new Color(84, 153, 199));
        lblPadding8.setHorizontalAlignment(JLabel.LEFT);
       
        
        
        //lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        
       
        
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
        String pid ="Physic ";
              String Sear="SELECT * FROM APP.ANNOUNCEMENT where Subject= ?";
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
                 
                 
                 String YEAR=rs.getString("Subject");
                 String YEAR1=rs.getString("Annous");
                 String YEAR2=rs.getString("Date");
                 
                 
                 
                 Surname.setText("                                  "+YEAR);
                 txtSurname.setText(YEAR2);
                 lblGender.setText(YEAR1);

        
         
                }
             else
             {
                 System.out.println("Enter Correct Surname");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
    } 
    public void SES()
    {
        String pid ="ADF";
              String Sear="SELECT * FROM APP.ANNOUNCEMENT where Subject= ?";
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
                 
                 
                 String YEAR=rs.getString("Subject");
                 String YEAR1=rs.getString("Annous");
                 String YEAR2=rs.getString("Date");
                 
                 
                 
                 lblPadding06.setText("                                  "+YEAR);
                 lblPadding07.setText(YEAR2);
                 lblPadding8.setText(YEAR1);

        
         
                }
             else
             {
                 System.out.println("Enter Correct Surname");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
    }
    
    
    public void MECLASSES()
    {
        String pid ="Math";
              String Sear="SELECT * FROM APP.ANNOUNCEMENT where Subject= ?";
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
                 
                 
                 String YEAR=rs.getString("Subject");
                 String YEAR1=rs.getString("Annous");
                 String YEAR2=rs.getString("Date");
                // String ADF=rs.getString("ADF");
                 //String ADFDATE=rs.getString("dateADF");
                 //String NETWORK=rs.getString("NETwork");
                 //String NETWORKDATE=rs.getString("NETworkDate");
                 //String ADP=rs.getString("ADP");
                 //String ADPDATE=rs.getString("ADPDate");
                 
                 
                 
                 lblEmail.setText("                                  "+YEAR);
                 lblPadding03.setText(YEAR1);
                 lblPadding1.setText(YEAR2);
                 
                 //lblPadding07.setText(YEAR1);
                 //lblPadding8.setText(NETWORK);
                 //lblPadding9.setText(NETWORKDATE);
                 
                 //panelBlank6.setText(YEAR2);
                 //panelBlank1.setText(ADP);
                // panelBlank2.setText(ADPDATE);
                 
                
                 

        
         
                }
             else
             {
                 System.out.println("Enter Correct Surname");
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

       if (e.getSource() == btnJailCell) 
        {
            main.setVisible(false);
            // new CONTENT().SUBB() ;
             CONTENT jj= new CONTENT();
              
            jj.SurnameE.setText(lblCompanyName .getText());
            jj.SUBB();
             
        }
          
       
          
    }

    
}
