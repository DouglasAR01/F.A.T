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
import java.util.ArrayList;
/**
 * Write a description of class Formulario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formulario extends JPanel
{   private JTextField emailField;
    private JLabel emailLabel;
    private JLabel labelNombre;       
    private JLabel passLabel;
    private JPasswordField passwordField;
    private JTextField userField;
    private JButton botonLimpiar;
    protected ArrayList datos;
    public Formulario(){
        
        super(null);
        this.setBorder(BorderFactory.createEtchedBorder(1));
		this.setBounds(91,175,601,312);
		this.setBackground(new Color(214,217,223));
		this.setForeground(new Color(0,0,0));
		this.setEnabled(true);
		this.setFont(new Font("sansserif",0,12));
		this.setVisible(false);
		
		datos = new ArrayList<Object>();
        
		botonLimpiar = new JButton();
		botonLimpiar.setBounds(247,281,89,26);
		botonLimpiar.setBackground(new Color(214,217,223));
		botonLimpiar.setForeground(new Color(0,0,0));
		botonLimpiar.setEnabled(true);
		botonLimpiar.setFont(new Font("sansserif",0,12));
		botonLimpiar.setText("Limpiar");
		botonLimpiar.setVisible(true);
		botonLimpiar.addActionListener(new ActionListener()          
        {
            public void actionPerformed(ActionEvent evt) {  
                limpiar();
            }
        });

    	emailField = new JTextField();
    	emailField.setBounds(97,109,142,28);
    	emailField.setBackground(new Color(255,255,255));
    	emailField.setForeground(new Color(0,0,0));
    	emailField.setEnabled(true);
    	emailField.setFont(new Font("sansserif",0,12));
    	emailField.setText("");
    	emailField.setVisible(true);
    
    	emailLabel = new JLabel();
    	emailLabel.setBounds(39,104,90,35);
    	emailLabel.setBackground(new Color(214,217,223));
    	emailLabel.setForeground(new Color(0,0,0));
    	emailLabel.setEnabled(true);
    	emailLabel.setFont(new Font("sansserif",0,12));
    	emailLabel.setText("Correo :");
    	emailLabel.setVisible(true);
    
    	labelNombre = new JLabel();
    	labelNombre.setBounds(35,37,90,35);
    	labelNombre.setBackground(new Color(214,217,223));
    	labelNombre.setForeground(new Color(0,0,0));
    	labelNombre.setEnabled(true);
    	labelNombre.setFont(new Font("sansserif",0,12));
    	labelNombre.setText("Usuario:");
    	labelNombre.setVisible(true);
		
        passLabel = new JLabel();
		passLabel.setBounds(47,69,90,35);
		passLabel.setBackground(new Color(214,217,223));
		passLabel.setForeground(new Color(0,0,0));
		passLabel.setEnabled(true);
		passLabel.setFont(new Font("sansserif",0,12));
		passLabel.setText("Clave:");
		passLabel.setVisible(true);

		passwordField = new JPasswordField();
		passwordField.setBounds(96,74,90,29);
		passwordField.setBackground(new Color(214,217,223));
		passwordField.setForeground(new Color(0,0,0));
		passwordField.setEnabled(true);
		passwordField.setFont(new Font("sansserif",0,12));
		passwordField.setVisible(true);

		userField = new JTextField();
		userField.setBounds(97,40,89,27);
		userField.setBackground(new Color(255,255,255));
		userField.setForeground(new Color(0,0,0));
		userField.setEnabled(true);
		userField.setFont(new Font("sansserif",0,12));
		userField.setText("");
		userField.setVisible(true);
		
		this.add(emailField);
		this.add(emailLabel);
		this.add(labelNombre);	
		this.add(passLabel);
		this.add(passwordField);	
		this.add(userField);
		this.add(botonLimpiar);

        
    }
    public void sacarDatos(){ 
        datos.removeAll(datos);
        datos.add(userField.getText());
        datos.add(passwordField.getText());
        datos.add(emailField.getText());
        
        
    }   
    public ArrayList getDatos(){
        this.sacarDatos();        
        return this.datos;
    }
    public void limpiar(){
        userField.setText("");
        passwordField.setText("");
        emailField.setText("");
    }
}
