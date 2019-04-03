package Controladores;
import java.util.ArrayList;
import Backend.UsuarioRegistrado;
public class ControladorUsuarios
{
    private static boolean verificarUnicidad(ConexionBD c, String usuario, String correo){
        ArrayList<UsuarioRegistrado> usuarios = c.BASE_DATOS.getUsuarios();
        for(UsuarioRegistrado usuarioActivo : usuarios){
            if(usuarioActivo.getNombreUsuario().equals(usuario) || usuarioActivo.getEmail().equals(correo)){
                return false;
            }
        }
        return true;
    }    
    private static boolean verificarClave(String clave){
        if(clave.length()<=6){
            return false;
        }
        return true;
    }
    public static UsuarioRegistrado getUsuario(ConexionBD c, String usuario)
    {
        ArrayList<UsuarioRegistrado> usuarios = c.BASE_DATOS.getUsuarios();
        for(UsuarioRegistrado usuarioActivo : usuarios){
            if(usuarioActivo.getNombreUsuario().equals(usuario)){
                return usuarioActivo;
            }
        }
        return null;
    }
    
    public static String crearUsuarioRegistrado(ConexionBD c, String nombreUsuario, String clave, String correo){
        if(!(nombreUsuario.length()>=6 && Validador.verificarCorreo(correo))){
            return Respuestas.ERROR_1;
        }
        if(!verificarClave(clave)){
            return Respuestas.ERROR_3;
        }
        if(!verificarUnicidad(c,nombreUsuario,correo)){
            return Respuestas.ERROR_0;
        }
        c.BASE_DATOS.crearUsuarioRegistrado(nombreUsuario, clave, correo);
        return Respuestas.USUARIO_CORRECTO;
    }
    
    public static String crearAprendiz(
                         ConexionBD c,
                         String nombreUsuario, String clave, String correo,
                         String nombre, String apellido, String fechaNacimiento,
                         String celular, String ciudadResidencia, String direccion,
                         boolean visibilidad){
        if(!(nombreUsuario.length()>=6 && Validador.verificarCorreo(correo) && Validador.verificarNumerico(celular,10) && Validador.verificarFecha(fechaNacimiento))){
            return Respuestas.ERROR_1;
        }
        if(!verificarClave(clave)){
            return Respuestas.ERROR_3;
        }
        if(!verificarUnicidad(c,nombreUsuario,correo)){
            return Respuestas.ERROR_0;
        }
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
       if(!(nombreUsuario.length()>=6 && Validador.verificarCorreo(correo) && Validador.verificarNumerico(celular,10) && Validador.verificarFecha(fechaNacimiento) 
       && horasPresenciales>=0 && horasNoPresenciales>=0 && precioPorHora>=0)){
            return Respuestas.ERROR_1;
       }
       if(!verificarClave(clave)){
            return Respuestas.ERROR_3;
       }
       if(!verificarUnicidad(c,nombreUsuario,correo)){
            return Respuestas.ERROR_0;
       }
       
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
