/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallafinalcrisentrega;

import java.util.Random;

/**
 *
 * @author crist
 */
public  abstract class Personaje {
    
    protected String nombre;
    protected int vida;
    protected Random rand= new Random();

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;// el valor inicial de vida
    }

    public String getNombre() {
        return nombre;
    }

    //public void setNombre(String nombre) {
        //this.nombre = nombre;
    //}

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida); // para evitar que tome vidas negativas
    }
    
    public abstract  int atacar();
    
    
    public int defenderse(){
        return rand.nextInt(2);// toma dos valores se defiende  con 1 y no se defiende con 0
    }
        

   
}
