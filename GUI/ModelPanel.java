package GUI;

import java.awt.*;
import javax.swing.*;
import Controladores.*;
/**
 * 
 * @author Lokuest-Pecons
 * @version 0.8
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
        this.setBounds(16,15,780,580);
        this.setBackground(new Color(214,217,223)); 
        //Color Sobrio Original : 214,217,223
        this.setForeground(new Color(0,0,0));
        this.setEnabled(true);
        this.setFont(new Font("sansserif",0,12));
        this.setVisible(isPrincipal);        
    }
    public String getUserData(){
        return "";
    }
    public void actualizar(String datos,ConexionBD c){
    };
   
    
    
   
    
   
    
}
