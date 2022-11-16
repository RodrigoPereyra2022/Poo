

package poo_extra_1;

//@author Your Name <Rodrigo Pereyra>

import java.util.Scanner;
import poo_extra_1.Entidades.Cancion;


public class Poo_Extra_1 {

    public static void main(String[] args) {
        /*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.*/
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cancion c1= new Cancion();
        
        System.out.println("ingrese el autor ");
        c1.setAutor(leer.next());
        System.out.println("ingrese el titulo ");
        c1.setTitulo(leer.next());
    }

}