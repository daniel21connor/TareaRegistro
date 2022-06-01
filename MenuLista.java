
package TareaRegistroAlumnos;
import static TareaRegistroAlumnos.MenuVectores.scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MenuLista {
    static  Scanner leer=new Scanner (System.in);
    public void menuLista(int opcion){
        List<ListaAlumno> lis_Nombre = new ArrayList<>();
         ListaAlumno datos = new ListaAlumno();
        do {
         System.out.println( "1" + " Lista Alumnno");
         System.out.println( "2 "+ "Lista curso");
         System.out.println( "3" + " Lista Grado");
         System.out.println( "4" + " Total De todas Las Listas");
         System.out.println( "5" + " Salir");      
          opcion = scanner.nextInt();
           switch(opcion){
               case 1 :
        datos.code();
        datos.codeList();
        
        break;
               case 2:
        System.out.println("Ingrese el codigo del curso");
        String codigocurso=leer.next();
        datos.setCodigoCurso(codigocurso);
       
        System.out.println("Ingrese  nombre curso");
        String nombrecurso=leer.next();
        datos.setNombreCurso(nombrecurso);
        break;
               case 3:
        System.out.println("Ingrese el codigo del curso");
        String codigogrado=leer.next();
        datos.setCodigoGrado(codigogrado);
       
        System.out.println("Ingrese Descripcion");
        String descripcion=leer.next();
        datos.setDescripcionLista(descripcion);

            break;
               case 4:
          lis_Nombre.add(datos);
        System.out.println("Lista Alumno: " + lis_Nombre.get(0).getCodigoLista()+"**__**" + lis_Nombre.get(0).getNombreLista()+"**__** " + lis_Nombre.get(0).getAliasLista()+"__*** " + lis_Nombre.get(0).getCorreoLista()+"**__** " + lis_Nombre.get(0).getTelefonoLista());
        System.out.println("Lista Curso: " + lis_Nombre.get(0).getCodigoCurso()+"**___*** " + lis_Nombre.get(0).getNombreCurso());
        System.out.println("Lista Grado: " + lis_Nombre.get(0).getCodigoGrado()+"**__**" + lis_Nombre.get(0).getDescripcionLista());   
              
        
               case 5 :
                   datos.codeList();
                   
               case 6 :
                datos.mostrarCodigoGrado();
                datos.mostrarCodi();
           }
}    while (opcion !=7);
}
    
    
    
   
}
