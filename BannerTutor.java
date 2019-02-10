
/**
 * Write a description of class BannerTutor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BannerTutor extends Banner
{
    private int horasMinimas;
    private boolean descuentoPorGrupo;
    private String descripcionDescuentoGrupal;
    private boolean visibilidad;
    
    public BannerTutor(
        String materia,
        String rama,
        String tema,
        String fecha,
        String lugar,
        Tutor autor
    ){
        super(materia, rama, tema, fecha, lugar, autor);
    }
    
    public void setHorasMinimas(int horasMinimas){
        this.horasMinimas = horasMinimas;
    }
    
    public void setDescuentoPorGrupo(boolean descuentoPorGrupo){
        this.descuentoPorGrupo = descuentoPorGrupo;
    }
    
    public void setDescripcionDescuentoGrupal(String desc){
        this.descripcionDescuentoGrupal = desc;
    }
    
    public void setVisibilidad(boolean visibilidad){
        this.visibilidad = visibilidad;
    }
    
    public String verContenidoBanner(){
        return "Horas mínimas de tutoría: "+this.horasMinimas+"\n"+
               "Se hace descuento por grupo: "+((this.descuentoPorGrupo) ?
               "Sí \n"+"Descripción del descuento grupal: "+this.descripcionDescuentoGrupal+"\n":"No")+
               "Visible al público: "+((this.visibilidad) ? "Sí":"No")+"\n";
    }
}
