/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author asus
 */
public class estancia {
    public void guardar(libro libro) {
        System.out.println("Guardando el libro en la base de datos...");
        // Simulación de guardado en base de datos
        System.out.println("Libro guardado: " + libro.getTitulo() + " - ISBN: " + libro.getIsbn());
    }
}
