/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerProyecto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mint
 */
public class Empresa {
    //Atributos
    private String nombre;
    private List<Vehiculo> misVehiculos;
    private List<VehiculosAlquilados> listaAlquilados;
    private Map<String, Cliente> misClientes;    

    //Constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        misVehiculos = new ArrayList<>();
        misClientes = new HashMap<>();
        listaAlquilados = new ArrayList<>();
    }

    //Metodos
    public boolean addVehiculo(Vehiculo v) {
        if (v!= null) {
            if (existeVehiculo(v.getMatricula())== null) {
                misVehiculos.add(v);
                return true;
            }
        }
        return false;
    }

    public Vehiculo existeVehiculo(String matricula) {
        for (Vehiculo v2 : misVehiculos) {
            if (v2.getMatricula().equals(matricula)) {
                    return v2;
            }
        }
            return null;
    }

    public boolean addCliente(Cliente c){
        if(c != null && !misClientes.containsKey(c.getDni())){
                misClientes.put(c.getDni(), c);
            }
        return false;
    }
    
    public Cliente existeCliente(String dni){
        if(misClientes.containsKey(dni)){
            misClientes.get(dni);
        }
        return null;
    }
    
    public Vehiculo existVehiculoAlquilado(Vehiculo v){
        //Saber si un vehiculo está alquilado teniendo el vehiculo
        for(VehiculosAlquilados a: listaAlquilados){
            if(a.getV().equals(v)){
                return v;
            }
        }
        return null;
    }
    
    public VehiculosAlquilados alquilerSegunVehiculo(Vehiculo v){
        for(VehiculosAlquilados a: listaAlquilados){
            if(a.getV().equals(v)){
                return a;
            }
        }
        return null;
    }

    public boolean alquilarVehiculoCliente(VehiculosAlquilados a){
        //El objeto alquilado ya viene con cliente, vehiculo, diasAlquilados y fecha
        if(a != null){
            if(a.getC()!= null && a.getV() != null){
                //Comprobamos que cliente y vehiculo en nuestro almacen (vehiculoAlquilado) no sean null
                if(misClientes.containsKey(a.getC().getDni()) && existeVehiculo(a.getV().getMatricula()) != null){
                    //Comprobamos si el cliente y vehiculo introducidos en vehiculosAlquilados existen en sus correspondientes listas
                
                    if(existVehiculoAlquilado(a.getV()) == null){
                        //Comprobamos por ultimo si el vehiculoAlquilado a introducir ya se encuentra en la lista.
                        //Ya que por error podríamos tener el mismo coche alquilado más de una vez en el mismo tiempo
                        listaAlquilados.add(a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Vehiculo[] listaCoches(int plazas, TipoMotor tipoMotor) {
        List<Coche> listaMostrada = new ArrayList<>();

        for (int i=0; i< misVehiculos.size(); i++) {
            if(misVehiculos.get(i) instanceof Coche) {
                if (((Coche) misVehiculos.get(i)).getPlazasMaximas() >= plazas && (misVehiculos.get(i)).getTipomotor() == tipoMotor) {
                    listaMostrada.add((Coche) misVehiculos.get(i));
                }
            }
        }
        return listaMostrada.toArray(new Vehiculo[0]);
    }

    public Vehiculo[] listaFurgon(int cargaMax, int  plazasAsiento) {
        List<Furgon> listaMostrada = new ArrayList<>();
        
        for (int i=0; i< misVehiculos.size(); i++) {
            if(misVehiculos.get(i) instanceof Furgon) {
                if (((Furgon) misVehiculos.get(i)).getPlazasAsiento() >= plazasAsiento &&  ((Furgon) misVehiculos.get(i)).getCargaMax() >= cargaMax) {
                    listaMostrada.add((Furgon) misVehiculos.get(i));
                }
            }
        }
        return listaMostrada.toArray(new Vehiculo[0]);
    }

    public Vehiculo[] listaCamiones(int cargaMax, int longitud) {
        ArrayList<Camion> listaMostrada = new ArrayList<>();

        for (int i=0; i< misVehiculos.size(); i++) {
            if(misVehiculos.get(i) instanceof Camion) {
                if (((Camion) misVehiculos.get(i)).getCargaMax() >= cargaMax && ((Camion) misVehiculos.get(i)).getLongitud() >= longitud) {
                    listaMostrada.add((Camion) misVehiculos.get(i));
                }
            }
        }
        return listaMostrada.toArray(new Vehiculo[0]);
    }

    public float price(Cliente cli, Vehiculo v, int kmRecorridos) {
        float recibo = 0.0f; 
        int diasExtra = 0;
        
        if(v != null && cli != null){
            //Para devolver el "vehiculoAlquilado" teniendo el vehiculo
            VehiculosAlquilados a = alquilerSegunVehiculo(v);
            

            if(a != null){
                //Fecha actual
                LocalDate fechaEntrega = LocalDate.now();
                LocalDate fechaInicioAlquiler = a.getFechaAlquiler();

                v.setKmRecorridos(v.getKmRecorridos() + kmRecorridos);

                if(v.getKmRecorridos() > 500){
                    recibo = (float) (v.getPrecioDia() * a.getDiasAlquilado() * 1.20);               
                }else {
                    recibo = (float) (v.getPrecioDia() * a.getDiasAlquilado());
                }
                
                //Calculamos los dias extra
                diasExtra = (int) ChronoUnit.DAYS.between(fechaInicioAlquiler, fechaEntrega) - a.getDiasAlquilado();
                
                recibo += diasExtra * v.getPrecioDia() * 1.50;
                
            }
        }
        return recibo;
    }
}
