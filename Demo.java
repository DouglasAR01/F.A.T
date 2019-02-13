import java.util.ArrayList;
import java.util.Scanner;
public class Demo
{
    public static void main(){
        ArrayList<Banner> bannersTotales = new ArrayList();
        ArrayList<UsuarioRegistrado> usuariosActivos = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        //Creación de los actores base
        Aprendiz estudiante = new Aprendiz(
                               "Doukuest",
                               "clavemain",
                               "ra.douglas@hotmail.com",
                               "Douglas Andrés",
                               "Ramírez Brujes",
                               "22/01/1999",
                               "3184301032",
                               "Bucaramanga",
                               "Calle falsa 123 # FFF",
                               true,
                               3);
        Tutor profesor = new Tutor(
                               "Henryxito",
                               "v1v4nl4s0b3s4s",
                               "henry.pena@correo.uis.edu.co",
                               "Henry Iván",
                               "Peña Contreras",
                               "6/01/1999",
                               "3013448093",
                               "Bucaramanga",
                               "Calle falsa 456 # 000",
                               true,
                               2.7,
                               "Cerca de la UIS equisdé",
                               12,
                               2,
                               12500,
                               "Universidad industrial de Santander",
                               "2150606");
        UsuarioRegistrado guest = new UsuarioRegistrado(
                               "FRoM",
                               "b3estopr0f3sor",
                               "FRoM@correo.uis.edu.co");
                               
        usuariosActivos.add(estudiante);
        usuariosActivos.add(profesor);
        usuariosActivos.add(guest);
        
        //Creación de los banners
        bannersTotales.add(estudiante.crearBanner(
                               "Matemáticas",
                               "Cálculo",
                               "Derivadas",
                               "15/02/2019",
                               "CT 403 UIS",
                               7000,
                               2,
                               true,
                               1.5));
        bannersTotales.add(profesor.crearBanner(
                               "Matemáticas",
                               "Ecuaciones diferenciales",
                               "Transformadas de Laplace",
                               "22/02/2019",
                               "LP CEIS UIS",
                               4,
                               true,
                               "Si llevan primiparas se hace 10%",
                               true));
        
        //Este banner tiene la visibilidad en falso, por lo tanto, no se mostrará
        bannersTotales.add(profesor.crearBanner(
                               "Física",
                               "Mecánica cuantica",
                               "Relatividad general",
                               "20/03/2019",
                              "LP CEIS UIS",
                               4,
                               false,
                               "",
                               false
        ));
        
        boolean opt = true;
        UsuarioRegistrado rol = guest;
        while (opt){
         System.out.println("====================\nDemostración de uso de FAT: TeachApp\n====================\n"+
                            "ROL ACTUAL: "+rol.getClass()+"\n"+
                            "OPCIONES\n"+
                            "1. Cambiar rol\n"+
                            "2. Crear banner\n"+
                            "3. Buscar banner\n"+
                            "4. Mostrar banners propios\n"+
                            "5. Mostrar banners disponibles\n"+
                            "6. Salir\n"
                           );
         int res = scanner.nextInt();
         switch(res){
             case 1:
                int x=0;
                System.out.println("Roles disponibles:\n");
                for ( UsuarioRegistrado pointer : usuariosActivos){
                    System.out.println(""+x+" "+pointer.getClass()+"\n");
                    x++;
                }
                int ent = scanner.nextInt();
                rol = usuariosActivos.get(ent<=usuariosActivos.size()-1 ? ent : 0);          
           
                break;
             case 2:
                break;
             case 3:
                scanner.nextLine();
                String materia = scanner.nextLine();
                for(Banner pointer : bannersTotales){
                    if(pointer.getMateria().equals(materia)){
                        pointer.verBanner();
                    }
                }
                break;
             case 4:
                //(Aprendiz) rol.getBanners();
                break;
             case 5:
                for (Banner pointer : bannersTotales){
                    if(pointer.getVisibilidad()){
                        System.out.println(pointer.verBanner());
                    }
                }
                break;
             case 6:
                opt=false;
                break;
             default:
                break;
               
         }
        }
    }
    
    
    
    //private static Banner buscarBanner(ArrayList<Banner> banners, String materia){
        //return banner;
    //}
}
