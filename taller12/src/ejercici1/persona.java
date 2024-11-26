/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici1;

/**
 *
 * @author asus
 */
interface Hablador {
    void hablar();
}

interface Trabajador {
    void trabajar();
}

class Persona implements Hablador, Trabajador {
    
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " dice: ¡Hola, estoy hablando!");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}

public class persona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        
        // Llamada a los métodos de las interfaces
        persona.hablar();
        persona.trabajar();
    }
}

    
