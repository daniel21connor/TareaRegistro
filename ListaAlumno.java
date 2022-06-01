
package TareaRegistroAlumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaAlumno extends ListaCurso{
  protected String CodigoLista;
    protected String nombreLista;
    protected String aliasLista;
    protected String correoLista;
     protected Integer telefonoLista;
    static  Scanner scanner=new Scanner (System.in);
   List<String> lisNombre = new ArrayList<>();
   List<String> lisAleas = new ArrayList<>();
     
   public void code(){
       System.out.println("aleas");
       String uwu=scanner.next();
       lisAleas.add(uwu);
     }

    public List<String> getLisAleas() {
        return lisAleas;
    }
   
   
     public void codeList(){
       System.out.println("Nombre");
       String uwu=scanner.next();
       lisNombre.add(uwu);
     }

    public List<String> getLisNombre() {
        return lisNombre;
    }
              public void mostrarCodi(){
      
            for (int i=1; i<lisAleas.size();i++){
                if(lisAleas != null){
               
                    System.out.println("ALEAS ="+ lisAleas );
                   
                }
            }
            System.out.println("");
            for(String transaccion : lisNombre){
                if(transaccion != null){
                   
                }   
            } 
        }
    
    
     public void mostrarCodigoGrado(){
      
            for (int i=1; i<lisNombre.size();i++){
                if(lisNombre != null){
               
                    System.out.println("NOMBRES ="+ lisNombre );
                   
                }
            }
            System.out.println("");
            for(String transaccion : lisNombre){
                if(transaccion != null){
                   
                }   
            } 
        }
     
    public String getCodigoLista(){
        
       return CodigoLista;
    }
    
     public void setCodigoLista(String CodigoLista){
        
       this.CodigoLista = CodigoLista;
     }
    
    public String getNombreLista(){
       return nombreLista;
    }
    
     public void setNombreLista(String nombreLista){
        
       this.nombreLista = nombreLista;
     }
     
      public String getAliasLista(){
       return aliasLista;
    }
    
     public void setAliasLista(String aliasLista){
        
       this.aliasLista = aliasLista;
     }

    public String getCorreoLista(){
       return correoLista;
    }
    
     public void setCorreoLista(String correoLista){
        
       this.correoLista = correoLista;
     }
     
     public Integer getTelefonoLista(){
        
       return telefonoLista;
    }
    
     public void setTelefonoLista(Integer telefonoLista){
        
       this.telefonoLista = telefonoLista;
     }


}    
    
        
   
  
