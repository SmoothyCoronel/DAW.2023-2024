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
public class Oficina {
    //Atributos
    private String direccion, codigoOfi, telefono, email, codPoliza, ciudad;
    private ArrayList<CuentaBancaria> cuentas;

    //Constructor
    public Oficina(String direccion, String codigoOfi, String telefono, String email, String codPoliza, String ciudad) {
        this.direccion = direccion;
        this.codigoOfi = codigoOfi;
        this.telefono = telefono;
        this.email = email;
        this.codPoliza = codPoliza;
        this.ciudad = ciudad;
        this.cuentas = new ArrayList<>();
    }
    
    //Métodos
    public boolean existeCuenta(String iban){
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getIban().equals(iban)){
                return true;
            }
        }
        return false;
    }
    
    public CuentaBancaria buscarCuenta(String iban){
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getIban().equals(iban)){
                return cuentas.get(i);
            }
        }
        return null;
    }
    
    public boolean añadirCuenta(CuentaBancaria miCuenta){
        if(!existeCuenta(miCuenta.iban)){
            this.cuentas.add(miCuenta);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean eliminarCuenta(String iban){
        if(buscarCuenta(iban) != null){
            this.cuentas.remove(buscarCuenta(iban));
            return true;
        }else{
            return false;
        }
    }
    
    public String mostrarCuentas(){
        String lista = "";
        
        if(cuentas.isEmpty()){
            lista = "";
        }else {
            for(int i = 0; i < cuentas.size(); i++){
                lista += cuentas.get(i) +"\n";
            }
        }
        return lista;  
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoOfi() {
        return codigoOfi;
    }
    public void setCodigoOfi(String codigoOfi) {
        this.codigoOfi = codigoOfi;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodPoliza() {
        return codPoliza;
    }
    public void setCodPoliza(String codPoliza) {
        this.codPoliza = codPoliza;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
