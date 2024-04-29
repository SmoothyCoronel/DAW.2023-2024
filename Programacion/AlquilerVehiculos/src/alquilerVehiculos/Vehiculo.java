/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilerVehiculos;

/**
 *
 * @author mint
 */
public class Vehiculo {
    //Atributos
    protected String matricula, modelo, marca;
    protected String tipoMotor; //Solo tendrá nombres especificos: electrico, hibrido enchufable, hibrido, gasolina, diesel.
    protected int kilometrosRecorridos;
    protected int precioDia;


    //Constructor
    public Vehiculo(String matricula, String modelo, String marca, String tipoMotor, int kilometrosRecorridos, int precioDia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.precioDia = precioDia;

    }

    //Getters y setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getPrecioDia() {
        return precioDia;
    }
    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }
    
}
