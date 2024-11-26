/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

public class producto {

    public  String nombre;
    public  int precio;
    public  int stock;

     public  producto(String nombre, int precio, int stock) {
         this.nombre = nombre;
         this.precio = precio;
         this.stock = stock;
     }


     public void mostrarInfo() {
         System.out.println("Producto: " + nombre);
         System.out.println("Precio: $" + precio);
         System.out.println("Stock: " + stock + " unidades");
     }
 }