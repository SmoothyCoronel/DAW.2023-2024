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
public class Empresa {
    //Atributos
    private ArrayList<Paquete>misPaquetes;
    private String nombre;
    
    //Constructor
    public Empresa(String nombre){
        this.nombre = nombre;
        misPaquetes = new ArrayList<>();
    }
    
    //Métodos
    //Existe paquete? y nos da el paquete
    public Paquete existePaquete(Paquete p){
        if(p != null){
            for(Paquete existencias: misPaquetes){
                if(p.getLocalizador().equals(existencias.getLocalizador())){
                    return p;
                }
            }
        }
        return null;
    }
    //Crear paquete
    public boolean añadePaquete(Paquete p){
        if(p != null){
            if(existePaquete(p) == null){
                misPaquetes.add(p);
                return true;
            }
        }
        return false;
    }
    //Listar paquetes
    public String listaPaquete(String estado){
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
    //Añadir producto a paquete
    public boolean añadeProductoPaquete(Paquete p, Producto pro){
        for(Paquete existencias: misPaquetes){
            if(existencias.getLocalizador().compareTo(p.getLocalizador()) == 0){
                if("Vacio".equals(existencias.getSituacion()) || existencias.getSituacion().equals("En preparación")){
                    if("Vacio".equals(existencias.getSituacion())){
                        existencias.setSituacion("En preparación");
                        existencias.addProducto(pro);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //Eliminar producto a paquete
    public boolean eliminaProductoPaquete(Paquete p, Producto pro){
        for(Paquete existencias: misPaquetes){
            if(existencias.getLocalizador().compareTo(p.getLocalizador()) == 0){
                existencias.deleteProducto(pro);
                return true;
            }
        }
        return false;
    }
    //Lista productos de paquetes
    public String listaProductosPaquete(Paquete p){
        String lista = "";
        
        if(misPaquetes.isEmpty()){
            lista = "";
        }else{
            for(Paquete existencias: misPaquetes){
                if(existencias.getLocalizador().equals(p.getLocalizador())){
                    lista += p.listaProducto();
                }
            }
        }
        return lista;
    }
    //Devolver paquete dandome su localizador
    public Paquete devuelvePaquete(String localizador){
        if(localizador != null){
            for(Paquete existencias: misPaquetes){
                if(existencias.getLocalizador().compareTo(localizador) == 0){
                    return existencias;
                }
            }
        }
        return null;
    }
    
    //Getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
