
package g7_cafetera.Servicios;

import g7_cafetera.Entidades.Cafetera;
import java.util.Scanner;



public class CafeteraServicios {
    
    Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        c1.setcMax(5000);
        c1.setcActual(c1.getcActual()+c1.getcMax());
        
        System.out.println("cafetera llena = "+c1.getcActual()  );
    }

    /*• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
    
    public void servirTaza(){
        int option ;
        
        System.out.println("elige  tamaño del cafe");
        System.out.println("1 - chico    150cc");
        System.out.println("2 - mediano  200cc");
        System.out.println("3 - grande   250cc");
        option=leer.nextInt();
                
        if(option>=1 && option <=4){
            switch (option){
                case 1:
                    if(c1.getcActual()>150){
                        c1.setcActual(c1.getcActual()-150);
                        System.out.println("Retirar Cafe");  
                    }else if (c1.getcActual()>=1 && c1.getcActual()<=149){
                        
                        System.out.println("no alcanza para completar");
                        System.out.println("alcanza para "+c1.getcActual()+"cc");
                        System.out.println("preparando cafe ");
                        System.out.println("Retirar Cafe");  
                        c1.setcActual(c1.getcActual()-c1.getcActual());
                        System.out.println("por favor llenar cafetera antes de pedir otro cafe");
                    } else if(c1.getcActual()==0){
                        System.out.println("cafetera vacia ");
                        System.out.println("llenar cafetera antes de pedir otro cafe");
                    }
                    System.out.println("    nivel de cafe ="+c1.getcActual()+"cc");
                    break;
                case 2:
                    if(c1.getcActual()>200){
                        c1.setcActual(c1.getcActual()-200);
                        System.out.println("Retirar Cafe");  
                    }else if (c1.getcActual()>=1 && c1.getcActual()<=199){
                        
                        System.out.println("no alcanza para completar");
                        System.out.println("alcanza para "+c1.getcActual()+"cc");
                        System.out.println("preparando cafe ");
                        System.out.println("Retirar Cafe");  
                        c1.setcActual(c1.getcActual()-c1.getcActual());
                        System.out.println("por favor llenar cafetera antes de pedir otro cafe");
                    } else if(c1.getcActual()==0){
                        System.out.println("cafetera vacia ");
                        System.out.println("llenar cafetera antes de pedir otro cafe");
                    }
                    System.out.println("    nivel de cafe ="+c1.getcActual()+"cc");
                    break;
                case 3:
                    if(c1.getcActual()>250){
                        c1.setcActual(c1.getcActual()-250);
                        System.out.println("Retirar Cafe");  
                    }else if (c1.getcActual()>=1 && c1.getcActual()<=249){
                        
                        System.out.println("no alcanza para completar");
                        System.out.println("alcanza para "+c1.getcActual()+"cc");
                        System.out.println("preparando cafe ");
                        System.out.println("Retirar Cafe");  
                        c1.setcActual(c1.getcActual()-c1.getcActual());
                        System.out.println("por favor llenar cafetera antes de pedir otro cafe");
                    } else if(c1.getcActual()==0){
                        System.out.println("cafetera vacia ");
                        System.out.println("llenar cafetera antes de pedir otro cafe");
                    }
                    System.out.println("    nivel de cafe ="+c1.getcActual()+"cc");
                    break;
                case 4:
                    System.out.println("cancelar");  
                    break;   
            }
            
        }
        
        
        
    }
    
    
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        System.out.println("vaciando cafetera......");
        System.out.println("aguarde un momento...........");
        System.out.println("proceso terminado puede limpiar cafetera...");
        c1.setcActual(0);
        System.out.println("    nivel de cafe ="+c1.getcActual()+"cc");
    }
    
    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(){
        int faltante=5000-c1.getcActual();
        int agregar;
        System.out.println("vamos agregar cafe ");
        
        System.out.println("la capacidad faltante es de  "+faltante+"cc");
        System.out.println("cuanto desea agregar ");
        agregar=leer.nextInt();
        
        
        if ( agregar <=  faltante) {
            c1.setcActual(c1.getcActual()+agregar);
            System.out.println("proceso terminado");
            
        }else if(agregar > faltante){
            System.out.println("no se puede agregaresa cantidad");
            System.out.println("cantidad faltante para llenar es "+faltante);
            System.out.println("agregue una cantidad menor o igual al faltante");
            
        }
       
        System.out.println("    nivel de cafe ="+c1.getcActual()+"cc");
    }
}
