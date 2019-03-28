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
public class PanelCrearUsuario extends ModelPanel
{
    private JButton botonCrear;
    private JButton botonVolver;
    private JComboBox comboBoxTipoUsuario;
    private JLabel labelNombre;
    private JLabel labelTipoUsuario;
    private JLabel labelTitle;
    private JTextField campoNombre;
    
    public PanelCrearUsuario(boolean isPrincipal)
    {
        super(isPrincipal);
        
        //Creo Label Principal-----------------------------------------------
        
        labelTitle = new JLabel();
        labelTitle.setBounds(177,101,387,61);
        labelTitle.setBackground(new Color(214,217,223));
        labelTitle.setForeground(new Color(0,0,0));
        labelTitle.setEnabled(true);
        labelTitle.setFont(new Font("SansSerif",0,40));
        labelTitle.setText("TeachApp : Create");
        labelTitle.setVisible(true);
        
        //-------------------------------------------------------------------
        
        //Creo Boton de Crear ------------------------------------------------
        
        botonCrear = new JButton();
        botonCrear.setBounds(194,412,90,35);
        botonCrear.setBackground(new Color(214,217,223));
        botonCrear.setForeground(new Color(0,0,0));
        botonCrear.setEnabled(true);
        botonCrear.setFont(new Font("sansserif",0,12));
        botonCrear.setText("Crear");
        botonCrear.setVisible(true);
        
        //--------------------------------------------------------------------
        
        //Creo Boton de Volver -----------------------------------------------
        
        botonVolver = new JButton();
        botonVolver.setBounds(489,411,90,35);
        botonVolver.setBackground(new Color(214,217,223));
        botonVolver.setForeground(new Color(0,0,0));
        botonVolver.setEnabled(true);
        botonVolver.setFont(new Font("sansserif",0,12));
        botonVolver.setText("Volver");
        botonVolver.setVisible(true);
        
        //-------------------------------------------------------------------
        
        //Creo ComboBox -----------------------------------------------------
        comboBoxTipoUsuario = new JComboBox();
        comboBoxTipoUsuario.setBounds(363,310,150,30);
        comboBoxTipoUsuario.setBackground(new Color(214,217,223));
        comboBoxTipoUsuario.setForeground(new Color(0,0,0));
        comboBoxTipoUsuario.setEnabled(true);
        comboBoxTipoUsuario.setFont(new Font("sansserif",0,12));
        comboBoxTipoUsuario.setVisible(true);
        
        comboBoxTipoUsuario.addItem("Tutor");
        comboBoxTipoUsuario.addItem("Aprendiz");
        comboBoxTipoUsuario.addItem("None");
        //-------------------------------------------------------------------
        
        //Creo Label Nombre--------------------------------------------------------
        
        labelNombre = new JLabel();
        labelNombre.setBounds(254,229,106,32);
        labelNombre.setBackground(new Color(214,217,223));
        labelNombre.setForeground(new Color(0,0,0));
        labelNombre.setEnabled(true);
        labelNombre.setFont(new Font("SansSerif",0,20));
        labelNombre.setText("Nombre:");
        labelNombre.setVisible(true);
        
        //--------------------------------------------------------------------
        
        //Creo TextField nombre ------------------------------------------------------
        campoNombre = new JTextField();
        campoNombre.setBounds(369,229,141,31);
        campoNombre.setBackground(new Color(255,255,255));
        campoNombre.setForeground(new Color(0,0,0));
        campoNombre.setEnabled(true);
        campoNombre.setFont(new Font("sansserif",0,12));
        campoNombre.setText("");
        campoNombre.setVisible(true);
        //---------------------------------------------------------------------
        //Creo Label Tipo de Usuario-------------------------------------------
        
        labelTipoUsuario = new JLabel();
        labelTipoUsuario.setBounds(185,314,152,23);
        labelTipoUsuario.setBackground(new Color(214,217,223));
        labelTipoUsuario.setForeground(new Color(0,0,0));
        labelTipoUsuario.setEnabled(true);
        labelTipoUsuario.setFont(new Font("SansSerif",0,20));
        labelTipoUsuario.setText("Tipo de Usuario:");
        labelTipoUsuario.setVisible(true);
        
        //----------------------------------------------------------------------
        //adding components to contentPane panel
        this.add(botonCrear);
        this.add(botonVolver);
        this.add(comboBoxTipoUsuario);
        this.add(labelNombre);
        this.add(labelTipoUsuario);
        this.add(labelTitle);
        this.add(campoNombre);
        
    }
    
    public JButton getBotonVolver(){
        return this.botonVolver;
    }
    public JButton getBotonCrear(){
        return this.botonCrear;
    }
}
