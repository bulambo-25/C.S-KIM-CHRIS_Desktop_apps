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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import kim.chris.college.Deposit;
import kim.chris.college.LOGINPAGE;
import kim.chris.college.server.Database;

/**
 *
 * @author HP
 */
public class EXAMCO extends Frame implements ActionListener {

    private JFrame mainFrame;
    private JPanel panelNorth, panelWest, panelCenter, panelEast, panelSouth;
    Database DB= new  Database();
    private JLabel lblPicture;
    private JLabel lblPicture1;

    private JLabel lblSelect;
    private JComboBox cboSelect;
    private JLabel lblCompanyName;
    private Font ft1, ft2, ft3, ft4;
    private JFrame MainFrame;

    private JLabel vehicleID;
    private JTextField vehicle_id;
    private JLabel lblPadding0, lblPadding01, lblPadding1, lblPadding2;
    private JLabel make;
    private JTextField vehicle_make;

    private JTextField model;
    private JTextField vehicle_model;

    private JTextField  Type;
    private JTextField vehicle_type;

    private JButton btnback;
    private JButton btnDelete;
   

    public EXAMCO() {

        mainFrame = new JFrame("");
        panelNorth = new JPanel();
        panelNorth.setBackground(new Color(33, 216, 179));
        panelNorth.setForeground(Color.LIGHT_GRAY);
        panelWest = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();
        panelSouth.setBackground(new Color(33, 216, 179));
            //
        panelCenter = new JPanel();
        panelCenter.setBackground(Color.WHITE);



        mainFrame.setPreferredSize(new Dimension(620,400));

        lblPicture = new JLabel(new ImageIcon("RRpalm.png"), SwingConstants.LEFT);
        lblPicture.setPreferredSize(new Dimension(100, 100));
        lblPicture.setOpaque(false);
        lblPicture.setBackground(Color.green);

        lblPicture1 = new JLabel(new ImageIcon("w.png"), SwingConstants.LEFT);
        lblPicture1.setPreferredSize(new Dimension(50, 50));
        lblPicture1.setOpaque(false);
        lblPicture1.setBackground(Color.green);

        lblCompanyName = new JLabel(" ");
        lblCompanyName.setBackground(Color.WHITE);

        MainFrame = new JFrame("");
        MainFrame.setSize(300, 300);

       
        lblSelect = new JLabel("QUESTION: ");
        cboSelect = new JComboBox();
        //lblSelect.setHorizontalAlignment(JLabel.RIGHT);

        vehicleID = new JLabel("StudentNumber ");
        vehicle_id = new JTextField(15);
        //vehicleID.setHorizontalAlignment(JLabel.RIGHT);

        make = new JLabel("Cours");
        vehicle_make = new JTextField(15);
       // make.setHorizontalAlignment(JLabel.RIGHT);

        model = new JTextField();
        vehicle_model = new JTextField(15);
       // model.setHorizontalAlignment(JLabel.RIGHT);

        Type = new JTextField ();
        vehicle_type = new JTextField(15);
       // Type.setHorizontalAlignment(JLabel.RIGHT);

        lblPadding0 = new JLabel("Question");
        lblPadding01 = new JLabel("Student Answer");
        lblPadding1 = new JLabel("Lecture Answer");
        lblPadding2 = new JLabel("Mark");

        ft1 = new Font("Arial", Font.BOLD, 16);

        btnback = new JButton("Back");
        btnback.setBackground(new Color(33, 216, 179));
        btnback.setForeground(Color.white);

        btnDelete = new JButton("Mark");
        btnDelete.setBackground(new Color(33, 216, 179));
        btnDelete.setForeground(Color.white);

        ft1 = new Font("Arial", Font.BOLD, 32);
        ft2 = new Font("Arial", Font.PLAIN, 22);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.ITALIC, 16);

        btnback.addActionListener(this);
        btnDelete.addActionListener(this);
        cboSelect.addActionListener(this);

    }

    public void settt() {
        
        panelNorth.setLayout(new GridLayout(1, 4));
        panelSouth.setLayout(new GridLayout(1, 2));
        panelWest.setLayout(new GridLayout(3, 2));
        panelCenter.setLayout(new GridLayout(7, 2));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        LoadID();
        panelNorth.add(lblPicture);
        panelNorth.add(lblCompanyName);
        //panelCenter.add(lblPadding2);
        //panelCenter.add(btnback);
        panelCenter.add(lblSelect);
        panelCenter.add(cboSelect);

       

        


        panelCenter.add(vehicleID);
        panelCenter.add(vehicle_id);

        panelCenter.add(make);
        panelCenter.add(vehicle_make);

        panelCenter.add(lblPadding0);
        panelCenter.add(vehicle_model);


       panelCenter.add(lblPadding01);
       panelCenter.add(vehicle_type);
        
        panelCenter.add(lblPadding1);
        panelCenter.add(model);

        panelCenter.add(lblPadding2);
        panelCenter.add(Type);

        panelSouth.add(btnDelete);
        panelSouth.add(btnback);

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
public void Update()
{
        try {
            String SUR=model.getText();
            String DEP=Type.getText();
            String Update="update APP.ANQUESTIONSS set Marks='"+DEP +"'where Question='"+SUR+"'";
            String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
            String username = "KIM";
            String password = "CHRIS";
            Connection con= DriverManager.getConnection(url, username, password);
            PreparedStatement statmnt = con.prepareStatement(Update); 
            statmnt.execute();
            
            JOptionPane.showMessageDialog(null, "Marked Successfully");
           
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
}

private void REA()
{                                        
              String pid =  cboSelect.getSelectedItem().toString();
              String Sear="SELECT * FROM APP.ANQUESTIONSS WHERE Question = ?";
             try
                {
                     String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                     String username = "KIM";
                     String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url,username, password);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
    
             if ( rs.next() == true )
                {
                
                 
                String StudentNumber=rs.getString("StudentNumber");
                 String Courses=rs.getString("Courses");
                String Quesr=rs.getString("Question");
                String SA=rs.getString("StudentAnswer");
                String LA=rs.getString("LectureAnswer");
                String Markss=rs.getString("Marks");
                 vehicle_id.setText(StudentNumber);
                 vehicle_make.setText(Courses);
                 vehicle_model.setText(Quesr);
                 vehicle_type.setText(SA);
                 model.setText(LA);
                 Type.setText(Markss);
         
                }
             else
             {
                 JOptionPane.showMessageDialog(this, "Record Not Found");
             }
                }
                catch ( Exception e )
                {
                e.printStackTrace();
                }  
    }
public void LoadID()
            {
                String com="SELECT Question FROM APP.ANQUESTIONSS";
                try
                {
                   String url = "jdbc:derby://localhost:1527/KIM-CHRIS";
                     String username = "KIM";
                     String password = "CHRIS";
                    Connection con= DriverManager.getConnection(url,username, password);
                    PreparedStatement ps= con.prepareStatement(com);
                    
                    ResultSet rs = ps.executeQuery();
                    cboSelect.removeAllItems();
                
 
                while (rs.next())
                  {
                     cboSelect.addItem(rs.getString(1));
                  }
                }
                catch ( Exception e)
                {
                  
                }
            }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cboSelect) {
           
           
                
               REA();

        }
        if (e.getSource() == btnback) {
           
           
               mainFrame.setVisible(false); 
               new LECTUREMENU().LECT();

        }
        if (e.getSource() == btnDelete) {
           
             Update();
               
            

        }
        }
       
   
    
}
