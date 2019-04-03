
/**
 * La clase Banner es de donde se heredan los métodos y atributos
 * necesarios para el correcto funcionamiento de BannerAprendiz y BannerTutor
 * @author: Douglas R
 * Date: 10/02/2019
 */
package Backend;
import java.io.Serializable;
import java.util.HashMap;
public abstract class Banner implements Serializable
{
    private String materia;
    private String rama;
    private String tema;
    private String fecha;
    private String lugar;
    private boolean visibilidad;
    protected Aprendiz autor;
    
    public Banner(
        String materia,
        String rama,
        String tema,
        String fecha,
        String lugar,
        Aprendiz autor
    ){
        this.materia = materia;
        this.rama = rama;
        this.tema = tema;
        this.fecha = fecha;
        this.lugar = lugar;
        this.autor = autor;
        this.visibilidad = true;
    }
    
    public boolean getVisibilidad(){
        return this.visibilidad;
    }
    
    public void setVisibilidad(boolean visibilidad){
        this.visibilidad = visibilidad;
    }
    
    public String getMateria(){
        return this.materia;
    }
    
    public String getRama(){
        return this.rama;
    }
    
    public String getTema(){
        return this.tema;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    
    public String getLugar(){
        return this.lugar;
    }
    
    public Aprendiz getAutor(){
        return this.autor;
    }
    
    /**
     * Este método permite eliminar el banner cuando el usuario lo solicite
     */
    public void eliminarBanner(){
        
    }
    public abstract HashMap verContenidoBanner();
    
    public HashMap verBanner(){
        HashMap<String,Object> contenido = verContenidoBanner();
        contenido.put("E_MATERIA",this.getMateria());
        contenido.put("E_RAMA", this.getRama());
        contenido.put("C_NOM_USUARIO",this.autor.getNombreUsuario());
        contenido.put("C_AUTOR", this.autor.getNombre()+" "+this.autor.getApellido());
        contenido.put("C_EMAIL", this.autor.getEmail());
        contenido.put("C_REP",this.autor.getReputacion());
        return contenido;
    }
    
}
