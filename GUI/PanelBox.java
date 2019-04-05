package GUI;

import javax.swing.JOptionPane;
/**
 *  
 * @author Lokuest-Pecons
 * @version 0.8
 */
public class PanelBox
{
    // Método Para Mostrar Mensajes
    public static void mostrarMensaje(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "F.A.T: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
