/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Banco;

/**
 *
 * @author mint
 */
public class Hipoteca extends CuentaBancaria{
    //Atributos
    private float hipotecaMensual;
    
    //Constructor
    public Hipoteca(String dniTitular, String nombre, String email, String telefono, String iban, float saldo) {
        super(dniTitular, nombre, email, telefono, iban, saldo);
    }
    
    //Métodos
    public void cobrarHipoteca(){
        saldo -= hipotecaMensual;
    }
    
}
