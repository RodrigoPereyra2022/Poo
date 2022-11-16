
package poo_5_app.Entidades;


public class Cuentas {
    
     private int numcuenta,DNI,saldoactual,saldo,interes;
    private String nombre;

    public Cuentas() {
    }

    public Cuentas(int numcuenta, int DNI, int saldoactual, int saldo, int interes, String nombre) {
        this.numcuenta = numcuenta;
        this.DNI = DNI;
        this.saldoactual = saldoactual;
        this.saldo = saldo;
        this.interes = interes;
        this.nombre = nombre;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getInteres() {
        return interes;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
}
