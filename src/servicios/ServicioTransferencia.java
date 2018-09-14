/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import repositorios.RepositorioTransferencia;
import modelos.Cliente;
import modelos.Transferencia;

/**
 *
 * @author elbat
 */
public class ServicioTransferencia {
    
    private RepositorioTransferencia repositorioTransferencia;

    public ServicioTransferencia() {
        this.repositorioTransferencia = new RepositorioTransferencia();
    }
    
    public void realizarTransferencia(
            Cliente clienteOrigen,
            Cliente clienteDestinatario,
            String monto
    ) {
        validarClienteOrigen(clienteOrigen);
        validarClienteDestinatario(clienteDestinatario);
        double montoParseado = parsearMonto(monto);
        
        Transferencia transferencia = new Transferencia(clienteOrigen, clienteDestinatario, montoParseado);
        this.repositorioTransferencia.guardarTransferencia(transferencia);
    }
    
    private void validarClienteOrigen(Cliente clienteOrigen){
        if (clienteOrigen == null){
            throw new IllegalArgumentException("¡El cliente de origen es nulo!");
        }
    }
    
    private void validarClienteDestinatario(Cliente clienteDestinatario){
        if (clienteDestinatario == null){
            throw new IllegalArgumentException("¡El cliente destinatario es nulo!");
        }
    }
    
    private double parsearMonto(String monto) {
        try {
            //Intento convertir el monto en un double
            double montoParseado = Double.valueOf(monto);
            

            if (montoParseado == 0) {

                throw new IllegalArgumentException("Ingrese un monto correcto");
            }
            
            //El sueldo base es correcto. Devolverlo.
            return montoParseado;
        } catch (NumberFormatException exception) {
            /*
            Si al intentar convertir el sueldo base se lanza un NumberFormatException, 
            significa que no es un double y, por tanto, es inválido. 
            Lanzar una excepción para que la agarre el presentador.
             */

            throw new IllegalArgumentException("¡El monto es inválido!");
        }
    }
    
}
