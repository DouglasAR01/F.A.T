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
 * Write a description of class PanelSelec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class PanelSelec extends ModelPanel
{
    private JLabel label3;
    private JLabel label4;  
    private JButton selecButton;
    private JComboBox selecComboBox;
    private JLabel titleLabell;
    private JLabel userLabel;
    private JButton reloadButton;
    private JButton volverButton;    
    public PanelSelec(boolean isPrincipal)
    {
        super(isPrincipal);
        
        label3 = new JLabel();
        label3.setBounds(315,247,28,30);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Type");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(374,244,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("/       UserName");
        label4.setVisible(true);
        

        selecButton = new JButton();
        selecButton.setBounds(300,391,97,31);
        selecButton.setBackground(new Color(214,217,223));
        selecButton.setForeground(new Color(0,0,0));
        selecButton.setEnabled(false);
        selecButton.setFont(new Font("sansserif",0,12));
        selecButton.setText("Seleccionar");
        selecButton.setVisible(true);
        //Set action for button click
        //Call defined method
        
        
        volverButton = new JButton();
        volverButton.setBounds(400,391,97,31);
        volverButton.setBackground(new Color(214,217,223));
        volverButton.setForeground(new Color(0,0,0));
        volverButton.setEnabled(true);
        volverButton.setFont(new Font("sansserif",0,12));
        volverButton.setText("Volver");
        volverButton.setVisible(true);      
        
        


        selecComboBox = new JComboBox();
        selecComboBox.setBounds(288,274,250,35);
        selecComboBox.setBackground(new Color(214,217,223));
        selecComboBox.setForeground(new Color(0,0,0));
        selecComboBox.setEnabled(true);
        selecComboBox.setFont(new Font("SansSerif",0,14));
        selecComboBox.setVisible(true);        
       
        

        reloadButton = new JButton();
        reloadButton.setBounds(350,320,100,35);
        reloadButton.setBackground(new Color(214,217,223));
        reloadButton.setForeground(new Color(0,0,0));
        reloadButton.setEnabled(true);
        reloadButton.setFont(new Font("sansserif",0,12));
        reloadButton.setText("Reload");
        reloadButton.setVisible(true);
        reloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ControladorDeEventos.AñadirUsuariosComboBox(selecComboBox);
                selecButton.setEnabled(true);
            }
        });

        titleLabell = new JLabel();
        titleLabell.setBounds(24,9,392,94);
        titleLabell.setBackground(new Color(214,217,223));
        titleLabell.setForeground(new Color(0,0,0));
        titleLabell.setEnabled(true);
        titleLabell.setFont(new Font("SansSerif",0,45));
        titleLabell.setText("TeachApp : Select");
        titleLabell.setVisible(true);

        userLabel = new JLabel();
        userLabel.setBounds(200,273,90,35);
        userLabel.setBackground(new Color(214,217,223));
        userLabel.setForeground(new Color(0,0,0));
        userLabel.setEnabled(true);
        userLabel.setFont(new Font("SansSerif",0,20));
        userLabel.setText("Usuario:");
        userLabel.setVisible(true);

        //adding components to contentPane panel
        this.add(label3);
        this.add(label4);       
        this.add(selecButton);
        this.add(volverButton);
        this.add(selecComboBox);
        this.add(titleLabell);
        this.add(userLabel);
        this.add(reloadButton);
    }
    public JButton getbotonSelec(){
        return this.selecButton;
    }
    public JButton getbotonVolver(){
        return this.volverButton;
    }   
    public String getUserData(){
        return String.valueOf(selecComboBox.getSelectedItem());
    }
}
