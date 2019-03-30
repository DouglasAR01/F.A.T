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
public class ControladorDeEventos
{
    public static ConexionBD query = new ConexionBD();
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
   public static void hacerQueryForm(JButton boton,PanelCrearUsuario panel){
       boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ArrayList temp = panel.obtenerQueryData();               
               
                
                if(panel.getTipoFormulario()==3){ 
                   
                   ControladorUsuarios.crearUsuarioRegistrado(query,
                   String.valueOf(temp.get(0)),
                   String.valueOf(temp.get(1)),
                   String.valueOf(temp.get(2)));
                   PanelBox.mostrarMensaje("Usuario Creado Exitosamente", "Creación Exitosa");
                  
                  
                }
                if(panel.getTipoFormulario()==2){
                    
                    ControladorUsuarios.crearAprendiz(query,
                    String.valueOf(temp.get(0)),
                    String.valueOf(temp.get(1)),
                    String.valueOf(temp.get(2)),
                    String.valueOf(temp.get(3)),
                    String.valueOf(temp.get(4)),
                    String.valueOf(temp.get(5)),
                    String.valueOf(temp.get(6)),
                    String.valueOf(temp.get(7)),
                    String.valueOf(temp.get(8)),
                    Boolean.getBoolean(String.valueOf(temp.get(9))));
                    PanelBox.mostrarMensaje("Aprendiz Creado Exitosamente", "Creación Exitosa");
                  
                
                }
                if(panel.getTipoFormulario()==1){
                    String t1,t2,t3;
                    t1=String.valueOf(temp.get(11));
                    t2=String.valueOf(temp.get(12));
                    t3=String.valueOf(temp.get(13));
                    
                    ControladorUsuarios.crearTutor(query,
                    String.valueOf(temp.get(0)),
                    String.valueOf(temp.get(1)),
                    String.valueOf(temp.get(2)),
                    String.valueOf(temp.get(3)),
                    String.valueOf(temp.get(4)),
                    String.valueOf(temp.get(5)),
                    String.valueOf(temp.get(6)),
                    String.valueOf(temp.get(7)),
                    String.valueOf(temp.get(8)),
                    Boolean.parseBoolean(String.valueOf(temp.get(9))),
                    String.valueOf(temp.get(10)),                    
                    Integer.parseInt(t1),
                    Integer.parseInt(t2),
                    Integer.parseInt(t3),
                    String.valueOf(temp.get(14)),
                    String.valueOf(temp.get(15)));
                    PanelBox.mostrarMensaje("Tutor Creado Exitosamente", "Creación Exitosa");
                   
                }
                
            }
            
        });
    }
   
   
}
