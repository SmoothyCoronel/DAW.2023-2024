/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mint
 */
public class EmpresaVehiculos {
    //Creamos las colecciones
    private List <Vehiculo> listaVehiculos;
    private Map <String, Cliente> listaClientes;
    private List <Alquilados> vehiculosAlquilados;
    
    //Constructor
    public EmpresaVehiculos(){
        listaVehiculos = new ArrayList<>();
        listaClientes = new HashMap<>();
        vehiculosAlquilados = new ArrayList<>();
    }
    
    //Metodos
    public boolean addVehiculo(Vehiculo v){
        if(v != null){
            if(existVehiculo(v.getMatricula()) == null){
                listaVehiculos.add(v);
                return true;
            }
        }
        return false;
    }
    
    public Vehiculo existVehiculo(String matricula){
        for(Vehiculo ve: listaVehiculos){
            if(ve.getMatricula().equals(matricula)){
                return ve;
            }
        }
        return null;
    }
    
    public Vehiculo existVehiculoAlquilado(Vehiculo v){
        for(Alquilados a: vehiculosAlquilados){
            if(a.getV().equals(v)){
                return v;
            }
        }
        return null;
    }
    
    public Alquilados alquilerSegunVehiculo(Vehiculo v){
        for(Alquilados a: vehiculosAlquilados){
            if(a.getV().equals(v)){
                return a;
            }
        }
        return null;
    }
    
    public boolean addCliente(Cliente cli){
        if(cli != null && !listaClientes.containsKey(cli.getDni())){
            listaClientes.put(cli.getDni(), cli);
            return true;
        }
        return false;
    }
    
    public boolean alquilarVehiculo(Alquilados a){    
        //El objeto alquilado ya viene con cliente, vehiculo, diasAlquilados y fecha 
        if(a != null){
            if(a.getC() != null && a.getV() != null){
                if(listaClientes.containsKey(a.getC().getDni()) && existVehiculo(a.getV().getMatricula()) != null){
                    //Si el vehiculo no está en la lista de alquilados es que no ha sido alquilado aún
                    if(existVehiculoAlquilado(a.getV()) == null){
                        vehiculosAlquilados.add(a);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public Vehiculo[] mostrarCoche(int numPlazas, String tipoMotor){
        //Nos dan los datos correctos tanto para el numero de plazas mayor que 0
        //Como para los tipos de motor, que son: 
        //electrico, hibrido enchufable, hibrido, gasolina, diesel
        List <Vehiculo> listaMostrada;
        listaMostrada = new ArrayList<>();
        
        for(int i = 0; i < listaVehiculos.size(); i++){
            if(listaVehiculos.get(i) instanceof Coche){
                if(listaVehiculos.get(i).getTipoMotor().equals(tipoMotor) && 
                    ((Coche) listaVehiculos.get(i)).getPlazasMaximas() > numPlazas){  
                    //((Coche) listaVehiculos.get(i)).getPlazasMaximas();
                    listaMostrada.add(listaVehiculos.get(i));
                }
            }
        }
        return  listaMostrada.toArray(new Vehiculo[0]);
    }
    
    public Vehiculo[] mostrarFurgon(int cargaMaxima, int plazas){
        List <Vehiculo> listaMostrada;
        listaMostrada = new ArrayList<>();
        
        for(int i = 0; i < listaVehiculos.size(); i++){
            if(listaVehiculos.get(i) instanceof Furgon){
                if(((Furgon)listaVehiculos.get(i)).getCargaMaxima() > cargaMaxima &&
                        ((Furgon)listaVehiculos.get(i)).getPlazasAsientos() > plazas){
                    
                    listaMostrada.add(listaVehiculos.get(i));
                }
            }
        }    
        return  listaMostrada.toArray(new Vehiculo[0]);
    }
    
    public Vehiculo[] mostrarCamion(int cargaMaxima, int longitud){
        List <Vehiculo> listaMostrada;
        listaMostrada = new ArrayList<>();
        
        for(int i = 0; i < listaVehiculos.size(); i++){
            if(listaVehiculos.get(i) instanceof Camion){
                if(((Camion)listaVehiculos.get(i)).getCargaMaxima() > cargaMaxima &&
                        ((Camion)listaVehiculos.get(i)).getLongitud() > longitud){
                    
                    listaMostrada.add(listaVehiculos.get(i));
                }
            }
        }
        return listaMostrada.toArray(new Vehiculo[0]);
    }

    
    public float devolverVehiculo(Cliente cli, Vehiculo v, int kilometrosRecorridos){
        float recibo = 0.0f; 
        Alquilados a = alquilerSegunVehiculo(v);
        //Fecha actual
        Calendar fecha = Calendar.getInstance();
        int diasDemas;
        
        if(cli != null && v != null){
            if(listaClientes.containsKey(cli.getDni()) && existVehiculo(v.getMatricula()) != null){
                //Si el metodo vehiculoAlquilado no es null, significa que ese vehiculo se encuentra en propiedad
                if(existVehiculoAlquilado(v) != null){
                    v.setKilometrosRecorridos(v.getKilometrosRecorridos() + kilometrosRecorridos);
                    
                    
                    if(kilometrosRecorridos > 500){
                       recibo = (v.getPrecioDia() * a.getDiasAlquilado()) + ((v.getPrecioDia() * a.getDiasAlquilado()) * 20/100);
                    }else {
                        recibo = v.getPrecioDia() * a.getDiasAlquilado();
                    }
                    
                    if(a.getFechaAlquiler().get(Calendar.DAY_OF_MONTH)+ a.getDiasAlquilado() < fecha.get(Calendar.DAY_OF_MONTH)){
                       diasDemas = fecha.get(Calendar.DAY_OF_MONTH) - a.getFechaAlquiler().get(Calendar.DAY_OF_MONTH)+ a.getDiasAlquilado();
                       
                           recibo += (v.getPrecioDia() * diasDemas) + ((v.getPrecioDia() * diasDemas) * 50/100);
                       
                    }
                    //Como ya se ha dado el recibo, el vehiculo deja de ser alquilado y sale de la lista de alquilados
                    vehiculosAlquilados.remove(a);
                    
                    return recibo;
                }
            }
        }
        //Si devuelve numero negativo, le decimos al main que algo no ha ido bien
        return -1;
    }
}
       
