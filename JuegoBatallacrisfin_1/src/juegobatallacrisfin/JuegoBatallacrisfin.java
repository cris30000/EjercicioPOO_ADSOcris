/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegobatallacrisfin;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class JuegoBatallacrisfin {

    /**
     * 
     * EJERCICIO: ENTREGA CRISTINA
 * ¡Deadpool y Wolverine se enfrentan en una batalla épica!
 * Crea un programa que simule la pelea y determine un ganador.
 * El programa simula un combate por turnos, donde cada protagonista posee unos
 * puntos de vida iniciales, un daño de ataque variable y diferentes cualidades
 * de regeneración y evasión de ataques.
 * Requisitos:
 * 1. El usuario debe determinar la vida inicial de cada protagonista.
 * 2. Cada personaje puede impartir un daño aleatorio:
 *    - Deadpool: Entre 10 y 100.
 *    - Wolverine: Entre 10 y 120.
 * 3. Si el daño es el máximo, el personaje que lo recibe no ataca en el
 * siguiente turno, ya que tiene que regenerarse (pero no aumenta vida).
 * 4. Cada personaje puede evitar el ataque contrario:
 *    - Deadpool: 25% de posibilidades.
 *    - Wolverine: 20% de posibilidades.
 * 5. Un personaje pierde si sus puntos de vida llegan a cero o menos.
 * Acciones:
 * 1. Simula una batalla.
 * 2. Muestra el número del turno (pausa de 1 segundo entre turnos).
 * 3. Muestra qué pasa en cada turno.
 * 4. Muestra la vida en cada turno.
 * 5. Muestra el resultado final.
 */

    
 
        
       
            
        public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);// libreria que permite leer desde el teclado

        System.out.print("Ingrese el nombre del jugador que será el villano Deadpool: ");
        String nombreDeadpool = scanner.nextLine();

        System.out.print("Ingrese el nombre del jugador que será el Mutante Wolverine: ");
        String nombreWolverine = scanner.nextLine();

        
        // creo el objeto de la clase Personaje uno actuara como VillanoDeadpool y el otro como VillanoWolverine
        Personaje Villanodeadpool = new VillanoDeadpool(nombreDeadpool);
        Personaje Mutantewolverine = new MutanteWolverine(nombreWolverine);

        JuegoBatalla juego = new JuegoBatalla(Villanodeadpool, Mutantewolverine);// Aqui llamo a la clase JuegoBatalla y creo un objeto juego para quenicialice el metodo Iniciar Batalla
        juego.iniciarBatalla();

        scanner.close();// cierro el scanner
    }
}
      

