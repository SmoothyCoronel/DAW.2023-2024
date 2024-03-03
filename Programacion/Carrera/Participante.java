/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Carrera;

/**
 *
 * @author mint
 */
public class Participante {
    //Atributos
    private String pDni, pNombre, pApellidos, pFNacimiento, pEmail;
    private int pTelefono;
    
    //Constructor
    public Participante(String pDni, String pNombre, String pApellidos, String pFNacimiento, String pEmail, int pTelefono) {
        this.pDni = pDni;
        this.pNombre = pNombre;
        this.pApellidos = pApellidos;
        this.pFNacimiento = pFNacimiento;
        this.pEmail = pEmail;
        this.pTelefono = pTelefono;
    }
    
    //Getters - setters
    public String getpDni() {
        return pDni;
    }
    public void setpDni(String pDni) {
        this.pDni = pDni;
    }

    public String getpNombre() {
        return pNombre;
    }
    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getpApellidos() {
        return pApellidos;
    }
    public void setpApellidos(String pApellidos) {
        this.pApellidos = pApellidos;
    }

    public String getpFNacimiento() {
        return pFNacimiento;
    }
    public void setpFNacimiento(String pFNacimiento) {
        this.pFNacimiento = pFNacimiento;
    }

    public String getpEmail() {
        return pEmail;
    }
    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public int getpTelefono() {
        return pTelefono;
    }
    public void setpTelefono(int pTelefono) {
        this.pTelefono = pTelefono;
    }
    
    
}
