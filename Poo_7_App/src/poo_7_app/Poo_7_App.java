package poo_7_app;

import java.util.Scanner;
import poo_7_app.Entidades.Persona;
import poo_7_app.Servicios.PesonaServicios;

public class Poo_7_App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int i = 0;
        int j = 100;
        int ideal = 0;
        int sobrePeso = 1;
        int bajoPeso = -1;
        PesonaServicios pers1 = new PesonaServicios();
        

        Persona p1 = pers1.crearPersona();
        pers1.calcularIMC(p1);
        switch (pers1.calcularIMC(p1)) {
            case 0:
                ideal++;
                break;
            case 1:
                sobrePeso++;
                break;
            case -1:
                bajoPeso++;
                break;
            default:
                break;
        }

        pers1.esMayorDeEdad(p1);
        if (pers1.esMayorDeEdad(p1)) {
            i++;
        }
     
        
        
        Persona p2 = pers1.crearPersona();
        pers1.calcularIMC(p2);
        switch (pers1.calcularIMC(p2)) {
            case 0:
                ideal++;
                break;
            case 1:
                sobrePeso++;
                break;
            case -1:
                bajoPeso++;
                break;
            default:
                break;
        }
                pers1.esMayorDeEdad(p2);
                if (pers1.esMayorDeEdad(p2)) {
                    i++;
                }

                
                
                
                
                Persona p3 = pers1.crearPersona();
                pers1.calcularIMC(p3);
                switch (pers1.calcularIMC(p3)) {
                    case 0:
                        ideal++;
                        break;
                    case 1:
                        sobrePeso++;
                        break;
                    case -1:
                        bajoPeso++;
                        break;
                    default:
                        break;
                }
                        pers1.esMayorDeEdad(p3);
                        if (pers1.esMayorDeEdad(p3)) {
                            i++;
                        }

                        
                        
                        
                        Persona p4 = pers1.crearPersona();
                        pers1.calcularIMC(p4);
                        switch (pers1.calcularIMC(p4)) {
                            case 0:
                                ideal++;
                                break;
                            case 1:
                                sobrePeso++;
                                break;
                            case -1:
                                bajoPeso++;
                                break;
                            default:
                                break;
                        }
                                pers1.esMayorDeEdad(p4);
                                if (pers1.esMayorDeEdad(p4)) {
                                    i++;
                                }

                                
                                
//cuantas están por debajo de su peso , cuantas en su peso ideal y cuantos, por encima,
                                System.out.println("estan en su peso ideal =" + (ideal * 100 / 4) + "%");
                                System.out.println("estan por encima de su peso ideal =" + (sobrePeso * 100 / 4) + "%");
                                System.out.println("estan por de bajo de su peso ideal =" + (bajoPeso * 100 / 4) + "%");

//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
                                System.out.println("mayores de edad =" + (i * 100 / 4) + "%");
                                System.out.println("menores de edad =" + (j - (i * 100 / 4)) + "%");
                        }

                }
