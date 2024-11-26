/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author asus
 */
public class title {
     public static void main(String[] args) {
        libro libro = new libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0");
        
        reporte reporteLibro = new reporte(libro);
        System.out.println(reporteLibro.generarReporte());

        estancia persistenciaLibro = new estancia();
        persistenciaLibro.guardar(libro);
    }
}

