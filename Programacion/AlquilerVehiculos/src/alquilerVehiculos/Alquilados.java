/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

import java.util.Calendar;

/**
 *
 * @author mint
 */
public class Alquilados {
    //Atributos para el funcionamiento de la clase
    private Calendar fechaAlquiler;
    private int diasAlquilado;
    private Cliente c;
    private Vehiculo v;

    //Constructor
    public Alquilados(Calendar fechaAlquiler, int diasAlquilado, Cliente c, Vehiculo v) {
        this.fechaAlquiler = fechaAlquiler;
        this.diasAlquilado = diasAlquilado;
        this.c = c;
        this.v = v;
    }

    //Getters y setters
    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getDiasAlquilado() {
        return diasAlquilado;
    }
    public void setDiasAlquilado(int diasAlquilado) {
        this.diasAlquilado = diasAlquilado;
    }

    public Cliente getC() {
        return c;
    }
    public void setC(Cliente c) {
        this.c = c;
    }

    public Vehiculo getV() {
        return v;
    }
    public void setV(Vehiculo v) {
        this.v = v;
    }
    
    
    
}
