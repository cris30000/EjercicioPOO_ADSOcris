/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batallafinalcrisentrega;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class BatallaFinalCrisentrega {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del jugador que será Deadpool: ");
        String nombreDeadpool = scanner.nextLine();

        System.out.print("Ingrese el nombre del jugador que será Wolverine: ");
        String nombreWolverine = scanner.nextLine();

        Personaje P1 = new VillanoDeadpool(nombreDeadpool);
        Personaje P2 = new MutanteWolverine(nombreWolverine);

        int turno = 1;
        Random rand = new Random();

        while (P1.getVida() > 0 && P2.getVida() > 0) {
            System.out.println("\n🔁 Turno: " + turno);
            System.out.println(P1.getNombre() + " (Deadpool) vida: " + P1.getVida());
            System.out.println(P2.getNombre() + " (Wolverine) vida: " + P2.getVida());

            boolean primerAtaque = rand.nextBoolean();
            if (primerAtaque) {
                atacarYDefender(P1, P2);
            } else {
                atacarYDefender(P2, P1);
            }

            // Wolverine se regenera cada 3 turnos
            if (turno % 3 == 0 && P2 instanceof Regenerando) {
                ((Regenerando) P2).regenerar();
            }

            Thread.sleep(1000);
            turno++;
        }

        System.out.println("\n⚔️ ¡La batalla ha terminado!");
        if (P1.getVida() <= 0) {
            System.out.println("🏆 " + P2.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println("🏆 " + P1.getNombre() + " ha ganado la batalla.");
        }

        scanner.close();
    }

    public static void atacarYDefender(Personaje atacante, Personaje defensor) {
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
    
    

