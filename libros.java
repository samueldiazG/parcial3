import java.util.Scanner;

public class libros {
public String autor;
public int nuemerodepaginas;
public String titulo;
public String nrodeserie;
public libros(){
    this.nrodeserie= "desconocido";
}

public libros(String autor, int nuemerodepaginas, String titulo) {
    this.autor = autor;
    this.nuemerodepaginas = nuemerodepaginas;
    this.titulo = titulo;
}

public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Escriba el nombre del autor del libro");
    String nombre= scanner.nextLine();
    System.out.println("digite el numero de paginas");
    int nuemerodepaginas =  scanner.nextInt();
}

}
