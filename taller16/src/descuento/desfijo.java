/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package descuento;

/**
 *
 * @author asus
 */
public class desfijo {
     private double montoFijo;

    public desfijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
}
}
