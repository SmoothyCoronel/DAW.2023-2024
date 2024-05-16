
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacaciones;

/**
 *
 * @author mint
 */
public class ClienteBono extends Cliente{
    //Atributos
    private int noches;
    
    //Constructor
    public ClienteBono(String dni, String nombre, String apellidos, String direccion, 
                        String email, int telefono, int edad, String fechaNacimiento, int noches){
        super(dni, nombre, apellidos, direccion, email, telefono, edad, fechaNacimiento, 0);
        if(this.noches >= 0){
            this.noches = noches;
        }else{
            this.noches = 5;
        }
    }
    
    //Métodos
    public void sumarNoches(int nochesAdicionales){
        noches = nochesAdicionales + noches;
    }
    
    public void pernocta(boolean pernoctado){
        if(pernoctado == true){
            noches = noches -1;
        }
    }
    
    //Getters y setters
    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    //Método toString para leer y escribir archivos
    @Override
    public String toString() {
        return "ClienteBono{" + "noches=" + noches + '}';
    }
    
}
