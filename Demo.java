import java.util.ArrayList;
public class Demo
{
    public static void main(){
        ArrayList<Banner> BannersTotales = new ArrayList();
        Aprendiz [] Usuarios = new Aprendiz[2];
        Usuarios[0] = new Aprendiz(
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
        Usuarios[1] = new Tutor(
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
                               "2150606"
                               );
        Usuarios[0].crearBanner(
                               "Matemáticas",
                               "Cálculo",
                               "Derivadas",
                               "15/02/2019",
                               "CT 403 UIS",
                               7000,
                               2,
                               true,
                               1.5);
    }
}
