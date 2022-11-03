
package poo_extra_2.Servivios;

import java.util.Scanner;
import poo_extra_2.Entidades.Puntos;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:*/

public class PuntosServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPuntos(Puntos p1){
        System.out.println("ingrese valor para x1");
        p1.setX1(leer.nextDouble());
        System.out.println("ingrese el valor para y1");
        p1.setY1(leer.nextDouble());
        System.out.println("ingrese valor para x2");
        p1.setX2(leer.nextDouble());
        System.out.println("ingrese el valor para y2");
        p1.setY2(leer.nextDouble());
        
    }
    
    public void calcularDistancia(Puntos p1  ){
        
        System.out.println("la distancia entre los dos puntos es = "+(Math.sqrt(Math.pow((p1.getX1()-p1.getY1()), 2))+ (Math.pow((p1.getX2()-p1.getY2()), 2))));

    }
}
