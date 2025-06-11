/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacioncris;

/**
 *
 * @author crist
 */
public class Cliente {
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private int telefono;

    public Cliente(String nombreCliente, String apellidoCliente, String direccion, int telefono) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    Cliente(String cristina, String _Samboni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getDatosCliente(){
        return "Nombre: "+ nombreCliente + "\n Apellido:" + apellidoCliente+"\n Dirección:" + direccion + "\n Telefono:" +  telefono;
    }
}
