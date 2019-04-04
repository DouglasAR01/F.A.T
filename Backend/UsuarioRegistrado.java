
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
    
    public String getNombreUsuario(){
        return this.nombreUsuario;
    }

    public String getEmail(){
        return this.email;
    }
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void crearBanner(){};
}
