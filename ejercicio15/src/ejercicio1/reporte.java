/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author asus
 */
public class reporte {
     private libro libro;

    public reporte(libro libro) {
        this.libro = libro;
    }

    public String generarReporte() {
        return "Reporte del libro: " + libro.getTitulo() + " escrito por " + libro.getAutor() + ". ISBN: " + libro.getIsbn();
    }
}

