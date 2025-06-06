/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crispublicacion;

import java.util.ArrayList;

/**
 *
 * @author Aprendiz
 */
public class Biblioteca {
    
    
    String nombre;
    ArrayList<Publicacion> coleccionPublicacion;

   public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionPublicacion= new ArrayList<Publicacion>();
        
    }
    
    
    public void agregarPublicacion(Publicacion publicacion){
        coleccionPublicacion.add(publicacion);// para adiconar PUBLICACIONES
        
    }
    
    public void mostrarPublicacion(){
        
        System.out.println("**** LAS PUBLICAIONES DE HOY********");
        for (int i = 0; i < coleccionPublicacion.size(); i++) {
            Publicacion publicacion = (Publicacion) coleccionPublicacion.get(i);
            publicacion.imprimir();
            
            
        }
    }
}



