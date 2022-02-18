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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import kim.chris.college.Lecture.QUESTIONW;
import kim.chris.college.Lecture.StudentAnswer;
import kim.chris.college.server.Database;

public class AVExma extends JFrame implements ActionListener
{
    Database DB= new  Database();
   private JFrame mainFrame;
   private JPanel panelNorth, panelWest,panelSouth, panelCenter,panelName,paneSurname,paneLg,paneS,p,fg,sd,ab,op,a,mk,kl; 


   private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4, panelBlank5;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;

    private Font font1;


    private JFrame MainFrame;
   
    private JLabel lblSearchID;
    private JTextField Search;
    private JButton btnsearch;

    private JLabel lblGender;
    private JTextField cboGender;
    private JLabel ErrorGender;
    
    private JTextArea Question;
    
    private JLabel lblYearOfStudy;
    private JTextField cboSecurity;
    private JLabel ErrorSecurity;
    
    private JTextField JTextField;
    
    private JLabel Name;
    private JTextField txtName;
    private JLabel lblErrorName;

    private JLabel Surname;
    private JTextField txtSurname;
    private JLabel lblErrorSurname;


    private JLabel Option4;
    private JTextField txtOption4;
    private JLabel lblErrorEmail;

    private JLabel Option3;
    private JTextField txtOption3;
    private JLabel lblErrorMobile;
    
    public JLabel lblPassword;
    private JTextField txtPassword;
    private JLabel lblErrorPassword;
    
    private JLabel lblAnswer;
    private JTextField txtAnswer;
    private JLabel lblErrorAnswer;

    private JLabel Option2;
    private JTextField txtcboOption2;
    private JLabel lblErrorNAtion;
    
    private JLabel Option1;
    private JTextField cboOption1;
    private JLabel lblErrorAdress;

    private JLabel lblDob;
    private JTextField txtDob;
    private JLabel lblErrortxtDob;
    
    private JLabel lblFaculty;
    private JTextField cboFaculty;
    public JLabel ErrSubject;
    
    private JLabel lblSubject2;
    private JTextField cboSubject2;
    private JLabel ErrSubject2;
    
    private JLabel lblLecture;
    private JTextField cboLecture;
    private JLabel ErrLecture;
    
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel Count;
    
    
    
    private JLabel lblSubject3;
    private JTextField cboSubject3;
    private JLabel ErrSubject3;
    
    private JLabel lblSubject4;
    private JTextField cboSubject4;
    private JLabel ErrSubject4;
    
    private JLabel lblLecture4;
    private JTextField cboLecture4;
    private JLabel ErrLecture4;
    
 

    private JButton btnBack;
    private JButton btnSearch;
    private JButton btnSUBMIT;
    private JButton btnreset;
    
    private JTable table;
    DefaultTableModel tableModel;
    JScrollPane spTable;
    
    private ArrayList<QUESTIONW> QuestionList = new ArrayList<QUESTIONW>();
    Database bs= new Database();
    private int in;
    private int numberofQuestion;
    
 public AVExma()
 {      
        mainFrame = new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelWest = new JPanel();
        paneSurname = new JPanel();
        paneSurname.setBackground(new Color(84, 153, 199));
        panelName = new JPanel();
        kl= new JPanel();
        panelName.setBackground(new Color(84, 153, 199));
        paneLg= new JPanel();
        paneLg.setBackground(new Color(84, 153, 199));
        p= new JPanel();
        fg= new JPanel();
        fg.setBackground(Color.WHITE);
        paneS= new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelCenter = new JPanel();
        panelSouth= new JPanel();
        panelCenter.setBackground( Color.WHITE);

        mainFrame.setPreferredSize(new Dimension(700, 370)); 
        Count = new JLabel("                     Next>> 1 ");
        
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(500,50));
       
        
        panelBlank1 = new JLabel();
        panelBlank2 = new JLabel();
        panelBlank3 = new JLabel();
        panelBlank4 = new JLabel();
        panelBlank5 = new JLabel();

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 200);

        lblSearchID= new JLabel();
        Search= new JTextField();
        btnsearch= new JButton("Search");
        
        lblGender = new JLabel();
        cboGender = new JTextField();
        ErrorGender = new JLabel();
        
        
        lblYearOfStudy = new JLabel("Exam: ");
        lblYearOfStudy.setForeground(Color.BLACK);
        cboSecurity = new JTextField();
        ErrorSecurity = new JLabel();
        
        
        Name = new JLabel();
        txtName = new JTextField(15);
        lblErrorName = new JLabel();
        lblErrorName.setForeground(Color.red);

        Surname = new JLabel();
        txtSurname = new JTextField(15);
        lblErrorSurname = new JLabel();



        lblDob = new JLabel();
        lblDob.setHorizontalAlignment(JLabel.RIGHT);
        txtDob= new JTextField(15);
        lblErrortxtDob = new JLabel();
        
        Question = new JTextArea();
        
        Option2 = new JLabel();
        txtcboOption2= new JTextField(15);
        lblErrorNAtion = new JLabel();

   

        Option4 = new JLabel();
        txtOption4 = new JTextField(15);
        lblErrorEmail = new JLabel();
        lblErrorEmail.setForeground(Color.red);

        lblPassword = new JLabel();
        txtPassword= new JTextField();
        lblErrorPassword= new JLabel();

        
        lblAnswer= new JLabel();
        txtAnswer= new JPasswordField();
        lblErrorAnswer= new JLabel();



        Option3 = new JLabel();
        txtOption3 = new JTextField(15);
        lblErrorMobile = new JLabel();
       
        Option3.setBackground(Color.WHITE);
        Option3.setForeground(new Color(84, 153, 199));
        Option3.setBounds(10, 119, 159, 20);

        Option1 = new JLabel();
        cboOption1 = new JTextField(15);
        lblErrorAdress = new JLabel("Student Number:");
        
        lblFaculty = new JLabel("Faculty: ");
        cboFaculty = new JTextField();
        ErrSubject= new JLabel();
        lblFaculty.setForeground(Color.RED);
        
        lblSubject2 = new JLabel();
        lblSubject2.setHorizontalAlignment(JLabel.RIGHT);
        cboSubject2 = new JTextField();
        ErrSubject2= new JLabel("*required");
        
        
        lblLecture = new JLabel("        Lecture: ");
        cboLecture = new JTextField();
        ErrSubject2= new JLabel();
       
        
        lblSubject3= new JLabel("Program: ");
        cboSubject3 = new JTextField();
        ErrSubject3= new JLabel();
        
        
        lblEmail = new JLabel("        Lecture: ");
        txtEmail = new JTextField();
        ErrSubject2= new JLabel();
       
        lblSubject4= new JLabel("Program: ");
        cboSubject4 = new JTextField();
        ErrSubject4= new JLabel();
       
        
        lblLecture4 = new JLabel("        Lecture: ");
        cboLecture4 = new JTextField();
       
        

        btnBack= new JButton("Cancel");
        btnSUBMIT = new JButton("Next");
        btnreset = new JButton("Reset");
        btnSearch= new JButton("Search"); 
        btnSearch.setBackground(new Color(26, 188, 156 ));
                
        btnBack.setForeground(Color.BLACK);
        btnBack.setBackground(Color.RED);
        btnBack.setFocusable(false);
        btnSUBMIT.setForeground(Color.WHITE);
        btnSUBMIT.setFocusable(false);
        btnSUBMIT.setBackground(new Color(84, 153, 199));
        btnSUBMIT.setHorizontalAlignment(JButton.CENTER);

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
        lblPadding07 = new JLabel();
        lblPadding07.setBackground(new Color(84, 153, 199));
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        
        btnBack.addActionListener(this);
        btnSUBMIT.addActionListener(this);
        btnreset.addActionListener(this);
        btnSearch.addActionListener(this);
        cboFaculty.addActionListener(this);
        cboSecurity.addActionListener(this);
        in=0;
        
 
 }
 public void SETGUI()
 {
        panelNorth.setLayout(new GridLayout(1, 2));
        panelWest.setLayout(new GridLayout(6, 2));
        panelSouth.setLayout(new GridLayout(1, 2));
        fg.setLayout(new GridLayout(2, 2));
        paneSurname.setLayout(new GridLayout(1,7 ));
        panelCenter.setLayout(new GridLayout(5,1));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        REA();
        FDA();
        ques();
        paneLg.add(lblPadding07);
        paneLg.add(txtName);
        paneLg.add(lblPadding06);
        panelName.add(panelBlank1);
        panelName.add(panelBlank2);
        panelName.add(panelBlank3);
        panelName.add(panelBlank4);
        panelName.add(panelBlank5);
        fg.add(lblYearOfStudy);
        fg.add(lblErrorName);
        fg.add(lblErrorAdress);
        fg.add(ErrSubject);
        p.add(lblPadding9);
        p.add(Surname);
        panelCenter.add(fg);
        panelCenter.add(Name);
        panelCenter.add(panelName);
        panelCenter.add(paneLg);
        kl.add(lblPadding5);
        kl.add(Count);
        paneSurname.add(lblPadding01);
        paneSurname.add(lblPadding5);
        paneSurname.add(btnSUBMIT);
        paneSurname.add(lblPadding0);
        paneSurname.add(Count);
        
        panelCenter.add(paneSurname);
        

         dd()  ;
        
       
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
 
     public  void FDA(){
    
        try {
            String hh= lblErrorName.getText();
            String query = "SELECT COUNT(*) FROM APP.QUESTIONS where Course='"+hh+"'";
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                int count=rs.getInt(1);
                Count.setText("  Next>> " + (in+ 1) + " of "+String.valueOf(count));
                in++;
                System.out.println("ssss");
            }else{System.out.println("eeeee");}
        } catch (SQLException ex) {
            Logger.getLogger(AVExma.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }  
 
 public void check()
 {
     if(txtName.getText().isEmpty())
     {
          int Option= JOptionPane.showConfirmDialog(this, "NO Answer Do you wanna Go to the Next Page ","Exit",JOptionPane.YES_NO_OPTION); 
            if (Option==0)
            {
             INSERT();
             Delete();
             ques();
             txtName.setText("");
              dd()  ;
            }
     }else 
     {
       INSERT();
       Delete();
       ques();
       txtName.setText("");  
       ques();
     }
 }
 public void INSERT()
 {   try {
     String Course = lblPadding9.getText();
     String Ques = Name.getText();
     String SA = txtName.getText();
     String LA = Surname.getText();
     String SN = ErrSubject.getText();
     if (Surname.getText().equals(SA) )
     {
     StudentAnswer Stud= new StudentAnswer(SN,Course,Ques,SA,LA,"10");
     System.out.println("you got right this question");
     JOptionPane.showMessageDialog(this, "you got right this question");
     DB.InsertAnswerQuestion(Stud);  
     }else{
     StudentAnswer Stud= new StudentAnswer(SN,Course,Ques,SA,LA,"00");
     JOptionPane.showMessageDialog(this, "you got wrong this question");
     System.out.println("you got wrong this question");
     DB.InsertAnswerQuestion(Stud);   
     }
     
        } catch (SQLException ex) {
            Logger.getLogger(AVExma.class.getName()).log(Level.SEVERE, null, ex);
        }
 } 

  private void REA()
{                                        
              String pid =  "Dray";
              String Sear="SELECT * FROM APP.CCC where Lecture= ?";
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
                 
                 
                 String Se=rs.getString("Course");
                 
                
                 lblErrorName.setText(Se);
                 

        
         
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
    public void qes()
    {
        STUDENTPR y= new STUDENTPR();
         y.lblNUmber.setText(ErrSubject.getText());
    }
 public void ques(){

        try {
            String use = lblErrorName.getText();
            String read = "SELECT * FROM APP.QUESTIONS where Course='"+use+"'";
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url,username, password);
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(read);
            
            
            if(rs.next()) {
                String Cour = rs.getString("Course");
                String name = rs.getString("Question");
                String option21 = rs.getString("Option1");
                String option2 = rs.getString("Option2");
                String option3 = rs.getString("Option3");
                String Answer= rs.getString("Answer");
                String trueAnswer= rs.getString("TrueAnswer");
                Name.setText(name);//Question
                panelBlank1.setText(option21);
                panelBlank2.setText(option2);
                panelBlank3.setText(option3);
                panelBlank4.setText(Answer);
                lblPadding9.setText(Cour);//course
                Surname.setText(trueAnswer);
               
                System.out.println("read successful");
                
            }else 
            {
                JOptionPane.showMessageDialog(this, "EXAM SUBMITTED ");
                mainFrame.setVisible(false);
                STUDENTPR nn= new STUDENTPR();
                nn.profil();
              
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(AVExma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
    }
 public void dd()
 {in =1;
     if(in>0)
     {
         in = in ++;
     }
 }
 void Delete() {                                        
              try {
            String dele = "delete from APP.QUESTIONS where Question =?";
            String pid = Name.getText();
             String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement ps= con.prepareStatement(dele);

            ps.setString(1, pid);
            int k = ps.executeUpdate();
            
            if(k==1)
            {
            JOptionPane.showMessageDialog(this, "Next Question ");
           
                 
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "Record Failed");
            }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage());
        }
 
        
    }
   @Override
  public void actionPerformed(ActionEvent e) 
  {
    if (e.getSource() == btnSUBMIT)
        {  
        
         if(in>0)
        
    
          FDA();
           
          check();
          in = in ++;
          
          
        }
     if (e.getSource() == cboSecurity)
        {
          
        
          
        }
    
      if (e.getSource() == btnSearch)
        {
  
          
        }
      if (e.getSource() == btnBack)
        {
          
          mainFrame.setVisible(false);
          new REGISTRACTION().setGui();
          
        }
  }
   
}
