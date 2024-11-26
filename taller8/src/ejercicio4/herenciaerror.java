/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author asus
 */
public class herenciaerror {
     public void zauna() {
        System.out.println("Método de zzauna");
    }
}

class bañera {
    public void metodoBase2() {
        System.out.println("Método de bañera");
    }
}




public class Ejemplo extends ClaseBase1, ClaseBase2 { // Error: Herencia múltiple no permitida
    public void metodoDerivado() {
        System.out.println("resultado");
    }  
}
