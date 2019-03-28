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
/**
 * 
 * @author Lokuest-Pecons
 * @version 0.1
 */
public class PanelPrincipal extends ModelPanel
{
   private JButton botonCrearUsuario;
   private JButton botonSelecUsuario;
   private JLabel labelApp;
    
    public PanelPrincipal(boolean isPrincipal)
    {
        super(isPrincipal);    
        
        //Creación Botón Crear User ------------------------------
        botonCrearUsuario = new JButton();
        botonCrearUsuario.setBounds(170,392,123,33);
        botonCrearUsuario.setBackground(new Color(214,217,223));
        botonCrearUsuario.setForeground(new Color(0,0,0));
        botonCrearUsuario.setEnabled(true);
        botonCrearUsuario.setFont(new Font("sansserif",0,12));
        botonCrearUsuario.setText("Crear Usuario");
        botonCrearUsuario.setVisible(true);
        
        
        
        //-------------------------------------------------------
        
        //Creación Botón Seleccionar Usuario
        botonSelecUsuario = new JButton();
        botonSelecUsuario.setBounds(453,394,164,33);
        botonSelecUsuario.setBackground(new Color(214,217,223));
        botonSelecUsuario.setForeground(new Color(0,0,0));
        botonSelecUsuario.setEnabled(true);
        botonSelecUsuario.setFont(new Font("sansserif",0,12));
        botonSelecUsuario.setText("Elegir Usuario Existente");
        botonSelecUsuario.setVisible(true);
        
        botonSelecUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //panelCrearUsuario.setVisible(true);
                //panelPrincipal.setVisible(false);
                
            }
        });
        
        //-------------------------------------------------------
        
        //Creación Label Principal
        labelApp = new JLabel();
        labelApp.setBounds(250,158,300,116);
        labelApp.setBackground(new Color(214,217,223));
        labelApp.setForeground(new Color(0,0,0));
        labelApp.setEnabled(true);
        labelApp.setFont(new Font("SansSerif",0,60));
        labelApp.setText("TeachApp");
        labelApp.setVisible(true);
        
        //-------------------------------------------------------
        
        this.add(botonCrearUsuario);
        this.add(botonSelecUsuario);
        this.add(labelApp);
    }    
    
    //Implementación de métodos
    public JButton getbotonCrearUsuario(){
        return this.botonCrearUsuario;
    }
    public JButton getbotonSeleccionarExistente(){
        return this.botonSelecUsuario;
    }
    
}

