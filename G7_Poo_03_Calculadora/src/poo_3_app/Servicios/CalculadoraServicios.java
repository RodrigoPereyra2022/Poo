package poo_3_app.Servicios;

import java.util.Scanner;
import poo_3_app.Entidades.Numeros;

public class CalculadoraServicios {

    Scanner leer = new Scanner(System.in);

    Numeros o1 = new Numeros();

    public void pidenumeros() {

        System.out.println("ingrese un numero ");
        o1.setNum1(leer.nextDouble());
        System.out.println("ingrese otro numero ");
        o1.setNum2(leer.nextDouble());
    }

    public void sumar() {
        double sumar = o1.getNum1() + o1.getNum2();
        System.out.println("la suma = " + sumar);

    }

    public void restar() {
        double restar = o1.getNum1() - o1.getNum2();
        System.out.println("la resta = " + restar);
    }

    public void multiplicar() {
        if ((o1.getNum1() > 0) || (o1.getNum2() > 0)) {
            double multiplicar = o1.getNum1() * o1.getNum2();
            System.out.println("la multiplicacion = " + multiplicar);
        } else {
            System.out.println("ingrese numero distinto de cero ");
        }

    }

    public void dividir() {
        if ((o1.getNum1() > 0) || (o1.getNum2() > 0)) {
            double dividir = o1.getNum1() / o1.getNum2();
            System.out.println("la division = " + dividir);
        } else {
            System.out.println("error a ingresado un 0 ");
        }
        double dividir = o1.getNum1() / o1.getNum2();
        System.out.println("la division = " + dividir);
    }

}
