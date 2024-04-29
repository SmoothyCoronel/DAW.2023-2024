/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

/**
 *
 * @author mint
 */
public class Cliente {
    //Atributos
    private String nombre, apellidos, email, dni;
    private int telefono, numTarjetaCredito;

    //Constructor
    public Cliente(String nombre, String apellidos, String email, String dni, int telefono, int numTarjetaCredito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.numTarjetaCredito = numTarjetaCredito;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumTarjetaCredito() {
        return numTarjetaCredito;
    }
    public void setNumTarjetaCredito(int numTarjetaCredito) {
        this.numTarjetaCredito = numTarjetaCredito;
    }    
}
