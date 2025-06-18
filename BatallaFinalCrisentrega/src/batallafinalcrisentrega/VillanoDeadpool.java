/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallafinalcrisentrega;

/**
 *
 * @author crist
 */
public class VillanoDeadpool  extends Personaje{

    public VillanoDeadpool(String nombre) {
        super(nombre);
    }

    @Override
    public int atacar() {
       return rand.nextInt(20)+5;// ataque en 5 y 24
    }
    
    
}
