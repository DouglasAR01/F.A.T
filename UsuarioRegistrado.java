
/**
 * Write a description of class UsuarioRegistrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsuarioRegistrado
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
