/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author asus
 */
public class Empleado extends persona {

    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); 
        this.departamento = departamento;
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Departamento: " + departamento);
    }
}
