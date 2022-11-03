

package poo_11_app;

//@author Your Name <Rodrigo Pereyra>

import java.util.Date;
import java.util.Scanner;


public class Poo_11_App {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        Date actual = new Date();
        
        int diaActual = actual.getDate();
        int mesActual = actual.getMonth()+1;
        int anioActual = actual.getYear()+1900;
        System.out.println(" FECHA ACTUAL");
        System.out.println(actual);
        System.out.println(" ");
        Date nacimiento = new Date();
        System.out.println(" ");
        System.out.println("ingresar fecha de nacimiento ");
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        //Diferencia de años
        int diferencia = anioActual - anio;
        
        if (diferencia != 0) {
            
            if (mesActual <= mes) { 
                        diferencia--;
                    }
                } else {
                    diferencia--;
                }
        System.out.println("============================");
        System.out.println("tu edad es de "+diferencia+" anios");
        System.out.println("============================");

    }

}