/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author asus
 */
public class empleado {
     protected String nombre;
    protected double salario;


    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }


    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
