
package poo_8_app.Entidades;


public class Cadena {
    
    private String frase;
    private int cadena;

    public Cadena() {
    }

    public Cadena(String frase, int cadena) {
        this.frase = frase;
        this.cadena = cadena;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setCadena(int cadena) {
        this.cadena = cadena;
    }

    public String getFrase() {
        return frase;
    }

    public int getCadena() {
        return cadena;
    }

    
}
