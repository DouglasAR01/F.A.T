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
}
