package Controladores;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Abstract class Validador - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Validador
{
    public static boolean verificarNumerico(String cadena){
        if(cadena.matches("[0-9]+")){
            return true;
        }
        return false;
    }
    
    public static boolean verificarNumerico(String cadena, int longitud){
        if(cadena.matches("[0-9]+") && cadena.length()>=longitud){
            return true;
        }
        return false;
    }
    
    public static boolean verificarFecha(String fecha){
        if(fecha.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")){
            return true;
        }
        return false;
    }
    
    public static boolean verificarCorreo(String correo){
        String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
    public static String validarUsuarios(int tipoUsuario, ArrayList datos){
        switch(tipoUsuario){
            case 1: //tut
                if(!( Integer.parseInt(String.valueOf(datos.get(11)))>=0 && Integer.parseInt(String.valueOf(datos.get(12)))>=0 && Integer.parseInt(String.valueOf(datos.get(13)))>=0 )){
                    return Respuestas.ERROR_1;
                }
            case 2: //Apr
                if(!(verificarNumerico(String.valueOf(datos.get(6)),10) && verificarFecha(String.valueOf(datos.get(5))))){
                    return Respuestas.ERROR_1;
                }
            case 3: //UR
                if(!(String.valueOf(datos.get(0)).length()>=6 && verificarCorreo(String.valueOf(datos.get(2))))){
                    return Respuestas.ERROR_1;
                }
                if(String.valueOf(datos.get(1)).length()<6){
                    return Respuestas.ERROR_3;
                }
                break;
        }
        return Respuestas.USUARIO_CORRECTO;
    }
    
    public static String validarBanner(int tipoBanner, ArrayList datos){
        if(!( verificarFecha(String.valueOf(datos.get(3))) )){
            return Respuestas.ERROR_1;
        }
        switch(tipoBanner){
            case 1:
                if(!( Integer.parseInt(String.valueOf(datos.get(5)))>=0 && Integer.parseInt(String.valueOf(datos.get(6)))>=0 && Double.parseDouble(String.valueOf(datos.get(8)))>=0 )){
                    return Respuestas.ERROR_4;
                }
                break;
            case 2:
                if(!( Integer.parseInt(String.valueOf(datos.get(5)))>=0 )){
                    return Respuestas.ERROR_4;
                }
                break;
        }
        return Respuestas.BANNER_CORRECTO;
    }
}
