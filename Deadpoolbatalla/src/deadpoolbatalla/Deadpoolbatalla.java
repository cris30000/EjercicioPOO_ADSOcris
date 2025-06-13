/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deadpoolbatalla;

import java.util.Random;

/**
 *
 * @author Aprendiz
 */
public class Deadpoolbatalla {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */

        
        
   public static void main(String[] args) throws InterruptedException{
		Personajes P1 = new VillanoDeadpool();
		Personajes P2 = new MutanteWolverine();
		int turno = 1;
		Random rand = new Random();
		while (P1.getVida() > 0 && P2.getVida() > 0) {
			System.out.println("Turno: " + turno);
            System.out.println("Vida de Deadpool: " + P1.getVida());
            System.out.println("Vida del Wolverine: " + P2.getVida());
            boolean PrimerAtaqque = rand.nextBoolean();
            if (PrimerAtaqque) {
                // Deadpool ataca
                int ataque = P1.atacar();
                System.out.println("Deadpool ataca con un daño de " + ataque);
                if(P2.defenderse() == 0) {
                	int reducirvida = P2.getVida()-ataque;
                	System.out.println("Wolverine recibe daño");
                	P2.setVida(reducirvida);
                }else {
                	System.out.println("Wolverine Se defienden");
                } 
            } else {
                // Wolverine ataca
                int ataque = P2.atacar();
                System.out.println("Wolverine ataca con un daño de " + ataque);
                if(P2.defenderse() == 0) {
                	int reducirvida = P1.getVida()-ataque;
                	System.out.println("Deadpool recibe daño");
                	P1.setVida(reducirvida);
                }else {
                	System.out.println("Deadpool Se defienden");
                }                 
            }    
            // Cambiamos el turno
            
            PrimerAtaqque = !PrimerAtaqque;

            // Pausa de 1 segundo
            Thread.sleep(1000);
            turno++;
		}
		 if (P1.getVida() <= 0) {
	            System.out.println("Wolverine ha ganado la batalla.");
	        } else {
	            System.out.println("Deadpool ha ganado la batalla.");
	        }
	}

}

/*
public abstract class Personajes {
	protected int vida;

    public Personajes() {
        this.setVida(100); 
    }

    public abstract int atacar();

    public abstract int defenderse();
    
    public abstract int regenerarse();

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
}
public class Wolverine extends Personajes {
	private boolean estaRegenerandose;
	public Wolverine() {
		 super();
		 this.estaRegenerandose = false;
	}

	@Override
	 public int atacar() {
        Random rand = new Random();
        return rand.nextInt((120 - 10) + 1) + 10;
    }

	@Override
	public int defenderse() {
		Random rand = new Random();
        int probabilidad = rand.nextInt(100);
        if (probabilidad < 20) {
            return 1; // Defensa exitosa
        } else {
            return 0; // Defensa fallida
        }
	}

	@Override
	public int regenerarse() {
        // Se regenera si recibe daño crítico, lo que le impide atacar
        if (this.vida <= 20) {
            this.estaRegenerandose = true;
            this.vida += 20; // Aumenta la vida en 20 puntos
        }
        return this.vida;
    }
	
	 public boolean estaRegenerandose() {
	        return this.estaRegenerandose;
	 }

}
public class Deadpool extends Personajes {
    private boolean estaRegenerandose;

    public Deadpool() {
        super(); // Llama al constructor de la clase padre para inicializar la vida
        this.estaRegenerandose = false; // Inicializa la variable de regeneración
    }

    @Override
    public int atacar() {
        Random rand = new Random();
        return rand.nextInt((100 - 10) + 1) + 10;
    }

    @Override
    public int defenderse() {
        // Tiene una probabilidad de defenderse del 25%
        Random rand = new Random();
        int probabilidad = rand.nextInt(100);
        if (probabilidad < 25) {
            return 1; // Defensa exitosa
        } else {
            return 0; // Defensa fallida
        }
    }
    @Override
    public int regenerarse() {
        // Se regenera si recibe daño crítico, lo que le impide atacar
        if (this.vida <= 20) {
            this.estaRegenerandose = true;
            this.vida += 20; // Aumenta la vida en 20 puntos
        }
        return this.vida;
    }

    public boolean estaRegenerandose() {
        return this.estaRegenerandose;
    }
}


public class Principal {

	public static void main(String[] args) throws InterruptedException{
		Personajes P1 = new Deadpool();
		Personajes P2 = new Wolverine();
		int turno = 1;
		Random rand = new Random();
		while (P1.getVida() > 0 && P2.getVida() > 0) {
			System.out.println("Turno: " + turno);
            System.out.println("Vida de Deadpool: " + P1.getVida());
            System.out.println("Vida del Wolverine: " + P2.getVida());
            boolean PrimerAtaqque = rand.nextBoolean();
            if (PrimerAtaqque) {
                // Deadpool ataca
                int ataque = P1.atacar();
                System.out.println("Deadpool ataca con un daño de " + ataque);
                if(P2.defenderse() == 0) {
                	int reducirvida = P2.getVida()-ataque;
                	System.out.println("Wolverine recibe daño");
                	P2.setVida(reducirvida);
                }else {
                	System.out.println("Wolverine Se defienden");
                } 
            } else {
                // Wolverine ataca
                int ataque = P2.atacar();
                System.out.println("Wolverine ataca con un daño de " + ataque);
                if(P2.defenderse() == 0) {
                	int reducirvida = P1.getVida()-ataque;
                	System.out.println("Deadpool recibe daño");
                	P1.setVida(reducirvida);
                }else {
                	System.out.println("Deadpool Se defienden");
                }                 
            }    
            // Cambiamos el turno
            
            PrimerAtaqque = !PrimerAtaqque;

            // Pausa de 1 segundo
            Thread.sleep(1000);
            turno++;
		}
		 if (P1.getVida() <= 0) {
	            System.out.println("Wolverine ha ganado la batalla.");
	        } else {
	            System.out.println("Deadpool ha ganado la batalla.");
	        }
	}

}
*/