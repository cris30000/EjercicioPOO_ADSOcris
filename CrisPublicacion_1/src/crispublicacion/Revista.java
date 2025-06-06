/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crispublicacion;

/**
 *
 * @author Aprendiz
 */
public class Revista  extends Publicacion{
    
   
    int periodicidad;
    String pais;

    public Revista(int periodicidad, String pais, String titulo, String editorial, int anio_publicacion) {
        super(titulo, editorial, anio_publicacion);
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    

    
    
    
    @Override
    public void imprimir(){
        
        System.out.println("---------------------------------------");
        System.out.println("El nombre de la revista es:"+ titulo);
        System.out.println("La editorial  es  :"+ editorial);
        
        System.out.println("El año de publicacion es :"+ anio_publicacion);
        System.out.println("La periodicidad del libro :"+ periodicidad);
       
        System.out.println("El pais es  :"+ pais);
        
        System.out.println("---------------------------------------");
        
                
    }
    
}
