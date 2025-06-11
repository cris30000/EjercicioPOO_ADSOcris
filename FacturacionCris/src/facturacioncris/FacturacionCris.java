/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacioncris;

/**
 *
 * @author crist
 */
public class FacturacionCris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente= new Cliente("Cristina"," Samboni","Popayan",30037904);
        
        Factura factura= new Factura(cliente);
        
        factura.añadirProducto(new Producto("Ratón USB",8.43), 1);
        factura.añadirProducto(new Producto("Memoria RAM 2GB", 21.15), 2);
        factura.añadirProducto(new Producto("Altavoces", 12.66), 1);

        factura.imprimirFactura();
        
       
        
        
    }
    
}
