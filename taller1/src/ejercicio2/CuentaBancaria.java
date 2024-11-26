/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

public class CuentaBancaria {
    protected int NumerodeCuenta;
    protected float saldo;
    protected String tipoDeCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NumeroCuenta, String tipoDeCuenta) {
        this.NumerodeCuenta = NumeroCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public CuentaBancaria(int NumeroCuenta, float saldo, String tipoDeCuenta) {
        this.NumerodeCuenta = NumeroCuenta;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getNumeroCuenta() {
        return NumerodeCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumerodeCuenta = NumeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria [Numero = " + NumerodeCuenta + ", Saldo = " + saldo + ", Tipo de cuenta = " + NumerodeCuenta
                + " ]";
    }

}

