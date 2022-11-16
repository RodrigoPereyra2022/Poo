
package poo_6_app;

//@author Your Name <Rodrigo Pereyra>
import java.util.Scanner;
import poo_6_app.Entidad.Cafetera;

import poo_6_app.Servicios.ServiciosCafetera;


public class Poo_6_App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Cafetera cafet1 = new Cafetera();
        ServiciosCafetera cafe = new ServiciosCafetera();
        
        
        cafet1.crearCafetera();
        
        
        boolean salir = false;
        int opcion;
        
        while (!salir) {
            System.out.println("////////////////////////////////////////////");
            System.out.println("ELIJA UNA OPCION ");
            System.out.println("--------------------------------------------");
            System.out.println("1 - LLENAR CAFETERA ");
            System.out.println("2 - SERVIR TAZA  ");            
            System.out.println("3 - VACIAR CAFETERA ");
            System.out.println("4 - AGREGAR CAFE ");
            System.out.println("--------------------------------------------");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafe.llenarCafetera(cafet1);
                    break;
                case 2:
                     cafe.servirTaza(cafet1);
                     System.out.println("q rico");
                    break;
                case 3:
                    cafe.vaciarCafetera(cafet1);
                     System.out.println("");
                    break;
                case 4:
                    cafe.llenarCafetera(cafet1);
                     System.out.println("");
                    break;
                case 5:
                      System.out.println("");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }

        }

    }

}
