/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisstrategy;

/**
 *
 * @author Aprendiz
 */
public class CalculadoraRutas {
    
    private RutaStrategy estrategia;
    
    void setEstrategia (RutaStrategy estrategia){
        this.estrategia= estrategia;
    }
    
    public void calcular (String origen ,String destino){
        if(estrategia == null){
            System.out.println(" no se ha definido una estretgia de calculo de ruta ");
            
        } else
        {
            
        estrategia.calcularRuta(origen,destino);
                
    }
            
    
}
}
