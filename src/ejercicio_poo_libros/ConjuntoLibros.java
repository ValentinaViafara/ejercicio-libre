/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_poo_libros;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    
    //ATRIBUTO
        Libro1[] libros;
        
        //COSTRUCTOR
        
        public void ConjuntoLibros(){
            this.libros=new Libro1[20];
        }
        
        //MÉTODOS       
        
        
        //preguntar al profesor!!!!
        public boolean añadir_libro(Libro1 libro){
            int pos_vacio=20;
           for (int i = 0; i < 20; i++) {
                if(libros[i]==null){
                    pos_vacio=i;
                break;
                }
           }
           if(pos_vacio!=20){
               libros[pos_vacio]=libro;
               return true;
           }else{
               return false;
           }
           
            
        }

        
        public boolean eliminarLibroXautor(String autor){
            boolean operacion=false;
            for (int i = 0; i < 20; i++) {
                if(this.libros[i].getAutor()==autor){
                    libros[i]=null;
                    operacion=true;
                    break;
                }else{
                    operacion=false;
                }
                
            }
            return operacion;
        }
        
        public boolean eliminarLibroXtitulo(String titulo){
            boolean operacion=false;
            for (int i = 0; i < 20; i++) {
                String titulo_aux=libros[i].getTitulo();
                if(titulo_aux==titulo){
                    libros[i]=null;
                    operacion=true;
                    break;
                }else{
                    operacion=false;
                }
                
            }
            return operacion;
        }
        
        
        public void mayor_calificacion(){
            int aux=-1;
            
            
            for (int i = 0; i < 20; i++) {
                if(libros[i]!=null){
                    if(aux<libros[i].getCalificacion()){
                        aux=libros[i].getCalificacion();
                        
                    }
                }
            }
            
  }
  }  
          

