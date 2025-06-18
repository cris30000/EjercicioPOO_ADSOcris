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

    // realizo el constructor
    public MutanteWolverine(String nombre) {
        super(nombre);
    }
// sobre escribo el metodo atacar de la clase padre
    @Override
    public int atacar() {
        
      return aleat.nextInt((120-10)+1 )+10;// donde validad que puede realizar un daño entre  10 y 120
    }
    
     @Override
    public int defenderse() {
        
        Random aleat = new Random();
        int probabilidad = aleat.nextInt(100);
        if (probabilidad < 20) { // probabilidad de 20 % de posibilidad 
            return 1; //  marca 1 si la Defensa  es exitosa
        } else {
            return 0; // marca  0 si la Defensa  falló
        }
	}
    
// sobre escribo el metodo de la intefaz Regenerar
    @Override
    public void regenerar1() {
        int curacion = aleat.nextInt(20)+5;// realiza una curacion entre 5 y 14 puntos
       this.setVida(this.getVida()+curacion);
        System.out.println("se esta rehabilitando" + curacion + "Puntos de vida");
 
    }

   
}
