package poo_extra_5.Servicios;

import java.util.Scanner;
import poo_extra_5.Entidades.Arrays;

public class ArraysServicios {

    /*El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void adivinar(Arrays a1) {

        String mes;

        do {
            System.out.println("adivine el mes secreto");
            mes = leer.next();

        } while (mes == null ? a1.getMesSecreto() != null : !mes.equals(a1.getMesSecreto()));

        System.out.println("adivino el mes ");

    }

}
