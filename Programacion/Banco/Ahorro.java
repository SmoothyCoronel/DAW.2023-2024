/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Banco;

/**
 *
 * @author mint
 */
public class Ahorro extends CuentaBancaria{
    //Atributos
    private float interesAnual;

    //Constructor
    public Ahorro(String dniTitular, String nombre, String email, String telefono, String iban, float saldo) {
        super(dniTitular, nombre, email, telefono, iban, saldo);
        this.interesAnual = 0.1f;
    }
    
    //Métodos
    public void ajustarInteres(){
        saldo -= interesAnual * saldo;
    }
    
    
}
