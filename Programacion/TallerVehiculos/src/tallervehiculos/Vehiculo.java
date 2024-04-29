/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallervehiculos;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mint
 */
public class Vehiculo {
    //Atributos
    protected String matricula, modelo;
    protected String nombreDueño, apellidosDueño, DNIdueño;
    protected Date fechaEntrada;
    protected int horaEntrada;
    protected List<TrabajoTaller> misReparaciones;

    //Constructor
    public Vehiculo(String matricula, String modelo, String nombreDueño, String apellidosDueño, String DNIdueño, Date fechaEntrada, int horaEntrada) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.nombreDueño = nombreDueño;
        this.apellidosDueño = apellidosDueño;
        this.DNIdueño = DNIdueño;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        
        misReparaciones = new LinkedList<>();
    }
    
    //Metodos
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDNIdueño() {
        return DNIdueño;
    }
    public void setDNIdueño(String DNIdueño) {
        this.DNIdueño = DNIdueño;
    }

    public List<TrabajoTaller> getMisReparaciones() {
        return misReparaciones;
    }
    
    
    
    //CRUD reparaciones
    public boolean crearReparacion(TrabajoTaller tt){
        if(tt != null){
            if(buscarReparacion(tt.getCodigo()) == null){
               misReparaciones.add(tt);
               return true;
            }
        }
       return false;
    } 
    
    public TrabajoTaller buscarReparacion(String codigo){
        for(TrabajoTaller tt: misReparaciones){
            if(tt.getCodigo().equals(codigo)){
                return tt;
            }
        }
        return null;
    }
    
    public boolean eliminaReparacion(TrabajoTaller tt){
        if(tt != null){
            if(tt.isIsCobrado()){
                if(buscarReparacion(tt.getCodigo()) != null){
                    misReparaciones.remove(tt);
                }
            }
        }
        return false;
    }
    
}
