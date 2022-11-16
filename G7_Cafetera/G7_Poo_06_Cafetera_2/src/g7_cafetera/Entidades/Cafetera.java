
package g7_cafetera.Entidades;

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.*/

public class Cafetera {
    
     private int cMax;
     private int cActual;

    public Cafetera() {
    }

    public Cafetera(int cMax, int cActual) {
        this.cMax = cMax;
        this.cActual = cActual;
    }

    public int getcMax() {
        return cMax;
    }

    public void setcMax(int cMax) {
        this.cMax = cMax;
    }

    public int getcActual() {
        return cActual;
    }

    public void setcActual(int cActual) {
        this.cActual = cActual;
    }
     
     

}
