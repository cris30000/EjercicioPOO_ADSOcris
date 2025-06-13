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
public class MutanteWolverine extends Personajes {// clase que hereda atributos y metodos de la clase padre personajes 

   private boolean estaRegenerandose;
	public MutanteWolverine() {
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

