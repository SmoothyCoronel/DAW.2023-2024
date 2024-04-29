/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

/**
 *
 * @author mint
 */
public class Coche extends Vehiculo{
    //Atributos propios
    private int plazasMaximas, puertas, volumenMaletero;
    private String tipo; //Solo tendrá nombres específicos: utilitario, berlina, monovolumen, suv

    //Constructor
    public Coche(int plazasMaximas, int puertas, int volumenMaletero, String tipo, String matricula, String modelo, String marca, String tipoMotor, int kilometrosRecorridos, int precioDia) {
        super(matricula, modelo, marca, tipoMotor, kilometrosRecorridos, precioDia);
        this.plazasMaximas = plazasMaximas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipo = tipo;
    }

    //Getters y setters propios
    public int getPlazasMaximas() {
        return plazasMaximas;
    }
    public void setPlazasMaximas(int plazasMaximas) {
        this.plazasMaximas = plazasMaximas;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVolumenMaletero() {
        return volumenMaletero;
    }
    public void setVolumenMaletero(int volumenMaletero) {
        this.volumenMaletero = volumenMaletero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
