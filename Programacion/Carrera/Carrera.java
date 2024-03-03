/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Carrera;

/**
 *
 * @author mint
 */
public class Carrera {
    //Atributos
    private static final int NUM_PARTICIPANTES_MAX = 100;
    
    private int codigo;
    private String descripcion, fechaRealizacion;
    private Participante[] misParticipantes;

    //Constructor
    public Carrera(int codigo, String descripcion, String fechaRealizacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.misParticipantes = new Participante[NUM_PARTICIPANTES_MAX];
    }
    
    //Resto de métodos
    //Método inscribir participante
    public boolean inscribirParticipante(Participante nuevoParticipante){
        boolean isCorrect = false;
        
        for(int i = 0; i < misParticipantes.length; i++){
           if(misParticipantes[i] == null){
               //Asignar
               misParticipantes[i] = nuevoParticipante;
               isCorrect = true;
           }
        }
        return isCorrect;
    }    
    //Método buscar participante
    public boolean buscarParticipante(String dni){
        boolean isFound = false;
        
        for(int i = 0; i < misParticipantes.length; i++){
            if(misParticipantes[i].getpDni().equals(dni)){
                isFound = true;
            }
        }
        return isFound;
    }
    //Método borrar participante
    public boolean borrarParticipante(String dni){
        boolean isDeleted = false;
        
        for(int i = 0; i < misParticipantes.length; i++){
            if(misParticipantes[i] != null){
                if(misParticipantes[i].getpDni().equals(dni)){
                    //Elimina al cliente con el mismo DNI
                    misParticipantes[i] = null;
                    isDeleted = true;
                }
            }
        }
        return isDeleted;
    }
    //Getters - Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }
    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    
    
}

