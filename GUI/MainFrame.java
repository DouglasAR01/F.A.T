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
import java.util.ArrayList;

/**
 * 
 * @author Lokuest-Pecons
 * @version 0.1
 */
public class MainFrame extends ModelFrame
{
    // instance variables - replace the example below with your own
    
    
    
    
    private JButton button3;
    private JButton button4;
    private JComboBox combobox1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textfield1;
    
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        super();        
        
    }

    
    public void añadirComponentes()
    {  
        //Se Crea Panel Principal.
        JPanel BordererPanel = new JPanel(null);    
        BordererPanel.setPreferredSize(new Dimension(800,600));
        BordererPanel.setBackground(new Color(64,64,64));
        //Color Original 192,192,192
        
        //Se Instancian Paneles Complementarios.
        PanelPrincipal panelPrincipal = new PanelPrincipal(true);    
        PanelCrearUsuario panelCrearUsuario = new PanelCrearUsuario(false);
        PanelSelec panelSeleccionar = new PanelSelec(false);
        UserPanel panelUsuario = new UserPanel();
    
        
        //Se Añanden Eventos para Paneles -----------------------
        ControladorDeEventos.agregarTransicionBoton(
        panelPrincipal.getbotonCrearUsuario(),
        panelPrincipal,
        panelCrearUsuario);
        
        ControladorDeEventos.agregarTransicionBoton(
        panelPrincipal.getbotonSeleccionarExistente(),
        panelPrincipal,
        panelSeleccionar);
        
        ControladorDeEventos.agregarTransicionBoton(
        panelCrearUsuario.getBotonVolver(),
        panelCrearUsuario,
        panelPrincipal);
        
        ControladorDeEventos.agregarTransicionBoton(
        panelSeleccionar.getbotonVolver(),
        panelSeleccionar,
        panelPrincipal);
        
        ControladorDeEventos.hacerQueryForm(
        panelCrearUsuario.getBotonCrear(),        
        panelCrearUsuario);
        
        ControladorDeEventos.agregarTransicionBoton(
        panelCrearUsuario.getBotonCrear(),        
        panelCrearUsuario,
        panelPrincipal);
        
        ControladorDeEventos.agregarTransicionBotonActualizarPanel(
        panelSeleccionar.getbotonSelec(),        
        panelSeleccionar,
        panelUsuario);
        
        ControladorDeEventos.agregarTransicionBoton(
        panelUsuario.getBotonVolver(),
        panelUsuario,
        panelPrincipal);
        
        //-------------------------------------------------------
        
        
        
        //Set action for button click
        //Call defined method
      /* button3.addActionListener(new ActionListener() {
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
        */
               

        //Se Agregan los Paneles Al Panel Principal
        BordererPanel.add(panelCrearUsuario);
        BordererPanel.add(panelPrincipal);
        BordererPanel.add(panelSeleccionar);
        BordererPanel.add(panelUsuario);
        
        //Se Añade El panel Principal al Frame
    
        this.add(BordererPanel);
    
        
        
        
    }
    
    //Función De Inicialización ---------------------------------
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
    //-------------------------------------------------------------
}
