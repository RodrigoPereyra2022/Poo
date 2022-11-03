package poo_2_puntos;

import java.util.Scanner;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.*/

//@author Your Name <Rodrigo Pereyra>
public class Poo_2_Puntos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CrearPuntos p1 = new CrearPuntos();
        CrearPuntos p2 = new CrearPuntos();
        
        System.out.println("vamos a calcular la distacia entre sus dos puntos ");
        System.out.println("----------------------------------------        ");
        System.out.println("ingresar coordenadas para el punto 1 ");
        p1.x1 = leer.nextDouble();
        p1.y1 = leer.nextDouble();

        System.out.println("ingresar coordenadas para el punto 2 ");
        p2.x2 = leer.nextDouble();
        p2.y2 = leer.nextDouble();
        
        
        System.out.println("la distacncia entre sus punstos es de "+ distancia);

    }

}
