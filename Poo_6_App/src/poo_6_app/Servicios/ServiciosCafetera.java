/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
package poo_6_app.Servicios;

//@author Your Name <Rodrigo Pereyra>
import java.util.Scanner;
import poo_6_app.Entidad.Cafetera;

public class ServiciosCafetera {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafet1) {
        System.out.println("cafetera al maximo ");
        cafet1.setCantidadActual(cafet1.getCapacidadMaxima());
        System.out.println("contiene = " + cafet1.getCantidadActual());

    }

    public void servirTaza(Cafetera cafet1) {

        int opcion;

        System.out.println("ELIJA UNA OPCION ");
        System.out.println("--------------------------------------------");
        System.out.println("1 - SERVIR TAZA CHICA ");
        System.out.println("2 - SERVIR TAZA MEDIANA ");
        System.out.println("3 - SERVIR TAZA GRANDE  ");
        System.out.println("--------------------------------------------");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("llenado taza chica ");
                cafet1.setCantidadActual(cafet1.getCantidadActual() - 100);
                System.out.println("restante en cafetera = " + cafet1.getCantidadActual());
                break;
            case 2:
                System.out.println("llenado taza chica ");
                cafet1.setCantidadActual(cafet1.getCantidadActual() - 150);
                System.out.println("restante en cafetera = " + cafet1.getCantidadActual());

                break;
            case 3:
                System.out.println("llenado taza chica ");
                cafet1.setCantidadActual(cafet1.getCantidadActual() - 250);
                System.out.println("restante en cafetera = " + cafet1.getCantidadActual());
                break;
            case 4:
                System.out.println("");
                break;

            default:
                System.out.println("opcion incorrecta");
        }

    }

    public void vaciarCafetera(Cafetera cafet1) {
        System.out.println("vaciando cafetera ...... ....");

        cafet1.setCantidadActual(cafet1.getCantidadActual() - cafet1.getCantidadActual());
        System.out.println("proceso terminado");
        System.out.println("cafetera =" + cafet1.getCantidadActual());

    }

    public void agregarCafe(Cafetera cafet1) {
        System.out.println("llenando cafetera ...... ....");
        cafet1.setCantidadActual(cafet1.getCapacidadMaxima());
        System.out.println("proceso terminado");
        System.out.println("cafetera =" + cafet1.getCantidadActual());
    }
}
