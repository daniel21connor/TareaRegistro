
package TareaRegistroAlumnos;
import java.util.Scanner;


public class EscuelaConnor {
 static  Scanner scanner=new Scanner (System.in);
    public static void main(String[] args) {
        TablaAlumno hola=new TablaAlumno();
        MenuVectores ji=new MenuVectores();
        MenuLista mi= new MenuLista();
    int opcion  = 0;
  do{
        System.out.println("\n Bienvenidos A La Escuela Connor:");
          System.out.println("<<<<>>>>>>>>>>>>>>>>>>");
           System.out.println(" 1"+" metodo vectores y matriz");
            System.out.println(" 2"+" metodo Lista");
             System.out.println(" 3"+" SALIR");
           System.out.println(" "+"Escoja el metodo que desea");
           System.out.println("<<<<>>>>>>>>>><<<>>>>>>>>>>>>>>>>><<<<>>");
          
                 opcion = scanner.nextInt();
       switch(opcion){
               
         case 1 -> { 
           
            ji.menuVector(opcion);
           
               }
          
         case 2 -> {
             mi.menuLista(opcion);
         }  
                   
    }
    
}while (opcion !=3);
    }
    
    
}
