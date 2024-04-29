/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerProyecto;

/**
 *
 * @author mint
 */
public class Cliente {
    //Atributos
    private String nombre, apellidos, email, dni, telefono, tarjetaCredito;

    //Constructor
    public Cliente(String nombre, String apellidos, String email, String dni, String telefono, String tarjetaCredito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.tarjetaCredito = tarjetaCredito;
    }

    //Metodos
    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", tarjetaCredito=" + tarjetaCredito +
                '}';
    }
}
