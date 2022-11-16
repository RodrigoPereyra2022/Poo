/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera).*/

package poo_6_app.Entidad;

import java.util.Scanner;


 // @author Your Name <Rodrigo Pereyra>
 
public class Cafetera {
    
    Scanner leer=new Scanner(System.in);
    
     private int capacidadMaxima,cantidadActual;
    
   

    public Cafetera() {
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    
    
    public void crearCafetera(){
        capacidadMaxima=5000;
        cantidadActual=0;
        
    }

 
    
        
    
            
    
    
}
