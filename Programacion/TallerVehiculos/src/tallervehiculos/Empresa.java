/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallervehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mint
 */
public class Empresa {
    //Atributos
    private List<Vehiculo> listaVehiculos;
    
    //Constructor
    public Empresa(){
        listaVehiculos = new ArrayList<>();
    }
    
    //Métodos
    public boolean AñadirVehiculo(Vehiculo v){
        if(v != null){
            if(buscarVehiculo(v.getMatricula()) == null){
                listaVehiculos.add(v);
                return true;
            }            
        }
        return false;
    }
    
    public Vehiculo buscarVehiculo(String matricula){
        for(Vehiculo ve: listaVehiculos){
            if(ve.getMatricula().equals(matricula)){
                return ve;
            }
        }
        return null;
    }
    
    public Vehiculo[] listarVehiculos(){
        return listaVehiculos.toArray(new Vehiculo[0]);
        //En mapa return listaVehiculos.values.toArray(new Vehiculo[0])
    }
    
    public List<Vehiculo> buscarVehiculosDueño(String dniDueño){
        LinkedList<Vehiculo> resultado = new LinkedList<>();
        
        for(Vehiculo ve: listaVehiculos){
            if(ve.getDNIdueño().equals(dniDueño)){
                resultado.add(ve);
            }
        }
        return resultado;
    }
    
    
    public Map<String, Vehiculo> pruebaMapeadoCoches(){
        //Crearemos un mapa pero solo de los coches como prueba de nuestro estudio
        Map<String, Vehiculo> mapaPrueba = new HashMap<>();
        
        for(Vehiculo prueba: listaVehiculos){
            //Añadimos los datos de la lista en el mapa para poseer un mapa con los valores
            if(prueba instanceof Coche){
                mapaPrueba.put(prueba.getMatricula(), prueba);
            }
        }
        return mapaPrueba;
    }
    
    public float cobroVehiculo(Vehiculo v){
        /*
        * Motos 20/h
        * Coches 25/h
        * Furgones 30/h + 30 extra
        * Camiones 40/h + 50 extra
        */
        float cobroTotal = 0;
        
        if(v != null){
            //Tengo que cobrar todos los trabajos de taller de vehiculo que no han sido cobrados
            List<TrabajoTaller> tt;
            tt = v.getMisReparaciones();
            
            for(TrabajoTaller trabajando: tt){
                int horasCalculo = trabajando.getHorasReales();

                if(v instanceof Moto){
                    cobroTotal += horasCalculo * 20;
                }else if(v instanceof Coche){
                    cobroTotal += horasCalculo * 25;
                }else if(v instanceof Furgon){
                    cobroTotal += (horasCalculo * 30) + 30 ;
                }else {
                    cobroTotal += (horasCalculo * 40) + 50;
                }
                trabajando.setIsCobrado(true);
            }
            
        }
        return cobroTotal;
    }
}