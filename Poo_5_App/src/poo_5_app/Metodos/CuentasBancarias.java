
package poo_5_app.Metodos;

import java.util.Scanner;
import poo_5_app.Entidades.Cuentas;

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

//@author Your Name <Rodrigo Pereyra>
 
public class CuentasBancarias {
    
    Scanner leer=new Scanner(System.in);
   
    Cuentas c1 = new Cuentas();
    

    
    
    public void crearcuenta(){
        
        System.out.println("ingresar nombre completo ");
        c1.setNombre(leer.next());
        System.out.println("ingresar DNI");
        c1.setDNI(leer.nextInt());
        System.out.println("ingresar numero de cuenta ");
        c1.setNumcuenta(leer.nextInt());
        System.out.println("ingresar su primer deposito ");
        c1.setSaldoactual(leer.nextInt());
    }
    public void ingresar (){
        System.out.println("ingresar dinero ");
        c1.setSaldo(leer.nextInt());
        c1.setSaldoactual(c1.getSaldoactual()+c1.getSaldo());
        System.out.println("su saldo actual es de $"+c1.getSaldoactual());
        
    }   
    public void retirar (){
        System.out.println("cuanto desea retirar dinero ");
        int saldo1=leer.nextInt();
        c1.setSaldoactual(c1.getSaldoactual()-saldo1);
        System.out.println("su saldo actual es de $"+c1.getSaldoactual());
        
    }   
    public void extraccionRapida(){
        System.out.println("extraccion Rapida 20% de su saldo() ");
        
        int retira = (int) (0.2*c1.getSaldoactual());
        c1.setSaldoactual(c1.getSaldoactual()-retira);
        System.out.println("retira $"+retira);
        System.out.println("su saldo actual es de $"+c1.getSaldoactual());
        
    }   
    public void consultaSaldo(){
        System.out.println("su saldo es de $"+c1.getSaldoactual());
    }
    public void mostarInfo(){
        System.out.println("nombre = "+c1.getNombre());
        System.out.println("DNI = "+c1.getDNI());
        System.out.println("Numero de Cuenta = "+c1.getNumcuenta());
        System.out.println("saldo = $"+c1.getSaldoactual());
    }
}