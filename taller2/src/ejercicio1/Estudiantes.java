/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author asus
 */
public class Estudiantes {
private String nombre;
    private int edad;
    private double NotasPromedios;

    public Estudiantes(double NotasPromedios, int edad, String nombre) {
        this.NotasPromedios = NotasPromedios;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Estudiantes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotasPromedios() {
        return NotasPromedios;
    }

    public void setNotasPromedios(double NotasPromedios) {
        this.NotasPromedios = NotasPromedios;
    }


}
   
 
