/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregaForEach;

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
        Empresa e1 = new Empresa("Empresa ranchera");
        boolean metodos = true;
        String entrada;
        
        //Menú de empresa
        System.out.println("");
        System.out.println("***                         ***");
        System.out.println("Programa de entrega de paquetes");
        System.out.println("***                         ***");
        System.out.println("");
        System.out.println("Vamos a elegir las diferentes opciones que este programa nos ofrece: ");
        do{
            System.out.println("*******************************************");
            System.out.println("0. Salir");
            System.out.println("1. Añadir un paquete");
            System.out.println("2. Listar los paquetes disponibles");
            System.out.println("3. Añadir un producto a un paquete");
            System.out.println("4. Eliminar un producto a un paquete");
            System.out.println("5. Listar todos los productos de un paquete");
            System.out.println("*******************************************");
            entrada = sc.next();

            switch(entrada){
                case "1":
                    //Método añadir un paquete
                    System.out.println("Para añadir un paquete vamos a suministrar los datos de dicho paquete");
                    //String localizador, String direccionEnvio, String dniCliente, String fechaEnvio, int diasPrevistos
                    System.out.println("De datos de localizador de paquete");
                    String locaPaquete = sc.nextLine();
                    
                    System.out.println("Dirección de envio del paquete");
                    String direcPaquete = sc.nextLine();
                    
                    System.out.println("DNI del cliente");
                    String dniCliPaquete = sc.nextLine();
                    
                    System.out.println("Fecha de envio del paquete");
                    String fechaPaquete = sc.nextLine();
                    
                    System.out.println("Días previstos hasta la entrega");
                    int diasPaquete = Integer.valueOf(sc.nextLine());
                    
                    Paquete contenedor = new Paquete(locaPaquete, direcPaquete, dniCliPaquete, fechaPaquete, diasPaquete);
                    e1.añadePaquete(contenedor);
                    break;
                case "2":
                    //Método para listar todos los paquetes
                    System.out.println("Para listar todos los paquetes deberemos dar un identificador que puede ser 'Vacio' o 'En preparación'");
                    System.out.println("Si se escribe otra  cosa, la lista no mostrará nada");
                    System.out.println("");
                    System.out.println("Añadir identificador");
                    String identiPaquete = sc.nextLine();
                    System.out.println("**                                               **");
                    System.out.println(e1.listaPaquete(identiPaquete));
                    System.out.println("**                                               **");
                    break;
                case "3":
                    //Método para añadir un producto a un paquete
                    System.out.println("Para añadir un producto a un paquete necesitaremos el localizador del paquete para así poder encontrarlo");
                    System.out.println("");
                    System.out.println("Dar localizador de paquete");
                    String localizaPaquete = sc.nextLine();
                    System.out.println("");
                    System.out.println("Tras tener el paquete, suministraremos los datos de producto");
                    //String codigoProducto, String descripcion, int cantidad, float pesoUnidad
                    System.out.println("Añadir codigo de producto");
                    String codigoProducto = sc.nextLine();
                    
                    System.out.println("Añadir descripcion de producto");
                    String descriProducto = sc.nextLine();
                    
                    System.out.println("Añadir cantidad de productos iguales");
                    int cantidadProducto = Integer.valueOf(sc.nextLine());
                    
                    System.out.println("Añadir peso del producto");
                    float pesoProducto = Float.valueOf(sc.nextLine());
                    
                    Producto elementos = new Producto(codigoProducto, descriProducto, cantidadProducto, pesoProducto);
                    
                    if(e1.añadeProductoPaquete(e1.devuelvePaquete(localizaPaquete), elementos)){
                        System.out.println("Se ha añadido el paquete correctamente");
                    }
                    break;
                case "4":
                    //Método para eliminar un producto a un paquete
                    System.out.println("Para eliminar un producto a un paquete necesitaremos el localizador del paquete para así poder encontrarlo");
                    System.out.println("");
                    System.out.println("Dar localizador de paquete");
                    String eliminPaquete = sc.nextLine();
                    System.out.println("Dar localizador de producto");
                    String localizaProducto = sc.nextLine();
                    if(e1.eliminaProductoPaquete(e1.devuelvePaquete(eliminPaquete), e1.devuelvePaquete
                            (eliminPaquete).devuelveProducto(localizaProducto))){
                        System.out.println("Se ha eliminado el paquete correctamente");
                    }
                    break;
                case "5":
                    //Método listar todos los productos de un paquete
                    System.out.println("Para mostrar los productos de un paquete, necesitaremos el identificador del paquete para encontralo");
                    System.out.println("Dar identificador de paquete");
                    String localizaPaqueteProducto = sc.nextLine();
                    System.out.println("**                                                **");
                    System.out.println(e1.listaProductosPaquete(e1.devuelvePaquete(localizaPaqueteProducto)));
                    System.out.println("**                                                **");
                    break;
                default:
                    System.out.println("Hasta la proxima");
                    metodos = false;
            }
        }while(metodos);
    }
    
}
