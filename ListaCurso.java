
package TareaRegistroAlumnos;

public class ListaCurso extends ListaGrado{
    
    private String codigoCursoLista;
    private String nombreCursoLista;
    
    public String getCodigoCurso(){
        
       return codigoCursoLista;
    }
    
     public void setCodigoCurso(String codigocurso){
        
       this.codigoCursoLista = codigocurso;
     }
    
    public String getNombreCurso(){
       return nombreCursoLista;
    }
    
     public void setNombreCurso(String nombrecurso){
        
       this.nombreCursoLista = nombrecurso;
     }
    
    
    
    
}
