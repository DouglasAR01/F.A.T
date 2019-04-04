package Controladores;
import java.util.ArrayList;
import Backend.UsuarioRegistrado;
import Backend.Aprendiz;
import Backend.Tutor;
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
    
    private static boolean verificarUnicidad(ConexionBD c, String usuario, String correo, UsuarioRegistrado user){
        ArrayList<UsuarioRegistrado> usuarios = c.BASE_DATOS.getUsuarios();
        for(UsuarioRegistrado usuarioActivo : usuarios){
            if(!usuarioActivo.equals(user)){
                if(usuarioActivo.getNombreUsuario().equals(usuario) || usuarioActivo.getEmail().equals(correo)){
                    return false;
                }
            }
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
    
    public static String crearUsuario(ConexionBD c, int tipoUsuario, ArrayList datos){
        String res = Validador.validarUsuarios(tipoUsuario,datos);
        if(!res.equals(Respuestas.USUARIO_CORRECTO)){
            return res;
        }
        if(!verificarUnicidad(c,String.valueOf(datos.get(0)),String.valueOf(datos.get(2)))){
            return Respuestas.ERROR_0;
        }
        switch(tipoUsuario){
            case 1:
                c.BASE_DATOS.crearTutor(
                        String.valueOf(datos.get(0)),
                        String.valueOf(datos.get(1)),
                        String.valueOf(datos.get(2)),
                        String.valueOf(datos.get(3)),
                        String.valueOf(datos.get(4)),
                        String.valueOf(datos.get(5)),
                        String.valueOf(datos.get(6)),
                        String.valueOf(datos.get(7)),
                        String.valueOf(datos.get(8)),
                        Boolean.parseBoolean(String.valueOf(datos.get(9))),
                        String.valueOf(datos.get(10)),                    
                        Integer.parseInt(String.valueOf(datos.get(11))),
                        Integer.parseInt(String.valueOf(datos.get(12))),
                        Integer.parseInt(String.valueOf(datos.get(13))),
                        String.valueOf(datos.get(14)),
                        String.valueOf(datos.get(15)));
                break;
            case 2:
                c.BASE_DATOS.crearAprendiz(
                        String.valueOf(datos.get(0)),
                        String.valueOf(datos.get(1)),
                        String.valueOf(datos.get(2)),
                        String.valueOf(datos.get(3)),
                        String.valueOf(datos.get(4)),
                        String.valueOf(datos.get(5)),
                        String.valueOf(datos.get(6)),
                        String.valueOf(datos.get(7)),
                        String.valueOf(datos.get(8)),
                        Boolean.getBoolean(String.valueOf(datos.get(9))));
                 break;
            case 3:
                c.BASE_DATOS.crearUsuarioRegistrado(String.valueOf(datos.get(0)), String.valueOf(datos.get(1)), String.valueOf(datos.get(2)));
        }
        return Respuestas.USUARIO_CORRECTO;
    }
    
    public static String modificarUsuario(ConexionBD c, UsuarioRegistrado usuario, int tipoUsuario, ArrayList datos){
        String res = Validador.validarUsuarios(tipoUsuario,datos);
        if(!res.equals(Respuestas.USUARIO_CORRECTO)){
            return res;
        }
        
        if(!verificarUnicidad(c,String.valueOf(datos.get(0)),String.valueOf(datos.get(2)),usuario)){
            return Respuestas.ERROR_0;
        }
        switch(tipoUsuario){
            case 1: //tutor
                Tutor user = (Tutor) usuario;
                user.setDireccionAlternativa(String.valueOf(datos.get(10)));
                user.setHorasPresencialesDisponibles(Integer.parseInt(String.valueOf(datos.get(11))));
                user.setHorasNoPresencialesDisponibles(Integer.parseInt(String.valueOf(datos.get(12))));
                user.setPrecioPorHora(Integer.parseInt(String.valueOf(datos.get(13))));
                user.setInstitucion(String.valueOf(datos.get(14)));
                user.setDocumentoInstitucion(String.valueOf(datos.get(15)));
            case 2:
                Aprendiz user2 = (Aprendiz) usuario;
                user2.setNombre(String.valueOf(datos.get(3)));
                user2.setApellido(String.valueOf(datos.get(4)));
                user2.setFechaNacimiento(String.valueOf(datos.get(5)));
                user2.setNumeroCelular(String.valueOf(datos.get(6)));
                user2.setCiudadResidencia(String.valueOf(datos.get(7)));
                user2.setDireccionResidencia(String.valueOf(datos.get(8)));
                user2.setVisibilidad(Boolean.getBoolean(String.valueOf(datos.get(9))));
            case 3:
                UsuarioRegistrado user3 = (UsuarioRegistrado) usuario;
                user3.setNombreUsuario(String.valueOf(datos.get(0)));
                user3.setClave(String.valueOf(datos.get(1)));
                user3.setEmail(String.valueOf(datos.get(2)));
                break;
        }
        return Respuestas.USUARIO_MOD_CORRECTO;
    }
}
