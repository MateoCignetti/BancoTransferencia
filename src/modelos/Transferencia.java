/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author elbat
 */
public class Transferencia {
    
    private Cliente clienteOrigen;
    private Cliente clienteDestinatario;
    private double montoInicial;
    private double montoFinal;

    public Transferencia(Cliente clienteOrigen, Cliente clienteDestinatario, double monto) {
        this.clienteOrigen = clienteOrigen;
        this.clienteDestinatario = clienteDestinatario;
        this.montoInicial = clienteOrigen.getSaldo();
        this.montoFinal = montoInicial + monto;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public double getMontoFinal() {
        return montoFinal;
    }
    
    
    
    
    
}
