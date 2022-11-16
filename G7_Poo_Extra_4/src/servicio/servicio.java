/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;

import poo_extra4.entidades.entidades;


public class servicio {
    
    Scanner leer = new Scanner(System.in);
    
    
    public void creaNif(entidades o1){
        String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };
        System.out.println("Ingrese su DNI");
        o1.setDNI(leer.nextInt());
        int valor =  o1.getDNI() % 23;
        System.out.println(vector[valor]);
        o1.setLetra(vector[valor]);
    }
    public void mostrarNif(entidades o1){
        String formato = String.format("%08d", o1.getDNI());
        System.out.println("Su NIF es: ");
        System.out.println(formato + "-" + o1.getLetra() );
    }

    
}

