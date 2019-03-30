package Controladores;


/**
 * Write a description of class ConexionBD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import Backend.BaseDatos;
import java.io.*;
public class ConexionBD
{
   public final BaseDatos BASE_DATOS;
   
   public ConexionBD(){
       BaseDatos bd = null;
       try{
          FileInputStream fis = new FileInputStream("bd.ser");
          ObjectInputStream ois = new ObjectInputStream(fis);
          bd = (BaseDatos) ois.readObject();//El método readObject() recupera el objeto
          ois.close(); fis.close();
       }catch(FileNotFoundException e){
          bd = new BaseDatos();
       }catch(IOException e){
          e.printStackTrace();
       }catch(ClassNotFoundException e){
          e.printStackTrace();
       }
       BASE_DATOS = bd;
    }
}
