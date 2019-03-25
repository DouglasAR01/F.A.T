package Backend;
import java.util.ArrayList;
public class BaseDatos
{
    private ArrayList<Banner> bannersTotales;
    private ArrayList<UsuarioRegistrado> usuariosActivos;
    
    public BaseDatos()
    {
        bannersTotales = new ArrayList();
        usuariosActivos = new ArrayList();
    }
    
    public BaseDatos(ArrayList<Banner> bannersTotales, ArrayList<UsuarioRegistrado> usuariosActivos)
    {
        this.bannersTotales = bannersTotales;
        this.usuariosActivos = usuariosActivos;
    }
    
    public ArrayList<Banner> getBanners(){
        return bannersTotales;
    }
    
    public ArrayList<UsuarioRegistrado> getUsuarios(){
        return usuariosActivos;
    }
    
    public void crearUsuarioRegistrado(String nombreUsuario, String clave, String correo){
        usuariosActivos.add(new UsuarioRegistrado(
                            nombreUsuario,
                            clave,
                            correo));
    }
    
    public void crearAprendiz(
                String nombreUsuario, String clave, String correo,
                String nombre, String apellido, String fechaNacimiento,
                String celular, String ciudadResidencia, String direccion,
                boolean visibilidad){
        usuariosActivos.add(new Aprendiz(
                            nombreUsuario,
                            clave,
                            correo,
                            nombre,
                            apellido,
                            fechaNacimiento,
                            celular,
                            ciudadResidencia,
                            direccion,
                            visibilidad,
                            3));
    }
    
    public void crearTutor(
                String nombreUsuario, String clave, String correo,
                String nombre, String apellido, String fechaNacimiento,
                String celular, String ciudadResidencia, String direccion,
                boolean visibilidad, String direccionAlter, int horasPresenciales,
                int horasNoPresenciales, int precioPorHora, String institucion,
                String documentoInstitucion){
        usuariosActivos.add(new Tutor(
                            nombreUsuario,
                            clave,
                            correo,
                            nombre,
                            apellido,
                            fechaNacimiento,
                            celular,
                            ciudadResidencia,
                            direccion,
                            visibilidad,
                            3,
                            direccionAlter,
                            horasPresenciales,
                            horasNoPresenciales,
                            precioPorHora,
                            institucion,
                            documentoInstitucion));
    }
    
    public void crearBannerAprendiz(
                Aprendiz autor,
                String materia, String rama, String tema,
                String fecha, String lugar, int pagoMaxHora,
                int horasReq, boolean visibilidad, int repMin){
        bannersTotales.add(autor.crearBanner(
                           materia,
                           rama,
                           tema,
                           fecha,
                           lugar,
                           pagoMaxHora,
                           horasReq,
                           visibilidad,
                           repMin));
    }
    
    public void crearBannerTutor(
                Tutor autor,
                String materia, String rama, String tema,
                String fecha, String lugar, int horasMin,
                boolean descGrup, String descDescuento, boolean visibilidad){
        bannersTotales.add(autor.crearBanner(
                           materia,
                           rama,
                           tema,
                           fecha,
                           lugar,
                           horasMin,
                           descGrup,
                           descDescuento,
                           visibilidad));
    }
    
}
