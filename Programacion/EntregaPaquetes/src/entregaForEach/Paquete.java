/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregaForEach;

import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class Paquete {
     //Atributos
    private String localizador, direccionEnvio, dniCliente, fechaEnvio;
    private int diasPrevistos;
    private String Situacion;
    
    private ArrayList<Producto> misProductos;
    
    //Constructor
    public Paquete(String localizador, String direccionEnvio, String dniCliente, String fechaEnvio, int diasPrevistos) {
        this.localizador = localizador;
        this.direccionEnvio = direccionEnvio;
        this.dniCliente = dniCliente;
        this.fechaEnvio = fechaEnvio;
        this.diasPrevistos = diasPrevistos;
        misProductos = new ArrayList<>();
        this.Situacion = "Vacio";
        
    }
    
    //Atributos
    //Añadir producto
    public boolean addProducto(Producto pro){
        if(pro != null){
            if(!buscaProducto(pro)){
                if("Vacio".equals(this.Situacion) || "En Preparación".equals(this.Situacion)){
                    misProductos.add(pro);
                    return true;
                }  
            }
            
        }
        return false;
    }
    //Eliminar producto
    public boolean deleteProducto(Producto pro){
        if(buscaProducto(pro)){
            misProductos.remove(pro);
            return true;
        }
        return false;
    }
    //Buscar producto
    public boolean buscaProducto(Producto pro){
        for(Producto buscado: misProductos){
            if(pro.getCodigoProducto().equals(buscado.getCodigoProducto())){
                return true;
            }
        }
        return false;
    }
    //Listar productos
    public String listaProducto(){
        String lista = "";
        
        if(misProductos.isEmpty()){
            lista = "";
        }else {
            for(int i = 0; i < misProductos.size(); i++){
                lista += misProductos.get(i) +"\n";
            }
        }
    return lista; 
    }
    //Devolver producto segun su código dado
    public Producto devuelveProducto(String codigoProducto){
        for(Producto lista: misProductos){
            if(lista.getCodigoProducto().compareTo(codigoProducto) == 0){
                return lista;
            }
        }
        return null;
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
        return Situacion;
    }
    public void setSituacion(String Situacion) {
        this.Situacion = Situacion;
    }
    
    
    
}
