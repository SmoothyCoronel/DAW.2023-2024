/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerProyecto;

/**
 *
 * @author mint
 */
public class Coche extends Vehiculo{
    //Atributos propios
    private int plazasMaximas, puertas, volumenMaletero;
    private TipoCoche tipo;

    //Constrcutor
    public Coche(String matricula, String modelo, String marca, int kmRecorridos, int precioDia, TipoMotor tipomotor, int plazasMax, int puertas, int maletero, TipoCoche tipo) {
        super(matricula, modelo, marca, kmRecorridos, precioDia, tipomotor);
        this.plazasMaximas = plazasMax;
        this.puertas = puertas;
        this.volumenMaletero = maletero;
        this.tipo = tipo;
    }
    
    //Metodos
    public int getPlazasMaximas() {
        return plazasMaximas;
    }
}
