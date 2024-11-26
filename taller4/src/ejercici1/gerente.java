/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercici1;

/**
 *
 * @author asus
 */
public class gerente {
    public class Gerente extends empleado {

    private String departamento;


    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); 
        this.departamento = departamento;
    }


    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}
}
