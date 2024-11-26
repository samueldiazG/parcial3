/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {
    
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }
}

public class pato {
    public static void main(String[] args) {
        Pato pato = new Pato("Donald");

        // Llamada a los métodos de las interfaces
        pato.volar();
        pato.nadar();
    }
}