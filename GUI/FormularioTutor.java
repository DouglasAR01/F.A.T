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
 * 
 * @author Lokuest-Pecons
 * @version 0.8
 */
public class FormularioTutor extends FormularioAprendiz
{
    private JLabel diralterLabel;
    private JTextField diralterField;
    private JLabel hpdLabel;
    private JTextField hpdField;
    private JLabel hnpdLabel;
    private JTextField hnpdField;
    private JLabel preciohoraLabel;
    private JTextField preciohoraField;
    private JLabel institucionLabel;
    private JTextField institucionField;
    private JLabel instidocLabel;    
    
    
    public FormularioTutor()
    {
        super();
        diralterLabel = new JLabel();
        diralterLabel.setBounds(328,103,90,35);
        diralterLabel.setBackground(new Color(214,217,223));
        diralterLabel.setForeground(new Color(0,0,0));
        diralterLabel.setEnabled(true);
        diralterLabel.setFont(new Font("sansserif",0,12));
        diralterLabel.setText("Direccion Alter:");
        diralterLabel.setVisible(true);
        
        diralterField = new JTextField();
        diralterField.setBounds(416,107,115,25);
        diralterField.setBackground(new Color(255,255,255));
        diralterField.setForeground(new Color(0,0,0));
        diralterField.setEnabled(true);
        diralterField.setFont(new Font("sansserif",0,12));
        diralterField.setText("");
        diralterField.setVisible(true);
        
        hpdField = new JTextField();
        hpdField.setBounds(499,132,29,29);
        hpdField.setBackground(new Color(255,255,255));
        hpdField.setForeground(new Color(0,0,0));
        hpdField.setEnabled(true);
        hpdField.setFont(new Font("sansserif",0,12));
        hpdField.setText("");
        hpdField.setVisible(true);

        hpdLabel = new JLabel();
        hpdLabel.setBounds(312,131,204,33);
        hpdLabel.setBackground(new Color(214,217,223));
        hpdLabel.setForeground(new Color(0,0,0));
        hpdLabel.setEnabled(true);
        hpdLabel.setFont(new Font("sansserif",0,12));
        hpdLabel.setText("Horas Presenciales Disponibles:");
        hpdLabel.setVisible(true);
        
        hnpdField = new JTextField();
        hnpdField.setBounds(499,160,29,29);
        hnpdField.setBackground(new Color(255,255,255));
        hnpdField.setForeground(new Color(0,0,0));
        hnpdField.setEnabled(true);
        hnpdField.setFont(new Font("sansserif",0,12));
        hnpdField.setText("");
        hnpdField.setVisible(true);

        hnpdLabel = new JLabel();
        hnpdLabel.setBounds(293,156,218,35);
        hnpdLabel.setBackground(new Color(214,217,223));
        hnpdLabel.setForeground(new Color(0,0,0));
        hnpdLabel.setEnabled(true);
        hnpdLabel.setFont(new Font("sansserif",0,12));
        hnpdLabel.setText("Horas No Presenciales Disponibles:");
        hnpdLabel.setVisible(true);
        
        preciohoraField = new JTextField();
        preciohoraField.setBounds(445,193,81,22);
        preciohoraField.setBackground(new Color(255,255,255));
        preciohoraField.setForeground(new Color(0,0,0));
        preciohoraField.setEnabled(true);
        preciohoraField.setFont(new Font("sansserif",0,12));
        preciohoraField.setText("");
        preciohoraField.setVisible(true);

        preciohoraLabel = new JLabel();
        preciohoraLabel.setBounds(374,186,90,35);
        preciohoraLabel.setBackground(new Color(214,217,223));
        preciohoraLabel.setForeground(new Color(0,0,0));
        preciohoraLabel.setEnabled(true);
        preciohoraLabel.setFont(new Font("sansserif",0,12));
        preciohoraLabel.setText("Precio Hora:");
        preciohoraLabel.setVisible(true);
        
        institucionField = new JTextField();
        institucionField.setBounds(400,221,136,22);
        institucionField.setBackground(new Color(255,255,255));
        institucionField.setForeground(new Color(0,0,0));
        institucionField.setEnabled(true);
        institucionField.setFont(new Font("sansserif",0,12));
        institucionField.setText("");
        institucionField.setVisible(true);

        institucionLabel = new JLabel();
        institucionLabel.setBounds(291,220,125,25);
        institucionLabel.setBackground(new Color(214,217,223));
        institucionLabel.setForeground(new Color(0,0,0));
        institucionLabel.setEnabled(true);
        institucionLabel.setFont(new Font("sansserif",0,12));
        institucionLabel.setText("Nombre Institucion:");
        institucionLabel.setVisible(true);

        instidocLabel = new JLabel();
        instidocLabel.setBounds(290,243,161,33);
        instidocLabel.setBackground(new Color(214,217,223));
        instidocLabel.setForeground(new Color(0,0,0));
        instidocLabel.setEnabled(true);
        instidocLabel.setFont(new Font("sansserif",0,12));
        instidocLabel.setText("Añadir documento Instucion");
        instidocLabel.setVisible(false);
        
        this.add(diralterLabel);
        this.add(diralterField);
        this.add(hpdLabel);
        this.add(hpdField);
        this.add(hnpdLabel);
        this.add(hnpdField);
        this.add(preciohoraLabel);
        this.add(preciohoraField);
        this.add(institucionLabel);
        this.add(institucionField);
        //this.add(instidocLabel);
       
    }
   public void sacarDatos(){
       super.sacarDatos();
       datos.add(diralterField.getText());
       datos.add(hpdField.getText());
       datos.add(hnpdField.getText());
       datos.add(preciohoraField.getText());
       datos.add(institucionField.getText());
       datos.add("Vacio");
    }
   public void limpiar(){
       super.limpiar();
       diralterField.setText("");
       hpdField.setText("");
       hnpdField.setText("");
       preciohoraField.setText("");
       institucionField.setText("");
    }
    
}
