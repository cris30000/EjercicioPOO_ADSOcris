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
public class JuegoBatalla {
    
    private Personaje persona1;// lo declaro como privado para que se este tipo de variables solo puedan ser accedidas por Juego Batalla
    private Personaje persona2;
    private Random aleat;

    
    // creo el constructor
    public JuegoBatalla(Personaje persona1, Personaje persona2) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.aleat = new Random();
    }
// creo el metodo Iniciar Batalla que es el que se llama en el main
    public void iniciarBatalla() throws InterruptedException {// este throws InterruptedException es una herramienta para indicar y manejar la interrupcion 
        int turno = 1;// inicializa en el turno 1

        while (persona1.getVida() > 0 && persona2.getVida() > 0) { // realizo un mientras la vida sea mayor a cero en persona 1 y 2 entonces juegue  y asigne un turno
            System.out.println("\n Turno: " + turno);
            System.out.println(persona1.getNombre() + " (Deadpool) vida: " + persona1.getVida());// me sale por pantalla el jugador con que personaje y cuantas vidas tiene
            System.out.println(persona2.getNombre() + " (Wolverine) vida: " + persona2.getVida());

            boolean primerAtaque = aleat.nextBoolean();// 
            if (primerAtaque) {
                atacarYDefender(persona1, persona2);
            } else {
                atacarYDefender(persona2, persona1);
            }

            if (turno % 3 == 0 && persona2 instanceof Regenerar) {
                ((Regenerar) persona2).regenerar1();
            }
// aqui realizo la pasa de un segundo
            Thread.sleep(1000);
            turno++;
        }

        System.out.println("\n ¡La batalla ha terminado!");
        if (persona1.getVida() <= 0) {
            System.out.println( persona2.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println( persona1.getNombre() + " ha ganado la batalla.");
        }
    }

    private void atacarYDefender(Personaje atacante, Personaje defensor) {
        int ataque = atacante.atacar();
        System.out.println(atacante.getNombre() + " ataca con " + ataque + " de daño.");
        if (defensor.defenderse() == 0) {
            System.out.println(defensor.getNombre() + " no se defendió y recibe daño.");
            defensor.setVida(defensor.getVida() - ataque);
        } else {
            System.out.println(defensor.getNombre() + " se defendió exitosamente.");
        }
    }
}

    

