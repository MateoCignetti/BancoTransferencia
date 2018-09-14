/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentadores;

import javax.swing.JOptionPane;
import vistas.view.VistaPrincipal;
import servicios.ServicioCliente;
import servicios.ServicioTransferencia;
import vistas.viewmodels.ClienteOption;


/**
 *
 * @author elbat
 */
public class PresentadorVistaPrincipal {

    private VistaPrincipal vistaPrincipal;
    private ServicioCliente servicioCliente;
    private ServicioTransferencia servicioTransferencia;

    public PresentadorVistaPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioCliente = new ServicioCliente();
        this.servicioTransferencia = new ServicioTransferencia();
    }

    public void guardarDatosPersonales() {
        //Obtengo los datos ingresados por el usuario
        String nombre = this.vistaPrincipal.getNombreTextField().getText();
        String apellido = this.vistaPrincipal.getApellidoTextField().getText();
        String dni = this.vistaPrincipal.getDniTextField().getText();
        String saldoInicial = this.vistaPrincipal.getSaldoInicialTextField().getText();
        String nombreCompleto = (nombre + " " + apellido);

        try {
            //Intento guardar los datos personales
            this.servicioCliente.guardarDatosPersonales(nombre, apellido, dni, saldoInicial);
            ClienteOption empleadoOption = new ClienteOption(nombreCompleto, dni);

            this.vistaPrincipal.getDesdeComboBox().addItem(empleadoOption);
            this.vistaPrincipal.getHaciaComboBox().addItem(empleadoOption);
            /*
            El empleado se guardó exitosamente. Limpiar la vista y mostrar un 
            mensaje indicando el éxito.
             */

            //Limpiar vista
            this.vistaPrincipal.getNombreTextField().setText("");
            this.vistaPrincipal.getApellidoTextField().setText("");
            this.vistaPrincipal.getDniTextField().setText("");
            this.vistaPrincipal.getSaldoInicialTextField().setText("");

            //Mostrar mensaje de éxito.
            JOptionPane.showMessageDialog(vistaPrincipal, "¡El empleado fue guardado correctamente!");
        } catch (IllegalArgumentException excepcion) {
            /*
            Llamé a "guardarDatosPersonales", pero ocurrió un error y por eso lanzó
            una excepción. Mostremos dicho error en una nueva ventana.
             */
            JOptionPane.showMessageDialog(vistaPrincipal, excepcion.getMessage());
        }
    }

    public void realizarTransferencia() {
        try {
            
            ClienteOption clienteDesde = (ClienteOption) this.vistaPrincipal.getDesdeComboBox().getSelectedItem();
            String dniClienteDesde = clienteDesde.getDni();
            ClienteOption clienteHacia = (ClienteOption) this.vistaPrincipal.getHaciaComboBox().getSelectedItem();
            String dniClienteHacia = clienteHacia.getDni();
            
            this.servicioTransferencia.realizarTransferencia(
                    this.servicioCliente.obtenerClienteSeleccionado(dniClienteDesde),
                    this.servicioCliente.obtenerClienteSeleccionado(dniClienteHacia),
                    this.vistaPrincipal.getMontoTextField().getText()
            );

        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(vistaPrincipal, excepcion.getMessage());
        }
    }

}
