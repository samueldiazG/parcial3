/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
public class Libros{
    protected String titulo;
    protected String autor;
    protected int NumeroPaginas;

    public Libros() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.NumeroPaginas = 0;
    }

    public Libros(int NumeroPaginas, String autor, String titulo) {
        this.NumeroPaginas = NumeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    @Override
    public String toString(){
        return  "Libro [Titulo = "+ titulo  + ", Numero de paginas = " + NumeroPaginas+ ", Autor = "+ autor + " ]";
    }

}
/**
 *
 * @author asus
 */

    
