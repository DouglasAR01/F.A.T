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
    
    
        
   
    
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        super(true);        
        
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
        BannerPanel panelCrearBanner = new BannerPanel();
    
        
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
        
        ControladorDeEventos.agregarTransicionBotonActualizarPanel(
        panelUsuario.getBotonCrear(),        
        panelUsuario,
        panelCrearBanner);
        //-------------------------------------------------------
        ControladorDeEventos.agregarTransicionBoton(
        panelCrearBanner.getBotonCancelar(),
        panelCrearBanner,
        panelUsuario);
        
        ControladorDeEventos.crearBanner(panelCrearBanner);
        
        ControladorDeEventos.agregarTransicionBoton(
        panelCrearBanner.getBotonCrear(),
        panelCrearBanner,
        panelUsuario);        
        
       
        //Se Agregan los Paneles Al Panel Principal
        BordererPanel.add(panelCrearUsuario);
        BordererPanel.add(panelPrincipal);
        BordererPanel.add(panelSeleccionar);
        BordererPanel.add(panelUsuario);
        BordererPanel.add(panelCrearBanner);
        
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
