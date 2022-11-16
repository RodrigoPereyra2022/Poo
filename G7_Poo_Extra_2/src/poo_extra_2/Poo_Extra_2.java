

package poo_extra_2;

//@author Your Name <Rodrigo Pereyra>

import poo_extra_2.Entidades.Puntos;
import poo_extra_2.Servivios.PuntosServicios;


public class Poo_Extra_2 {

    public static void main(String[] args) {
        /*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:*/
        PuntosServicios ps =new PuntosServicios();
        Puntos p1 = new Puntos();
        Puntos p2 = new Puntos();
        
        
        ps.crearPuntos(p1);
        
        
        ps.calcularDistancia(p1);
        
    }

}