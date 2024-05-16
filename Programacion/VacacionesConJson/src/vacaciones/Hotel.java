/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacaciones;

import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class Hotel {   
    //Atributos
    private String descripcion, nombre, direccionP;
    private int telefono;
    private String email;
    private ArrayList<Cliente> listaClientes;
    
    //Constructor
    public Hotel(String descripcion, String nombre, String direccionP, int telefono, String email) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.direccionP = direccionP;
        this.telefono = telefono;
        this.email = email;
        listaClientes = new ArrayList<>();
    }
    //Resto de métodos
    public boolean existeCliente (Cliente c){
        boolean resultado = false;
        for(int i = 0; i < listaClientes.size() && resultado != true; i++){
            if(listaClientes.get(i).getDni().compareTo(c.getDni()) == 0){
                resultado = true;
            }
        }
        return resultado;
    }
    
    
    public boolean addCliente(Cliente c){
        boolean resultado = false;
        if(!existeCliente(c)){
            listaClientes.add(c);
            resultado = true;
        }
        return resultado;
    }
    
    public void eliminarCliente(String dni){
        boolean isDeleted = false;
        for(int i = 0; i < listaClientes.size() && isDeleted != true; i++){
            if(listaClientes.get(i).getDni().compareTo(dni) == 0){
                listaClientes.remove(i);
                isDeleted = true;
            }
        }
        if(isDeleted){
            System.out.println("El cliente ha sido eliminado");
        }else {
            System.out.println("No se ha encontrado al cliente a eliminar");
        }
        
    }
    
    public boolean crearPromocion(int minimo, int maximo){
        //Crear una promoción para los clientes de edades entre un mínimo
        // y un máximo de edad 
        //La promoción será del 15%
        
        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i) != null){
                if(listaClientes.get(i).getEdad() <= minimo || listaClientes.get(i).getEdad() >= maximo){
                    //Añadir promoción 
                    listaClientes.get(i).setPago((listaClientes.get(i).getPago()- listaClientes.get(i).getPago()*15*0.01f));
                    return true;
                }
            }
        }
        return false;
    }
    
    public String mostrarClientes(){
        String lista = "";
        
        if(listaClientes.isEmpty()){
            lista = "";
        }else {
            for(int i = 0; i < listaClientes.size(); i++){
                lista += listaClientes.get(i) +"\n";
            }
        }
    return lista;    
    }
    
    //Método que no vamos a utilizar por ahora
    public boolean actualizaClienteEmail(String dni, String email){
        boolean isTrue = false;
        
        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i)!= null){
                if(listaClientes.get(i).getDni().equals(dni)){
                    listaClientes.get(i).setEmail(email);
                    isTrue = true;
                }
            }
        }
        return isTrue;
    }
    
    //Getters - setters
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionP() {
        return direccionP;
    }
    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String datosHotel = "Hotel{" + "descripcion=" + descripcion + ", nombre=" + nombre + ", direccionP=" + direccionP + ", telefono=" + telefono + ", email=" + email + ", listaClientes=" + listaClientes + '}';
        String datosClientes = "";
        
        if(!listaClientes.isEmpty()){
            for(int i = 0; i < listaClientes.size(); i++){
               datosClientes += listaClientes.get(i).toString();
            }
        }
        datosHotel += datosClientes;
        return datosHotel;
    }
    
    
    
}
