/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegobatallacrisfin;

import java.util.Random;// esta libreria es para que los turnos sean aleatorios

/**  JUEGO BATALLA CRISTINA 
 * esta clase personajes define el comportamineto basico de un personaje que es atacar, defender  y tiene un estado de vida y p
 * puede utilizar los metodos getter y setter 
 * @author Aprendiz
 */
public abstract class Personaje {
    
    protected String nombre;
    protected int vida;
    protected Random aleat= new Random();

    
    // este es el contructor de la clase personaje
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
    }
// llamos los getter y setter de personaje 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0,vida);// para evitar que tome vidas negativas
    }
    
    
    public abstract int atacar();// 1 metodo: este es el metodo atacar y devuelve un entero y no tiene una implementacion dentro de esta clase porque cada  subclase debe implementarla por eso se utiliza el override e las sublases de sobreescribe

    public  abstract int  defenderse();
       // return aleat.nextInt(2);// para que retorne 2 valores 1 que se defiende y 0 no se defiende
    }// 2. metodo ste se emplementa en cada subclase hijo
    
    //public abstract int regenerarse();//3. método: este se emplementa en cada subclase hijo

    
    
