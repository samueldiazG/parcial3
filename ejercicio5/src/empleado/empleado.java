/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author asus
 */
public class empleado {
  public String nombre;


    private double salario;


    public empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); 
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        if (salario >= 0) { 
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }
}
    
