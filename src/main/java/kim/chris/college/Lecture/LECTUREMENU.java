/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kim.chris.college.Lecture;

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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import kim.chris.college.ANNOUNCEMENT;
import kim.chris.college.CONTENT;
import kim.chris.college.EXAMS;
import kim.chris.college.OPENPAGE;
import kim.chris.college.STUDENTPR;
import kim.chris.college.TIMETABLE;


public class LECTUREMENU  extends Frame implements ActionListener
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
    
    private JTextField lblNUmber;
    private JTextField lblPadding2;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;
    
    private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4,panelBlank6,panelBlank7, panelBlank5;
    
    private Font ft1, ft2, ft3, ft4;
     
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
    private JLabel cboGender;
    private JLabel lblErrortxtDob;
    
    private JLabel lblAmount;
    private JLabel Amount;
    private JLabel lAmount;
    
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JLabel lblErrorPassword;


    private JFrame MainFrame;
    JLabel label;
    JScrollPane spTable;
   
    
    private JButton btnLogin, button;
    private JButton btnForgot;
    private JButton btnNext;
    private JButton btnSearchv;
    

    private JButton btnBack;
    
    public LECTUREMENU()
    {
        
        main= new JFrame("KIM-CHRIS");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(33, 216, 179));
        panelCenter.setBackground(new Color(33, 216, 179));
        panelWest = new JPanel();
        panelWest.setBackground(new Color(33, 216, 179));

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
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("user.png").getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon Icon = new ImageIcon(new ImageIcon("door-key.png").getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon eIcon = new ImageIcon(new ImageIcon("Message.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon on = new ImageIcon(new ImageIcon("log-out.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon Book = new ImageIcon(new ImageIcon("Book.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon writing= new ImageIcon(new ImageIcon("writing.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        ImageIcon smartphone= new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        lblCompanyName = new JLabel("CONTENT     ");
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
        Emai = new JLabel("Email:  ");
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        lblEmail.setIcon(imageIcon);
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail = new JTextField("Student Number");
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
        lblPassword.setIcon(Icon);
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
        lblPadding2 = new JTextField("Forgot Password");
        lblPadding2.setBackground(new Color(33, 216, 179));
        lb1Welcome = new JLabel("");
        lb1Welcome.setForeground(new Color(0, 205, 179));
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        button = new JButton("Add picture");
        button.setBounds(300,300,100,40);
        label = new JLabel();
        lblNUmber= new JTextField(15);
        
        
        Surname = new JLabel();
        txtSurname = new JLabel("");
        lblErrorSurname = new JLabel("*required");
        lblErrorSurname.setForeground(Color.red);
        lblErrorSurname.setVisible(false);
        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel("Gender:  ");
        cboGender = new JLabel();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
        
        lblAmount = new JLabel("You owe the institution:  R");
        Amount = new JLabel();
        lblAmount.setHorizontalAlignment(JLabel.RIGHT);
        lAmount = new JLabel("R");
        lAmount.setForeground(Color.red);
        lAmount.setVisible(false);
        
         ft1 = new Font("Arial", Font.BOLD, 16);
        
        btnLogin = new JButton("Member");
        btnLogin.setBackground(Color.white);
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

        btnBack= new JButton("Sign out");
        btnBack.setBackground(Color.white);

        
        btnForgot= new JButton("Courses Exam");
        btnForgot.setBackground(new Color(204, 204, 255));

        btnInventory = new JButton("STUDENT");
        btnInventory.setBackground(Color.WHITE);
        

        btnPersonnel = new JButton("Announcement");
        btnPersonnel.setBackground(Color.WHITE);
       

        btnSchedule = new JButton("Back");
        btnSchedule.setBackground(Color.WHITE);
      

        btnCriminal = new JButton("Mark");
        btnCriminal.setBackground(Color.WHITE);


        btnJailCell = new JButton("Exams");
        btnJailCell.setBackground(Color.WHITE);
        
        btnSearchv= new JButton("SET The Available");
        btnSearchv.setBackground(Color.WHITE);
        

        
        
        btnJailCell.addActionListener(this);
        btnSearchv.addActionListener(this);
        btnLogin.addActionListener(this);
        btnNext.addActionListener(this);
        btnForgot.addActionListener(this);
        btnBack.addActionListener(this);
        lblPadding2.addActionListener(this);
        button.addActionListener(this);
        btnInventory.addActionListener(this);
        btnPersonnel.addActionListener(this);
        btnCriminal.addActionListener(this);
    }
   

public void LECT() 
{ 
        panelCenter.setLayout(new GridLayout(4, 2));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(14, 1));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        main.add(panelWest, BorderLayout.WEST);
        
       
       
        panelNorth.add(lblCompanyName);
        lblCompanyName.setHorizontalAlignment(JLabel.CENTER);

        panelCenter.add(btnInventory);
        btnInventory.setForeground( Color.WHITE);
        btnInventory.setBackground(new Color(33, 216, 179));
        panelCenter.add(btnCriminal);
        btnCriminal.setForeground( Color.WHITE);
        btnCriminal.setBackground(new Color(33, 216, 179));
        panelCenter.add(btnJailCell);
        btnJailCell.setForeground( Color.WHITE);
        btnJailCell.setBackground(new Color(33, 216, 179));
        panelCenter.add(btnPersonnel);
        btnPersonnel.setForeground( Color.WHITE);
        btnPersonnel.setBackground(new Color(33, 216, 179));
        panelCenter.add(btnSearchv);
        btnSearchv.setForeground( Color.WHITE);
        btnSearchv.setBackground(new Color(33, 216, 179));
        panelCenter.add(btnBack); 
        btnBack.setBackground(new Color(33, 216, 179));
        btnBack.setForeground( Color.WHITE);
        panelCenter.add(btnForgot); 
        btnForgot.setBackground(new Color(33, 216, 179));
        btnForgot.setForeground( Color.WHITE);
        panelCenter.add(Surname); 
        Surname.setBackground(new Color(33, 216, 179));
        Surname.setForeground( Color.WHITE);
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
  @Override
  public void actionPerformed(ActionEvent e) 
  {
    if (e.getSource() == btnCriminal)
        {
            main.setVisible(false);
            new EXAMCO().settt();
          
        }
    if (e.getSource() == btnInventory)
        {
        try {
            main.setVisible(false);
            new STUDENTS().VIEW();
        } catch (SQLException ex) {
            Logger.getLogger(LECTUREMENU.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        }
     if (e.getSource() == btnJailCell)
        {
            main.setVisible(false);
              new CreateExams().SETGUI();
          
        }
     if (e.getSource() == btnPersonnel)
        {
           
            
          
        }
     if (e.getSource() == btnBack)
        {
        
            main.setVisible(false);
            System.exit(0);
        
          
        }
     if (e.getSource() == btnSearchv)
        {
        
            main.setVisible(false);
            new SETAVAILABLE().LECT();
          
        }
       
           if (e.getSource() == btnForgot)
        {
        
            main.setVisible(false);
            new Courses().CT();
          
        }
     
    }
 
}
