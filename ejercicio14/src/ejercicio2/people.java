/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

class Profesor extends Persona {
    
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}

public class people {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        // Uso del polimorfismo para invocar presentarse en diferentes tipos de Persona
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}