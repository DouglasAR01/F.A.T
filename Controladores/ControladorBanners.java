package Controladores;
import java.util.ArrayList;
import Backend.UsuarioRegistrado;
import Backend.Banner;
import Backend.Aprendiz;
import Backend.Tutor;
public class ControladorBanners
{
   public static String crearBanner(ConexionBD c, UsuarioRegistrado autor, ArrayList datos, int tipoBanner){
       String res = Validador.validarBanner(tipoBanner, datos);
       if(!res.equals(Respuestas.BANNER_CORRECTO)){
           return res;
        }
       switch(tipoBanner){
           case 1:
                c.BASE_DATOS.crearBannerAprendiz(
                   (Aprendiz) autor,
                   String.valueOf(datos.get(0)),
                   String.valueOf(datos.get(1)),
                   String.valueOf(datos.get(2)),
                   String.valueOf(datos.get(3)),
                   String.valueOf(datos.get(4)),
                   Integer.parseInt(String.valueOf(datos.get(5))),
                   Integer.parseInt(String.valueOf(datos.get(6))),
                   Boolean.getBoolean(String.valueOf(datos.get(7))),
                   Double.parseDouble(String.valueOf(datos.get(8))));
                 break;
            case 2:
                c.BASE_DATOS.crearBannerTutor(
                   (Tutor) autor,
                   String.valueOf(datos.get(0)),
                   String.valueOf(datos.get(1)),
                   String.valueOf(datos.get(2)),
                   String.valueOf(datos.get(3)),
                   String.valueOf(datos.get(4)),
                   Integer.parseInt(String.valueOf(datos.get(5))),
                   Boolean.getBoolean(String.valueOf(datos.get(6))),
                   String.valueOf(datos.get(7)),
                   true);
                break;
            }
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
    
   public static void eliminarBanner(ConexionBD c, Banner banner){
       banner.eliminarBanner();
       c.BASE_DATOS.getBanners().remove(banner);
    }
}
