
package poo_extra4.entidades;

/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:*/

public class entidades {
    
    private int DNI;
    private String Letra;

    public entidades() {
    }

    public entidades(int DNI, String Letra) {
        this.DNI = DNI;
        this.Letra = Letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public int getDNI() {
        return DNI;
    }

    public String getLetra() {
        return Letra;
    }
    
    
    
}
