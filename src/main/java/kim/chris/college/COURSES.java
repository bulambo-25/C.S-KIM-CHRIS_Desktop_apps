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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import kim.chris.college.server.Database;


public class COURSES extends JFrame implements ActionListener
{
    Database DB= new  Database();
   private JFrame mainFrame;
   private JPanel panelNorth, panelWest,panelSouth, panelCenter,panelCen,paneCen; 


   private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4, panelBlank5;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;

    private Font font1;


    private JFrame MainFrame;
   
    private JLabel lblSearchID;
    private JComboBox Search;
    private JButton btnsearch;

    private JLabel lblGender;
    private JComboBox cboGender;
    private JLabel ErrorGender;
    
    private JLabel lblYearOfStudy;
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
    
    private JLabel lblFaculty;
    private JComboBox cboFaculty;
    private JLabel ErrSubject;
    
    private JLabel lblSubject2;
    private JComboBox cboSubject2;
    private JLabel ErrSubject2;
    
    private JLabel lblLecture;
    private JComboBox cboLecture;
    private JLabel ErrLecture;
    
    private JLabel lblLecture2;
    private JComboBox cboLecture2;
    private JLabel ErrLecture2;
    
    
    
    private JLabel lblSubject3;
    private JComboBox cboSubject3;
    private JLabel ErrSubject3;
    
    private JLabel lblSubject4;
    private JComboBox cboSubject4;
    private JLabel ErrSubject4;
    
    private JLabel lblLecture4;
    private JComboBox cboLecture4;
    private JLabel ErrLecture4;
    
 

    private JButton btnBack;
    private JButton btnSearch;
    private JButton btnSUBMIT;
    private JButton btnreset;
    
 public COURSES()
 {
        mainFrame = new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelWest = new JPanel();
        paneCen = new JPanel();
        panelCen = new JPanel();
        paneCen.setBackground(new Color(84, 153, 199));
        panelCen.setBackground(new Color(84, 153, 199));
        panelNorth.setBackground(Color.WHITE);
        panelCenter = new JPanel();
        panelSouth= new JPanel();
        panelCenter.setBackground(new Color(84, 153, 199));

        mainFrame.setPreferredSize(new Dimension(600, 370));

        panelBlank1 = new JLabel();
        panelBlank2 = new JLabel();
        panelBlank3 = new JLabel();
        panelBlank4 = new JLabel();
        panelBlank5 = new JLabel();

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
        
        lblYearOfStudy = new JLabel("        Year of Study: ");
        lblYearOfStudy.setForeground(Color.WHITE);
        cboSecurity = new JComboBox(new String[]{"Select","1","2","3"});
        ErrorSecurity = new JLabel("*required");
        ErrorSecurity.setForeground(Color.red);
        ErrorSecurity.setVisible(false);
        
        
        Name = new JLabel("Names: ");
        txtName = new JTextField(15);
        lblErrorName = new JLabel("*required");
        lblErrorName.setForeground(Color.red);
        lblErrorName.setVisible(false);
        Name.setForeground(Color.WHITE);

        Surname = new JLabel("Surname: ");
        txtSurname = new JTextField(15);
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.WHITE);

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
        lblEmail.setForeground(Color.WHITE);
        
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
        
        lblFaculty = new JLabel("Faculty: ");
        cboFaculty = new JComboBox(new String[]
        {"Select","Engineering","Management", "Informtics && Design"});
        ErrSubject= new JLabel("*required");
        ErrSubject.setVisible(false);
        lblFaculty.setForeground(Color.WHITE);
        
        lblSubject2 = new JLabel("Program: ");
        cboSubject2 = new JComboBox(new String[]
        {"Choose","Management", "ADF", "Multimedia", "Business","Math"});
        ErrSubject2= new JLabel("*required");
        ErrSubject2.setVisible(false);
        lblSubject2.setForeground(Color.WHITE);
        
        lblLecture = new JLabel("        Lecture: ");
        cboLecture = new JComboBox(new String[]
        {"Choose","RUBBEN", "ALPHON", "FARAI", "NATHAN","PAUL"});
        ErrSubject2= new JLabel("*required");
        ErrSubject2.setVisible(false);
        lblLecture.setForeground(Color.WHITE);
        
        lblSubject3= new JLabel("Program: ");
        cboSubject3 = new JComboBox(new String[]
        {"Choose","Physic", "Networking", "Design", "Project prat","Communication"});
        ErrSubject3= new JLabel("*required");
        ErrSubject3.setVisible(false);
        lblSubject3.setForeground(Color.WHITE);
        
        lblLecture2 = new JLabel("        Lecture: ");
        cboLecture2 = new JComboBox(new String[]
        {"Choose","FRANCK", "MPONENG", "MBALI", "ANGE","KATIA"});
        ErrSubject2= new JLabel("*required");
        ErrSubject2.setVisible(false);
        lblLecture2.setForeground(Color.WHITE);
        
        lblSubject4= new JLabel("Program: ");
        cboSubject4 = new JComboBox(new String[]
        {"Choose","Project", "Math Algorith", "ADP", "Multimedia Design","Marketing"});
        ErrSubject4= new JLabel("*required");
        ErrSubject4.setVisible(false);
        lblSubject4.setForeground(Color.WHITE);
        
        lblLecture4 = new JLabel("        Lecture: ");
        cboLecture4 = new JComboBox(new String[]
        {"Choose","BURGER", "JOHN", "EMMA"});
        lblLecture4.setForeground(Color.WHITE);
        Name.setHorizontalAlignment(JLabel.LEFT);
        

        btnBack= new JButton("Cancel");
        btnSUBMIT = new JButton("Save");
        btnreset = new JButton("Reset");
        btnSearch= new JButton("Search"); 
        btnSearch.setBackground(new Color(26, 188, 156 ));
                
        btnBack.setForeground(Color.BLACK);
        btnBack.setBackground(Color.RED);
        btnBack.setFocusable(false);
        btnSUBMIT.setForeground(Color.BLACK);
        btnSUBMIT.setFocusable(false);
        btnSUBMIT.setBackground(new Color(26, 188, 156 ));


        btnreset.setForeground(Color.BLACK);
        btnreset.setBackground(Color.white);
        
        lblPadding0 = new JLabel("");
        lblPadding01 = new JLabel("");
        lblPadding1 = new JLabel("");
        lblPadding03 = new JLabel("");
        lblPadding04 = new JLabel("");
        lblPadding5 = new JLabel("");
        lb1Welcome = new JLabel("");
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("FACULTY");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        
        btnBack.addActionListener(this);
        btnSUBMIT.addActionListener(this);
        btnreset.addActionListener(this);
        btnSearch.addActionListener(this);
        cboFaculty.addActionListener(this);
        cboSecurity.addActionListener(this);
 }
 public void SETGUI()
 {
        panelCen.setLayout(new GridLayout(1, 2));
        paneCen.setLayout(new GridLayout(1, 2));
        panelWest.setLayout(new GridLayout(10, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelCenter.setLayout(new GridLayout(10, 4));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        


        panelCenter.add(lblPadding03);
        panelCenter.add(lblPadding07);
        panelCenter.add(lblPadding06);
        panelCenter.add(lblPadding04);
        
        panelCenter.add(Name);
        panelCenter.add(txtName);
        panelCenter.add(btnSearch);
        panelCenter.add(lblPadding0);
        
         panelCenter.add(Surname);
        panelCenter.add(txtSurname);
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        
        panelCenter.add(lblFaculty);
        panelCenter.add(cboFaculty);
        panelCenter.add(lblYearOfStudy);
        panelCenter.add(cboSecurity);
        
        panelCenter.add(lblSubject2);
        panelCenter.add(cboSubject2);
        panelCenter.add(lblLecture);
        panelCenter.add(cboLecture);
        
        panelCenter.add(lblSubject3);
        panelCenter.add(cboSubject3);
        panelCenter.add(lblLecture2);
        panelCenter.add(cboLecture2);
        
        panelCenter.add(lblSubject4);
        panelCenter.add(cboSubject4);
        panelCenter.add(lblLecture4);
        panelCenter.add(cboLecture4);
        
        paneCen.add(lblPadding01);
        paneCen.add(btnSUBMIT);
        panelCen.add(btnBack);
        panelCen.add(lblPadding5);
        
        panelCenter.add(panelBlank1);
        panelCenter.add(panelBlank2);
        panelCenter.add(panelBlank3);
        panelCenter.add(panelBlank4);
        
                
        panelCenter.add(lblPadding8);
        panelCenter.add(paneCen);
        panelCenter.add(lblPadding9);
        panelCenter.add(panelCen);
       

        
       
        
        
        

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
 public void FACULTY()
 {
     if (cboFaculty.getSelectedItem().equals("Engineering"))
     {
         cboSubject2.setSelectedItem("Math");
         cboSubject3.setSelectedItem("Physic");
         cboSubject4.setSelectedItem("Multimedia Design");
         
     }
      if (cboFaculty.getSelectedItem().equals("Management"))
     {
         cboSubject2.setSelectedItem("Management");
         cboSubject3.setSelectedItem("Communication");
         cboSubject4.setSelectedItem("Marketing");
         
     }
        if (cboFaculty.getSelectedItem().equals("Informtics && Design"))
     {
         cboSubject2.setSelectedItem("ADF");
         cboSubject3.setSelectedItem("Networking");
         cboSubject4.setSelectedItem("ADP");
         
     }
 }
 public void YEARS()
 {
      if (cboSecurity.getSelectedItem().equals("1"))
     {
         cboLecture.setSelectedItem("ALPHON");
         cboLecture2.setSelectedItem("MBALI");
         cboLecture4.setSelectedItem("JOHN");
         
     }
      if (cboSecurity.getSelectedItem().equals("2"))
     {
         cboLecture.setSelectedItem("FARAI");
         cboLecture2.setSelectedItem("MPONENG");
         cboLecture4.setSelectedItem("EMMA");
         
     }
        if (cboSecurity.getSelectedItem().equals("3"))
     {
         cboLecture.setSelectedItem("NATHAN");
         cboLecture2.setSelectedItem("FRANCK");
         cboLecture4.setSelectedItem("BURGER");
         
     }
 }
 public void Save()
 {
                try {String NAME = txtName.getText();
                String SURNAME = txtSurname.getText();
                String EMAIL = txtEmail.getText();
                String Faculty = cboFaculty.getSelectedItem().toString();
                String YEAR = cboSecurity.getSelectedItem().toString();
                String Program = cboSubject2.getSelectedItem().toString();
                String LECTURE = cboLecture.getSelectedItem().toString();
                String ProGram = cboSubject3.getSelectedItem().toString();
                String Lecture2 = cboLecture2.getSelectedItem().toString();
                String Program3 = cboSubject4.getSelectedItem().toString();
                String LECTURES= cboLecture4.getSelectedItem().toString();
                
                COURSESS co= new COURSESS(NAME,SURNAME,EMAIL,Faculty,YEAR,Program,LECTURE,ProGram,Lecture2,Program3,LECTURES);
                if(cboFaculty.getSelectedItem().equals("Select") && cboSecurity.getSelectedItem().equals("Select"))
                {
                  JOptionPane.showMessageDialog(this, "SELECT YOUR FACULTY && YEAR") ; 
                }
                DB.COURSESUpdate(co);
                txtName.setText("");
                txtSurname.setText("");
                txtEmail.setText("");
                cboFaculty.setSelectedItem("Select");
                cboSecurity.setSelectedItem("Select");
                cboSubject2.setSelectedItem("Choose");
                cboLecture.setSelectedItem("Choose");
                cboSubject3.setSelectedItem("Choose");
                cboLecture2.setSelectedItem("Choose");
                cboSubject4.setSelectedItem("Choose");
                cboLecture4.setSelectedItem("Choose");
                JOptionPane.showMessageDialog(this, "SAVED SUCESSFULLY");
                 mainFrame.setVisible(false);
                new Deposit().DEP();
                } 
                catch ( Exception e )
                {
                e.printStackTrace();
                } 
 }
  private void REA()
{                                        
              String pid =  txtName.getText();
              String Sear="SELECT * FROM APP.Courses where Student_Name= ?";
             try 
                {
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
               if(txtName.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(this, "Fill your Surname ");
               }
             if ( rs.next() == true )
                {
                 
                 
                 String Se=rs.getString("Student_Surname");
                 String Ge=rs.getString("Student_Email");
                 txtSurname.setText(Se);
                 txtEmail.setText(Ge);
                 
                 

        
         
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
   @Override
  public void actionPerformed(ActionEvent e) 
  {
    if (e.getSource() == cboFaculty)
        {
          
            FACULTY(); 
          
        }
     if (e.getSource() == cboSecurity)
        {
          
           YEARS(); 
          
        }
     if (e.getSource() == btnSUBMIT)
        {
          
         Save();
          
        }
      if (e.getSource() == btnSearch)
        {
          
           REA();
          
        }
      if (e.getSource() == btnBack)
        {
          
          mainFrame.setVisible(false);
          new REGISTRACTION().setGui();
          
        }
  }
   
}
