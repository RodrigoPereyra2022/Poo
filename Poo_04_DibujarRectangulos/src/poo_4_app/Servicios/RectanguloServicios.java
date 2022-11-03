package poo_4_app.Servicios;

import java.util.Scanner;
import poo_4_app.Entidades.Rectangulos;

public class RectanguloServicios {

    Scanner leer = new Scanner(System.in);

    Rectangulos r1 = new Rectangulos();

    public void crearRectangulo() {

        System.out.println("ingrese el tamaño de la base ");
        r1.setBase(leer.nextInt());
        System.out.println("ingrese la altura del rectangulo ");
        r1.setAltura(leer.nextInt());

    }

    public void superficie() {
        int superficie = r1.getBase() * r1.getAltura();
        System.out.println("la superficie es de " + superficie);

    }

    public void perimetro() {
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("el perimetro es de " + perimetro);
    }

    public void dibujo() {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i == 0 || j == 0 || i == r1.getAltura() - 1 || j == r1.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}
