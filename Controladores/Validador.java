package Controladores;
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
}
