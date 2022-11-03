package poo_2_puntos;

//@author Your Name <Rodrigo Pereyra>
public class CrearPuntos {

    public static void main(String[] args) {
        
    public Double x1;
    public Double y1;
    public Double x2;
    public Double y2;
    public Double distancia;

    public CrearPuntos() {
    }

    public CrearPuntos(Double x1, Double y1, Double x2, Double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Distancia() {

        distancia = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

}
