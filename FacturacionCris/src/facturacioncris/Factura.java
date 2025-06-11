/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacioncris;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author crist
 */
public class Factura {
    
    private static int sigid= 1101;// sigid hacer referencia a numeracion de la factura empieza en 0001 y se debe incrementar 
    private int numeroFactura;
    private Date fecha;
    private Cliente cliente;
    private List<Linea>lineas;

    public Factura(Cliente cliente) {
        this.numeroFactura = getSigid();
        this.fecha = new Date();
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }

    public static int getSigid() {
        return sigid++;
    }
    
    //CREO METODO Añadir producto
    
    public void añadirProducto(Producto producto,int cantidad){
        lineas.add(new Linea(producto,cantidad));
    }
    
    // creo la funcion imprimir
    
    public void imprimirFactura(){
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Factura # :"+ numeroFactura);
        System.out.println("Fecha : " + formatoFecha.format(fecha));
        System.out.println("\n Datos del cliente---------------------");
        System.out.println(cliente.getDatosCliente());
        
        
       
        System.out.println("*******Detalle de la Factura*****");
        System.out.println( );
        System.out.printf("%-5s | %-20s | %-4s | %-10s | %-10s\n",
                      "Línea", "Producto", "Cant", "Precio ud.", "Total");
        System.out.println("------+----------------------+------|------------|-----------");

        double subtotal = 0;
        for (Linea linea : lineas) {
        subtotal += linea.getPrecioTotal();
        System.out.printf("%-5d | %-20s | %4d | %10.2f | %10.2f\n",
                          linea.getNumeroLinea(),
                          linea.getProducto().getNombreProducto(),
                          linea.getCantidad(),
                          linea.getProducto().getPrecioUnitario(),
                          linea.getPrecioTotal());
        
         System.out.println("------+----------------------+------|------------|-----------");
        
    }
        double iva= subtotal * 0.19;
        double total= subtotal + iva;
        
        System.out.println("Subtotal $: "+ String.format("%.2f", subtotal));
        System.out.println("Iva(19%) $: "+ String.format("%.2f", iva));
        System.out.println("Total $: "+ String.format("%.4f", total));
        
    }        

}
