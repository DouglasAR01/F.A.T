
/**
 * Write a description of class UsuarioRegistrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package Backend;
import java.io.Serializable;
public class UsuarioRegistrado implements Serializable
{
    protected String nombreUsuario;
    protected String clave;
    protected String email;
    
    public UsuarioRegistrado(String nombreUsuario, String clave, String email){
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.email = email;
    }
    public void eliminarUsuario(UsuarioRegistrado target){
        target=null;
    }
    
    public void crearBanner(){};
}
