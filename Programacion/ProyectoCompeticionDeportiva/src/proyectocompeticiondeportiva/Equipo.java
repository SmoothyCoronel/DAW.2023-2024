/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompeticiondeportiva;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mint
 */
public class Equipo {
    //Atributos
    private String codigo;
    //Codigo de 5 caracteres
    private String descripcion, nombreResponsable, apellidosResponsable, ciudadOrigen, email, telefono;
    
    //Mapa de jugadores
    private Map <String, Jugador> listaJugadores;
    
    //Constructor
    public Equipo(String codigo, String descripcion, String nombreResponsable, String apellidosResponsable, String ciudadOrigen, String email, String telefono) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombreResponsable = nombreResponsable;
        this.apellidosResponsable = apellidosResponsable;
        this.ciudadOrigen = ciudadOrigen;
        this.email = email;
        this.telefono = telefono;
        
        listaJugadores = new HashMap<>();
    }
    
    //Metodos
    public void añadirJugador(Jugador j){
        if(j != null){
            if(existeJugador(j.getDni()) == null){
                listaJugadores.put(j.getDni(), j);
            }
        }
    }
    
    public Jugador existeJugador(String dni){
        if(listaJugadores.containsKey(dni)){
            listaJugadores.get(dni);
        }
        return null;
    }
    
    public boolean eliminarJugador(String dni){
        if(listaJugadores.containsKey(dni)){
            listaJugadores.remove(dni);
            return true;
        }
        return false;
    }
    
    public boolean hacerDisponible(String dni){
        if(listaJugadores.containsKey(dni)){
            Jugador j = listaJugadores.get(dni);
            if(!j.isActivo()){
                j.setActivo(true);
                return true;
            }          
        }
        return false;
    }
    
    public boolean hacerNoDisponible(String dni){
        if(listaJugadores.containsKey(dni)){
            Jugador j = listaJugadores.get(dni);
            if(j.isActivo()){
                j.setActivo(false);
                return true;
            }          
        }
        return false;
    }
    
    @Override
    public String toString(){
        String cadenaJugadores = "";
        
        //Se añade el equipo al string
        /*
        String cadenaEquipo = String.format( "Datos del equipo: Codigo del equipo: %s, Descripción del equipo: %s, Nombre del responsable: %s, Apellidos del responsable: %s. Ciudad de origen del equipo: %s,"
                + " Email del equipo: %s, Telefono del equipo: %s\n", codigo, nombreResponsable, apellidosResponsable, ciudadOrigen, email, telefono);
        */
        String cadenaEquipo = "\n Datos del equipo: Codigo del equipo:" + codigo + "  Descripción del equipo: " + descripcion + " Nombre del responsable: " + nombreResponsable + " Apellidos del responsable: " + 
                apellidosResponsable + " Ciudad de origen del equipo: " + ciudadOrigen + " Email del equipo: " + email + " Telefono del equipo: " + telefono + "\n";
                ;
        
        if(listaJugadores.isEmpty()){
            return cadenaEquipo;
        }else {
            //Se añaden los jugadores al string
            for(Map.Entry<String, Jugador> entry: listaJugadores.entrySet()){
                cadenaJugadores += entry.getValue().toString();
            }

            //Se juntan ambos grupos y se envia el resultado
            cadenaEquipo += cadenaJugadores;
            return cadenaEquipo;
        }
    }
    
    //Getters y setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    
    public Map<String, Jugador> getListaJugadores() {
        return listaJugadores;
    }

    
    
    
    
}
