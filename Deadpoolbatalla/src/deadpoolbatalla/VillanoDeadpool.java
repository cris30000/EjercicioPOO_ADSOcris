/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deadpoolbatalla;

import java.util.Random;

/**
 *
 * @author Aprendiz
 */
public class VillanoDeadpool  extends Personajes{// esta clase hereda de la clase Personajes  y adquiere las propiedades y metodos de la clase personajes y puede agregar o modiciar su cpropio comportamineto
     private boolean estaRegenerandose;// este es un atributo privado de tipo booleano se utiliza para indicar si el personaje esta en proceso de regeneracion solo en esta clase 

    public VillanoDeadpool() { // este es el constructor y se llama cunado se crea un nuevo objeto
        super(); // Llama al constructor de la clase padre para inicializar la vida
        this.estaRegenerandose = false; // Inicializa la variable de regeneración del nuevo objeto a false
    }

    @Override// este metodo sobreescribe el metodo atacar dela clase padre
    public int atacar() {
        Random rand = new Random();
        return rand.nextInt((100 - 10) + 1) + 10;// me devuelve un valor alaetorio entre 10 y 100 simulando  el daño causado por el ataque
    }

    @Override
    public int defenderse() { //este metodo sobreescribe el metodo defender  dela clase padre
        // Tiene una probabilidad de defenderse del 25%
        Random rand = new Random();// para generarnumeros aleatorios
        int probabilidad = rand.nextInt(100);
            
        if (probabilidad < 25) {// el metodo simula una defensa con probabilidad  del 25 %  y si es menor a 25  la defensa es exitosa y devuelve un 1 si falla devuelve un 0
            
            return 1; // Defensa exitosa
        } else {
            return 0; // Defensa fallida
        }
    }
    @Override
    public int regenerarse() {// este metodo sobreescribe el metodo regenarse dela clase padre 
        // Se regenera si recibe daño crítico, lo que le impide atacar
        if (this.vida <= 20) { // realizamos un condicional si la vida del personaje es menor a 20 entonces se activa regenaracion y lo coloca como true o verdadero
            this.estaRegenerandose = true;
            this.vida += 20; // Aumenta la vida en 20 puntos
        }
        return this.vida; // aqui retorna el  nuevo valor de la vida 
    }

    public boolean estaRegenerandose() {// este metodo devuelve le valor actual del estado regenerandose permitiendo a otras partes del codigo  verificar el estado de regeneracion
        return this.estaRegenerandose;
    }
}

