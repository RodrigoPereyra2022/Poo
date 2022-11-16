package poo_3_app.Entidades;

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.*/


public class Numeros {

    private Double num1, num2;
    

    public Numeros() {
    }

    public Numeros(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
        
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    
    

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

   
    }
    

    

   


