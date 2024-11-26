/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
public class Etiqueta {
    public class EtiquetaProducto {
    
    private Producto producto;

    public EtiquetaProducto(Producto producto) {
        this.producto = producto;
    }

    public String generarEtiqueta() {
        Caluladora calculadora = new Caluladora();
        double precioFinal = calculadora.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + ", Precio: $" + precioFinal;
    }
}
