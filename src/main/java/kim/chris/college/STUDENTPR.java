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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;


public class STUDENTPR extends Frame implements ActionListener{
    
    
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
    
    public JLabel lblNUmber;
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
    
    public JLabel Surname;
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
    String PICTE;
    String k;
    
    private JButton btnLogin, button;
    private JButton btnForgot;
    private JButton btnNext;
    private JButton btnSearchv;
    

    private JButton btnBack;
    
    public STUDENTPR()
    {

        main= new JFrame("made by dray");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelSouth = new JPanel();

        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(34, 139, 34));

       
        panelWest = new JPanel();
        panelWest.setBackground(new Color(34, 139, 34));

        main.setPreferredSize(new Dimension(660, 400));
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
        lblCompanyName = new JLabel("PROFILE     ");
        lblCompanyName.setForeground(new Color(253, 245, 104));
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
        lblPadding2.setBackground(new Color(0, 255, 255));
        lb1Welcome = new JLabel("");
        lb1Welcome.setForeground(new Color(0, 205, 179));
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        button = new JButton("Add picture");
        button.setBounds(300,300,100,40);
        label = new JLabel();
        lblNUmber= new JLabel("StudentN"+"");
        
        
        Surname = new JLabel("Surname:  ");
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

        btnBack= new JButton("Back");
        btnBack.setBackground(Color.white);

        
        btnForgot= new JButton("Forgot Password");
        btnForgot.setBackground(new Color(204, 204, 255));

        btnInventory = new JButton("Add Picture");
        btnInventory.setBackground(Color.WHITE);
        btnInventory.setIcon(smartphone);

        btnPersonnel = new JButton("Attendance");
        btnPersonnel.setBackground(Color.WHITE);
        btnPersonnel.setIcon(Book);

        btnSchedule = new JButton("Sign Out");
        btnSchedule.setBackground(Color.WHITE);
        btnSchedule.setIcon(on );

        btnCriminal = new JButton("Content");
        btnCriminal.setBackground(Color.WHITE);
        //btnCriminal.setIcon(writing);

        btnJailCell = new JButton("Message");
        btnJailCell.setIcon(eIcon);
        btnJailCell.setBackground(Color.WHITE);
        
        btnSearchv= new JButton("Search");
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
        btnSchedule.addActionListener(this);
    }
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

public void profil() throws SQLException
{       panelCenter.setBackground(Color.WHITE);
        panelCenter.setLayout(new GridLayout(5, 3));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(14, 1));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        main.add(panelWest, BorderLayout.WEST);
        panelCenter.add(panelBlank6);
        panelCenter.add(label);
        panelCenter.add(lblNUmber);  
        panelCenter.add(Surname);
        panelCenter.add(txtSurname);
        panelCenter.add(lblPadding01);
        Surname.setHorizontalAlignment(JLabel.RIGHT);
        panelCenter.add(Emai);
        panelCenter.add(Email);
        panelCenter.add(lblPadding0);
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        panelCenter.add(lblGender);
        panelCenter.add(cboGender);
        panelCenter.add(lblErrortxtDob);
        SELECTPICTURES();
        panelCenter.add(lblAmount);
        panelCenter.add(Amount);
        panelCenter.add(lAmount);
        
        
        /*panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(lblErrorEmail);
        */
        
       
        panelNorth.add(lblCompanyName);
        lblCompanyName.setHorizontalAlignment(JLabel.CENTER);
        panelWest.add(panelBlank1);
        panelWest.add(btnInventory);
        panelWest.add(panelBlank2);
        panelWest.add(btnCriminal);
        panelWest.add(panelBlank3);
        panelWest.add(btnJailCell);
        panelWest.add(panelBlank4);
        panelWest.add(btnPersonnel);
        panelWest.add(panelBlank7);
         panelWest.add(btnSearchv);
        panelWest.add(lblPadding9);
        panelWest.add(btnBack); 
        panelWest.add(panelBlank5);
        panelWest.add(btnSchedule);
        
        search();
        
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
 public void SELECTPICTURES()
   
{                                        
              String pid = lblNUmber.getText();
              String Sear="SELECT * FROM PITRESS where STUDENTNUMDER= ?";
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
                 
                 byte[]imag= rs.getBytes("PICT");
                 ImageIcon in= new ImageIcon(imag);
                 Image img = in.getImage();
                 Image newImg = img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                 
                 ImageIcon image = new ImageIcon(newImg);
                 label.setIcon(image);
                }
             else
             {
                 System.out.println("Incore");
                 
             }
                }
                catch ( Exception e )
                {
                System.out.println(""+e.getMessage());
                }  
    }
 public void qes()
    {
        CONTENT y= new CONTENT();
         y.SurnameE.setText(lblNUmber.getText());
         y.SUBB();
    }
public void search()
{
              String pid =  lblNUmber.getText();
              String Sear="SELECT * FROM APP.STUDENTSS where StudentID= ?";
             try
                {
                    String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                    String username = "KIM";
                    String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url, username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
               if(lblNUmber.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(this, "Fill your Surname ");
               }
             if ( rs.next() == true )
                {
                 
                 String SU=rs.getString("Student_Surname");
                 String Se=rs.getString("Student_Email");
                 String Ge=rs.getString("Student_Gender");
                 String AM=rs.getString("Student_fees");
                 txtSurname.setText(SU);
                 Email.setText(Se);
                 cboGender.setText(Ge);
                 Amount.setText(AM);
                 

        
         
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
}public void AD() throws FileNotFoundException
{
     try {
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con = DriverManager.getConnection(url, username, password);

            int row = 0;
            String SQLupdate = "insert into PITRESS values(?,(?)) ";
            PreparedStatement ps = con.prepareStatement(SQLupdate);
            InputStream is= new FileInputStream(new File(PICTE));
            ps.setString(1, lblNUmber.getText());
            ps.setBlob(2, is);
            

            row = ps.executeUpdate();

            if (row > 0) {
                System.out.println("insert pect successful");

            } else {
                System.out.println(" add unsuccessful");
            }

        } catch (SQLException ex) {
            System.out.println("  unsuccessful" + ex);
        }

}
public void update()
{
     
            
       try {
            String SUR=lblNUmber.getText();
            String DEP=label.getText();
            String Update="update PITRESS set PICT=? where STUDENTNUMDER=? ";
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url, username, password);
            PreparedStatement statmnt = con.prepareStatement(Update); 
            InputStream ks= new FileInputStream(new File(k));
            statmnt.setBlob(1, ks);
            statmnt.setString(2, SUR);
            statmnt.execute();
            
            System.out.println("Successfully");
        } catch (SQLException ex) {
            System.out.println("uppppdate error"+ex.getMessage());     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(STUDENTPR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() ==btnBack )
        {    main.setVisible(false);
             new OPENPAGE().setGUI();
            
            
        } 
        if (e.getSource() ==btnCriminal )
        {    main.setVisible(false);
             qes();
             
            
            
        } 
         if (e.getSource() ==btnPersonnel )
        {    main.setVisible(false);  
            new AttendClasses().ATTEND();
            

        } 
         if (e.getSource() ==btnSchedule )
        {  
            System.exit(0);
            

        } 
        
        if (e.getSource() ==btnJailCell )
        {   
          main.setVisible(false);  
          new MESSAGE().SendEmail() ;
        }
        
         if (e.getSource() ==btnInventory )
        {
            JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
                try {
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    PICTE=path;
                    k=path;
                    label.setIcon(ResizeImage(path));
                    update();
                    AD();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(STUDENTPR.class.getName()).log(Level.SEVERE, null, ex);
                }
          }
           //if the user click on save in Jfilechooser
         

          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
            
          
        } 
    }
//public static void main(String[] args) {
  //      try {
       //     new STUDENTPR().profil();
      //  } catch (SQLException ex) {
      //      Logger.getLogger(STUDENTPR.class.getName()).log(Level.SEVERE, null, ex);
       // }
  //  }
}
