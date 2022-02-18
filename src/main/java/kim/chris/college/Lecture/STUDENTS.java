/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college.Lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import kim.chris.college.Student;
import org.apache.commons.validator.EmailValidator;

public class STUDENTS extends JFrame implements ActionListener {

    private JFrame mainFrame;
    private JPanel panelNorth, panelWest,panelSouth, panelCenter; 

    private JLabel lblPicture;

    private JLabel lblCompanyName;

    private JButton btnInventory;
    private JButton btnPersonnel;
    private JButton btnSchedule;
    private JButton btnCriminal;
    private JButton btnJailCell;

    private JPanel panelBlank1, panelBlank2, panelBlank3, panelBlank4, panelBlank5;
    //private ArrayList<Details> playerList = new ArrayList<Details>();
    private Font font1;

    Insets btnInsets = new Insets(5, 5, 5, 5);

    private JFrame MainFrame;
    private JLabel Victime;
    private JLabel cboVictime;
    private JLabel lblErrorVictime;
     
    private JLabel lblSearchID;
    private JComboBox Search;
    private JButton btnsearch;

    private JLabel ComplainID;
    private JLabel txtComplainID;
    private JLabel cboComplainID;

    private JLabel VictimeID;
    private JTextField txtVictimeID;
    private JLabel lblErrorVictimeID;
    
    private JComboBox cboTitle;
    
    private JLabel Name;
    private JLabel txtName;
    private JLabel lblErrorName;

    private JLabel Surname;
    private JTextField txtSurname;
    private JLabel lblErrorSurname;

    

    private JLabel lblOptinal;

    private JLabel lblGender;
    private JPanel panelGender;
    private JRadioButton radMale;
    private JRadioButton radFemale;
    private JLabel lblErrorGender;
    private ButtonGroup GenderGroup;

    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblErrorEmail;

    private JLabel lblMobile;
    private JTextField txtMobile;
    private JLabel lblErrorMobile;

    private JLabel lblAdress;
    private JTextField cboAdress;
    private JLabel lblErrorAdress;

    private JLabel Complain;
    private JLabel cboComplain;
    private JLabel lblErrorComplain;

    private JLabel ComplainV;
    private JTextField txtComplainV;
    private JLabel cboComplainV;
    private JLabel lblDob;
    private JTextField txtDob;
    private JLabel lblErrortxtDob;
    
    private JLabel InvenstigationOfficerID;
    private JTextField txtInvenstigationOfficerID;
    private JLabel lblErrorInvenstigationOfficerID;

    private JLabel OfficerName;
    private JTextField txtOfficerName;
    private JLabel lblErrorOfficerName;

    private JLabel RegistractionDate;
    private JTextField txtRegistractionDate;
    private JLabel lblErrorRegistractionDate;

    private JLabel CrimeDate;
    private JTextField txtCrimeDate;
    private JLabel lblErrorCrimeDate;

    private JButton btnBack;
    private JButton btnSave;
    private JButton btnreset;
    private JButton btnbtnView;
    private Font ft1;
    private JTable table;
    DefaultTableModel tableModel;
    JScrollPane spTable;
    private ArrayList<Student> StudentList = new ArrayList<Student>();

    public STUDENTS() 
    {
        
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        table.setBackground(Color.WHITE);
        mainFrame = new JFrame("PS Manager");
        panelNorth = new JPanel();
        panelNorth.setBackground(new Color(27, 78, 164));
        panelWest = new JPanel();
        panelWest.setBackground(new Color(27, 78, 164));
        panelCenter = new JPanel();
        panelSouth= new JPanel();
        panelCenter.setBackground(Color.WHITE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 2 / 3;
        int width = screenSize.width * 2 / 3;
        mainFrame.setPreferredSize(new Dimension(480,560));

        font1 = new Font("Impact", Font.PLAIN, 40);

        

        lblCompanyName = new JLabel("LIST OF STUDENT");
        lblCompanyName.setHorizontalAlignment(JLabel.CENTER);
        lblCompanyName.setFont(font1);
        lblCompanyName.setForeground(new Color(84, 153, 199));

        btnInventory = new JButton("INVENTORY");
        btnInventory.setForeground(Color.BLACK);
        btnInventory.setMargin(btnInsets);

        btnPersonnel = new JButton("PERSONNEL");
        btnPersonnel.setForeground(Color.BLACK);
        btnPersonnel.setMargin(btnInsets);

        btnSchedule = new JButton("SCHEDULE");
        btnSchedule.setForeground(Color.BLACK);
        btnSchedule.setMargin(btnInsets);

        btnCriminal = new JButton("CRIMINAL");
        btnCriminal.setForeground(Color.BLACK);
        btnCriminal.setMargin(btnInsets);

        btnJailCell = new JButton("JAIL CELL");
        btnJailCell.setForeground(Color.BLACK);
        btnJailCell.setMargin(btnInsets);

        panelBlank1 = new JPanel();
        panelBlank1.setBackground(new Color(27, 78, 164));
        panelBlank2 = new JPanel();
        panelBlank2.setBackground(new Color(27, 78, 164));
        panelBlank3 = new JPanel();
        panelBlank3.setBackground(new Color(27, 78, 164));
        panelBlank4 = new JPanel();
        panelBlank4.setBackground(new Color(27, 78, 164));
        panelBlank5 = new JPanel();
        panelBlank5.setBackground(new Color(27, 78, 164));

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 200);
        ft1 = new Font("Arial", Font.BOLD, 16);

        Victime = new JLabel();
        cboVictime = new JLabel("Victime Details",SwingConstants.CENTER);
        lblErrorVictime = new JLabel ();
        
        lblSearchID= new JLabel();
        Search= new JComboBox();
        btnsearch= new JButton("Search");
        
        ComplainID = new JLabel("Date");
        txtComplainID = new JLabel();
        cboComplainID = new JLabel();
        cboComplainID.setForeground(Color.red);
        cboComplainID.setVisible(false);
        ComplainID.setForeground(Color.BLACK);
        VictimeID = new JLabel("   Victime ID: ");
        txtVictimeID = new JTextField(15);
        lblErrorVictimeID = new JLabel("*required");
        lblErrorVictimeID.setForeground(Color.red);
        lblErrorVictimeID.setVisible(false);
        VictimeID.setForeground(Color.BLACK);

        Name = new JLabel();
        txtName = new JLabel();
        lblErrorName = new JLabel();
        lblErrorName.setForeground(Color.red);
        lblErrorName.setVisible(false);
        Name.setForeground(Color.BLACK);
        Name.setHorizontalAlignment(JLabel.LEFT);

        Surname = new JLabel("   Surname: ");
        txtSurname = new JTextField(15);
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);

        lblDob = new JLabel("   Date Of Birth");
        txtDob= new JTextField(15);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
        
        
        lblOptinal = new JLabel("  Opitional");
        lblOptinal.setVisible(false);
        lblDob.setForeground(Color.BLACK);

        lblGender = new JLabel("   Gender ");
        panelGender = new JPanel();
        radMale = new JRadioButton("Male");
        radFemale = new JRadioButton("Female");
        GenderGroup = new ButtonGroup();
        GenderGroup.add(radMale);
        GenderGroup.add(radFemale);
        panelGender.setLayout(new GridLayout(1, 2));
        panelGender.add(radFemale);
        panelGender.add(radMale);
        lblErrorGender = new JLabel("*required");
        lblErrorGender.setForeground(Color.red);
        lblErrorGender.setVisible(false);
        radFemale.setSelected(true);
        lblGender.setForeground(Color.BLACK);
        cboTitle = new JComboBox(new String[]{"","Female", "Male"});

        lblEmail = new JLabel("   Email:");
        txtEmail = new JTextField(15);
        lblErrorEmail = new JLabel("*Require");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);

        lblMobile = new JLabel("   Mobile:");
        txtMobile = new JTextField(15);
        lblErrorMobile = new JLabel("*Require");
        lblErrorMobile.setForeground(Color.red);
        lblErrorMobile.setVisible(false);
        lblMobile.setBackground(Color.WHITE);
        lblMobile.setForeground(Color.BLACK);
        lblMobile.setBounds(10, 119, 159, 20);

        lblAdress = new JLabel();
        cboAdress = new JTextField(15);
        lblErrorAdress = new JLabel();
        lblErrorAdress.setVisible(false);


        Complain = new JLabel();
        cboComplain = new JLabel("Complaints",SwingConstants.CENTER);
        lblErrorComplain = new JLabel();
        lblErrorComplain.setForeground(Color.red);
        lblErrorComplain.setVisible(false);
        Complain.setForeground(Color.BLACK);
        cboComplain.setFont(ft1);

        ComplainV = new JLabel("   Complaint : ");
        txtComplainV = new JTextField(15);
        cboComplainV = new JLabel("*required");
        cboComplainV.setForeground(Color.red);
        cboComplainV.setVisible(false);
        ComplainV.setForeground(Color.BLACK);

        InvenstigationOfficerID = new JLabel("   Invenstigation Officer ID: ");
        txtInvenstigationOfficerID = new JTextField(15);
        lblErrorInvenstigationOfficerID = new JLabel("*required");
        lblErrorInvenstigationOfficerID.setForeground(Color.red);
        lblErrorInvenstigationOfficerID.setVisible(false);
        InvenstigationOfficerID.setForeground(Color.BLACK);

        OfficerName = new JLabel("   Officer Name: ");
        txtOfficerName = new JTextField(15);
        lblErrorOfficerName = new JLabel("*required");
        lblErrorOfficerName.setForeground(Color.red);
        lblErrorOfficerName.setVisible(false);
        OfficerName.setForeground(Color.BLACK);

        RegistractionDate = new JLabel("   Registration Date: ");
        txtRegistractionDate = new JTextField(15);
        lblErrorRegistractionDate = new JLabel("*required");
        lblErrorRegistractionDate.setForeground(Color.red);
        lblErrorRegistractionDate.setVisible(false);
        RegistractionDate.setForeground(Color.BLACK);

        CrimeDate = new JLabel("   Crime Date: ");
        txtCrimeDate = new JTextField(15);
        lblErrorCrimeDate = new JLabel("*required");
        lblErrorCrimeDate.setForeground(Color.red);
        lblErrorCrimeDate.setVisible(false);
        CrimeDate.setForeground(Color.BLACK);

        ft1 = new Font("Arial", Font.BOLD, 18);

        btnBack= new JButton("Back");
        btnSave = new JButton("Save");
        btnreset = new JButton("Reset");
        btnbtnView= new JButton("Display");
                
        btnBack.setForeground(Color.white);
        btnBack.setBackground(Color.blue);
        btnBack.setFont(ft1);

        btnSave.setForeground(Color.white);
        btnSave.setBackground(Color.blue);
        btnSave.setFont(ft1);

        btnreset.setForeground(Color.white);
        btnreset.setBackground(Color.blue);
        btnreset.setFont(ft1);
        
        btnbtnView.setForeground(Color.white);
        btnbtnView.setBackground(Color.blue);
        btnbtnView.setFont(ft1);
        
        btnBack.addActionListener(this);
        btnSave.addActionListener(this);
        btnreset.addActionListener(this);
        btnsearch.addActionListener(this);
        btnbtnView.addActionListener(this);
    }
    
    public void VIEW() throws SQLException {
        
        panelNorth.setLayout(new GridLayout(3, 1));
        panelCenter.setLayout(new FlowLayout());
       // panelSouth.setLayout(new GridLayout(1, 3));
        //mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        panelCenter.add(lblCompanyName);
        //panelNorth.add(lblAdress);
        //panelNorth.add(btnBack);
       // panelNorth.add(lblErrorAdress);

       // panelCenter.add(cboComplainID);
       // panelCenter.add(ComplainID);
       // panelCenter.add(txtComplainID);
        
       // panelCenter.add(Name);
       // panelCenter.add(lblErrorName);
       // panelCenter.add(txtName);
        
        panelCenter.add(new JScrollPane(table));
        tableModel.addColumn("STUDENT N");
        tableModel.addColumn("Names");
        tableModel.addColumn("Surname");
        panelCenter.add(btnBack);
        
        
       
        
        
         read();
        SA();
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
    public ArrayList<Student > read() throws SQLException {

        String read = "SELECT * FROM APP.STUDENTSS ";
        String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
        String username = "KIM";
        String password = "CHRIS";
        Connection con= DriverManager.getConnection(url,username, password);
        Statement state = con.createStatement();
        ResultSet rs = state.executeQuery(read);
       
        ArrayList<Student > V = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("StudentID");
            String fname = rs.getString("Student_Name");
            String sname = rs.getString("Student_Surname");
            
            Student  de = new Student (id, fname, sname );
            V.add(de);
            System.out.println("read successful");
            System.out.println(V.toString());
        }
        
        
        rs.close();
        state.close();
        return V;
    }
    
public void SA()
{
       try {
                StudentList = read();
                table.setModel(tableModel);
                tableModel = (DefaultTableModel) table.getModel();
                tableModel.setRowCount(0);

                for (int i = 0; i < StudentList.size(); i++) {

                    int id = StudentList.get(i).getStudentNumber();
                    String name = StudentList.get(i).getStudentName();
                    String surname = StudentList.get(i).getStudentSurname();
                    
                    
                    Object[] pdata = {id, name, surname};
                    System.out.println(pdata.toString());
                    tableModel.addRow(pdata);
                }
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
}
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnBack)
        {
             mainFrame.setVisible(false);
               new LECTUREMENU().LECT();
        }
        
        }
        
 

}

