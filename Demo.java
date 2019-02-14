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
                            "3. Mostrar banners propios\n"+
                            "4. Mostrar banners disponibles\n"+
                            "5. Salir\n"
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
                if(rol instanceof Aprendiz){
                    String materia, rama, tema, fecha, lugar;
                    System.out.println("Digite la materia:");
                    scanner.nextLine();
                    materia = scanner.nextLine();
                    System.out.println("Digite la rama de la materia:");
                    rama = scanner.nextLine();
                    System.out.println("Digite el tema de la rama:");
                    tema = scanner.nextLine();
                    System.out.println("Digite la fecha en la que desea dar/recibir la tutoría:");
                    fecha = scanner.nextLine();
                    System.out.println("Digite la dirección o lugar en que será realizada la tutoría:");
                    lugar = scanner.nextLine();
                    if(rol instanceof Tutor){
                        int horasMinimas;
                        boolean descuentoGrupal, visibilidad;
                        String descDescuentoGrupal = "";
                        System.out.println("Digite las horas mínimas de tutoría que debrán tomar los estudiantes:");
                        horasMinimas = scanner.nextInt();
                        System.out.println("¿Hará descuento por grupos de estudiantes? true:Sí false:No");
                        descuentoGrupal = scanner.nextBoolean();
                        if(descuentoGrupal){
                            System.out.println("Digite la descripción para aplicar el descuento:");
                            scanner.nextLine();
                            descDescuentoGrupal = scanner.nextLine();
                        }
                        System.out.println("¿Desea que el banner sea visible? true:Sí false:No");
                        visibilidad = scanner.nextBoolean();
                        Tutor persona = (Tutor)rol;
                        bannersTotales.add(persona.crearBanner(materia, rama, tema, fecha,
                                           lugar, horasMinimas, descuentoGrupal,descDescuentoGrupal,visibilidad));
                    }else{
                        int pagoMaximoPorHora, horasRequeridas;
                        double rep;
                        System.out.println("Digite el pago máximo que desea hacer por hora:");
                        pagoMaximoPorHora = scanner.nextInt();
                        System.out.println("Digite el número de horas requeridas:");
                        horasRequeridas = scanner.nextInt();
                        Aprendiz persona = (Aprendiz)rol;
                        bannersTotales.add(persona.crearBanner(materia, rama, tema, fecha, lugar, pagoMaximoPorHora, horasRequeridas,true,0));
                    }
                    
                }else{
                    System.out.println("Debe continuar su proceso de registro para poder ver y crear banners");
                }
                break;
             case 3:
                if(rol instanceof Aprendiz){
                    Aprendiz var = (Aprendiz) rol;
                    var.getBanners();
                }else{
                    System.out.println("Debe continuar su proceso de registro para poder ver y crear banners");
                }
                break;
             case 4:
                if(rol instanceof Aprendiz){
                    for (Banner pointer : bannersTotales){
                        if(pointer.getVisibilidad()){
                            if(!(rol.getClass() == Aprendiz.class & pointer.getAutor().getClass() == Aprendiz.class))
                            System.out.println(pointer.verBanner());
                        }
                    }
                }else{
                    System.out.println("Debe continuar su proceso de registro para poder ver y crear banners");
                }
                
                break;
             case 5:
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
