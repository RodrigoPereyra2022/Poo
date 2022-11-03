

package poo_2_app;

//@author Your Name <Rodrigo Pereyra>

import java.util.Scanner;
import poo_2_app.formulas.F_radio;


public class Poo_2_App {

    public static void main(String[] args) {
        
          Scanner leer= new Scanner(System.in);
          
        
        F_radio c1= new F_radio();
        
        System.out.println("ingrese el radio ");
        c1.radio =leer.nextDouble();
        
        c1.formulaArea();
        c1.perimetro();
        
        System.out.println(" el area del circulo es de "+c1.area );
        System.out.println(" el area del perimetro  es  de "+c1.perimetro );
    }

    
}