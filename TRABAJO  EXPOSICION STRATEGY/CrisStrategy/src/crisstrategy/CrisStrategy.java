/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crisstrategy;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class CrisStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        CalculadoraRutas calculadora = new CalculadoraRutas();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();

        System.out.println("Seleccione el tipo de ruta:");
        System.out.println("1. Peatonal");
        System.out.println("2. En coche");
        System.out.println("3. En transporte publico");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calculadora.setEstrategia(new RutaPeatonal());
                break;
            case 2:
                calculadora.setEstrategia(new RutaCoche());
                break;
            case 3:
                calculadora.setEstrategia(new RutaTransportepublico());
                break;
            default:
                System.out.println("Opción no válida. Usando estrategia por defecto: más corta.");
                calculadora.setEstrategia(new RutaCoche());
        }

        calculadora.calcular(origen, destino);
        scanner.close();
    }
}

  