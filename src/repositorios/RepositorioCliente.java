/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Cliente;

/**
 *
 * @author elbat
 */
public class RepositorioCliente {
    /*
    Hacerlo static para simular que está en la Base de Datos.
    Si no lo hacemos así, cuando creemos diferentes objetos Repositorio,
    vamos a perder lo que ya está guardado.
    */
    private ArrayList<Cliente> clientesGuardados;
    
    public RepositorioCliente(){
        this.clientesGuardados = new ArrayList<>();
    }
    
    public void guardar(Cliente cliente)
    {
        this.clientesGuardados.add(cliente);
    }
    
    public Cliente obtenerClienteGuardado(String dni) throws Exception{
        for (Cliente cliente : this.clientesGuardados){
            if (cliente.getDni().equals(dni)){
                return cliente;
            }
        }
        throw new Exception("Cliente no encontrado");
    }
    
    public void actualizarSaldo(Cliente cliente, double monto){
            cliente.setSaldo(cliente.getSaldo() + monto);
        }
    
}


