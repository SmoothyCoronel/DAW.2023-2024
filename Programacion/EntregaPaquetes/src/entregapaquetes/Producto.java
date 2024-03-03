/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregapaquetes;

/**
 *
 * @author mint
 */
public class Producto {
    //Atributos
    private String codigoProducto, descripcion;
    private int cantidad;
    private float pesoUnidad;

    //Constructor
    public Producto(String codigoProducto, String descripcion, int cantidad, float pesoUnidad) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pesoUnidad = pesoUnidad;
    }

    //Getters y setters
    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPesoUnidad() {
        return pesoUnidad;
    }
    public void setPesoUnidad(float pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }
    
    
    
    
}
