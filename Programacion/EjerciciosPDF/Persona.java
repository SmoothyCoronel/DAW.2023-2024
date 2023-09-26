/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Persona {

    /*
    Se requiere un programa que modele el concepto de una persona. Una per-
    sona posee nombre, apellido, número de documento de identidad y año de
    nacimiento. La clase debe tener un constructor que inicialice los valores de sus
    respectivos atributos.
    
    La clase debe incluir los siguientes métodos:
     Definir un método que imprima en pantalla los valores de los atri-
     butos del objeto.
     En un método main se deben crear dos personas y mostrar los va-
     lores de sus atributos en pantalla.
     */
    
    String nombre;
    String apellido;
    int documIdentidad;
    int añoNacimiento;
    
    Persona(String nombre, String apellido, int documIdentidad, int añoNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documIdentidad = documIdentidad;
        this.añoNacimiento = añoNacimiento;
    }
    
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Documento de Identidad: " + documIdentidad);
        System.out.println("Año nacimiento: " + añoNacimiento);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Carla", "Cruz Jurado", 213231, 12012003);
        Persona p2 = new Persona("Juan", "Jose Jaime", 103879, 23012004);
        p1.imprimir();
        p2.imprimir();
    }
    
}
