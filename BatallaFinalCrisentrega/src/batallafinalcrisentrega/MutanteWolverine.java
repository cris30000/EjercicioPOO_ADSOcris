/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallafinalcrisentrega;

/**
 *
 * @author crist
 */
public class MutanteWolverine extends Personaje implements Regenerando {

    public MutanteWolverine(String nombre) {
        super(nombre);
    }

    @Override
    public int atacar() {
        return rand.nextInt(15)+10; // esta puede realizar un atacar entre 10 y 24
    }

    @Override
    public void regenerar() {
        int curacion = rand.nextInt(10)+5;// cura entre 5 y 14
        this.setVida(this.getVida()+curacion);
        System.out.println("getNombre" + "se esta rehabilitando" + curacion + "Puntos de vida" );
        
    }   
    
}
