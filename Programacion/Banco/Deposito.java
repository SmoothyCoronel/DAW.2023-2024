/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Banco;

/**
 *
 * @author mint
 */
public class Deposito extends CuentaBancaria{
    //Atributos
    private float interesAnual;
    
    //Constructor
    public Deposito(String dniTitular, String nombre, String email, String telefono, String iban, float saldo) {
        super(dniTitular, nombre, email, telefono, iban, saldo);
        this.interesAnual = 4.0f;
    }
    //Métodos
    @Override
    public boolean añadirOperacion(Operacion miOperacion){
        if(miOperacion.getFecha() == null || miOperacion.getFecha().isEmpty() || miOperacion.getConcepto() == null || 
                miOperacion.getConcepto().isEmpty() || miOperacion.getHora() < 0){
            return false;
        }else{      
            if(miOperacion.getCantidad() > 0){
                return false;
            }else {
                saldo += miOperacion.getCantidad();
            }
            
            operaciones.add(miOperacion);
            return true;
        }
    }
    
    public void ajustarInteres(){
        saldo -= interesAnual * saldo;
    }

    public float getInteresAnual() {
        return interesAnual;
    }
    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    
}
