/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.viewmodels;

/**
 *
 * @author Laboratorio
 */
public class ClienteOption {
    
    private String nombreCompleto;
    private String dni;

    public ClienteOption(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDni() {
        if (dni == null){
            throw new IllegalArgumentException("¡Cliente inexistente!");
        }
        return dni;
    }

    @Override
    public String toString() {
        return nombreCompleto;
    }
    
    
            
}
