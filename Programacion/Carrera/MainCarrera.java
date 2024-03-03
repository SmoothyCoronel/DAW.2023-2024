/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examenes.Carrera;

import Examenes.Carrera.Carrera;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class MainCarrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean metodos = true;
        String entrada;
        
        Carrera c1 = new Carrera(00000, "","");
        
        
        System.out.println("");
        System.out.println("CARRERAS URBANAS");
        System.out.println("Sistema de control de participantes: ");
        do{
            System.out.println("a. Resetear/Crear carrera");
            System.out.println("b. Inscribir participante");
            System.out.println("c. Buscar participante");
            System.out.println("d. Borrar participante");
            System.out.println("e. (o cualquier otra tecla) Salir");
            entrada = sc.next();
            
            switch(entrada){
                case "a":
                    //Crear nueva carrera
                    System.out.println("");
                    System.out.println("Cambiar/añadir datos de carrera");
                    System.out.println("*********************************");
                    System.out.println("Código de la carrera");
                    int codigo = Integer.valueOf(sc.next());
                    
                    c1.setCodigo(codigo);
                    
                    System.out.println("Descripcion de la carrera");
                    String descripcion = sc.next();
                    
                    c1.setDescripcion(descripcion);
                    
                    System.out.println("Fecha de realización '00/00/0000'");
                    String fechaRealizacion = sc.next();
                    
                    c1.setFechaRealizacion(fechaRealizacion);
                    break;
                case "b":
                    //Crear nunevo participante
                    System.out.println("");
                    System.out.println("Suministrar datos de participante");
                    System.out.println("*********************************");
                    //pDni, pNombre, pApellidos, pFNacimiento, pEmail, pTelefono
                    System.out.println("DNI de paciente");
                    String pDNI = sc.next();
                    
                    System.out.println("Nombre de paciente");
                    String pNombre = sc.next();
                    
                    System.out.println("Apellidos de paciente");
                    String pApellidos = sc.next();
                    
                    System.out.println("Fecha de nacimiento de paciente");
                    String pFNacimiento = sc.next();
                    
                    System.out.println("Email de paciente");
                    String pEmail = sc.next();
                    
                    System.out.println("Telefono de paciente");
                    int pTelefono = Integer.valueOf(sc.nextLine());
                    
                    Participante nuevoParticipante = new Participante(pDNI, pNombre, pApellidos, pFNacimiento, pEmail, pTelefono);
                    
                    c1.inscribirParticipante(nuevoParticipante);
                    
                    if(c1.inscribirParticipante(nuevoParticipante) == true){
                        System.out.println("Operación realizada correctamente");
                    }else{
                        System.out.println("La carrera está llena");
                    }
                    break;
                case "c":
                    System.out.println("");
                    System.out.println("De DNI para buscar al participante en la carrera");
                    String DNIbuscado = sc.next();
                    System.out.println("Buscando...");
                    
                    if(c1.buscarParticipante(DNIbuscado) == true){
                        System.out.println("Se ha encontrado al participante");
                    }else {
                        System.out.println("No hemos encontrado al participante");
                    }
                    break;
                case "d":
                    System.out.println("");
                    System.out.println("De DNI como indice para eliminar participante");
                    String dniElimina = sc.next();
                    
                    if(c1.borrarParticipante(dniElimina) == true){
                        System.out.println("El participante ha sido eliminado correctamente");
                    }else {
                        System.out.println("El DNI introducido no existe en la base de datos");
                    }
                    break;
                default:
                    metodos = false;
            }
        }while(metodos);
        
        
    }
    
}
