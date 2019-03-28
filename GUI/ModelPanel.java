package GUI;

import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Lokuest-Pecons
 * @version 0.1
 */
public abstract class ModelPanel extends JPanel
{
    // instance variables - replace the example below with your own
    
    
    /**
     * Constructor for objects of class ModelPanel
     */
    public ModelPanel(boolean isPrincipal)
    {
                
        super(null);    
        this.setBorder(BorderFactory.createEtchedBorder(1));
        this.setBounds(20,25,767,555);
        this.setBackground(new Color(214,217,223)); 
        //Color Sobrio Original : 214,217,223
        this.setForeground(new Color(0,0,0));
        this.setEnabled(true);
        this.setFont(new Font("sansserif",0,12));
        this.setVisible(isPrincipal);        
    }
   
    
    
   
    
   
    
}
