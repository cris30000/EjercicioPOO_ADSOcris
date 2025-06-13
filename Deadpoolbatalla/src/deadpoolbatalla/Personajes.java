/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deadpoolbatalla;

/**
 * esta clase personajes define el comportamineto basico de un personaje que es atacar, defender y regenerarse y tiene un estado de vida y p
 * puede utilizar los metodos getter y setter
 *
 * @author Aprendiz
 */
public abstract class Personajes { // abstract significa que esta clase solo se puede usar como base para otras clases  esta seria la clase padre de Villano y mutante para aplicar herencia
    
  protected int vida;// esta es una variable de tipo entero  y es protegido porque se puede acceder desde esta clase

    public Personajes() {// definimos el constructor e inicializamos en vida con  un valor de 100
        this.setVida(100); 
    }

    public abstract int atacar();// 1 metodo: este es el metodo atacar y devuelve un entero y no tiene una implementacion dentro de esta clase porque cada  subclase debe implementarla por eso se utiliza el override e las sublases de sobreescribe

    public abstract int defenderse();// 2. metododeste se emplementa en cada subclase hijo
    
    public abstract int regenerarse();//3. método: este se emplementa en cada subclase hijo

    
    // aplicamos los metodods getter  para acceder al atributo y setter para modificar el atributo
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
}
    

    
