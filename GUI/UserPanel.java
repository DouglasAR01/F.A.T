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
import java.net.URL;
import java.io.IOException;

/**
 * Write a description of class UserPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserPanel extends ModelPanel
{
  private JButton botonVolver;
  public UserPanel(){
      super(false); 
      crearGif();
      botonVolver = new JButton();
      botonVolver.setBounds(345,504,90,35);
      botonVolver.setBackground(new Color(214,217,223));
      botonVolver.setForeground(new Color(0,0,0));
      botonVolver.setEnabled(true);
      botonVolver.setFont(new Font("sansserif",0,12));
      botonVolver.setText("Volver");
      botonVolver.setVisible(true);
      this.add(botonVolver);
    }
  public void crearGif() {
        try {
        URL url = new URL("https://i.pinimg.com/originals/3b/d9/79/3bd979216dc79eb5fef530ced89f9e06.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        label.setBounds(166,77,431,390);
        this.add(label);        
       } catch (IOException e) {
        throw new RuntimeException(e);
       } 
        
    }
  public JButton getBotonVolver(){
      return this.botonVolver;
    }
  
}
