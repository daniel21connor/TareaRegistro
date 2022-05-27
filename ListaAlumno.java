/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaRegistroAlumnos;
import java.util.ArrayList;
 import java.util.List;
import java.util.Scanner;
public class ListaAlumno {
 private int indiceVector;
 private String [] vectorNombre;

     public ListaAlumno (){
      vectorNombre=new String [100];
       this.indiceVector=0;
}
    
    List<String>lis_Alumno = new ArrayList<String>();
    
    
    
        
     public void registrarnombre(String tipo ){
        
        lis_Alumno.add(tipo);
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
     
     
}
