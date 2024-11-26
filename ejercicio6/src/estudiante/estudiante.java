/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author asus
 */
public class estudiante {
     private String nombre;
    private int edad;


    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public estudiante() {
        this("Desconocido", 0); 
    }


    public void mostrarDetalles() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad del estudiante: " + edad);
    }
}

