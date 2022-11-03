package g7_cafetera;

import g7_cafetera.Entidades.Cafetera;
import g7_cafetera.Servicios.CafeteraServicios;
import java.util.Scanner;

public class G7_Cafetera {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CafeteraServicios c1 = new CafeteraServicios();
        Cafetera n1 = new Cafetera();
        int option ;
            System.out.println("        BUEN DIA      ");

        do {
            
            System.out.println(" ");
            System.out.println("     MENU  OPCIONES ");            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1 -  LLENAR CAFETERA ");
            System.out.println("2 - PREPARAR UN CAFE ");
            System.out.println("3 -  VACIAR CAFETERA ");
            System.out.println("4 -    AGREGAR CAFE  ");
            System.out.println("6 -     CANCELAR     ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("      ELIJA UNA OPCION");
            option = leer.nextInt();

            if (option >= 1 && option <= 4) {

                switch (option) {
                    case 1:
                        c1.llenarCafetera();
                        break;
                    case 2:
                        c1.servirTaza();
                        break;
                    case 3:
                        c1.vaciarCafetera();
                        break;
                    case 4:
                        c1.agregarCafe();

                }

            }
        } while (option >0 && option <=6);
    }
}
