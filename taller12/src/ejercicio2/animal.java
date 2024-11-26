/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author asus
 */
interface Nadador{
    void Nadar();
}

interface Respirador{
    void Respirar();
}

class Pez implements Nadador, Respirador{
    
    @Override
    public void Nadar(){
        System.out.println("Nadaremos nadaremos en el mar, el mar, el mar.");
    }

    @Override
    public void Respirar(){
        System.out.println("Estoy respirando");
    }
}
public class animal {
    public static void main(String[] args) {
        Pez pez1 = new Pez();
        pez1.Respirar();
        pez1.Nadar();
    }
}
