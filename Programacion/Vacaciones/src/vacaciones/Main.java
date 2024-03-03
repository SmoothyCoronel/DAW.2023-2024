/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vacaciones;

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
        Hotel h1 = new Hotel("Hotel casa bermeja", "Fuente Nueva", "calle callado", 
                1233245, "fuenteNueva@@");
        boolean metodos = true;
        String entrada;
        
        System.out.println("");
        System.out.println("*******************************************************************");
        System.out.println(" Programa vacaciones en la costa del sol - hotel ");
        System.out.println("");
        System.out.println("Vamos a elegir las diferentes opciones que este programa nos ofrece");
        System.out.println("");
        do{
            System.out.println("Elegir entre:");
            System.out.println("0. Salir");
            System.out.println("1. Mostrar clientes por pantalla");
            System.out.println("2. Crear nuevo cliente");
            System.out.println("3. Eliminar cliente existente");
            System.out.println("4. Crear promoción para los clientes ");
            entrada = sc.next();
            
            switch(entrada) {
                case "1":
                    //Mostrar lista con todos los clientes
                    if(h1.mostrarClientes() == null){
                        System.out.println("Aún no se ha añadido ningún cliente");
                    }else{
                        System.out.println(h1.mostrarClientes());
                    }
                    break;
                case "2":
                    //Crear nunevo cliente
                    System.out.println("");
                    System.out.println("Suministrar datos de cliente");
                    System.out.println("****************************");
                    //dni, nombre, apellidos, direccion, email, telefono, edad, fechaNacimiento
                    System.out.println("DNI de cliente");
                    String cDNI = sc.nextLine();
                    
                    System.out.println("Nombre de cliente");
                    String cNombre = sc.nextLine();
                    
                    System.out.println("Apellidos de cliente");
                    String cApellidos = sc.nextLine();
                    
                    System.out.println("Direccion de cliente");
                    String cDireccion = sc.nextLine();
                    
                    System.out.println("Email de cliente");
                    String cEmail = sc.nextLine();

                    System.out.println("Telefono de cliente");
                    int cTelefono = Integer.valueOf(sc.nextLine());
                    
                    System.out.println("Edad de cliente");
                    int cEdad = Integer.valueOf(sc.nextLine());
                    
                    System.out.println("Nacimiento de cliente");
                    String cNacimiento = sc.nextLine();
                    
                    System.out.println("Cliente oficial '0', cliente vip '1', cliente normal 'otra tecla' ");
                    int cCliente = Integer.valueOf(sc.nextLine());
                    
                    
                    switch (cCliente) {
                        case 0:
                            {
                                ClienteBono nuevoBono = new ClienteBono(cDNI, cNombre, cApellidos, cDireccion,
                                        cEmail, cTelefono, cEdad, cNacimiento, 5);
                                
                                if(h1.existeCliente(nuevoBono)){
                                    nuevoBono.pernocta( true);
                                }else{
                                    h1.addCliente(nuevoBono);
                                    nuevoBono.pernocta( h1.addCliente(nuevoBono));
                                }
                                break;
                            }
                        case 1:
                            {
                                ClienteVip nuevoVip = new ClienteVip(cDNI, cNombre, cApellidos, cDireccion,
                                        cEmail, cTelefono, cEdad, cNacimiento,90, 25);
                                h1.addCliente(nuevoVip);
                                nuevoVip.añadirDescuento();
                                break;
                            }
                        default:
                            {
                                Cliente nuevoCliente = new Cliente(cDNI, cNombre, cApellidos, cDireccion,
                                        cEmail, cTelefono, cEdad, cNacimiento, 90);
                                h1.addCliente(nuevoCliente);
                                break;
                            }
                    }
                    
                    break;

                case "3":
                    //Eliminar cliente existente
                    System.out.println("");
                    System.out.println("De DNI como indice para eliminar cliente");
                    System.out.println("****************************************");
                    String dniElimina = sc.nextLine();
                    
                    h1.eliminarCliente(dniElimina);
                    
                    break;
                case "4":
                    //Añadir promociones a clientes
                    System.out.println("");
                    System.out.println("De un mínimo y máximo de edad para la promoción");
                    System.out.println("***********************************************");
                    System.out.println("Minimo de edad");
                    int minimo = Integer.valueOf(sc.nextLine());
                    
                    System.out.println("Máximo de edad");
                    int maximo = Integer.valueOf(sc.nextLine());
                    
                    h1.crearPromocion(minimo, maximo);
                    
                    if(h1.crearPromocion(minimo, maximo) == true){
                        System.out.println("Se ha creado la promoción correctamente");
                    }else {
                        System.out.println("No hay usuarios en nuestra base de datos con");
                        System.out.println("esos mínimos o máximos de edad");
                    }
                    break;
                default: 
                    System.out.println("Adios");
                    metodos = false;
            }
            
        }while(metodos);
    }
    
}
