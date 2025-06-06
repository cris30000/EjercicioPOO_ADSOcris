/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crispublicacion;

/**
 *
 * @author Aprendiz
 */
public class Libro  extends Publicacion{
     String autor;
     String referencia_bibliografica;

    public Libro(String autor, String referencia_bibliografica, String titulo, String editorial, int anio_publicacion) {
        super(titulo, editorial, anio_publicacion);
        this.autor = autor;
        this.referencia_bibliografica = referencia_bibliografica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getReferencia_bibliografica() {
        return referencia_bibliografica;
    }

    public void setReferencia_bibliografica(String referencia_bibliografica) {
        this.referencia_bibliografica = referencia_bibliografica;
    }

   

    
    
    
      
  
    

   public void imprimir(){
       
       System.out.println("---------------------------------------");
        System.out.println("El titulo del libro es:"+ titulo);
        System.out.println("El Autor  del libro es:"+ autor);
        System.out.println("La editorial del libro :"+ editorial);
        System.out.println("La referencia bibliografica es  :"+ referencia_bibliografica);
        System.out.println("El año de publicacion del libro :"+ anio_publicacion);
        System.out.println("---------------------------------------");
                
    }
}
