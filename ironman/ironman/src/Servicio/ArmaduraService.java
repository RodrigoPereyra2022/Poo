/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Armadura;
import java.text.DecimalFormat;
import java.util.Scanner;

//@author Facundo Cruz
public class ArmaduraService {

    Scanner leer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");
    DecimalFormat f1 = new DecimalFormat("0.####");

    public void caminar(Armadura a1) {
        a1.setBotaIzq(estadoDispositivo());
        if (a1.isBotaDer()) {
            System.out.println("Ingrese el tiempo a caminar en segundos");
            int t = leer.nextInt();
            a1.setBateria(a1.getBateria() - ((t / 30) * a1.getBotas()));
            System.out.println("La energía restante es " + a1.getBateria() + "J");
        }else{
            System.out.println("rompiste las botas");
        }

    }

    public void correr(Armadura a1) {
        System.out.println("Ingrese el tiempo a correr en segundos");
        int t = leer.nextInt();
        a1.setBateria(a1.getBateria() - (((t / 30) * a1.getBotas()) * 2));
        System.out.println("La energía restante es " + a1.getBateria() + "J");
    }

    public void propulsarse(Armadura a1) {
        System.out.println("Ingrese el tiempo a propulsarse en segundos");
        int t = leer.nextInt();
        a1.setBateria(a1.getBateria() - (((t / 30) * a1.getBotas()) * 3));
        System.out.println("La energía restante es " + a1.getBateria() + "J");
    }

    public void volar(Armadura a1) {
        System.out.println("Ingrese el tiempo a volar en segundos");
        int t = leer.nextInt();
        a1.setBateria(a1.getBateria() - ((((t / 30) * a1.getBotas()) * 3) + (((t / 30) * a1.getGuantes()) * 2)));
        System.out.println("La energía restante es " + a1.getBateria() + "J");
    }

    public void disparar(Armadura a1) {
        System.out.println("Ingrese el tiempo a disparar en segundos");
        int t = leer.nextInt();
        a1.setBateria(a1.getBateria() - (((t / 30) * a1.getGuantes()) * 3));
        System.out.println("La energía restante es " + a1.getBateria() + "J");
    }

    public void hablarOEscrbir(Armadura a1) {
        a1.setBateria(a1.getBateria() - a1.getConsola());
    }

    public void menuAcciones(Armadura a1) {
        int opcion;

        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Caminar");
            System.out.println("2 - Correr");
            System.out.println("3 - Propulsarse");
            System.out.println("4 - Volar");
            System.out.println("5 - Disparar");
            System.out.println("6 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    
                    hablarOEscrbir(a1);
                    caminar(a1);
                    break;
                case 2:
                    hablarOEscrbir(a1);
                    correr(a1);
                    break;
                case 3:
                    hablarOEscrbir(a1);
                    propulsarse(a1);
                    break;
                case 4:
                    hablarOEscrbir(a1);
                    volar(a1);
                    break;
                case 5:
                    hablarOEscrbir(a1);
                    disparar(a1);
                    break;
                case 6:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 6));
    }

    public void mostrandoEstado(Armadura a1) {
        if (a1.isCascoOperativo()) {
            System.out.println("El casco es funcional");
        } else {
            System.out.println("El casco no es funcional");
        }
        if (a1.isBotaDer()) {
            System.out.println("La bota derecha es funcional");
        } else {
            System.out.println("La bota derecha no es funcional");
        }
        if (a1.isBotaIzq()) {
            System.out.println("La bota izquierda es funcional");
        } else {
            System.out.println("La bota izquierda no es funcional");
        }
        if (a1.isGuanteDer()) {
            System.out.println("El guante derecho es funcional");
        } else {
            System.out.println("El guante izquierdo no es funcional");
        }
        if (a1.isGuanteIzq()) {
            System.out.println("El guante izquierdo es funcional");
        } else {
            System.out.println("El guante izquierdo no es funcional");
        }
        System.out.println("La salud actual es " + a1.getSalud());
        System.out.println("La energía actual es " + a1.getBateria() + "J");
    }

    public void estadoBateria(Armadura a1) {
        double porcentaje = ((double) a1.getBateria() * 100.0) / 1000.0;
        System.out.println("El estado de la batería es del " + df.format(porcentaje) + "%");
    }

    public void informacionReactor(Armadura a1) {
        double Wh = (double) a1.getBateria() / 3599.997;
        double kCal = (double) a1.getBateria() / 4184.0;
        System.out.println("La energía en varios/hora es " + f1.format(Wh) + " Wh");
        System.out.println("La energía en kilo calorías es " + f1.format(kCal) + " kCal");
    }

    public boolean estadoDispositivo() {
        int azar = (int) (Math.random() * 10) + 1;
        return azar > 3;
    }
}
