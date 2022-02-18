/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import kim.chris.college.Lecture.LECTUREMENU;
import kim.chris.college.Lecture.QUESTIONW;
import kim.chris.college.server.Database;

public class FORGETPASSWORD extends Frame implements ActionListener
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
public FORGETPASSWORD()
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

        panelCenter.setLayout(new GridLayout(7, 3));


        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);  
        
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
public void ATT() 
{
    //String SURN= txtSecurity.getText();
    String SRN= txtName.getText();
    String EMAI= txtPassword.getText();
    QUESTIONW a= new QUESTIONW(SRN,EMAI);
    DB.UpdatePassword(a);

}

public void Check() throws SQLException
  {
         String url="jdbc:derby://localhost:1527/KIM-CHRIS";
         String username = "KIM";
         String password = "CHRIS";
         
         String SE=txtSecurity.getText();
         String answ=txtAnswer.getText();
       
        try
        {
         Connection con= DriverManager.getConnection(url, username, password);
         String query=" select *from APP.STUDENTSS where Student_Security=? and  Student_Answer=?";
         PreparedStatement ps=con.prepareStatement(query);
         ps.setString(1,SE);
         ps.setString(2,answ);
          ResultSet rs=ps.executeQuery();
           if (txtPassword.getText().equals("")) {
            
            lblPadding07.setText("Fill New password");
            lblPadding07.setForeground(Color.red);
       }
         if(txtSecurity.getText().isEmpty() && txtAnswer.getText().isEmpty())
         {
            
            lblPadding07.setText("Question ID and Answer must be fill");
            lblPadding07.setForeground(Color.red);
             
         }
          
         else if (rs.next())
         {
         
          
           UPDATEPASSWORD();
              
                
               
         }else {
             JOptionPane.showMessageDialog(null,"Lectures ID and Password does not match");
              
            lblPadding07.setText("Wrong Answer ");
            lblPadding07.setForeground(Color.red);
         }
        }catch(SQLException g)
        {
           JOptionPane.showMessageDialog(null, g.getMessage());
         }
     
  }
public void SELECT()
    {
        
        
             try
                {   
                    String Emaill=txtEmail.getText();
                    String Sear="SELECT * FROM APP.STUDENTSS where Student_Email= ?";
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1,Emaill);
                    ResultSet rs = ps.executeQuery();
            if(txtEmail.getText().isEmpty() )
            {
            
            lblPadding07.setText("Email Empty");
            lblPadding07.setForeground(Color.red);
            }
            else if ( rs.next())
            {   
               
                String Name =  rs.getString("Student_Name"); 
                String Question =  rs.getString("Student_Security"); 
                txtName.setText(Name);
                txtSecurity.setText(Question);
                lblPadding07.setText("");
            }else
            {
               lblPadding07.setText("Wrong Email Adress"); 
               lblPadding07.setForeground(Color.red);
            }
        } catch (Exception k) {
  
            JOptionPane.showMessageDialog(null, "Email Address not found"+k.getMessage());
        }
                     
    }
  public void UPDATEPASSWORD()
    {
     
      
       try {
            String SUR=txtName.getText();
            String DEP=txtPassword.getText();
            
            String Update="update APP.STUDENTSS set Student_password='"+DEP +"'where Student_Name='"+SUR+"'";
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url, username, password);
            PreparedStatement statmnt = con.prepareStatement(Update); 
            statmnt.execute();
           
            lblPadding07.setText("");
            JOptionPane.showMessageDialog(null, "New Password  Updated");
            mainFrame.setVisible(false);
            new LOGINPAGE().setGUI() ;
        } catch (SQLException ex) {
            System.out.println("error"+ex);
      
       }         
    } 
  @Override
   
      public void actionPerformed(ActionEvent e) {

        if (e.getSource() ==btnBack )
        {
             mainFrame.setVisible(false);
            new LOGINPAGE().setGUI();
           
            

        } 
        if (e.getSource() ==btnSearch )
        {
         
           SELECT();
            

        } 
         if (e.getSource() ==Retrieve )
        {
         
            
            try {
                Check();
            } catch (SQLException ex) {
                Logger.getLogger(FORGETPASSWORD.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            

        } 
    }
   
}

