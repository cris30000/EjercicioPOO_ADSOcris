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
public class VillanoDeadpool extends Personaje implements Regenerar {

    public VillanoDeadpool(String nombre) {
        super(nombre);
    }

    @Override
    public int atacar() {
       return aleat.nextInt((100-10)+1)+10; //me devuelve el valor alatrorio de ataque entre 100 y 10 seria el daño causado al atacar
        //return aleat.nextInt(20)+5;// ataque en 5 y 24     para quer juegue con mas vidas
    }

    @Override
    public int defenderse() {
        
         Random aleat = new Random();// para generar numeros aleatorios
        int probabilidad = aleat.nextInt(100);
            
        if (probabilidad < 25) {// el metodo simula una defensa con probabilidad  del 25 %  y si es menor a 25  la defensa es exitosa y devuelve un 1 si falla devuelve un 0
            
            return 1; // Defensa exitosa
        } else {
            return 0; // Defensa fallida
        }
    }
        

    @Override
    public void regenerar1() {
           int curacion = aleat.nextInt(10)+5;// realiza una curacion entre 5 y 14 puntos
       this.setVida(this.getVida()+curacion);
        System.out.println("se esta rehabilitando" + curacion + "Puntos de vida");
 
    }
 
    
}
