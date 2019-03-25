package Controladores;
public class ControladorUsuarios
{
    public static String crearUsuarioRegistrado(ConexionBD c, String nombreUsuario, String clave, String correo){
        c.BASE_DATOS.crearUsuarioRegistrado(nombreUsuario, clave, correo);
        return Respuestas.USUARIO_CORRECTO;
    }
    
    public static String crearAprendiz(
                         ConexionBD c,
                         String nombreUsuario, String clave, String correo,
                         String nombre, String apellido, String fechaNacimiento,
                         String celular, String ciudadResidencia, String direccion,
                         boolean visibilidad){
        c.BASE_DATOS.crearAprendiz(nombreUsuario,
                                   clave,
                                   correo,
                                   nombre,
                                   apellido,
                                   fechaNacimiento,
                                   celular,
                                   ciudadResidencia,
                                   direccion,
                                   visibilidad);
        return Respuestas.USUARIO_CORRECTO;
    }
    
    public static String crearTutor(
                         ConexionBD c,
                         String nombreUsuario, String clave, String correo,
                         String nombre, String apellido, String fechaNacimiento,
                         String celular, String ciudadResidencia, String direccion,
                         boolean visibilidad, String direccionAlter, int horasPresenciales,
                         int horasNoPresenciales, int precioPorHora, String institucion,
                         String documentoInstitucion){
       c.BASE_DATOS.crearTutor(
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
                         direccionAlter,
                         horasPresenciales,
                         horasNoPresenciales,
                         precioPorHora,
                         institucion,
                         documentoInstitucion);
       return Respuestas.USUARIO_CORRECTO;
    }
}
