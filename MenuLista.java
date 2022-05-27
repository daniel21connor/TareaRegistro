
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
        System.out.println("Ingrese el codigo");
        String codigo=leer.next();
        datos.setCodigoLista(codigo);
       
        System.out.println("Ingrese un nombre");
        String nombre=leer.next();
        datos.setNombreLista(nombre);
        
        System.out.println("Ingrese un alias");
        String alias=leer.next();
        datos.setAliasLista(alias);
        
        System.out.println("Ingrese un correo");
        String correo=leer.next();
        datos.setCorreoLista(correo);
        
        System.out.println("Ingrese su telefono");
        int telefono=leer.nextInt();
        datos.setTelefonoLista(telefono);
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
        
        }
}    while (opcion !=5);
}
}
