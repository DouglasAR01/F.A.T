package GUI;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import Controladores.*;

/**
 * 
 * @author Lokuest-Pecons
 * @version 0.1
 */

public class ControladorDeEventos
{
    public static void agregarTransicionBoton(JButton boton,
                                              JPanel panelBoton,
                                              JPanel panelApuntado)
    {       
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(panelBoton.isVisible()){
                    panelBoton.setVisible(false);
                    panelApuntado.setVisible(true);
                }           
                
               
    }
    });    
   }
}
