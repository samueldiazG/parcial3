/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

public class Estudiantes {
      protected String Nombre;
    protected int Edad;
    protected String curso;

    public Estudiantes() {
        this.Nombre = "Default";
        this.curso = "Default";
        this.Edad = 0;
    }

    public Estudiantes(int Edad, String Nombre) {
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public Estudiantes(int Edad, String Nombre, String curso) {
        this(Edad,Nombre);
        this.curso = curso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Curso=" + curso + "]";
    }


}
