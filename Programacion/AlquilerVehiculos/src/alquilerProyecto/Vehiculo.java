/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerProyecto;

/**
 *
 * @author mint
 */
public class Vehiculo {
    //Atributos
    protected String matricula, modelo, marca;
    protected int kmRecorridos, precioDia;
    protected TipoMotor tipomotor;
    
    //Constructor
    public Vehiculo(String matricula, String modelo, String marca, int kmRecorridos, int precioDia, TipoMotor tipomotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.kmRecorridos = kmRecorridos;
        this.precioDia = precioDia;
        this.tipomotor = tipomotor;
    }

    //Metodos
    public String getMatricula() {
        return matricula;
    }
    
    public TipoMotor getTipomotor() {
        return tipomotor;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", kmRecorridos=" + kmRecorridos +
                ", precioDia=" + precioDia +
                ", tipomotor=" + tipomotor +
                '}';
    }
}
