/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrcicio1;

/**
 *
 * @author asus
 */
public class coche {
 private int numeroDePuertas;


    public coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); 
        this.numeroDePuertas = numeroDePuertas;
    }


    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
    
    
}
