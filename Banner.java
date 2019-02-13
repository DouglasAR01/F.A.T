
/**
 * La clase Banner es de donde se heredan los métodos y atributos
 * necesarios para el correcto funcionamiento de BannerAprendiz y BannerTutor
 * @author: Douglas R
 * Date: 10/02/2019
 */
public abstract class Banner
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
    
    public String contactarAutor(Aprendiz pointer){
        if(!this.equals(pointer)){
            return "==============================================\n"+
                   "Contacto:"+pointer.getNombre()+"\n"+
                   "-email:"+pointer.getEmail()+"\n"+
                   "-celular:"+pointer.getCel()+"\n"+
                   "==============================================\n";
        }
        return "No se encontró información del contacto\n";
    }
    
    
    
    public String verEncabezado(){
        return "==============================================\n"+
               "Materia: "+this.getMateria()+"\n"+
               "Rama: "+this.getRama()+" | Tema: "+this.getTema()+"\n"+
               "----------------------------------------------";
    }
    
    public String verInfoAutor(){
        return "----------------------------------------------\n"+
               "Usuario: "+this.autor.getNombreUsuario()+"\n"+
               "Nombre del autor: "+this.autor.getNombre()+" "+this.autor.getApellido()+"\n"+
               "Email: "+this.autor.getEmail()+"\n"+
               "Reputacion del autor: "+this.autor.getReputacion()+
               "\n==============================================\n";
    }
    
    public abstract String verContenidoBanner();
   
    public String verBanner(){
        return this.verEncabezado()+"\n"+
               this.verContenidoBanner()+"\n"+
               this.verInfoAutor();
    }
}
