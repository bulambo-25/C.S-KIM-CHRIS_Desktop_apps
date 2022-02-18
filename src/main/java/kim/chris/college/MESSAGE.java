/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;


import com.sun.mail.util.logging.MailHandler;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import kim.chris.college.server.Database;
import org.apache.commons.validator.routines.EmailValidator;


public class MESSAGE extends Frame implements ActionListener{
    
    Database DB= new  Database();
    private JFrame main;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest,PAnelSouth,panelenter;
    
    private JLabel lblCompanyName;
    private JLabel lblProfile;
    
    private JMenuBar MenuBar;
    private JMenu Menu1;
    private JMenu Menu2;
    private JMenu Menu3;
    
    private JMenuItem Item1;
    private JMenuItem Item2;
    private JMenuItem Item3;
    
    
    private Calendar calendar;
    private SimpleDateFormat timeformat;
    private SimpleDateFormat dayformat;
    private SimpleDateFormat Dateformat;
    private JLabel timelabel;
    private JLabel daylabel;
    private JLabel Datelabel;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;
    
  
     
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
    private JTextField cboGender;
    private JLabel lblErrortxtDob;
    
    private JLabel lblAmount;
    private JTextArea Amount;
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
    private JScrollPane jscrollPane;
    private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4,panelBlank6,panelBlank7, panelBlank5;
    private JLabel panelBlank8, panelBlank9, panelBlank10, panelBlank11,panelBlank12,panelBlank13, panelBlank15;
    private JLabel panelBlank16, panelBlank17, panelBlank18, panelBlank19,panelBlank20,panelBlank21, panelBlank22;
    private JButton btnBack;
    String time;
    String day;
    String Date;
    String from ,to, host,sub,content;
    public MESSAGE()
    {
        
        main= new JFrame("");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel(); 
        panelSouth.setBackground(new Color(84, 153, 199));
        panelCenter = new JPanel();
        panelenter = new JPanel();
        panelCenter.setBackground(new Color(84, 153, 199));

       PAnelSouth= new JPanel();
        panelWest = new JPanel();
        panelWest.setBackground(new Color(84, 153, 199));

        main.setPreferredSize(new Dimension(500, 290));
        
        MenuBar = new JMenuBar();
        Menu1=new JMenu("Message");
        Menu2=new JMenu("Email");
        Menu3=new JMenu("Meeting");
        Item1=new JMenuItem ("My Grades");
        Item2=new JMenuItem ("Discussions");
        Item3=new JMenuItem ("Help");
        lblCompanyName = new JLabel("EMAIL");
        lblCompanyName.setForeground(Color.LIGHT_GRAY);
        Menu3.add(Item1);
        Menu3.add(Item2);
        Menu3.add(Item3);
        Dateformat = new SimpleDateFormat("MMMMM dd, yyyy");
        Datelabel= new JLabel();
        Datelabel.setFont(new Font("Ink Free",Font.PLAIN,10));
        
        timeformat = new SimpleDateFormat("hh:mm:ss a");
        timelabel= new JLabel();
        timelabel.setFont(new Font("Verdana",Font.PLAIN,10));
        timelabel.setForeground(new Color(0x00FF00));
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);
        
        dayformat = new SimpleDateFormat("EEEE");
        daylabel= new JLabel();
        daylabel.setFont(new Font("Ink Free",Font.PLAIN,10));
        
         
        timelabel.setHorizontalAlignment(JLabel.LEFT);
        
        lblEmail = new JLabel();
        Emai = new JLabel("to:");
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail = new JTextField();
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
        
        lb1Welcome = new JLabel("");
        lb1Welcome.setForeground(new Color(0, 205, 179));
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        button = new JButton("Add picture");
        button.setBounds(300,300,100,40);
        label = new JLabel();
        
        
        
        Surname = new JLabel("Surname:  ");
        txtSurname = new JLabel("");
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel("From:");
        cboGender = new JTextField();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
       
        lblAmount = new JLabel("");
        Amount = new JTextArea();
        jscrollPane=new JScrollPane(Amount,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
         //Amount.setPreferredSize(new Dimension(250,40));
        lblAmount.setHorizontalAlignment(JLabel.RIGHT);
        lAmount = new JLabel("R");
        lAmount.setForeground(Color.red);
        lAmount.setVisible(false);
        
        
        btnLogin = new JButton("Send");
        btnLogin.setHorizontalAlignment(JLabel.RIGHT);
        btnLogin.setBackground(new Color(26, 188, 156 ));
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
        btnBack.setBackground(new Color(231, 76, 60 ));

        
        panelBlank1 = new JLabel();
        panelBlank6= new JLabel();
        panelBlank2 = new JLabel();
        panelBlank3 = new JLabel();
        panelBlank4 = new JLabel("");
        panelBlank7 = new JLabel();
        panelBlank5 = new JLabel();
        panelBlank8 = new JLabel();
        panelBlank9= new JLabel();
        panelBlank10 = new JLabel();
        panelBlank11 = new JLabel();
        panelBlank12 = new JLabel("");
        panelBlank13 = new JLabel();
        panelBlank15 = new JLabel();
        panelBlank16 = new JLabel();
        panelBlank17 = new JLabel();
        panelBlank18 = new JLabel("");
        panelBlank19 = new JLabel();
        panelBlank20= new JLabel();
        
        btnLogin.addActionListener(this);
        btnNext.addActionListener(this);
        btnBack.addActionListener(this);
        Item1.addActionListener(this);
        Item2.addActionListener(this);
        Item3.addActionListener(this);
        
    }
    
    public void SendEmail() 
{       //panelCenter.setBackground(Color.WHITE);
        panelCenter.setLayout(new GridLayout(3, 3));
        panelenter.setLayout(new GridLayout(1, 2));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        PAnelSouth.setLayout(new GridLayout(15, 1));
        //panelWest.setLayout(new GridLayout(5, 1));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        //main.add(panelWest, BorderLayout.WEST);
        main.add(PAnelSouth, BorderLayout.WEST);
        //panelenter.setLayout(new GridLayout(1, 3));
        MenuBar.add(Menu1);
        MenuBar.add(Menu2);
        MenuBar.add(Menu3);
        panelCenter.add(lblPadding0);  
        panelCenter.add(lblPadding01);
        panelCenter.add(Datelabel);
        
        Surname.setHorizontalAlignment(JLabel.RIGHT);
        panelCenter.add(Emai);
        panelCenter.add(txtEmail);
        panelCenter.add(lblPadding03);
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        panelenter.add(btnLogin);
        panelenter.add(btnBack);
        panelCenter.add(lblGender);
        panelCenter.add(cboGender);
        panelCenter.add(panelenter);
        
        
       
        panelSouth.add(lblAmount);
        panelSouth.add(jscrollPane);
        panelSouth.add(lblPadding9);
        
        
        Date=Dateformat.format(Calendar.getInstance().getTime());
        Datelabel.setText(Date);
       
        panelNorth.add(MenuBar);
        lblCompanyName.setHorizontalAlignment(JLabel.CENTER);
       
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
    public void RESET() 
{
    txtEmail.setText("");
    cboGender.setText("");
    Amount.setText("");
    

}
    public void SetTime()
{
    while(true)
    {
        time=timeformat.format(Calendar.getInstance().getTime());
        timelabel.setText(time);
        day=dayformat.format(Calendar.getInstance().getTime());
        daylabel.setText(day);
        Date=Dateformat.format(Calendar.getInstance().getTime());
        Datelabel.setText(Date);
        
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
    }
} 
 

     @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnBack)
        {
           
        }
        if (e.getSource() == Item2)
        {
         System.out.print("ssssss");
        }
         if (e.getSource() == Item1)
        {
         
            try {
                main.setVisible(false);
                new STUDENTPR().profil();
            } catch (SQLException ex) {
                Logger.getLogger(MESSAGE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) {
        new MESSAGE ().SendEmail();
    }
}
