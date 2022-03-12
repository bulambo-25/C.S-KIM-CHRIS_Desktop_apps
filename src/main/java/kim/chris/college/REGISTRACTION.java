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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import kim.chris.college.server.Database;
import org.apache.commons.validator.routines.EmailValidator;

public class REGISTRACTION extends JFrame implements ActionListener {
   
    Database DB= new  Database();
    private JFrame mainFrame;
    private JPanel panelNorth, panelWest,panelSouth, panelCenter; 


    private JPanel panelBlank1, panelBlank2, panelBlank3, panelBlank4, panelBlank5;

    private Font font1;


    private JFrame MainFrame;
   
    private JLabel lblSearchID;
    private JComboBox Search;
    private JButton btnsearch;

    private JLabel lblGender;
    private JComboBox cboGender;
    private JLabel ErrorGender;
    
    private JLabel lblSecurity;
    private JComboBox cboSecurity;
    private JLabel ErrorSecurity;
    
    private JComboBox cboTitle;
    
    private JLabel Name;
    private JTextField txtName;
    private JLabel lblErrorName;

    private JLabel Surname;
    private JTextField txtSurname;
    private JLabel lblErrorSurname;


    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblErrorEmail;

    private JLabel lblMobile;
    private JTextField txtMobile;
    private JLabel lblErrorMobile;
    
    public JLabel lblPassword;
    private JPasswordField txtPassword;
    private JLabel lblErrorPassword;
    
    private JLabel lblAnswer;
    private JTextField txtAnswer;
    private JLabel lblErrorAnswer;

    private JLabel NAtion;
    private JTextField txtNAtion;
    private JLabel lblErrorNAtion;
    
    private JLabel lblAdress;
    private JTextField cboAdress;
    private JLabel lblErrorAdress;

    private JLabel lblDob;
    private JTextField txtDob;
    private JLabel lblErrortxtDob;
    
    private JLabel lblSubject;
    private JComboBox cboSubject;
    private JLabel ErrSubject;
    
    private JLabel lblSubject2;
    private JComboBox cboSubject2;
    private JLabel ErrSubject2;
    
    private JLabel lblSubject3;
    private JComboBox cboSubject3;
    private JLabel ErrSubject3;
    
 

    private JButton btnBack;
    private JButton btnRegister;
    private JButton btnreset;


    

    public REGISTRACTION() {
        
      
        mainFrame = new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelWest = new JPanel();
        panelCenter = new JPanel();
        panelSouth= new JPanel();
        panelCenter.setBackground(new Color(0,206,209));

        mainFrame.setPreferredSize(new Dimension(600, 370));

        panelBlank1 = new JPanel();
        panelBlank1.setBackground(new Color(0,206,209));
        panelBlank2 = new JPanel();
        panelBlank2.setBackground(new Color(27, 78, 164));
        panelBlank3 = new JPanel();
        panelBlank3.setBackground(new Color(27, 78, 164));
        panelBlank4 = new JPanel();
        panelBlank4.setBackground(new Color(27, 78, 164));
        panelBlank5 = new JPanel();
        panelBlank5.setBackground(new Color(0,206,209));

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 200);

        lblSearchID= new JLabel();
        Search= new JComboBox();
        btnsearch= new JButton("Search");
        
        lblGender = new JLabel("        Gender: ");
        cboGender = new JComboBox(new String[]{"Select", "Male","Female"});
        ErrorGender = new JLabel("*required");
        ErrorGender.setForeground(Color.red);
        ErrorGender.setVisible(false);
        
        lblSecurity = new JLabel("        Security Question: ");
        cboSecurity = new JComboBox(new String[]{"Select", "What city were you born in?",
            "What's your oldest sibling’s "
                    + "middle name?","What's your car’s license plate number?"});
        ErrorSecurity = new JLabel("*required");
        ErrorSecurity.setForeground(Color.red);
        ErrorSecurity.setVisible(false);
        
        
        Name = new JLabel("        Names: ");
        txtName = new JTextField(15);
        lblErrorName = new JLabel("*required");
        lblErrorName.setForeground(Color.red);
        lblErrorName.setVisible(false);
        Name.setForeground(Color.BLACK);
        Name.setHorizontalAlignment(JLabel.LEFT);

        Surname = new JLabel("        Surname: ");
        txtSurname = new JTextField(15);
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);

        lblDob = new JLabel("        Date Of Birth");
        txtDob= new JTextField(15);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
   
        NAtion = new JLabel("        Nationality");
        txtNAtion= new JTextField(15);
        lblErrorNAtion = new JLabel("*required");
        lblErrorNAtion.setVisible(false);
        NAtion.setBackground(Color.WHITE);
        NAtion.setForeground(Color.BLACK);
        
        cboTitle = new JComboBox(new String[]{"","Female", "Male"});

        lblEmail = new JLabel("        Email:");
        txtEmail = new JTextField(15);
        lblErrorEmail = new JLabel("*Require");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);
        
        lblPassword = new JLabel("        Password:");
        txtPassword= new JPasswordField();
        lblErrorPassword= new JLabel("*Password must be file");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        
        lblAnswer= new JLabel("        Answer:");
        txtAnswer= new JPasswordField();
        lblErrorAnswer= new JLabel("*required");
        lblErrorAnswer.setForeground(Color.red);
        lblErrorAnswer.setVisible(false);


        lblMobile = new JLabel("        Mobile:");
        txtMobile = new JTextField(15);
        lblErrorMobile = new JLabel("*Require");
        lblErrorMobile.setForeground(Color.red);
        lblErrorMobile.setVisible(false);
        lblMobile.setBackground(Color.WHITE);
        lblMobile.setForeground(Color.BLACK);
        lblMobile.setBounds(10, 119, 159, 20);

        lblAdress = new JLabel("        Adress: ");
        cboAdress = new JTextField(15);
        lblErrorAdress = new JLabel("*required");
        lblErrorAdress.setForeground(Color.red);
        lblErrorAdress.setVisible(false);
        lblAdress.setForeground(Color.BLACK);
        
        lblSubject = new JLabel("        Subject 1: ");
        cboSubject = new JComboBox(new String[]
        {"Choose","ADF", "BUSINESS ", "HOSPITALITY", "MANAGEMENT","MARKETING", "TOURISM"});
        ErrSubject= new JLabel("*required");
        ErrSubject.setVisible(false);
        
        lblSubject2 = new JLabel("        Subject 2: ");
        cboSubject2 = new JComboBox(new String[]
        {"Choose","Project", "ADP", "Multimedia", "Physic","Math"});
        ErrSubject2= new JLabel("*required");
        ErrSubject2.setVisible(false);
        
        lblSubject3= new JLabel("        Subject 3: ");
        cboSubject3 = new JComboBox(new String[]
        {"Choose","Inf.System", "Design", "Multimedia", "Project prat","History"});
        ErrSubject3= new JLabel("*required");
        ErrSubject3.setVisible(false);


        btnBack= new JButton("Back");
        btnRegister = new JButton("Register");
        btnreset = new JButton("Reset");

                
        btnBack.setForeground(Color.BLACK);
        btnBack.setBackground(Color.white);


        btnRegister.setForeground(Color.BLACK);
        btnRegister.setBackground(Color.white);


        btnreset.setForeground(Color.BLACK);
        btnreset.setBackground(Color.white);

        btnBack.addActionListener(this);
        btnRegister.addActionListener(this);
        btnreset.addActionListener(this);
        btnsearch.addActionListener(this);
        txtEmail.addActionListener(this);
    }
    
    public void setGui() {

        panelNorth.setLayout(new GridLayout(1, 2));
        panelWest.setLayout(new GridLayout(10, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);

        
        
        panelCenter.setLayout(new GridLayout(11, 3));
       
        



        panelCenter.add(Name);
        panelCenter.add(txtName);
        panelCenter.add(lblErrorName);
        
        panelCenter.add(Surname);
        panelCenter.add(txtSurname);
        panelCenter.add(lblErrorSurname);
        
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(lblErrorEmail);
        
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(lblErrorPassword);
        
        panelCenter.add(lblSecurity);
        panelCenter.add(cboSecurity);
        panelCenter.add(ErrorSecurity);
        
        panelCenter.add(lblAnswer);
        panelCenter.add(txtAnswer);
        panelCenter.add(lblErrorAnswer);
        
        panelCenter.add(lblMobile);
        panelCenter.add(txtMobile);
        panelCenter.add(lblErrorMobile);
        
        panelCenter.add(lblDob);
        panelCenter.add(txtDob);
        panelCenter.add(lblErrortxtDob);
        
        panelCenter.add(lblGender);
        panelCenter.add(cboGender);
        panelCenter.add(ErrorGender);
        
        panelCenter.add(lblAdress);
        panelCenter.add(cboAdress);
        panelCenter.add(lblErrorAdress);
        
        panelCenter.add(NAtion);
        panelCenter.add(txtNAtion);
        panelCenter.add(lblErrorNAtion);
        
        /*
        panelCenter.add(lblSubject);
        panelCenter.add(cboSubject);
        panelCenter.add(ErrSubject);
        
        panelCenter.add(lblSubject2);
        panelCenter.add(cboSubject2);
        panelCenter.add(ErrSubject2);
        
        panelCenter.add(lblSubject3);
        panelCenter.add(cboSubject3);
        panelCenter.add(ErrSubject3);
        */

        
        
        
        panelSouth.add(btnBack);
        panelSouth.add(btnRegister);
        panelSouth.add(btnreset);

        
       
        
        
        

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
  
    public boolean Validation()
    {
        String u=txtEmail.getText();
        boolean valid = false;
        if(valid)
        {
        if (txtName.getText().equals("")) {
            valid = false;
            lblErrorName.setVisible(true);
        }
        
        if (txtSurname.getText().equals("")) {
            valid = false;
            lblErrorSurname.setVisible(true);
        }
        
        if (!EmailValidator.getInstance().isValid(txtEmail.getText())) {
            valid = false;
            lblErrorEmail.setVisible(true);
        } 
        if (!u.equals("")) {
           Number();
        } 
         if(txtPassword.getText().equals("")) {
            valid = false;
            lblErrorPassword.setVisible(true);
        } 
         if(txtPassword.getPassword().length<5) {
            valid = false;
  
            JOptionPane.showMessageDialog(null, "Password must be 8....");
                    
         } 
         
         if (cboSecurity.getSelectedItem().equals("Select")) {
            valid = false;
            ErrorSecurity.setVisible(true);
        }
          if(txtAnswer.getText().equals("")) {
            valid = false;
            lblErrorAnswer.setVisible(true);
        } 
        
        if (cboAdress.getText().equals("")) {
            valid = false;
            lblErrorAdress.setVisible(true);
        }
         
         if(txtDob.getText().equals("")) {
            valid = false;
            lblErrortxtDob.setVisible(true);
        } 
          if (cboGender.getSelectedItem().equals("Select")) {
            valid = false;
            ErrorGender.setVisible(true);
        }
         
         if(txtNAtion.getText().equals("")) {
            valid = false;
            lblErrorNAtion.setVisible(true);
        } 
        
    }else 
    {
      In();}
        return valid;
    }
  public void In()
  {
          
           try {
               
                String NAME = txtName.getText();
                String SURNAME = txtSurname.getText();
                String EMAIL = txtEmail.getText();
                String PASSWORD = txtPassword.getText();
                String SECURITY = cboSecurity.getSelectedItem().toString();
                String ANSWER = txtAnswer.getText();
                String MOBILE = txtMobile.getText();
                String DATE = txtDob.getText();
                String GENDER = cboGender.getSelectedItem().toString();
                String ADRESS = cboAdress.getText();
                String NATION= txtNAtion.getText();
                Student students= new Student(NAME,SURNAME,EMAIL,PASSWORD,SECURITY,ANSWER,MOBILE,DATE,GENDER,ADRESS,NATION,"","","","45000");
                DB.Insert(students);
                Attendance Attendance= new Attendance(EMAIL,"000","0");
                COURSESS Courses=new COURSESS(NAME,SURNAME,EMAIL,"","","","","","","","");
                DB.InsertAttedance(Attendance);
                DB.CoursesINSERT(Courses);
                JOptionPane.showMessageDialog(null, "Register Sucessfully");
              
                mainFrame.setVisible(false);
                 new COURSES().SETGUI();
           } catch (SQLException ex) {
                Logger.getLogger(REGISTRACTION.class.getName()).log(Level.SEVERE, null, ex);
           }
             
  }    
public void RESET() 
{
    
        txtName.setText("");
        lblErrorName.setText("");
        
        txtSurname.setText("");
        lblErrorSurname.setText("");
        
        txtEmail.setText("");
        lblErrorEmail.setText("");
        
        txtPassword.setText("");
        lblErrorPassword.setText("");
        
        cboSecurity.setSelectedItem("");
        ErrorSecurity.setText("");
        
        txtAnswer.setText("");
        lblErrorAnswer.setText("");

        txtMobile.setText("");
        lblErrorMobile.setText("");
        
        txtDob.setText("");
        lblErrortxtDob.setText("");
        

        cboGender.setSelectedItem("");
        ErrorGender.setText("");
        

        cboAdress.setText("");
        lblErrorAdress.setText("");
        
        txtNAtion.setText("");
        lblErrorNAtion.setText("");
} 
    
public void Number()
    {
        String Email=txtEmail.getText();
        try {
                 String query = "select *from APP.STUDENTSS where Student_Email ='"+Email+"'";
                 String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                 String username = "KIM";
                 String password = "CHRIS";
                 Connection con= DriverManager.getConnection(url, username, password);  
            PreparedStatement statmnt = con.prepareStatement(query);
            ResultSet result = statmnt.executeQuery(); 
            
             if (result.next())
            {  lblErrorEmail.setVisible(true);
               lblErrorEmail.setText("Email Already Exist");
                
                
            }
        } catch (Exception k) {
  
            JOptionPane.showMessageDialog(null, "Email Address not found"+k.getMessage());
        }
                     
    }   
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnBack)
        {
            mainFrame.setVisible(false);
            new LOGINPAGE().setGUI(); 
        }
        if (e.getSource() == btnRegister)
        {
          
            Validation();  
          
        }
         if (e.getSource() == btnreset)
        {
          
             RESET()  ;
          
        }
        
    }

   

}

