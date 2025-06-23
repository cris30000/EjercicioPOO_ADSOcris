/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegobatallacrisfin;

import java.util.Random;

/**
 *
 * @author Aprendiz CRISTINA SAMBONI SANDOVAL 
 * ADSO 3066446 POPAYAN
 */
public class JuegoBatalla {
    
    private Personaje persona1;// lo declaro como privado para que se este tipo de variables solo puedan ser accedidas por Juego Batalla
    private Personaje persona2;
    private Random ran;

    
    // creo el constructor
    public JuegoBatalla(Personaje persona1, Personaje persona2) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.ran = new Random();
    }
// creo el metodo Iniciar Batalla que es el que se llama en el main y ejecuta el juego turno por turno
    public void iniciarBatalla() throws InterruptedException {// este throws InterruptedException es una herramienta para indicar y manejar la interrupcion 
        int turno = 1;// inicializa en el turno 1
// este mientras me permite seguir el juego se los dos personas tienen vida si esta en cero se termina
        while (persona1.getVida() > 0 && persona2.getVida() > 0)  { // realizo un mientras la vida sea mayor a cero en persona 1 y 2 entonces juegue  y asigne un turno
            System.out.println("\n Turno: " + turno);// imprime el turno en que van
            System.out.println(persona1.getNombre() + " (Deadpool) vida: " + persona1.getVida());// me sale por pantalla el jugador con que personaje y cuantas vidas tiene
            System.out.println(persona2.getNombre() + " (Wolverine) vida: " + persona2.getVida());

            boolean primerAtaque = ran.nextBoolean();// este boleano lo aplico para saber quien ataca primero se es verdadero ataca persona 1 y si es falso ataca persona 2
            if (primerAtaque) {
                atacarYDefender(persona1, persona2);
            } else {
                atacarYDefender(persona2, persona1);
            }

            if (turno % 2 == 0 && persona2 instanceof Regenerar) {// cada DOS trunos  la persona implementa la interfaz regenerar para recupera la vida
                ((Regenerar) persona2).regenerar1();// recupera la vida
            }
// aqui realizo la pausa de un segundo que es igual a 1000milisengundos
            Thread.sleep(1000);
            turno++;// incremento el turno en1
        }
// final de la batalla
        System.out.println("\n ¡La batalla ha terminado!");
        if (persona1.getVida() <= 0) {// si persona 1 tiene menos de 0 vidas significa que peronsaje 2 gano si esto no es asi entoces persona 1 gano
            System.out.println( persona2.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println( persona1.getNombre() + " ha ganado la batalla.");
        }
    }
// este metodo  atacar y defender se implementa para que el atacante  lance el ataque  llamando a su metodo  especifico atacar
    private void atacarYDefender(Personaje atacante, Personaje defensor) {
        int ataque = atacante.atacar();
        System.out.println(atacante.getNombre() + " ataca con " + ataque + " de daño.");
        if (defensor.defenderse() == 0) { // el defensor llama a su metodo defenderse y si su defensa fue cero entoces recibe daño 
            System.out.println(defensor.getNombre() + " no se defendió y recibe daño.");
            defensor.setVida(defensor.getVida() - ataque);
        } else {// si no fue cero se defendió 
            System.out.println(defensor.getNombre() + " se defendió exitosamente.");
        }
    }
}

    

