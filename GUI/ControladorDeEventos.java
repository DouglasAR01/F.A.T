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
import Backend.*;
import java.util.ArrayList;

/**
 * 
 * @author Lokuest-Pecons
 * @version 0.8
 */
public class ControladorDeEventos
{
    public static final ConexionBD query = new ConexionBD();    
    public static void agregarTransicionBoton(JButton boton,
                                              JPanel panelBoton,
                                              JPanel panelApuntado)
    {       
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(panelBoton.isVisible()){
                    panelBoton.setVisible(false);
                    panelApuntado.setVisible(true);
                }           
                
               
    }
    });    
   }
   
    public static void agregarTransicionBotonActualizarPanel(JButton boton,
                                                        ModelPanel panelBoton,
                                                        ModelPanel panelApuntado)
    {
       boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(panelBoton.isVisible()){
                    panelBoton.setVisible(false);
                    panelApuntado.actualizar(panelBoton.getUserData(),query);
                    panelApuntado.setVisible(true);
                }
            }
        
    });
   }
   
   public static void hacerQueryForm(JButton boton,PanelCrearUsuario panel){       
       boton.addActionListener(new ActionListener() {                       
            public void actionPerformed(ActionEvent evt) {
                ArrayList temp = panel.obtenerQueryData();              
                String response = ControladorUsuarios.crearUsuario(query, panel.getTipoFormulario(),temp);
                if(response.equals(Respuestas.USUARIO_CORRECTO)){
                    panel.limpiarForms();
                }
                PanelBox.mostrarMensaje(response, "Creación de usuario:");
            }            
        });        
    }
   public static void crearBanner(BannerPanel panel){
       panel.getBotonCrear().addActionListener(new ActionListener() {                       
            public void actionPerformed(ActionEvent evt) {
                String response= ControladorBanners.crearBanner(query, panel.getUsuario(), panel.getDatos(), panel.getBannerType());
                PanelBox.mostrarMensaje(response, "Creación de Banner:");
            }            
        });
       
    }
    
   public static void AñadirUsuariosComboBox(JComboBox comboBox){
        comboBox.removeAllItems();        
        for(UsuarioRegistrado user : query.BASE_DATOS.getUsuarios()){            
            comboBox.addItem(user.getClass().toString().replace("class Backend.","")+"/"+user.getNombreUsuario());            
        }
    }
   
}
