/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacioncris;

/**
 *
 * @author crist
 */
public class Linea {
    
    private static int contador = 1;
    private int numeroLinea;
    private Producto producto;
    private final int cantidad;

    public Linea(Producto producto, int cantidad) {
        this.numeroLinea = contador++;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    // realizo los metodos para calcular precio total
    
    public double getPrecioTotal(){
        return producto.getPrecioUnitario() * cantidad;
        
    }
    // realizo el metodo que imprima los datos
    
    
    public int getNumeroLinea() { return numeroLinea; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    
    
}
