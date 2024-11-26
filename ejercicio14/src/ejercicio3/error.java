/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author asus
 */

    class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends Vehiculo {
    
    @Override
    public void mover() {
        System.out.println("El coche está avanzando en la carretera.");
    }
}

class Bicicleta extends Vehiculo {
    
    @Override
    public void mover() {
        System.out.println("La bicicleta se está desplazando por el camino.");
    }
}
public class error {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();

        // Uso del polimorfismo para invocar el método mover en diferentes tipos de Vehículo
        coche.mover();
        bicicleta.mover();
    }
}

