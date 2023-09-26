/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Persona1 {

    /*
    Agregar dos nuevos atributos a la clase Persona. Un atributo que
    represente el país de nacimiento de la persona (de tipo String) y
    otro que identifique el género de la persona, el cual debe represen-
    tarse como un char con valores 'H' o 'M'.
    
    Modificar el constructor de la clase Persona para que inicialice es-
    tos dos nuevos atributos.
    Modificar el método imprimir de la clase Persona para que mues-
    tre en pantalla los valores de los nuevos atributos.
     */
    String nombre;
    String apellido;
    int documIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;
    
    Persona1(String nombre, String apellido, int documIdentidad, int añoNacimiento, String paisNacimiento, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documIdentidad = documIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        
        if (genero == 'H' || genero == 'M'){
            this.genero = genero;
        }
    }
    
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Documento de Identidad: " + documIdentidad);
        System.out.println("Año nacimiento: " + añoNacimiento);
        System.out.println("Pais de nacimiento: " + paisNacimiento);
        System.out.println("Genero: "+ genero);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona1 p1 = new Persona1("Carla", "Cruz Jurado", 213231, 12012003, "España", 'M');
        Persona1 p2 = new Persona1("Juan", "Jose Jaime", 103879, 23012004, "España", 'H');
        p1.imprimir();
        p2.imprimir();
    }
    
}
