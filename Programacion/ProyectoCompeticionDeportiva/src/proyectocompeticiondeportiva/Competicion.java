/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompeticiondeportiva;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mint
 */
public class Competicion {
    //Atributos
    private String codigoCompeticion, descripcion, provinciaRealizacion;
    
    //Lista de equipos
    private List <Equipo> listaEquipos;

    //Constructor
    public Competicion(String codigoCompeticion, String descripcion, String provinciaRealizacion) {
        this.codigoCompeticion = codigoCompeticion;
        this.descripcion = descripcion;
        this.provinciaRealizacion = provinciaRealizacion;
        
        listaEquipos = new ArrayList<>();
    }
    
    //Metodos
    //Metodos de equipos
    public boolean añadirEquipo(Equipo e){
        if(e != null){
            if(existeEquipo(e.getCodigo()) == null){
                listaEquipos.add(e);
                return true;
            }            
        }
        return false;
    }
    
    public Equipo existeEquipo(String codigo){
        for(Equipo e: listaEquipos){
            if(e.getCodigo().equals(codigo)){
                return e;
            }
        }
        return null;
    }
    
    public boolean eliminarEquipo(String codigo){
        //Creamos un equipo de prueba para almacenar temporalmente la información
        Equipo e = existeEquipo(codigo);
        if(e != null && e.getListaJugadores().isEmpty()){
            listaEquipos.remove(e);
            return true;
        }
        return false;
    }
    
    //Se busca por ciudad de origen
    public Equipo[] buscarEquipo(String ciudadOrigen){
        List<Equipo> busquedaCiudad = new ArrayList<>();
        
        for(Equipo e: listaEquipos){
            if(e.getCiudadOrigen().equals(ciudadOrigen)){
                busquedaCiudad.add(e);
            }
        }
        if(!busquedaCiudad.isEmpty()){
            return busquedaCiudad.toArray(new Equipo[0]);
        }else{
            return null;
        }   
    }
    
    public Equipo[] listarEquipos(){
        List<Equipo> listaTotal = new ArrayList<>();
        
        for(Equipo e: listaEquipos){
            listaTotal.add(e);
        }
        return listaTotal.toArray(new Equipo[0]);
    }
    
    //Metodos de Jugadores
    public boolean darAltaJugador(Jugador j, String codigoEquipo){
        Equipo e = existeEquipo(codigoEquipo);
        if(e != null){
            //El equipo dado existe
            if(j != null){
                e.añadirJugador(j);
                return true;
            }
        }
        return false;
    }
    
    public boolean darBajaJugador(String codigoEquipo, String dniJugador){
        Equipo e = existeEquipo(codigoEquipo);
        if(e != null){
            //El equipo dado existe
            return e.eliminarJugador(dniJugador);
                
        }
        return false;
    }
    
    public boolean jugadorDisponible(String codigoEquipo, String dniJugador){
        Equipo e = existeEquipo(codigoEquipo);
        if(e != null){
            //El equipo dado existe
            return e.hacerDisponible(dniJugador);
        }
        return false;
    }
    
    public boolean jugadorNoDisponible(String codigoEquipo, String dniJugador){
        Equipo e = existeEquipo(codigoEquipo);
        if(e != null){
            //El equipo dado existe
            return e.hacerNoDisponible(dniJugador);
        }
        return false;
    }
    
    @Override
    public String toString(){
        //Ültimo método de insercción de datos en fichero
        String cadenaEquipos = "";
        
        //Se añade la competición al String
        /*
        String cadenaCompeticion = String.format("Datos de competición: " + "Codigo de competición: %s,  Descripcion de competición: %s, Porvincia de realizacion de competición: %s, \n", 
                codigoCompeticion, descripcion, provinciaRealizacion);
        */
        String cadenaCompeticion = "Datos de competicion: Codigo de competicion: " + codigoCompeticion + " Descripcion de competición: " + descripcion + " Porvincia de realizacion de competición: " +
                provinciaRealizacion + "\n";
        
        if(listaEquipos.isEmpty()){
            return cadenaCompeticion;
        }else {
            //Se añaden los equipos al String
            for(int i = 0; i < listaEquipos.size(); i++){
                cadenaEquipos += listaEquipos.get(i).toString();
            }

            cadenaCompeticion += cadenaEquipos;
            return cadenaCompeticion;
        }
        
    }
    
}
