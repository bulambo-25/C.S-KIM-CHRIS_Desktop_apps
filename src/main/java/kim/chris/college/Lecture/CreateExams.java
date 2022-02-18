
package kim.chris.college.Lecture;

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
import kim.chris.college.COURSESS;
import kim.chris.college.Deposit;
import kim.chris.college.REGISTRACTION;
import kim.chris.college.Student;
import kim.chris.college.server.Database;


public class CreateExams extends JFrame implements ActionListener
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
    
    private JTextArea Question;
    
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
    
    private JTable table;
    DefaultTableModel tableModel;
    JScrollPane spTable;
    
    private ArrayList<QUESTIONW> QuestionList = new ArrayList<QUESTIONW>();
    
 public CreateExams()
 {
        mainFrame = new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelWest = new JPanel(); 
        panelWest.setBackground(new Color(33, 216, 179));
        paneCen = new JPanel();
        panelCen = new JPanel();
        panelCen.setBackground(Color.WHITE);
        panelNorth.setBackground(Color.WHITE);
        panelCenter = new JPanel();
        panelSouth= new JPanel();
        panelSouth.setBackground(new Color(33, 216, 179));
        panelCenter.setBackground(new Color(33, 216, 179));

        mainFrame.setPreferredSize(new Dimension(700, 370));
        
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

        lblDob = new JLabel("Question");
        lblDob.setHorizontalAlignment(JLabel.RIGHT);
        txtDob= new JTextField(15);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
        
        Question = new JTextArea();
        
        Option2 = new JLabel("        Option2");
        txtcboOption2= new JTextField(15);
        lblErrorNAtion = new JLabel("*required");
        lblErrorNAtion.setVisible(false);
        Option2.setBackground(Color.WHITE);
        Option2.setForeground(new Color(84, 153, 199));
        
        cboTitle = new JComboBox(new String[]{"","Female", "Male"});

        Option4 = new JLabel("        Answer:");
        txtOption4 = new JTextField(15);
        lblErrorEmail = new JLabel("*Require");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        Option4.setBackground(Color.WHITE);
        Option4.setForeground(new Color(84, 153, 199));
        
        lblPassword = new JLabel("        Password:");
        txtPassword= new JTextField();
        lblErrorPassword= new JLabel("*Password must be file");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        
        lblAnswer= new JLabel("        Answer:");
        txtAnswer= new JPasswordField();
        lblErrorAnswer= new JLabel("*required");
        lblErrorAnswer.setForeground(Color.red);
        lblErrorAnswer.setVisible(false);


        Option3 = new JLabel("        Option3:");
        txtOption3 = new JTextField(15);
        lblErrorMobile = new JLabel("*Require");
        lblErrorMobile.setForeground(Color.red);
        lblErrorMobile.setVisible(false);
        Option3.setBackground(Color.WHITE);
        Option3.setForeground(new Color(84, 153, 199));
        Option3.setBounds(10, 119, 159, 20);

        Option1 = new JLabel("        Option1: ");
        cboOption1 = new JTextField(15);
        lblErrorAdress = new JLabel("*required");
        lblErrorAdress.setForeground(Color.red);
        lblErrorAdress.setVisible(false);
        Option1.setForeground(new Color(84, 153, 199));
        
        lblFaculty = new JLabel("Faculty: ");
        cboFaculty = new JComboBox(new String[]
        {"Select","Engineering","Management", "Informtics && Design"});
        ErrSubject= new JLabel("*required");
        ErrSubject.setVisible(false);
        lblFaculty.setForeground(Color.WHITE);
        
        lblSubject2 = new JLabel("Course: ");
        lblSubject2.setHorizontalAlignment(JLabel.RIGHT);
        cboSubject2 = new JComboBox(new String[]
        {"Management", "ADF", "Multimedia", "Business","Math"});
        ErrSubject2= new JLabel("*required");
        ErrSubject2.setVisible(false);
        lblSubject2.setForeground(Color.BLACK);
        
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
        

        btnBack= new JButton("Back");
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
        lblPadding5 = new JLabel("        Lecture Answer");
        lb1Welcome = new JLabel("");
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("             QUESTIONS");
        lblPadding07.setBackground(new Color(84, 153, 199));
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
        panelNorth.setLayout(new GridLayout(1, 2));
        panelWest.setLayout(new GridLayout(7, 2));
        panelSouth.setLayout(new GridLayout(1, 2));
        panelCenter.setLayout(new GridLayout(1,1));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        


        panelNorth.add(lblPadding03);
        panelNorth.add(lblPadding07);
        
        
        panelCenter.add(new JScrollPane(table));
        tableModel.addColumn("Course");
        tableModel.addColumn("Question");
        tableModel.addColumn("Option1");
        tableModel.addColumn("Option2");
        tableModel.addColumn("Option3");
        tableModel.addColumn("Answer");
        tableModel.addColumn("TrueAnswer");
        
        panelWest.add(lblSubject2);
        panelWest.add(cboSubject2);
        
        
        panelWest.add(Option1);
        panelWest.add(cboOption1);
        
        panelWest.add(Option2);
        panelWest.add(txtcboOption2);
        
        panelWest.add(Option3);
        panelWest.add(txtOption3);
        
        panelWest.add(Option4);
        panelWest.add(txtOption4);
        
        panelCen.add(btnBack);
        panelCen.add(btnSUBMIT);
        
       
        
        panelWest.add(lblPadding5);
        panelWest.add(txtPassword);
        
         panelWest.add(lblPadding01);
        panelWest.add(panelCen);
        
        panelSouth.add(lblDob);
        panelSouth.add(Question);

       Data();
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
 public void INSERT()
 {
        try {
            String Course = cboSubject2.getSelectedItem().toString();
            String Option1= cboOption1.getText();
            String Option2= txtcboOption2.getText();
            String Option3 = txtOption3.getText();
            String Answer = txtOption4.getText();
            String QuestionS = Question.getText();
            String Qu = txtPassword.getText();
            QUESTIONW Q= new QUESTIONW(Course,QuestionS,Option1,Option2,Option3,Answer,Qu);
            DB.InsertQuestion(Q);
            JOptionPane.showMessageDialog(null, "Question Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(CreateExams.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 public void Data()
 {
      try {
                QuestionList = ques();
                table.setModel(tableModel);
                tableModel = (DefaultTableModel) table.getModel();
                tableModel.setRowCount(0);

                for (int i = 0; i < QuestionList.size(); i++) {

                    String id = QuestionList.get(i).getCourse();
                    String name = QuestionList.get(i).getQuestion();
                    String op1= QuestionList.get(i).getOption1();
                    String po2 = QuestionList.get(i).getOption2();
                    String opt3 = QuestionList.get(i).getOption3();
                    String ans = QuestionList.get(i).getAnswer();
                     String nm = QuestionList.get(i).getTrueAnswer();
                    
                    
                    Object[] pdata = {id, name,op1 ,po2,opt3,ans,nm};
                    System.out.println(pdata.toString());
                    tableModel.addRow(pdata);
                }
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
 }
 public ArrayList<QUESTIONW > ques() throws SQLException {

        String read = "SELECT * FROM APP.QUESTIONS ";
        String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
        String username = "KIM";
        String password = "CHRIS";
        Connection con= DriverManager.getConnection(url,username, password);
        Statement state = con.createStatement();
        ResultSet rs = state.executeQuery(read);
       
        ArrayList<QUESTIONW > V = new ArrayList<>();
        while(rs.next()) {
            String Cour = rs.getString("Course");
            String fname = rs.getString("Question");
            String option21 = rs.getString("Option1");
             String option2 = rs.getString("Option2");
            String option3 = rs.getString("Option3");
            String Answer= rs.getString("Answer");
            String TrueAnswer= rs.getString("TrueAnswer");
          QUESTIONW  www = new QUESTIONW (Cour , fname, option21,option2 ,option3,Answer,TrueAnswer);
            V.add(www);
            System.out.println("read successful");
            System.out.println(V.toString());
        }
        
        
        rs.close();
        state.close();
        return V;
    }
    
 public void Save()
 {
            
 }
   @Override
  public void actionPerformed(ActionEvent e) 
  {
    if (e.getSource() == btnSUBMIT)
        {
          
             INSERT();
             Data();
          
        }
     if (e.getSource() == cboSecurity)
        {
          
        
          
        }
     if (e.getSource() == btnSUBMIT)
        {
          
         Save();
          
        }
      if (e.getSource() == btnSearch)
        {
  
          
        }
      if (e.getSource() == btnBack)
        {
          
          mainFrame.setVisible(false);
          new LECTUREMENU().LECT();
          
        }
  }
   

}
