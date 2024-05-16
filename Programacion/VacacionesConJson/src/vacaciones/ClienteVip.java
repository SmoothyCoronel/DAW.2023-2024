/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacaciones;

/**
 *
 * @author mint
 */
public class ClienteVip extends Cliente{
    //Atributos
    private int descuento; //Porcentaje para las reservas a futuro
    
    //Constructor
    public ClienteVip(String dni, String nombre, String apellidos, String direccion, 
                        String email, int telefono, int edad, String fechaNacimiento,float pago, int descuento){
        super(dni, nombre, apellidos, direccion, email, telefono, edad, fechaNacimiento, pago);
        if(this.descuento >= 0 && this.descuento <= 100){
            this.descuento = descuento;
        }else {
            this.descuento = 1;
        }
    }
    
    //Método
    @Override
    public void añadirDescuento(){
        //miCliente.setPago(miCliente.getPago() * this.getDescuento());
        this.setPago(this.getPago() - (this.getPago() * this.getDescuento()*0.01f));
    }
    
    
    //Getters y setters
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    //Método toString para leer y escribir en archivos
    @Override
    public String toString() {
        return "ClienteVip{" + "descuento=" + descuento + '}';
    }
    
    
}
