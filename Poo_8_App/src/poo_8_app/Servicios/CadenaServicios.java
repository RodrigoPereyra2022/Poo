package poo_8_app.Servicios;

import java.util.Scanner;
import poo_8_app.Entidades.Cadena;



public class CadenaServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.*/
    public void mostrarVocales(Cadena c1) {
        int cont1=0;

        

        for (int i = 0; i < c1.getFrase().length(); i++) {
            if ((c1.getFrase().charAt(i) == 'a') || (c1.getFrase().charAt(i) == 'e') || (c1.getFrase().charAt(i) == 'i') || (c1.getFrase().charAt(i) == 'o') || (c1.getFrase().charAt(i) == 'u')) {
                cont1++;

            }

        }

        System.out.println("hay en total "+ cont1 + " vocales ");

    }
    
    
    
    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/         
    public void invertirFrase(Cadena c1){
        
        String invertir = " ";
        
        for (int i = c1.getFrase().length()-1 ; i >= 0; i--) {
            
            invertir=invertir+c1.getFrase().charAt(i);
        }
        
        System.out.println("su frase invertida es = "+invertir);
    }
    
    
     /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:*/
    public void vecesRepetido(Cadena c1){
        
       
        int pos =0 ;
        int cont =0 ;
        String caracter = " ";
        System.out.println("ingrese el caracter a contar ");
        caracter=leer.next();
        pos=c1.getFrase().indexOf(caracter);
        
        while(pos!=-1){
            cont++;
            pos=c1.getFrase().indexOf(caracter, pos+1);
            
                    
            
        }
        System.out.println("el caracter elegido se repite "+cont + " veces ");
    }
    
    
    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena c1){
        
    }
    
    
    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(Cadena c1){
        String frase2= " ";
        System.out.println("ingrese otra frase para unir a la primera ");
        frase2=leer.next();
        System.out.println("sus frase terminada seria ");
        System.out.println(c1.getFrase()+" "+frase2);
        
    }
    
    
    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.*/
    public void reemplazar(Cadena c1){
        String caracter = " ";
        String remplazar = "a";
        System.out.println("elija un caracter para remplazar todas las letras A" );
        caracter=leer.next();               
        String fraseCambiada=c1.getFrase().replace(remplazar ,caracter);
        System.out.println(fraseCambiada);
    }
    
    
    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public boolean contine(Cadena c1){
        String letra= "";
        System.out.println("ingrese una letra a buscar en la primera frase ingresada");
        letra=leer.next();
        
        
        c1.getFrase().contains(letra); 
       
                  
         return true;
              
             
           
        
        
        
        
    }
    
}
