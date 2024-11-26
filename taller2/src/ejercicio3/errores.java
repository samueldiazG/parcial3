/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio1.Estudiantes;
import ejercicio2.automovil;


public class errores {
    public static void main(String[] args) {
        Estudiantes user = new Estudiantes(5, 18, "Steven");
        System.out.println("Detalles = " + user.getNombre() + user.getNotasPromedios() + user.getEdad());
                automovil coche = new automovil("Toyota", "Corolla", 180);

                System.out.println("Detalles iniciales del coche: " + coche);

                // Estas líneas darán errores
        // coche.marca = "chevrolet";
         //coche.modelo = "corvette ZR1";
        // coche.velocidadMaxima = 340;
                coche.acelerar(20); 
                coche.acelerar(-10); 


                System.out.println("Detalles finales del coche: " + coche);



    }
}
    

