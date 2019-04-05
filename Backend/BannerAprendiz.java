
/**
 * Write a description of class BannerAprendiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package Backend;
import java.util.HashMap;
public class BannerAprendiz extends Banner
{
    private int pagoMaximoPorHora;
    private int horasRequeridas;
    //Banner visible por un tutor recién registrado
    private boolean visTutorNuevo; 
    //Banner visible para tutores con una calificación >= attrib
    private double visCalificacionMin;
    
    public BannerAprendiz(
        String materia,
        String rama,
        String tema,
        String fecha,
        String lugar,
        Aprendiz autor
    ){
        super(materia, rama, tema, fecha, lugar, autor);
    }
    
    public void setPagoMaximoPorHora(int pagoMaximo){
        this.pagoMaximoPorHora = pagoMaximo;
    }
    
    public void setHorasRequeridas(int horasRequeridas){
        this.horasRequeridas = horasRequeridas;
    }
    
    public void setVisTutorNuevo(boolean visTutorNuevo){
        this.visTutorNuevo = visTutorNuevo;
    }
    
    public void setVisCalificacionMin(double visCalificacionMin){
        this.visCalificacionMin = visCalificacionMin;
    }
    
    public HashMap verContenidoBanner(){
        HashMap<String,Object> contenido = new HashMap();
        contenido.put("PAGO_MAX",this.pagoMaximoPorHora);
        contenido.put("HORAS_REQ",this.horasRequeridas);
        contenido.put("VIS_TUT", this.visTutorNuevo);
        contenido.put("REP_MIN_TUT", this.visCalificacionMin);
        return contenido;
    }
    
    public String verContenidoBannerString(){
        return "Pago máximo por hora: "+this.pagoMaximoPorHora+"\n"+
               "Horas requeridas: "+this.horasRequeridas+"\n"+
               "Visible para tutores nuevos: "+((this.visTutorNuevo) ? "Sí":"No")+"\n"+
               "Reputación mínima del tutor: "+this.visCalificacionMin;
    }
}
