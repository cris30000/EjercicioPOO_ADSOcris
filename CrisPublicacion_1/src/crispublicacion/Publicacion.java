/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crispublicacion;

/**
 *
 * @author Aprendiz
 */
public class Publicacion {
    
    String titulo,editorial;
   int anio_publicacion;

    public Publicacion(String titulo, String editorial, int anio_publicacion) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.anio_publicacion = anio_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    
   public void imprimir(){
        System.out.println("1. VER PUBLICACIONES*********************");
        System.out.println("El titulo de la publicacion es:"+ titulo);
        System.out.println("La editorial  de la publicacion:"+ editorial);
        System.out.println("El año de publicacion de la publicacion :"+ anio_publicacion);
        System.out.println("1. VER PUBLICACIONES*********************");
        
        
     
        
                
    }
   
    
}
