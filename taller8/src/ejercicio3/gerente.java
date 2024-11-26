/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author asus
 */
public class gerente {
     private String departamento;


    public gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); 
        this.departamento = departamento;
    }


    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Departamento: " + departamento);
    }
}
