

package poo_8_app;

//@author Your Name <Rodrigo Pereyra>

import java.util.Scanner;
import poo_8_app.Entidades.Cadena;
import poo_8_app.Servicios.CadenaServicios;


public class Poo_8_App {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        /*En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada*/
        
        Cadena cad1 = new Cadena();
        CadenaServicios datos = new CadenaServicios();
         
        System.out.print("ingrese una frase o palabra ");
        cad1.setFrase(leer.next());
        
        
       
        datos.mostrarVocales(cad1);
        datos.invertirFrase(cad1);
        datos.vecesRepetido(cad1);
        //datos.compararLongitud(cad1);
        datos.unirFrases(cad1);
        datos.reemplazar(cad1);
        datos.contine(cad1);
    }
        
    }
        
       
    
          

    

