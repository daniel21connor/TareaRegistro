
package TareaRegistroAlumnos;


public class TablaCurso {
   protected String [] registroCodigoGrado;
     protected String [] vectorDescripcion;
    private int indiceVector;
    
    public TablaCurso(){
     registroCodigoGrado=new String [100];
       vectorDescripcion=new String[100];
        indiceVector=0;
    }
    
      public void registrogradoo(String tipo ){
        indiceVector= indiceVector+1;
        registroCodigoGrado[indiceVector]= " * " +" codigo del Grado---> "+ tipo;
        
     }
     public void registro(String tipo ){
        indiceVector= indiceVector+1;
        vectorDescripcion[indiceVector]=   " * " +" Descripcion---> "+ tipo;
        } 
   
}
