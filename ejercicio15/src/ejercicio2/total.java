/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
public class total {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.0, 0.15);

        Caluladora calculadora = new Caluladora();
        System.out.println("Precio final: $" + calculadora.total(producto));

        Etiqueta etiqueta = new Etiqueta(producto);
        System.out.println(etiqueta.generarEtiqueta());
    }
}
