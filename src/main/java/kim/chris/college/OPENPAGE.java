
package kim.chris.college;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Dray
 */
public class OPENPAGE extends Frame implements ActionListener
{
    private JFrame mainFrame;
    private JPanel panelNorth, panelWest, panelCenter,earstpanel,panelSouth;

    private JLabel lblPicture;
    
    private JLabel lblPicture1;
    private JLabel lblPicture2;
    private JLabel lblCenter;


    private JLabel lblSchoolName;
    
   
    
    private JLabel lblPadding0, 
    lblPadding01, lblPadding1,
    lblPadding2, lb1Welcome;
   
    
    private Font ft1, ft2, ft3, ft4;
     
    private JLabel lblFullName;
    private JTextField txtFullName;
    private JLabel lblErrorFullName;
    private JFrame MainFrame;  
    private JButton btnLogin;
    private JButton btnReset;
    private JButton btnNext;

    private JButton btnExit;


public OPENPAGE()
{
        mainFrame = new JFrame("made by Dray");
        panelNorth = new JPanel();
        panelNorth.setBackground(new Color(34, 139, 34));
        panelNorth.setForeground(Color.WHITE);
        panelWest = new JPanel();
        panelWest.setBackground(new Color(34, 139, 34));
        panelSouth= new JPanel();
        earstpanel= new JPanel();
        panelSouth.setBackground(Color.WHITE);

        panelCenter = new JPanel();
        panelCenter.setBackground(Color.WHITE);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 3/ 5;
        int width = screenSize.width * 3/ 5;
        mainFrame.setPreferredSize(new Dimension(width, height));

        lblPicture = new JLabel(new ImageIcon("student.png"), SwingConstants.LEFT);
        lblPicture.setPreferredSize(new Dimension(100,100));
        lblPicture.setOpaque(false);
        lblPicture.setBackground(Color.green);
        
        lblPicture1 = new JLabel(new ImageIcon("welcome.png"), SwingConstants.LEFT);
        lblPicture1.setPreferredSize(new Dimension(50,50));
        lblPicture1.setOpaque(false);
        lblPicture1.setBackground(Color.green);
        lblCenter= new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("KIM-CHRIS.jpeg").getImage().getScaledInstance(600, 300, Image.SCALE_AREA_AVERAGING));
        ImageIcon geIcon = new ImageIcon(new ImageIcon("log-out.png").getImage().getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING));
        lblCenter.setIcon(imageIcon);
        
        
        
      

        lblSchoolName = new JLabel("KIM-CHRIS ");
        lblSchoolName.setBackground(Color.WHITE);
        
        MainFrame = new JFrame("");
        MainFrame.setSize(300, 300);
        
        
        
        

        lblPadding0 = new JLabel("");
        lblPadding01 = new JLabel("");
        lblPadding1 = new JLabel("");
        lblPadding2 = new JLabel("");
        lb1Welcome = new JLabel("WELCOME");
        lb1Welcome.setForeground(new Color(0, 205, 179));
        
        
        
        
         ft1 = new Font("Arial", Font.BOLD, 16);
        
        btnLogin = new JButton("LOGIN");
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setForeground(Color.BLUE);
        btnNext = new JButton("REGISTER");
        btnNext.setBackground(Color.WHITE);
        btnNext.setForeground(Color.BLUE);

        
        btnExit = new JButton();
        btnExit.setBackground(Color.WHITE);
        btnExit.setForeground(Color.white);
        btnExit.setIcon(geIcon );
      
        btnLogin.addActionListener(this);
        btnNext.addActionListener(this);
        btnExit.addActionListener(this);
        
}

public void setGUI() 
{
  
        panelNorth.setLayout(new GridLayout(1, 4));
        panelSouth.setLayout(new GridLayout(1, 2));
        panelWest.setLayout(new GridLayout(6, 1));
        panelCenter.setLayout(new GridLayout(1, 1));
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);                       
      
        panelNorth.add(lblPicture);
        panelNorth.add(lblSchoolName);
          
       
        panelCenter.add(lblCenter);
        panelWest.add(btnLogin);
        panelWest.add(lblPadding2);
        panelWest.add(btnNext);
        panelWest.add(lblPadding01);
        panelWest.add(btnExit);
        panelWest.add(lblPadding1);
        
        
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
      public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnExit )
        {
            int Option= JOptionPane.showConfirmDialog(this, "Do you want to Exit ","Exit",JOptionPane.YES_NO_OPTION); 
            if (Option==0){
             System.exit(0);}

        } if (e.getSource() == btnLogin) 
        {
            mainFrame.setVisible(false);
            new LOGINPAGE().setGUI() ;
        }
        if (e.getActionCommand().equals("REGISTER")) 
        {
             mainFrame.setVisible(false);
             new REGISTRACTION().setGui();
        }
    }
    public static void main(String[] args) {
        new OPENPAGE().setGUI();
    }
}
