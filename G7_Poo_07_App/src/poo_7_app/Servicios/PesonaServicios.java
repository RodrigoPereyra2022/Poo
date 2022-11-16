package poo_7_app.Servicios;

import java.util.Scanner;
import poo_7_app.Entidades.Persona;

public class PesonaServicios {

    private double imc;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje*/       
    
    public Persona crearPersona() {

        Persona p1 = new Persona();

        System.out.println("ingrese el nombre :");
        p1.setNombre(leer.next());
        System.out.println("ingrese el sexo H para hombre, M para mujer y O para otro :");
        p1.setSexo(leer.next());
        System.out.println("ingrese la edad :");
        p1.setEdad(leer.nextDouble());
        System.out.println("ingrese la altura :");
        p1.setAltura(leer.nextDouble());
        System.out.println("ingrese el peso :");
        p1.setPeso(leer.nextDouble());

        return p1;
    }

    
    
    /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
       kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
       que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
          fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
            está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
          fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
          función devuelve un 1.*/
    public int calcularIMC(Persona p1) {

        imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());

        if (imc < 20) {
            System.out.println("esta por de bajo de su peso ideal " );
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("esta en su peso ideal " );
            return 0;
        } else if (imc > 25) {
            System.out.println("esta en sobrepeso " );
            return 1;
        }
        return 0;

    }

    
    
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
           un booleano.*/
    public boolean esMayorDeEdad(Persona p1) {

        if (p1.getEdad() >= 18) {
            return true;

        } else {
            return false;

        }

    }
}
