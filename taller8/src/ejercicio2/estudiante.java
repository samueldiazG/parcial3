/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
public class estudiante {
      private String matricula;


    public estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); 
        this.matricula = matricula;
    }


    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Matrícula: " + matricula);
    }
}
