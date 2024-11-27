/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercici2;

/**
 *
 * @author asus
 */
public class Moto extends Vehiculo {

    private int cilindrada;


    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); 
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}