
package TareaRegistroAlumnos;
import java.util.Scanner;       
public class MenuVectores {
     static  Scanner scanner=new Scanner (System.in);
      TablaAlumno hola=new TablaAlumno();
   public void menuVector(int opcion){
    
  do{
        System.out.println("\n Bienvenidos A La Escuela Connor:");
          System.out.println("<<<<>>>>>>>>>>>>>>>>>>");
           System.out.println( " metodo vectores y matriz");
            System.out.println( "1" + " tabla Alumno");
            System.out.println( "2 "+ "resultado tabla Alumno");
            System.out.println( "3" + " tabla curso");
            System.out.println( "4" + " Resultado tabla curso");
            System.out.println( "5" + " Tabla Grado");
            System.out.println( "6" + " Resultado tabla Grado");
            System.out.println( "7" + " Resultado  de todas las tablas ");
            System.out.println("<<<<>>>>>>>>>>>>>>>>>>");
            System.out.println("2" + " Alumnos de metodo Vectores y matriz");
             System.out.println("<<<<>>>>>>>>>>>>>>>>>>");
                 opcion = scanner.nextInt();
       switch(opcion){
               
         case 1 -> { 
            System.out.println("**_________________**");   
            System.out.println(" ingrese el codigo ");
            String codigo=scanner.next();
           System.out.println("**_________________**");
           System.out.println("  ingrese el nombre ");
           String nombre=scanner.next();
         System.out.println("**_________________**");
           System.out.println("ingrese el alias");
           String alias=scanner.next();
        System.out.println("**_________________**");
           System.out.println("ingrese el correo");
            String correo=scanner.next();
          System.out.println("**_________________**");
            System.out.println("ingrese el telfono");
            int telfono=scanner.nextInt();
        System.out.println("**_________________**");
          System.out.println("**Datos agregados**");
           hola.registroCodigo(codigo);
           hola.registrarnombre(nombre);
           hola.registraralias(alias);
           hola.registroCorreo(correo);
           hola.registrotelefono(telfono);
           
               }
          
         case 2 -> {
         System.out.println("lista de alumnos ");
          hola.mostrarCodigo();   
          hola.mostrarNombre();
         hola.mostrarApellido();
          hola.mostrarAlias();
          hola.mostrarCorreo();
         hola.mostrarTransacciones();
         
     
          
               }
            
           case 3 -> {
                 System.out.println("**--------------**");
           System.out.println(" ingrese el codigo Del Curso ");
          String codigo=scanner.next();
          System.out.println("**_________________**");
          System.out.println("  ingrese el nombre del curso ");
          String nombre=scanner.next(); 
          System.out.println("**Datos agregados**");
          hola.registroCodigoCurso(codigo);
          hola.registroCurso(nombre);
            
            
           }
                      case 4 -> {
       System.out.println("TABLA CURSO");
       System.out.println("**_________________**");
            hola.mostrarCursoCodigo();
            hola.mostrarCurso();
            
           }
                   case 5 -> {
           System.out.println("**_________________**");              
         System.out.println(" ingrese el codigo Del Grado ");
          String codigo=scanner.next();
          System.out.println("**_________________**");
          System.out.println("Drescripcion ");
          String nombre=scanner.next(); 
          System.out.println("**Datos agregados**");
            hola.registrogradoo(codigo);
            hola.registro(nombre);
           }            
                   case 6  -> {
 System.out.println(" TABLA GRADO ");    
 System.out.println("**_________________**");
         hola.mostrarCodigoGrado();
         hola.mostrarDes();
           }     
                   
                case 7  -> {
 System.out.println(" TODAS LAS TABLAS ");    
   hola.mostrarCodigo();   
        hola.mostrarNombre();
        hola.mostrarApellido();
        hola.mostrarAlias();
        hola.mostrarCorreo();
        hola.mostrarTransacciones();
        hola.mostrarCursoCodigo();
        hola.mostrarCurso();
        hola.mostrarCodigoGrado();
        hola.mostrarDes();
           }                
                   
    }
    
}while (opcion !=8);
    }
}
        
    
        

    

