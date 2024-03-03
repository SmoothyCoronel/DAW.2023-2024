/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Banco;

import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class CuentaBancaria {
    //Atributos
    protected String dniTitular, nombre, email, telefono, iban;
    protected float saldo;
    protected ArrayList<Operacion> operaciones;

    //Constructor
    public CuentaBancaria(String dniTitular, String nombre, String email, String telefono, String iban, float saldo) {
        this.dniTitular = dniTitular;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.iban = iban;
        this.saldo = saldo;
        this.operaciones = new ArrayList<>();
    }
    
    //Métodos
    public boolean añadirOperacion(Operacion miOperacion){
        if(miOperacion.getFecha() == null || miOperacion.getFecha().isEmpty() || miOperacion.getConcepto() == null || 
                miOperacion.getConcepto().isEmpty() || miOperacion.getHora() < 0){
            return false;
        }else{      
            if(miOperacion.getCantidad() > 0){
                saldo -= miOperacion.getCantidad();
            }else {
                saldo += miOperacion.getCantidad();
            }
            
            operaciones.add(miOperacion);
            return true;
        }
    }

    public String getDniTitular() {
        return dniTitular;
    }
    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
