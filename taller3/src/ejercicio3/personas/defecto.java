/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.personas;

import ejercicio2.vehiculos.moto;
import ejercicio3.personas.Personas.Persona;

public class defecto {
    public static void main(String[] args) {
       
        moto moto = new moto("Deportiva");
        moto.mostrarInfo();

 
        System.out.println(moto.tipo); // Error de compilación

         Vehiculo vehiculo = new Vehiculo("Sedán"); // Error de compilación

        Personas persona = new Personas();


        persona.edad = 30; // Acceso permitido
        System.out.println("Edad: " + persona.edad);
        persona.setNombre("Juan"); // Modificación permitida a través del método set
        System.out.println("Nombre: " + persona.getNombre()); // Acceso permitido a través del método get

        System.out.println("Nombre directo: " + persona.nombre); // Error de compilación


        Producto producto = new Producto("Laptop", 850, 10);
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
        System.out.println("Stock: " + producto.stock);


        producto.mostrarInfo();
    }
}
    
}
