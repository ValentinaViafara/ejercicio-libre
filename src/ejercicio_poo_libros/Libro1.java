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
public class Libro1 {
   
    //ATRIBUTOS
    
        private String titulo;
        private int num_paginas;
        private int calificacion;
        private String autor;
        
        public Libro1(String titulo, String autor, int num_paginas, int calificacion){
            this.autor=autor;
            this.titulo=titulo;
            this.calificacion=calificacion;
            this.num_paginas=num_paginas;
        }
        
        public String getTitulo(){
           return titulo;
        }
        
        public void setTitulo(String titulo){
           this.titulo=titulo;
        }
        
        public int getNum_paginas(){
            return num_paginas;
        }
        
        public void setNum_paginas(int num_paginas){
            this.num_paginas=num_paginas;
        }
        
        public int getCalificacion(){
            return calificacion;
        }
        
        public void setCalificacion(int calificacion){
            this.calificacion=calificacion;
        }
        
        public String getAutor(){
            return autor;
        }
        
        public void setAutor(String autor){
            this.autor=autor;
        }
        
}
