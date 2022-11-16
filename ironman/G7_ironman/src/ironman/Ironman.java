package ironman;

//@author Facundo Cruz
import Entidad.Armadura;
import Servicio.ArmaduraService;
import java.util.Scanner;

public class Ironman {
    
    public static void main(String[] args) {
        ArmaduraService sv = new ArmaduraService();
        Armadura a1 = new Armadura();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        sv.estadoBateria(a1);
        sv.informacionReactor(a1);
        
        
        System.out.println(" ");
        System.out.println(" ");
        int opcion;
        do {
            System.out.println("\tIRONMAN ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" 1 - caminar");
            System.out.println(" 2 - correr");
            System.out.println(" 3 - disparar");
            System.out.println(" 4 - estado bateria");
            System.out.println(" 5 - estado dispositivo");
            //System.out.println(" 6 - hablar o escribir");
            System.out.println(" 7 - estado bateria");
            System.out.println(" 8 - informacion reactor");
            //System.out.println("9 - menu acciones");
            System.out.println("10 - mostrar estado");
            System.out.println("11 - volar");
            System.out.println("12 - guardar armadura");
            System.out.println(" ");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    sv.hablarOEscrbir(a1);
                    System.out.println("Hola Tony vamos a caminar");                   
                    sv.caminar(a1);
                    break;
                case 2:
                    System.out.println("Tony vamos a correr");
                    sv.hablarOEscrbir(a1);
                    sv.correr(a1);
                    break;
                case 3:
                    sv.disparar(a1);
                    break;
                case 4:
                    sv.estadoBateria(a1);
                    break;
                case 5:
                    sv.estadoDispositivo();
                    break;
               // case 6:
                   // sv.hablarOEscrbir(a1);
                   // break;
                case 7:
                    sv.hablarOEscrbir(a1);
                case 8:
                    sv.informacionReactor(a1);
                    break;
                //case 9:
                 //   sv.menuAcciones(a1);
                  //4  break;
                case 10:
                    sv.mostrandoEstado(a1);
                    break;
                case 11:
                    sv.volar(a1);
                    break;
                case 12:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 12));
    }
    
}
