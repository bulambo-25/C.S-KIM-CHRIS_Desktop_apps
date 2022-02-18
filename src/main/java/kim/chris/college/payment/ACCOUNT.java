
package kim.chris.college.payment;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import kim.chris.college.LOGINPAGE;
import kim.chris.college.Lecture.QUESTIONW;
import kim.chris.college.OPENPAGE;
import kim.chris.college.server.Database;


public class ACCOUNT extends Frame implements ActionListener
{
    
   

    private JFrame mainFrame;
    private JPanel panelNorth,panelCenter,panelSouth;




    private JLabel lblCompanyName;
    
    private JTextField lblPadding2;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07, lblPadding8;
    
    private Font ft1, ft2, ft3, ft4;
     
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblErrorEmail;
    
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblErrorName;
    
    private JLabel lblSecurity;
    private JTextField txtSecurity;
    
    private JLabel lblAnswer;
    private JTextField txtAnswer;

    
    
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JLabel lblErrorPassword;


    private JFrame MainFrame;

   
    
    private JButton btnSearch;
    private JButton Retrieve;


    private JButton btnBack;

     Database DB= new Database();
public ACCOUNT()
{
        mainFrame = new JFrame("");

        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(84, 153, 199));

       
        
        mainFrame.setPreferredSize(new Dimension(600, 370));

       
       

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 300);
        
        
        lblEmail = new JLabel("Email");
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail = new JTextField("");
        
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);
        
        lblName = new JLabel("Name");
        lblName.setHorizontalAlignment(JLabel.RIGHT);
        txtName = new JTextField("");
        
        lblSecurity = new JLabel("Security Question");
        lblSecurity.setHorizontalAlignment(JLabel.RIGHT);
        txtSecurity = new JTextField("");
        
        lblAnswer = new JLabel("Answer");
        lblAnswer.setHorizontalAlignment(JLabel.RIGHT);
        txtAnswer = new JTextField("");
        
        lblPassword = new JLabel("Password");
        lblPassword.setHorizontalAlignment(JLabel.RIGHT);
        txtPassword= new JTextField("Password");
        lblErrorPassword= new JLabel("*Password must be filled");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        
        lblCompanyName = new JLabel("          CREATE A ACCOUNT ");

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
        
        
        
         ft1 = new Font("Arial", Font.BOLD, 16);
        
        btnSearch = new JButton("Search");
        btnSearch.setBackground(Color.white);
        btnSearch.setForeground(Color.BLACK);


        btnBack= new JButton("Back");
        btnBack.setBackground(Color.white);

        
        Retrieve= new JButton("Retrieve");
        Retrieve.setBackground(new Color(204, 204, 255));

        

        
        
        
      
        btnSearch.addActionListener(this);
        Retrieve.addActionListener(this);
        btnBack.addActionListener(this);

        
}

public void setGUI() 
{
  
        panelSouth.setLayout(new GridLayout(1, 3));

        panelCenter.setLayout(new GridLayout(8, 3));


        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);  
        
        panelCenter.add(lblPadding04);
        panelCenter.add(lblCompanyName);
        panelCenter.add(lblPadding03);
        
        panelCenter.add(lblPadding06);
        panelCenter.add(lblPadding07);
        panelCenter.add(lblPadding8);
      
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(btnSearch);
        
        panelCenter.add(lblName);
        panelCenter.add(txtName);
        panelCenter.add(lblPadding5);
        
        panelCenter.add(lblSecurity);
        panelCenter.add(txtSecurity);
        panelCenter.add(lb1Welcome);
        
        panelCenter.add(lblAnswer);
        panelCenter.add(txtAnswer);
        panelCenter.add(Retrieve);
        
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(lblPadding01);
        
        panelCenter.add(lblPadding1);
        panelCenter.add(btnBack);
        panelCenter.add(lblPadding0);



        
        
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


  @Override
   
      public void actionPerformed(ActionEvent e) {

        if (e.getSource() ==btnBack )
        {
           
            
           
            

        } 
        if (e.getSource() ==btnSearch )
        {
         
           
            

        } 
         if (e.getSource() ==Retrieve )
        {
         
            
           

        } 
    }
   public static void main(String[] args) {
        new ACCOUNT().setGUI();
    }
}

 

