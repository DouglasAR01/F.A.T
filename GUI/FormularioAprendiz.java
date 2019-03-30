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
 * Write a description of class FormularioAprendiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FormularioAprendiz extends Formulario
{
    private JTextField birthField;
    private JLabel birthLabel;
    private JTextField cityField;
    private JLabel cityLabel;
    private JTextField dirField;
    private JLabel dirLabel;
    private JTextField lastnameField;
    private JLabel lastnameLabel;
    private JTextField nameField;
    private JLabel nameLabel;
    private JTextField phoneField;
    private JLabel phoneLabel;
    public FormularioAprendiz()
    {
        super();
        
        birthField = new JTextField();
        birthField.setBounds(109,202,129,25);
        birthField.setBackground(new Color(255,255,255));
        birthField.setForeground(new Color(0,0,0));
        birthField.setEnabled(true);
        birthField.setFont(new Font("sansserif",0,12));
        birthField.setText("");
        birthField.setVisible(true);

        birthLabel = new JLabel();
        birthLabel.setBounds(5,196,105,36);
        birthLabel.setBackground(new Color(214,217,223));
        birthLabel.setForeground(new Color(0,0,0));
        birthLabel.setEnabled(true);
        birthLabel.setFont(new Font("sansserif",0,12));
        birthLabel.setText("Fecha Nacimento:");
        birthLabel.setVisible(true);

        cityField = new JTextField();
        cityField.setBounds(412,47,117,26);
        cityField.setBackground(new Color(255,255,255));
        cityField.setForeground(new Color(0,0,0));
        cityField.setEnabled(true);
        cityField.setFont(new Font("sansserif",0,12));
        cityField.setText("");
        cityField.setVisible(true);

        cityLabel = new JLabel();
        cityLabel.setBounds(344,49,80,21);
        cityLabel.setBackground(new Color(214,217,223));
        cityLabel.setForeground(new Color(0,0,0));
        cityLabel.setEnabled(true);
        cityLabel.setFont(new Font("sansserif",0,12));
        cityLabel.setText("Ciudad:");
        cityLabel.setVisible(true);

        dirField = new JTextField();
        dirField.setBounds(414,77,165,26);
        dirField.setBackground(new Color(255,255,255));
        dirField.setForeground(new Color(0,0,0));
        dirField.setEnabled(true);
        dirField.setFont(new Font("sansserif",0,12));
        dirField.setText("");
        dirField.setVisible(true);

        dirLabel = new JLabel();
        dirLabel.setBounds(331,73,90,35);
        dirLabel.setBackground(new Color(214,217,223));
        dirLabel.setForeground(new Color(0,0,0));
        dirLabel.setEnabled(true);
        dirLabel.setFont(new Font("sansserif",0,12));
        dirLabel.setText("Direccion:");
        dirLabel.setVisible(true);

        lastnameField = new JTextField();
        lastnameField.setBounds(101,171,90,26);
        lastnameField.setBackground(new Color(255,255,255));
        lastnameField.setForeground(new Color(0,0,0));
        lastnameField.setEnabled(true);
        lastnameField.setFont(new Font("sansserif",0,12));
        lastnameField.setText("");
        lastnameField.setVisible(true);

        lastnameLabel = new JLabel();
        lastnameLabel.setBounds(25,166,90,35);
        lastnameLabel.setBackground(new Color(214,217,223));
        lastnameLabel.setForeground(new Color(0,0,0));
        lastnameLabel.setEnabled(true);
        lastnameLabel.setFont(new Font("sansserif",0,12));
        lastnameLabel.setText("Apellido:");
        lastnameLabel.setVisible(true);

        nameField = new JTextField();
        nameField.setBounds(99,138,93,27);
        nameField.setBackground(new Color(255,255,255));
        nameField.setForeground(new Color(0,0,0));
        nameField.setEnabled(true);
        nameField.setFont(new Font("sansserif",0,12));
        nameField.setText("");
        nameField.setVisible(true);

        nameLabel = new JLabel();
        nameLabel.setBounds(22,135,90,35);
        nameLabel.setBackground(new Color(214,217,223));
        nameLabel.setForeground(new Color(0,0,0));
        nameLabel.setEnabled(true);
        nameLabel.setFont(new Font("sansserif",0,12));
        nameLabel.setText("Nombre:");
        nameLabel.setVisible(true);

        phoneField = new JTextField();
        phoneField.setBounds(101,230,86,24);
        phoneField.setBackground(new Color(255,255,255));
        phoneField.setForeground(new Color(0,0,0));
        phoneField.setEnabled(true);
        phoneField.setFont(new Font("sansserif",0,12));
        phoneField.setText("");
        phoneField.setVisible(true);

        phoneLabel = new JLabel();
        phoneLabel.setBounds(24,227,90,35);
        phoneLabel.setBackground(new Color(214,217,223));
        phoneLabel.setForeground(new Color(0,0,0));
        phoneLabel.setEnabled(true);
        phoneLabel.setFont(new Font("sansserif",0,12));
        phoneLabel.setText("Telefono:");
        phoneLabel.setVisible(true);
        
        this.add(birthField);
        this.add(birthLabel);
        this.add(cityField);
        this.add(cityLabel);
        this.add(dirField);
        this.add(dirLabel);
        this.add(lastnameField);
        this.add(lastnameLabel);
        this.add(nameField);
        this.add(nameLabel);
        this.add(phoneField);
        this.add(phoneLabel);

      
    }
   /*
     @override
    */
   public void sacarDatos(){
       super.sacarDatos();
       datos.add(nameField.getText());
       datos.add(lastnameField.getText());
       datos.add(birthField.getText());
       datos.add(phoneField.getText());
       datos.add(cityField.getText());
       datos.add(dirField.getText());
       datos.add(true);
    }
   public void limpiar(){
       super.limpiar();
       nameField.setText("");
       lastnameField.setText("");
       birthField.setText("");
       phoneField.setText("");
       cityField.setText("");
       dirField.setText("");
    }
       
   
}
