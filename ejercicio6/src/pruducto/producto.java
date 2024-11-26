/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruducto;

/**
 *
 * @author asus
 */
public class producto {
    private String nombre;
    private double precio;


    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public void mostrarProducto() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: $" + precio);
    }
    
}
