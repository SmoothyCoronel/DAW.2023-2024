/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

/**
 *
 * @author mint
 */
public class Camion extends Vehiculo{
    //Atributos propios
    private int cargaMaxima, longitud;

    //Constructor
    public Camion(int cargaMaxima, int longitud, String matricula, String modelo, String marca, String tipoMotor, int kilometrosRecorridos, int precioDia) {
        super(matricula, modelo, marca, tipoMotor, kilometrosRecorridos, precioDia);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }

    //Getters y setters
    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
    
    
    
    
}
