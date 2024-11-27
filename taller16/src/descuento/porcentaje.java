/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package descuento;

/**
 *
 * @author asus
 */
public class porcentaje {
     private double porcentaje;

    public porcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}
