
package TareaRegistroAlumnos;


public class TablaGrado extends TablaCurso{
     protected String [] vectorNombreCurso;
    protected String [] vectorCodigoCurso; 
    private int indiceVector;
    
    TablaGrado(){
    
    vectorNombreCurso=new String [100];
    vectorCodigoCurso=new String[100];
    indiceVector=0;
    }
    
    
     public void registroCurso(String tipo ){
        indiceVector= indiceVector+1;
        vectorNombreCurso[indiceVector]=     " * " +" curso---> "+ tipo;
        
     }
     
     public void registroCodigoCurso(String tipo ){
        indiceVector= indiceVector+1;
        vectorCodigoCurso[indiceVector]=     " * " +" Codigo del Curso---> "+ tipo;
     }
}
