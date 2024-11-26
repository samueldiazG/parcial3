/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author asus
 */
public class estaticer {
    private String mensaje = "Mensaje original";


    public static void cambiarMensaje() {
       // mensaje = "Nuevo mensaje"; // Error: no se puede hacer referencia a un atributo de instancia desde un contexto estático
    }

    public static void main(String[] args) {
        cambiarMensaje(); 
    }

    
public class Ejemplo {
   
    private static String mensaje = "Mensaje original";
   
    public static void cambiarMensaje() {
        mensaje = "Nuevo mensaje";
    }
    public static void main(String[] args) {
        cambiarMensaje(); 
        System.out.println("Mensaje: " + mensaje);
    }
}
}
