/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo*/
package poo_7_app.Entidades;

import java.util.Scanner;


public class Persona {
     
    Scanner leer=new Scanner(System.in);
     private String nombre,sexo;
     private Double peso,altura,edad;

     public Persona() {
    }

    public Persona(String nombre, String sexo, Double peso, Double altura, Double edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getEdad() {
        return edad;
    }


   
    
    
}
