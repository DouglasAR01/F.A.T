
/**
 * Write a description of class Tutor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutor extends Aprendiz
{
    private String direccionAlternativa;
    private int horasPresencialesDisponibles;
    private int horasNoPresencialesDisponibles;
    private int precioPorHora;
    private String institucion;
    private String documentoInstitucion;
    
    public Tutor(
           String nombreUsuario,
           String clave,
           String email,
           String nombre,
           String apellido,
           String fechaNacimiento,
           String numeroCelular,
           String ciudadResidencia,
           String direccionResidencia,
           boolean visibilidad,
           double reputacion,
           String direccionAlternativa,
           int horasPresencialesDisponibles,
           int horasNoPresencialesDisponibles,
           int precioPorHora,
           String institucion,
           String documentoInstitucion
    ){
        super(nombreUsuario, clave, email, 
              nombre, apellido, fechaNacimiento, numeroCelular, 
              ciudadResidencia, direccionResidencia, visibilidad, reputacion);
        this.direccionAlternativa = direccionAlternativa;
        this.horasPresencialesDisponibles = horasPresencialesDisponibles;
        this.horasNoPresencialesDisponibles = horasNoPresencialesDisponibles;
        this.precioPorHora = precioPorHora;
        this.institucion = institucion;
        this.documentoInstitucion = documentoInstitucion;
    }
    
    public void crearBanner(
           String materia,
           String rama,
           String tema,
           String fecha,
           String lugar,
           int horasMinimas,
           boolean descuentoGrupal,
           String descDescuentoGrupal,
           boolean visibilidad
    ){
        BannerTutor banner = new BannerTutor(
                                       materia, rama,
                                       tema, fecha,
                                       lugar, this);
        banner.setHorasMinimas(horasMinimas);
        banner.setDescuentoPorGrupo(descuentoGrupal);
        banner.setDescripcionDescuentoGrupal(descDescuentoGrupal);
        banner.setVisibilidad(visibilidad);
        bannersCreados.add(banner);
    }
    
    public String getInstitucion(){
        return this.institucion;
    }
}
