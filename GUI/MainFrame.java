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
 * Write a description of class MainFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainFrame extends ModelFrame
{
    // instance variables - replace the example below with your own
    
    private JButton botonCrearUsuario;
    private JButton botonSelecUsuario;
    private JLabel labelApp;
    private JButton button3;
    private JButton button4;
    private JComboBox combobox1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textfield1;
    private ConexionBD query;
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        super();
        query = new ConexionBD();
        
    }

    
    public void añadirComponentes()
    {        
        JPanel BordererPanel = new ModelPanel();    
        
    JPanel panelPrincipal = new JPanel(null);
    panelPrincipal.setBorder(BorderFactory.createEtchedBorder(1));
    panelPrincipal.setBounds(16,15,767,555);
    panelPrincipal.setBackground(new Color(214,217,223));
    panelPrincipal.setForeground(new Color(0,0,0));
    panelPrincipal.setEnabled(true);
    panelPrincipal.setFont(new Font("sansserif",0,12));
    panelPrincipal.setVisible(true);
    
        JPanel panelCrearUsuario = new JPanel(null);
    panelCrearUsuario.setBorder(BorderFactory.createEtchedBorder(1));
    panelCrearUsuario.setBounds(16,15,767,555);
    panelCrearUsuario.setBackground(new Color(214,217,223));
    panelCrearUsuario.setForeground(new Color(0,0,0));
    panelCrearUsuario.setEnabled(true);
    panelCrearUsuario.setFont(new Font("sansserif",0,12));
    panelCrearUsuario.setVisible(false);
        
        
        botonCrearUsuario = new JButton();
        botonCrearUsuario.setBounds(170,392,123,33);
        botonCrearUsuario.setBackground(new Color(214,217,223));
        botonCrearUsuario.setForeground(new Color(0,0,0));
        botonCrearUsuario.setEnabled(true);
        botonCrearUsuario.setFont(new Font("sansserif",0,12));
        botonCrearUsuario.setText("Crear Usuario");
        botonCrearUsuario.setVisible(true);
        
        //Set action for button click
        //Call defined method
    botonCrearUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panelCrearUsuario.setVisible(true);
                panelPrincipal.setVisible(false);
                
            }
        });

        botonSelecUsuario = new JButton();
        botonSelecUsuario.setBounds(453,394,164,33);
        botonSelecUsuario.setBackground(new Color(214,217,223));
        botonSelecUsuario.setForeground(new Color(0,0,0));
        botonSelecUsuario.setEnabled(true);
        botonSelecUsuario.setFont(new Font("sansserif",0,12));
        botonSelecUsuario.setText("Elegir Usuario Existente");
        botonSelecUsuario.setVisible(true);
        
        labelApp = new JLabel();
        labelApp.setBounds(250,158,300,116);
        labelApp.setBackground(new Color(214,217,223));
        labelApp.setForeground(new Color(0,0,0));
        labelApp.setEnabled(true);
        labelApp.setFont(new Font("SansSerif",0,60));
        labelApp.setText("TeachApp");
        labelApp.setVisible(true);
        
        //adding components to panelPrincipal panel
        panelPrincipal.add(botonCrearUsuario);
        panelPrincipal.add(botonSelecUsuario);
        panelPrincipal.add(labelApp);
        
        //adding panel to JFrame and seting of window position and close operation        
        
        //-----------------------------------------//
        
        button3 = new JButton();
        button3.setBounds(194,412,90,35);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Crear");
        button3.setVisible(true);
        //Set action for button click
        //Call defined method
    button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            System.out.println("Datos Ingresados:\n -Nombre: "+
            textfield1.getText()+
            "\n tipo de Usuario: "+
            combobox1.getSelectedItem());
            
            ControladorUsuarios.crearTutor(query,
                                            textfield1.getText(),
                                            "1234", "_correo_",
                                            "_nombre_",
                                            "_apellido_",
                                            "_fechaNacimiento_",
                                            "_celular_",
                                            "_ciudadResidencia_",
                                            "_direccion_",
                                            true,
                                            "_direccionAlter_",
                                            20,
                                            4,
                                            5000,
                                            "_institucion_",
                                            "_documentoInstitucion_");
            
            
            }
        });


    button4 = new JButton();
    button4.setBounds(489,411,90,35);
    button4.setBackground(new Color(214,217,223));
    button4.setForeground(new Color(0,0,0));
    button4.setEnabled(true);
    button4.setFont(new Font("sansserif",0,12));
    button4.setText("Volver");
    button4.setVisible(true);
        //Set action for button click
        //Call defined method
    button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panelCrearUsuario.setVisible(false);
                panelPrincipal.setVisible(true);
                
            }
        });


    combobox1 = new JComboBox();
    combobox1.setBounds(363,310,150,30);
    combobox1.setBackground(new Color(214,217,223));
    combobox1.setForeground(new Color(0,0,0));
    combobox1.setEnabled(true);
    combobox1.setFont(new Font("sansserif",0,12));
    combobox1.setVisible(true);
    
    combobox1.addItem("Tutor");
    combobox1.addItem("Aprendiz");
    combobox1.addItem("None");
    

        label2 = new JLabel();
        label2.setBounds(254,229,106,32);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("SansSerif",0,20));
        label2.setText("Nombre:");
        label2.setVisible(true);

    label3 = new JLabel();
    label3.setBounds(185,314,152,23);
    label3.setBackground(new Color(214,217,223));
    label3.setForeground(new Color(0,0,0));
    label3.setEnabled(true);
    label3.setFont(new Font("SansSerif",0,20));
    label3.setText("Tipo de Usuario:");
    label3.setVisible(true);

    label4 = new JLabel();
    label4.setBounds(177,101,387,61);
    label4.setBackground(new Color(214,217,223));
    label4.setForeground(new Color(0,0,0));
    label4.setEnabled(true);
    label4.setFont(new Font("SansSerif",0,40));
    label4.setText("TeachApp : Create");
    label4.setVisible(true);

    textfield1 = new JTextField();
    textfield1.setBounds(369,229,141,31);
    textfield1.setBackground(new Color(255,255,255));
    textfield1.setForeground(new Color(0,0,0));
    textfield1.setEnabled(true);
    textfield1.setFont(new Font("sansserif",0,12));
    textfield1.setText("");
    textfield1.setVisible(true);

        //adding components to contentPane panel
    panelCrearUsuario.add(button3);
    panelCrearUsuario.add(button4);
    panelCrearUsuario.add(combobox1);
    panelCrearUsuario.add(label2);
    panelCrearUsuario.add(label3);
    panelCrearUsuario.add(label4);
    panelCrearUsuario.add(textfield1);

        //adding panel to JFrame and seting of window position and close operation
    BordererPanel.add(panelCrearUsuario);
    BordererPanel.add(panelPrincipal);
    
    this.add(BordererPanel);
    
        
        
        
    }
    
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}
