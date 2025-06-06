/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crispublicacion;

/**
 *
 * @author Aprendiz
 */
public class CRISPUBLICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Biblioteca biblioteca1= new Biblioteca("Biblioteca Nacional");
     
      
    //public Libro(String autor, String referencia_bibliografica, String titulo, String editorial, int anio_publicacion)
      Libro libro1= new Libro( "Gabriel Garcia Marquez", "historia","Cien años de Soledad", "enlace",1958);
      biblioteca1.agregarPublicacion(libro1);
      Libro libro2 = new Libro("Isabel Allende", "drama", "La casa de los espíritus", "enlace", 1982);
      biblioteca1.agregarPublicacion(libro2);
      Libro libro3 = new Libro("Jorge Luis Borges", "ficción", "Ficciones", "enlace", 1944);
      biblioteca1.agregarPublicacion(libro3);
      Libro libro4 = new Libro("Mario Vargas Llosa", "novela", "La ciudad y los perros", "enlace", 1963);
      biblioteca1.agregarPublicacion(libro4);
      
      
      //biblioteca1.mostrarPublicacion();
      
      //public Revista(int periodicidad, String pais, String titulo, String editorial, int anio_publicacion)
      Revista revista1= new Revista( 3,"Colombia","Semana","Enlace",2020);
      biblioteca1.agregarPublicacion(revista1);
      Revista revista2 = new Revista(15, "México", "Nexos", "enlace", 2018);
      biblioteca1.agregarPublicacion(revista2);

      Revista revista3 = new Revista(7, "Argentina", "Caras y Caretas", "enlace", 2019);
      biblioteca1.agregarPublicacion(revista3);

      Revista revista4 = new Revista(22, "España", "Muy Interesante", "enlace", 2021);
      biblioteca1.agregarPublicacion(revista4);
      biblioteca1.mostrarPublicacion();
      
      
    
    }
    
}
