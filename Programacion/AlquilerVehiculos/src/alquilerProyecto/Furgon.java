/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerProyecto;

/**
 *
 * @author mint
 */
public class Furgon extends Vehiculo{
    //Atributos propios
    private int cargaMaxima, plazasAsientos;

    //Constructor
    public Furgon(String matricula, String modelo, String marca, int kmRecorridos, int precioDia, TipoMotor tipomotor, int cargaMax, int plazasAsiento) {
        super(matricula, modelo, marca, kmRecorridos, precioDia, tipomotor);
        this.cargaMaxima = cargaMax;
        this.plazasAsientos = plazasAsiento;
    }

    //Metodos
    public int getCargaMax() {
        return cargaMaxima;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMaxima = cargaMax;
    }

    public int getPlazasAsiento() {
        return plazasAsientos;
    }

    public void setPlazasAsiento(int plazasAsiento) {
        this.plazasAsientos = plazasAsiento;
    }
}
