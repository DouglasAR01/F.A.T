
/**
 * Write a description of class BannerTutor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package Backend;
import java.util.HashMap;
public class BannerTutor extends Banner
{
    private int horasMinimas;
    private boolean descuentoPorGrupo;
    private String descripcionDescuentoGrupal;
    
    
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
    
    
    public HashMap verContenidoBanner(){
        HashMap<String,Object> contenido = new HashMap();
        contenido.put("HORAS_MIN_TUT",this.horasMinimas);
        contenido.put("DESCUENTO_GRUPO",this.descuentoPorGrupo);
        contenido.put("DESC_DESCUENTO",this.descripcionDescuentoGrupal);
        contenido.put("VISIBILIDAD",this.getVisibilidad());
        return contenido;
    }
    
    public String verContenidoBannerString(){
        return "Horas mínimas de tutoría: "+this.horasMinimas+"\n"+
               "Se hace descuento por grupo: "+((this.descuentoPorGrupo) ?
               "Sí \n"+"Descripción del descuento grupal: "+this.descripcionDescuentoGrupal+"\n":"No\n")+
               "Visible al público: "+((this.getVisibilidad()) ? "Sí":"No")+"\n";
    }
}
