/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
public class automovil {
    private String marca;
    private String modelo;
    private int velocidadMaxima;


    public automovil(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("La velocidad máxima ahora es: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("Incremento no válido. La velocidad no ha cambiado.");
        }
    }


    @Override
    public String toString() {
        return "Coche [Marca=" + marca + ", Modelo=" + modelo + ", Velocidad Máxima=" + velocidadMaxima + " km/h]";
    }
}