/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Banco;

/**
 *
 * @author mint
 */
public class Operacion {
    //Atributos
    private String fecha, concepto;
    private byte hora;
    private float cantidad;

    //Constructor
    public Operacion(String fecha, String concepto, byte hora, float cantidad) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.hora = hora;
        this.cantidad = cantidad;
    }

    //Métodos
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public byte getHora() {
        return hora;
    }
    public void setHora(byte hora) {
        this.hora = hora;
    }

    public float getCantidad() {
        return cantidad;
    }
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
 
}
