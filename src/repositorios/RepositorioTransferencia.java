/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Transferencia;

/**
 *
 * @author elbat
 */
public class RepositorioTransferencia {
    private ArrayList<Transferencia> transferenciasRealizadas;

    public RepositorioTransferencia() {
        this.transferenciasRealizadas = new ArrayList<>();
    }
    
    public void guardarTransferencia(Transferencia transferencia){
        this.transferenciasRealizadas.add(transferencia);
    }
}
