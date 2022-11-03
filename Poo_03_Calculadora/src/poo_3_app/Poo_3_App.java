/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
package poo_3_app;

//@author Your Name <Rodrigo Pereyra>
import java.util.Scanner;
import poo_3_app.Servicios.CalculadoraServicios;

public class Poo_3_App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CalculadoraServicios cs = new CalculadoraServicios();
        
        cs.pidenumeros();

        int opcion;
        
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - sumar");
            System.out.println("2 - restar");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir 4");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.sumar();
                    break;
                case 2:
                    cs.restar();
                    break;
                case 3:
                    cs.multiplicar();
                    break;
                case 4:
                    cs.dividir();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));

    }

}
