/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
public class animal {
     protected String especie;


    public animal(String especie) {
        this.especie = especie;
    }


    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
