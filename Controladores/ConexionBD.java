package Controladores;


/**
 * Write a description of class ConexionBD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import Backend.BaseDatos;
public class ConexionBD
{
   public final BaseDatos BASE_DATOS;
   
   public ConexionBD(){
       BASE_DATOS = new BaseDatos();
    }
}
