/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;
import ejercicio1.Libros;
import ejercicio2.CuentaBancaria;
import ejercicio3.Estudiantes;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class proyectoap {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido Usuario");
        System.out.println("¿Que es lo desea hacer?");
        op();
        int OP = leer.nextInt();


        switch (OP) {
            case 1:
                CrearEstudiantes();
                break;
                case 2:
                CrearCuenta();
                break;
                case 3:
                CrearLibro();
                break;
                case 4:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion invalida");
        }

    }

    public static  void CrearEstudiantes(){

        System.out.println("Ingrese El nombre del Estudiante");
        String newName = leer.next();
        System.out.println("Digite La edad del estudiante");
        int newAge = leer.nextInt();
        System.out.println("Digite el Curso de el estudiante");
        String newGrade = leer.next();
        Estudiantes NewUser = new Estudiantes(newAge, newName, newGrade);
        System.out.println("Detalles = " + NewUser);            

    }

    public static  void CrearCuenta(){

        System.out.println("Digite su numero de cuenta");
        int newNumero = leer.nextInt();
        System.out.println("digite el saldo");
        float newSaldo = leer.nextFloat();
        System.out.println("Ingrese su tipo de cuenta");
        String newTipo = leer.next();
        CuentaBancaria newCuenta = new CuentaBancaria(newNumero, newSaldo,newTipo);
        System.out.println("Detalles = " + newCuenta);

    }

    public static  void CrearLibro(){

        System.out.println("Ingrese el titulo");
        String newTitulo = leer.next();
        System.out.println("Ingrese el numero de paginas");
        int newPagina = leer.nextInt();
        System.out.println("Ingrese e nombre del autor");
        String newAutor = leer.next();
        Libros newBook = new Libros(newPagina,newAutor,newTitulo);
        System.out.println("Detalles = " + newBook);


    }

    public static void op(){
        System.out.println("1.Crear Estudiante");
        System.out.println("2.Crear cuenta bancaria");
        System.out.println("3.Crear Libro");
        System.out.println("4.Exit");
    }

}
