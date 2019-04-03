package Controladores;
import java.util.ArrayList;
import Backend.UsuarioRegistrado;
import Backend.Banner;
import Backend.Aprendiz;
import Backend.Tutor;
public class ControladorBanners
{
   public static String crearBannerAprendiz(
                 ConexionBD c,
                 Aprendiz autor,
                 String materia, String rama, String tema,
                 String fecha, String lugar, int pagoMaxHora,
                 int horasReq, boolean visibilidad, int repMin){
      c.BASE_DATOS.crearBannerAprendiz(
                   autor,
                   materia,
                   rama,
                   tema,
                   fecha,
                   lugar,
                   pagoMaxHora,
                   horasReq,
                   visibilidad,
                   repMin);
      return Respuestas.BANNER_CORRECTO;
   }
   
   public static String crearBannerTutor(
                 ConexionBD c,
                 Tutor autor,
                 String materia, String rama, String tema,
                 String fecha, String lugar, int horasMin,
                 boolean descGrup, String descDescuento, boolean visibilidad){
      c.BASE_DATOS.crearBannerTutor(
                   autor,
                   materia,
                   rama,
                   tema,
                   fecha,
                   lugar,
                   horasMin,
                   descGrup,
                   descDescuento,
                   visibilidad);
      return Respuestas.BANNER_CORRECTO;
   }
   
   public static ArrayList<Banner> verBanners(ConexionBD c, UsuarioRegistrado usuario){
       ArrayList<Banner> bannersVisibles = new ArrayList();
       
       ArrayList<Banner> bannersTotales = c.BASE_DATOS.getBanners();
       for (Banner pointer : bannersTotales){
            if(pointer.getVisibilidad()){
                if(!(usuario.getClass() == Aprendiz.class & pointer.getAutor().getClass() == Aprendiz.class)){
                    bannersVisibles.add(pointer);
                }                    
            }
       }
       return bannersVisibles;
    }
}
