/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelos.Cliente;
import repositorios.RepositorioCliente;

/**
 *
 * @author elbat
 */
public class ServicioCliente {
    
    private RepositorioCliente repositorioCliente;

    public ServicioCliente() {
        this.repositorioCliente = new RepositorioCliente();
    }
    
    public void guardarDatosPersonales(
            String nombre,
            String apellido,
            String dni,
            String saldoIncial
    ) {
        /*
        Validar datos. Si alguno es incorrecto, se va a lanzar una excepción y
        lo va a agarrar el presentador. El presentador, va a mostrar un mensaje
        de error indicando por qué falló.
        */
        this.validarNombre(nombre);
        this.validarApellido(apellido);
        this.validarDNI(dni);
        double sueldoBaseConvertido = this.parsearSueldoBase(saldoIncial);
        
        /*
        Si llegó hasta acá, entonces no se lanzó ninguna excepción. Por lo tanto,
        los datos ingresados por el usuario son válidos.
        */
        
        //Creemos el modelo para guardarlo en la Base de Datos
        Cliente cliente = new Cliente(nombre, apellido, dni, sueldoBaseConvertido);
        
        /*
        El objeto Cliente ya está creado. Ahora enviémoslo al repositorio así
        se guarda en la Base de Datos.
        */
        this.repositorioCliente.guardar(cliente);
    }

    
    public Cliente obtenerClienteSeleccionado(String dni) throws Exception {
        return this.repositorioCliente.obtenerClienteGuardado(dni);
    }
    
    
    private void validarNombre(String nombre) {
        /*
        Si la cantidad de caracteres es igual a 0, entonces el usuario no 
        introdujo ningún nombre. Si es así, lanzar una excepción para
        que lo agarre el Presentador y muestre el mensaje de error.
        */
        if (nombre.length() == 0) {
            throw new IllegalArgumentException("¡El nombre es vacío!");
        }
    }
    
    private void validarApellido(String apellido) {
        /*
        Si la cantidad de caracteres es igual a 0, entonces el usuario no 
        introdujo ningún apellido. Si es así, lanzar una excepción para
        que lo agarre el Presentador y muestre el mensaje de error.
         */
        if (apellido.length() == 0) {
            throw new IllegalArgumentException("¡El apellido es vacío!");
        }
    }
    
    private void validarDNI(String dni) {
        try {
            //Intento convertir el DNI en un número
            int dniParseado = Integer.parseInt(dni);
            
            //Se pudo convertir sin problemas. Verificar que es uno válido
            if (dniParseado <= 0) {
                //Dni inválido. Lanzar una excepción para indicar el error.
                throw new IllegalArgumentException("El DNI debe ser mayor a 0");
            }
        } catch (NumberFormatException exception) {
            /*
            Si al intentar convertir el DNI ocurre una excepción, significa que
            no es un número y, por tanto, es inválido. Lanzar una excepción
            para que la agarre el presentador.
            */
            
            throw new IllegalArgumentException("¡El DNI es inválido!");
        }
    }
    
    private double parsearSueldoBase(String sueldoBase) {
        try {
            //Intento convertir el sueldo base en un double
            double sueldoBaseParseado = Double.valueOf(sueldoBase);
            
            //Lo pude parsear (convertir) sin problemas. Verificar que sea mayor a 0
            if (sueldoBaseParseado < 0) {
                //El sueldo es menor a 0. Lanzar una excepción para indicar el error.
                throw new IllegalArgumentException("¡El sueldo inicial debe ser mayor a 0!");
            }
            
            //El sueldo base es correcto. Devolverlo.
            return sueldoBaseParseado;
        } catch (NumberFormatException exception) {
            /*
            Si al intentar convertir el sueldo base se lanza un NumberFormatException, 
            significa que no es un double y, por tanto, es inválido. 
            Lanzar una excepción para que la agarre el presentador.
             */

            throw new IllegalArgumentException("¡El sueldo inicial es inválido!");
        }
    }
}
