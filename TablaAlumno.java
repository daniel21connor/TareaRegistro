
package TareaRegistroAlumnos;

public class TablaAlumno extends TablaGrado{
    private String[] vectorTransacciones;  
    private int indiceVector;
    private String [] vectorNombre;
    private String [] vectorAlias;
    private String [] vectorCorreo;
    private String [] vectorCodigo;
    private String [] vectorApellido;

    
    public TablaAlumno(){
        vectorAlias=new String[100];
        vectorCorreo=new String[100];
        vectorCodigo=new String [100];
       vectorNombre=new String [100];
       vectorTransacciones= new String[100];
         this.indiceVector=0;
        vectorApellido=new String [100];
    
}
    
     
    
     public void registrarnombre(String tipo ){
        indiceVector= indiceVector+1;
        System.out.println("----------------------------------------");
        vectorNombre[indiceVector]=   " * " +" Nombre---> "+ tipo;
        
    }
        public void registraralias(String tipo ){
        indiceVector= indiceVector+1;
        vectorAlias[indiceVector]=     " * " +" Alias--> "+ tipo;
        
    }
         
   
     public void registroCodigo(String tipo ){
        indiceVector= indiceVector+1;
 
        vectorCodigo[indiceVector]=   " * " +  " codigo--->"+ tipo;
        
    }
    public void registroCorreo(String tipo ){
        indiceVector= indiceVector+1;
        vectorCorreo[indiceVector]=    " * " + " correo---> "+ tipo;
        
    }
    public void registrotelefono(int tipo ){
        indiceVector= indiceVector+1;
        vectorTransacciones [indiceVector]= " * " +  " telefono---> "+ tipo;
      
        
    }
   
     public void mostrarDes(){
      
            for (int i=1; i<vectorDescripcion.length;i++){
                if(vectorDescripcion[i] != null){
               
                    System.out.println("Regitro = "+ vectorDescripcion[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorDescripcion){
                if(transaccion != null){
                   
                }   
            } 
        }      
    
    
     public void mostrarTransacciones(){
      
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
               
                    System.out.println("Regitro = "+ vectorTransacciones[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                   
                }   
            } 
        }     
     public void mostrarNombre(){
      
            for (int i=1; i<vectorNombre.length;i++){
                if(vectorNombre[i] != null){
               
                    System.out.println("Regitro ="+ vectorNombre[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorNombre){
                if(transaccion != null){
                   
                }   
            } 
        }
             public void mostrarApellido(){
      
            for (int i=1; i<vectorApellido.length;i++){
                if(vectorApellido[i] != null){
               
                    System.out.println("Regitro ="+ vectorApellido[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorApellido){
                if(transaccion != null){
                   
                }   
            } 
        }
          public void mostrarAlias(){
      
            for (int i=1; i<vectorAlias.length;i++){
                if(vectorAlias[i] != null){
               
                    System.out.println("Regitro ="+ vectorAlias[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorAlias){
                if(transaccion != null){
                   
                }   
            } 
        }
      public void mostrarCorreo(){
      
            for (int i=1; i<vectorCorreo.length;i++){
                if(vectorCorreo[i] != null){
               
                    System.out.println("Regitro ="+ vectorCorreo[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorCorreo){
                if(transaccion != null){
                   
                }   
            } 
        }
     
       public void mostrarCodigo(){
      
            for (int i=1; i<vectorCodigo.length;i++){
                if(vectorCodigo[i] != null){
               
                    System.out.println("Regitro= "+ vectorCodigo[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorCodigo){
                if(transaccion != null){
                   
                }   
            } 
        }
     
             public void mostrarCurso(){
      
            for (int i=1; i<vectorNombreCurso.length;i++){
                if(vectorNombreCurso[i] != null){
               
                    System.out.println("Regitro ="+ vectorNombreCurso[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorNombreCurso){
                if(transaccion != null){
                   
                }   
            } 
        }
             
             
                       public void mostrarCursoCodigo(){
      
            for (int i=1; i<vectorCodigoCurso.length;i++){
                if(vectorCodigoCurso[i] != null){
               
                    System.out.println("Regitro ="+ vectorCodigoCurso[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorCodigoCurso){
                if(transaccion != null){
                   
                }   
            } 
        }
                        
                       public void mostrarCodigoGrado(){
      
            for (int i=1; i<registroCodigoGrado.length;i++){
                if(registroCodigoGrado[i] != null){
               
                    System.out.println("Regitro ="+ registroCodigoGrado[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : registroCodigoGrado){
                if(transaccion != null){
                   
                }   
            } 
        }
           
        }
        
    
    
    

