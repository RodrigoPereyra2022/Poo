/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes*/

package poo_4_app;

//@author Your Name <Rodrigo Pereyra>


import poo_4_app.Servicios.RectanguloServicios;


public class Poo_4_App {

    public static void main(String[] args) {
        
        
        
        RectanguloServicios rs = new RectanguloServicios();
        
        rs.crearRectangulo();
        rs.superficie();
        rs.perimetro();
        rs.dibujo();
    }

}