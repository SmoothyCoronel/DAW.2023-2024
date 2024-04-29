/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicospropuestos10.pkg04.tres_1;

/**
 *
 * @author mint
 */
public class PaqueteEnvio3_5_1 {
    //Atributos
    Persona remitente, destinatario;
    enum contenido{DOCUMENTO, MERCANCIA};
    enum tipoEnvio{NACIONAL, INTERNACIONAL};
    int pesoPaquete;

    public PaqueteEnvio3_5(Persona remitente, Persona destinatario, int pesoPaquete) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.pesoPaquete = pesoPaquete;
    }
    
    
    
    class Persona{
        //Atributos
        String nombre, apellidos;
        int documentoId;
        String direccion, telefono;

        public Persona(String nombre, String apellidos, int documentoId, String direccion, String telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.documentoId = documentoId;
            this.direccion = direccion;
            this.telefono = telefono;
        }   
    }
    
    //Método calculo del valor del envio que depende el peso
    public float calculoEnvio(enum contenido, enum tipoEnvio, int pesoPaquete){
        if(tipoEnvio.equals("NACIONAL")){
            if(contenido.equals("DOCUMENTO")){
                if(pesoPaquete <= 2){
                    return 2000.0f;
                } else{
                    return 3000.0f;
                }
            }else{
                if(pesoPaquete <= 5){
                    return 5000.0f;
                } else{
                    return 7000.0f;
                }
            }
        }else{
            if(contenido.equals("DOCUMENTO")){
                if(pesoPaquete <= 2){
                    return 10000.0f;
                } else{
                    return 15000.0f;
                }
            }else{
                if(pesoPaquete <= 5){
                    return 12000.0f;
                } else{
                    return 20000.0f;
                }
            }
            
        }
        return 0.0f;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PaqueteEnvio3_5 paquete = new PaqueteEnvio3_5(Correos, CasaPepe, 10, DOCUMENTO);
        Persona Correos = new Persona("correos", "empresa", 3, "Avd Rios", "23498765");
        Persona CasaPepe = new Persona("Pepe", "p", 1, "Avd Mares", "98768320");
        
        calculoEnvio(DOCUMENTO, NACIONAL, paquete);
    }
    
}