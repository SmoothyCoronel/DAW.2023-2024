/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

/**
 *
 * @author mint
 */
public class Furgon extends Vehiculo{
    //Atributos propios
    private int cargaMaxima, plazasAsientos;

    //Constructor
    public Furgon(int cargaMaxima, int plazasAsientos, String matricula, String modelo, String marca, String tipoMotor, int kilometrosRecorridos, int precioDia) {
        super(matricula, modelo, marca, tipoMotor, kilometrosRecorridos, precioDia);
        this.cargaMaxima = cargaMaxima;
        this.plazasAsientos = plazasAsientos;
    }

    //Getters y setters
    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getPlazasAsientos() {
        return plazasAsientos;
    }
    public void setPlazasAsientos(int plazasAsientos) {
        this.plazasAsientos = plazasAsientos;
    }
    
    
    
}
