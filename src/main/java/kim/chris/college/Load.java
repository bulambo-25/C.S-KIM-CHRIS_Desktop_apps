
package kim.chris.college;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author draybulambo
 */
public class Load extends Frame implements ActionListener
{
    public  JFrame Frame;
    private JLabel lblPicture;

public Load()
{
        Frame = new JFrame();
        Frame.setPreferredSize(new Dimension(120, 100));
        lblPicture = new JLabel(new ImageIcon("frg.gif"));
//cargando.gif load.gif
}

public void setGUII() 
{
  
        Frame.add(lblPicture);
        Frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                
            }
        });

        Frame.pack();
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
        
 } 

 
  @Override
   
      public void actionPerformed(ActionEvent e) {
         
    }
     
    public static void main(String[] args) 
    {
        new Load().setGUII();
    }   
}
