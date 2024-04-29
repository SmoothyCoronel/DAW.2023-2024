/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompeticiondeportiva;

/**
 *
 * @author mint
 */
public class Jugador {
    //Atributos
    private String nombre, apellidos, dorsal, dni, email, telefono;
    private boolean activo;//Si es true está activo, si es false está no disponible

    //Constructor
    public Jugador(String nombre, String apellidos, String dorsal, String dni, String email, String telefono, boolean activo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.activo = activo;
    }
    
    @Override
    public String toString(){
        /*
        String cadenaJugador = String.format( "Datos de jugador: " + "Nombre de jugador: %s, Apellidos de jugador: %s, Dorsal de jugador: %s, DNI de jugador: %s, Email de jugador: %s, Telefono de jugador: %s, ¿Está activo? %b \n",
                nombre, apellidos, dorsal, dni, email, telefono, activo);
        */
        String cadenaJugador = ("Datos de jugador: " + "Nombre de jugador: "+ nombre +" Apellidos de jugador: " + apellidos +" Dorsal de jugador: "+ dorsal +" DNI de jugador: " +
                dni + " Email de jugador: " + email +" Telefono de jugador: " + telefono + " ¿Está activo?" + activo + "\n");
        return cadenaJugador;
    }
    
    //Metodos
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDni() {
        return dni;
    }
    
}
