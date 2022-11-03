package poo_5_app;

//@author Your Name <Rodrigo Pereyra>
import java.util.Scanner;
import poo_5_app.Metodos.CuentasBancarias;

public class Poo_5_App {

    public static void main(String[] args) {

        CuentasBancarias cuenta1 = new CuentasBancarias();

        Scanner leer = new Scanner(System.in);

        int opcion;
        boolean salir = false;

        System.out.println("VAMOS A CREAR SU CUENTA ");
        System.out.println("---------------------------------------------");
        cuenta1.crearcuenta();
        while (!salir) {

            System.out.println("INGRESE UNA OPCION ");
            System.out.println("---------------------------------------------");
            System.out.println("1 - ingresar dinero ");
            System.out.println("2 - retirar dinero ");
            System.out.println("3 - extraccion rapida 20% ");
            System.out.println("4 - consulta de saldo ");
            System.out.println("5 - mostrar info de la cuenta");
            System.out.println("---------------------------------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cuenta1.ingresar();
                    break;

                case 2:
                    cuenta1.retirar();
                    break;
                case 3:
                    cuenta1.extraccionRapida();
                    break;
                case 4:
                    cuenta1.consultaSaldo();
                    break;
                case 5:
                    cuenta1.mostarInfo();
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        }
    }
}
