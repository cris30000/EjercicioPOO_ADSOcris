/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegobatallacrisfin;

import java.util.Random;



/**
 *
 * @author Aprendiz
 */
public class MutanteWolverine extends Personaje implements Regenerar {

    // realizo el constructor enete ndiendo que mutante woverine es una subclase de personaje  y hereda las propiedades y metodos de la clase personaje 
    // como nombre ,vida=100 e implementa la interfza regenerar el cual esta definido como regenera1().
    public MutanteWolverine(String nombre) {// este constructor recibe el nombre  y lo envia a clase padre (Personaje) usando super (nombre) de esta
                                             //manera Woverine  hereda y guarda su nombre correctamente
        super(nombre);
    }
// sobre escribo el metodo atacar de la clase padre
    @Override
    public int atacar() {
        
      return aleat.nextInt((120-10)+1 )+10;// donde validad que puede realizar un daño entre  10 y 120 esto siginica que max= 120 y minimo = 10
                                            // la formula es alat.nextInt((max-min)+1)+ min por eso ((120-10)+1)+10
      
      //return aleat.nextInt(15)+10; para mas turnos
    }
    
     @Override
    public int defenderse() {
        
        Random aleat = new Random();
        int probabilidad = aleat.nextInt(100);// aqui se genera un numnero aleatorio de 0 a 99
        if (probabilidad < 20) { // probabilidad de 20 % de posibilidad  es decir si el numero esta por debajo de 20 wolverine se defiende y 
                                    //si el numeor es mas de 20 recibe daño
            return 1; //  marca 1 si la Defensa  es exitosa
        } else {
            return 0; // marca  0 si la Defensa  falló
        }
	}
    
// sobre escribo el metodo de la intefaz Regenerar
    @Override
    public void regenerar1() {// llamo al metodo de la interfaz regenerar 
        int curacion = aleat.nextInt(20)+5;// realiza una curacion entre 5 y 14 puntos es decir se genera el numero aleatorio entre 0 y 19 y luego le sumo 5
                                            // de esta manera si el numero fue 13 y le sumo 5 nos da 18 como nivel de curacion
       this.setVida(this.getVida()+curacion);// luego imprimo lo que tenia de vida + su curacion 
        System.out.println("se esta rehabilitando" + curacion + "Puntos de vida");
 
    }

   
}
