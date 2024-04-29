/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerProyecto;

/**
 *
 * @author mint
 */
public class Camion extends Vehiculo{
    //Atributos propios
    private int cargaMaxima, longitud;

    //Constructor
    public Camion(String matricula, String modelo, String marca, int kmRecorridos, int precioDia, TipoMotor tipomotor, int cargaMax, int longitud) {
        super(matricula, modelo, marca, kmRecorridos, precioDia, tipomotor);
        this.cargaMaxima = cargaMax;
        this.longitud = longitud;
    }

    //Metodos
    public int getCargaMax() {
        return cargaMaxima;
    }
    public void setCargaMax(int cargaMax) {
        this.cargaMaxima = cargaMax;
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
