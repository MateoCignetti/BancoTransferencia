/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author agu
 */
public class Cliente {
    private String nombre;
    
    private String apellido;
    
    private String dni;
    
    private double saldoInicial;
    
    private double saldo;

    public Cliente(String nombre, String apellido, String dni, double saldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldoInicial = saldoBase;
        this.saldo = saldoBase;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBase() {
        return saldoInicial;
    }
}
