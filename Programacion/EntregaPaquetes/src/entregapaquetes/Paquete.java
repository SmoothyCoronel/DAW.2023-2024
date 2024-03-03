/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregapaquetes;

import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class Paquete {
    //Atributos
    private String localizador, direccionEnvio, dniCliente, fechaEnvio;
    private int diasPrevistos;
    private String situacion;
    
    private ArrayList<Producto> misProductos;

    //Constructor
    public Paquete(String localizador, String direccionEnvio, String dniCliente, String fechaEnvio, int diasPrevistos) {
        this.localizador = localizador;
        this.direccionEnvio = direccionEnvio;
        this.dniCliente = dniCliente;
        this.fechaEnvio = fechaEnvio;
        this.diasPrevistos = diasPrevistos;
        misProductos = new ArrayList<>();
        this.situacion = "Vacio";
        
    }
    
    //Resto de metodos
    
    //Añadir producto
    public boolean addProducto(Producto pro){
        boolean resultado = false;
        if(pro != null){
            if("Vacio".equals(this.situacion) || "En Preparacion".equals(this.situacion)){
                misProductos.add(pro);
                resultado = true;
            }
        }
        return resultado;
    }
    
    //Eliminar producto
    public boolean deleteProducto(String codigoProducto){
        boolean resultado = false;
        /*
        for(Producto pro: misProductos){
            if(pro.getCodigo().equals(codigoProducto)){
                misProductos.remove(pro);
                return true;
            }
        }
        return false;
        */
        for(int i = 0; i < misProductos.size() && resultado != true; i++){
            if(misProductos.get(i).getCodigoProducto().compareTo(codigoProducto) == 0){
                misProductos.remove(i);  
                resultado = true;
            }
        }
        return resultado;
    }
    
    //Listar productos
    public String listProducto(){
        String lista = "";
        
        if(misProductos.isEmpty()){
            lista = "";
        }else {
            for(int i = 0; i < misProductos.size(); i++){
                lista += misProductos.get(i) +"\n";
            }
        }
    return lista; 
    //Convierte arrayList a array y se envía 
    /* return this.misProductos.toArray(new Producto[0];*/
    }
    
    //Getters y setters
    public String getLocalizador() {
        return localizador;
    }
    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }
    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getDiasPrevistos() {
        return diasPrevistos;
    }
    public void setDiasPrevistos(int diasPrevistos) {
        this.diasPrevistos = diasPrevistos;
    }

    public String getSituacion() {
        return situacion;
    }
    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
    
    
    
    
}
