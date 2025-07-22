/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crisstrategy;

/**
 *
 * @author Aprendiz
 */
public class RutaCoche implements RutaStrategy{

    @Override
    public void calcularRuta(String origen, String destino) {
       System.out.println("Calculando la ruta mas segura  es : "+ origen + " a"+ destino);
    }
    
}
