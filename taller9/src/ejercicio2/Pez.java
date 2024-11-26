/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
public class Pez extends animal {

    private String tipoDeAgua;


    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }


    public void mostrarDetalles() {
        mostrarEspecie(); 
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}
