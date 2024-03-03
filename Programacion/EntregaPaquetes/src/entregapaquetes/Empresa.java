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
public class Empresa {
    //Atributos
    private ArrayList<Paquete>misPaquetes;
    private String nombre;
    
    //Constructor
    public Empresa(String nombre){
        this.nombre = nombre;
        misPaquetes = new ArrayList<>();
    }
    
    //Metodos
    //Existe paquete
    public boolean existePaquete(Paquete p){
        boolean resultado = false;
        for(int i = 0; i < misPaquetes.size() && resultado != true; i++){
            if(misPaquetes.get(i).getLocalizador().compareTo(p.getLocalizador()) == 0){
                resultado = true;
            }
        }
        return resultado;
    }
    
    //Crear paquete
    public boolean añadirPaquete(Paquete p){
        boolean resultado = false;
            //Podemos crear un paquete
            if(!existePaquete(p)){
                misPaquetes.add(p);
                resultado = true;
            }
            
        return resultado;
    }
    
    //Listar los paquetes
    public String listarPaquetes(String estado){
        String lista = "";
        
        if(misPaquetes.isEmpty()){
            lista = "";
        }else {
            for(int i = 0; i < misPaquetes.size(); i++){
                if(misPaquetes.get(i).getSituacion().compareTo(estado) == 0){
                    lista += misPaquetes.get(i) +"\n";
                }
            }
        }
    return lista;
    }  
    
    //Añadir producto a un paquete
    public boolean añadirProductoPaquete(String localizador, Producto p){
        boolean resultado = false;
        for(int i = 0; i < misPaquetes.size() && resultado != true; i++){
            if(misPaquetes.get(i).getLocalizador().compareTo(localizador) == 0){
                if(misPaquetes.get(i).getSituacion().compareTo("Vacio")== 0 || misPaquetes.get(i).getSituacion().compareTo("En Preparacion")== 0){
                    resultado = misPaquetes.get(i).addProducto(p);
                    if("Vacio".equals(misPaquetes.get(i).getSituacion())){
                        misPaquetes.get(i).setSituacion("En Preparacion");
                    }
                }
            }
        }
        return resultado;
    }
    
    //Eliminar producto de un paquete
    public boolean eliminaProductoPaquete(String localizador, String codigoProducto){
        boolean resultado = false;
        for(int i = 0; i < misPaquetes.size() && resultado != true; i++){
            if(misPaquetes.get(i).getLocalizador().compareTo(localizador) == 0){
                resultado = misPaquetes.get(i).deleteProducto(codigoProducto);
            }
        }
        return resultado;
    }
    
    //Buscar producto dentro de paquetes
    public String listarProductosPaquete(String localizador){
        String lista = "";
        
        if(misPaquetes.isEmpty()){
            lista = "";
        }else{
            for(int i = 0; i < misPaquetes.size(); i++){
                if(misPaquetes.get(i).getLocalizador().compareTo(localizador) == 0){
                      lista += misPaquetes.get(i).listProducto() + "\n";
                }
            }
        }
        return lista;
    }
    
    //Getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
