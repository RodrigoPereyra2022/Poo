package poo_1_libro;

// @author Your Name <Rodrigo Pereyra>

import java.util.Scanner;



public class Libro {
    
     Scanner leer = new Scanner(System.in);
     
    public String isbn,titulo,autor,npaginas;
    
    public Libro() {

    }

    public Libro(String isbn, String titulo, String autor, String npaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
    }
    
    public void cargarlibro(){
        System.out.println("vamos a cargar su libro ");
        System.out.println("-------------------------------------");
        System.out.println("ingrese ISBN ");
        isbn = leer.next();
        System.out.println("ingrese el titulo ");
        titulo = leer.next();

        System.out.println("ingrese el autor ");
        autor = leer.next();

        System.out.println("ingrese cantidad de paginas ");
        npaginas = leer.next();
        
        System.out.println("su libro se cargo correctamente ");
    }
    
    public void informe(){
        System.out.println("isbn ="+isbn);   
        System.out.println("titulo ="+titulo );
        System.out.println("numero paginas ="+npaginas);
        System.out.println("autor ="+autor);
    }

    

}
