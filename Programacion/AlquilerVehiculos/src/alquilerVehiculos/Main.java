/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilerVehiculos;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        EmpresaVehiculos e1 = new EmpresaVehiculos();
        boolean metodos = true;
        String entrada;
        
        //Menu de  empresa
        System.out.println("");
        System.out.println("***                         ***");
        System.out.println("Programa de alquiler de vehiculos");
        System.out.println("***                         ***");
        System.out.println("");
        System.out.println("Vamos a elegir las diferentes opciones que este programa nos ofrece: ");
        do{
            System.out.println("*******************************************");
            System.out.println("0. Salir");
            System.out.println("1. Dar de alta vehiculo");
            System.out.println("2. Dar de alta cliente");
            System.out.println("3. Alquilar un vehiculo para un cliente determinado");
            System.out.println("4. Mostrar lista de coches especificos");
            System.out.println("5. Mostrar lista de furgones especificos");
            System.out.println("6. Mostrar lista de camiones especificos");
            System.out.println("7. Devolver vehiculo y  mostrar precio a cobrar");
            System.out.println("*******************************************");
            entrada = sc.next();
            
            switch(entrada){
                case "1":
                    //Dar de alta vehiculo
                    System.out.println("");
                    System.out.println("Datos genéricos de cada vehiculo: ");
                    //String matricula, String modelo, String marca, String tipoMotor, int kilometrosRecorridos, int precioDia
                    System.out.println("");
                    System.out.println("Matricula de vehiculo");
                    String matricula = sc.next();
                    System.out.println("Modelo de vehiculo");
                    String modelo = sc.next();
                    System.out.println("Marca de vehiculo");
                    String tipoMotor = sc.next();
                    System.out.println("Kilometros recorridos");
                    int kilometros = sc.next();
                    
                    System.out.println("");
                    System.out.println("Elegir vehiculo: (1) Coche (2) Camión (3) Furgón");
                    String opcion = sc.next();
                    switch(opcion){
                        case "1": 
                            
                            break;
                        case "2":
                            
                            break;
                        case "3":
                            
                            break;
                        default:
                            System.out.println("No has elegido uno de los vehiculos posibles");
                    }
                    
                    
                    
                    
                    
                    break;
                case "2":
                    //Dar de alta cliente
                    break;
                case "3":
                    //Alquilar un vehiculo para un cliente determinado
                    break;
                case "4":
                    //Mostrar lista de coches especificos
                    break;
                case "5":
                    //Mostrar lista de furgones especificos
                    break;
                case "6":
                    //Mostrar lista de camiones especificos
                    break;
                case "7":
                    //Devolver vehiculo y  mostrar precio a cobrar
                    break;
                default:
                    System.out.println("Hasta la proxima");
                    metodos = false;
            }
        }while(metodos);
    
    }
}
