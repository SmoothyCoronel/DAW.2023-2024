/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocompeticiondeportiva;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void datosPrograma(Competicion c){
        Equipo ep1 = new Equipo("123AB", "Equipo de Malaga", "Alberto", "Ramos", "Malaga", "mala@gmail.com", "123456789");
        c.añadirEquipo(ep1);
        
        Jugador j1 = new Jugador("lucia", "del pino", "123A", "1234567L", "luci@gmail.com", "123458777", true);
        Jugador j2 = new Jugador("Samuel", "Fuagras", "124A", "6530123S", "samu@gmail.com", "523768183", true);
        Jugador j3 = new Jugador("Andres", "Alcalaa", "125A", "5629275A", "aal@gmail.com", "6899875461", false);        
        ep1.añadirJugador(j1);
        ep1.añadirJugador(j2);
        ep1.añadirJugador(j3);
        
        Equipo ep2 = new Equipo("124BC", "Equipo de Extremadura", "Jose", "Martin", "Extremadura", "extre@gmail.com", "123456781");
        c.añadirEquipo(ep2);
        
        Jugador j1_1 = new Jugador("Pablo", "Velazquez", "123B", "352785P", "pablo@gmail.com", "123458777", true);
        Jugador j1_2 = new Jugador("Samuel", "Rubio", "124B", "013740670S", "samuRu@gmail.com", "523768183", false);
        Jugador j1_3 = new Jugador("Sandra", "Suma", "125B", "21462483S", "sasu@gmail.com", "6899875461", false);        
        ep2.añadirJugador(j1_1);
        ep2.añadirJugador(j1_2);
        ep2.añadirJugador(j1_3);
        
        Equipo ep3 = new Equipo("125CD", "Equipo de Granada", "Carlos", "Claveles", "Granada", "grana@gmail.com", "123456782");
        c.añadirEquipo(ep3);
        
        Jugador j2_1 = new Jugador("Alvaro", "Medina", "123C", "354785A", "alvarito@gmail.com", "123459977", false);
        ep3.añadirJugador(j2_1);
        
        Equipo ep4 = new Equipo("126DE", "Equipo de Valencia", "MariaJose", "Cantos", "Valencia", "vale@gmail.com", "123456783");
        c.añadirEquipo(ep4);
        
        Equipo ep5 = new Equipo("127EF", "Equipo de Murcia", "Nacho", "Torres", "Murcia", "murci@gmail.com", "123456784");
        c.añadirEquipo(ep5);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Competicion c = null;
        int i = 0;
        int contador = 0;
        
        boolean continuar = true;
        String teclado;
        
        

        while (continuar) {
            System.out.println("\n\n*****************************************************************");
            System.out.println("             MENÚ:\n");
            System.out.println("A. Proporcionar datos de competicion");
            System.out.println("B. Añadir nuevo equipo");
            System.out.println("C. Eliminar equipo existente");
            System.out.println("D. Buscar equipos de una localidad");
            System.out.println("E. Listar todos los equipos");
            System.out.println("F. Dar de alta un nuevo jugador en un equipo");
            System.out.println("G. Eliminar un jugador en un equipo");
            System.out.println("H. Cambiar estado/disponibilidad de un jugador en un equipo");
            System.out.println("Selecciona una opción: ");
            System.out.println("\n*****************************************************************\n");
            teclado = sc.nextLine();

            switch (teclado) {
                case "A":
                    System.out.println("");
                    System.out.println(" --Datos de competicion-- ");
                    //String codigoCompeticion, descripcion, provinciaRealizacion;
                    System.out.println("Codigo de competicion");
                    String codigoC = sc.nextLine();
                    
                    System.out.println("Descripcion de competicion");
                    String descripcionC = sc.nextLine();
                    
                    System.out.println("provincia de realizacion de competicion");
                    String provinciaC = sc.nextLine();
                    
                    c = new Competicion(codigoC, descripcionC, provinciaC);
                    if(i< 1){
                        datosPrograma(c);
                        i++;
                    }
                    contador++;
                    break;
                case "B":
                    System.out.println("");
                    System.out.println("Datos del nuevo equipo");
                    if(c != null){
                        //String codigo, descripcion, nombreResponsable, apellidosResponsable, ciudadOrigen, email, telefono

                        System.out.println("Codigo de equipo");
                        String codigoE = sc.nextLine();

                        System.out.println("Descripcion de equipo");
                        String descripcionE = sc.nextLine();

                        System.out.println("Nombre del responsable del equipo");
                        String nombreRespE = sc.nextLine();

                        System.out.println("Apellidos del responsable del equipo");
                        String apellidosRespE = sc.nextLine();

                        System.out.println("Ciudad de origen del equipo");
                        String ciudadE = sc.nextLine();

                        System.out.println("Email del equipo");
                        String emailE = sc.nextLine();

                        System.out.println("Telefono del equipo");
                        String telefonoE = sc.nextLine();

                        Equipo e = new Equipo(codigoE, descripcionE, nombreRespE, apellidosRespE, ciudadE,emailE, telefonoE);

                        if(c.añadirEquipo(e)){
                            System.out.println("Se ha añadido el equipo correctamente");
                        }else {
                            System.out.println("Algo ha ido mal, puede que no hayas dado datos para el equipo o este ya exista");
                        }
                    }else{
                        System.out.println("Aun no se ha creado una competición");
                    }
                    contador++;
                    break;
                case "C":
                    System.out.println("");
                    System.out.println("Eliminar un equipo existente");
                    System.out.println("Nota: Solo se puede eliminar si no tiene jugadores dentro");
                    if(c != null){
                        System.out.println("Inserte codigo del equipo a eliminar");
                        String codigoE = sc.nextLine();
                        
                        if(c.eliminarEquipo(codigoE)){
                            System.out.println("Se ha eliminado el equipo correctamente");
                        }else {
                            System.out.println("Algo ha ido mal, puede que el equipo buscado no esté en la lista o aún posea jugadores");
                        }
                    }else {
                        System.out.println("Aún no se ha creado una competicion");
                    }
                    contador++;
                    break;
                case "D":
                    System.out.println("");
                    System.out.println("Buscar equipos por una localidad");
                    if(c != null){
                        System.out.println("Inserte ciudad de origen");
                        String ciudadOrigen = sc.nextLine();
                        
                        if(c.buscarEquipo(ciudadOrigen) != null){
                            System.out.println(c.buscarEquipo(ciudadOrigen));
                        }else {
                            System.out.println("Algo ha ido mal, puede que la ciudad de origen escrita no este dentro de nuestra base de datos");
                        }
                    }else {
                        System.out.println("Aún no se ha creado una competicion");
                    }                   
                    break;
                case "E":
                    System.out.println("");
                    System.out.println("Listar todos los equipos");
                    if(c != null){
                        System.out.println("");
                        System.out.println(c.listarEquipos());
                    }else {
                        System.out.println("Aún no se ha creado una competicion");
                    }
                    break;
                case "F":
                    System.out.println("");
                    System.out.println("Dar de alta jugador en equipo");
                    if(c != null){
                        System.out.println("");
                        System.out.println("Dar dni de jugador");
                        String dniJ = sc.nextLine();
                        
                        System.out.println("Dar codigo de Equipo");
                        String codigoE = sc.nextLine();
                        
                        if(c.darAltaJugador(c.existeEquipo(codigoE).existeJugador(dniJ), codigoE)){
                            System.out.println("Se ha añadido un jugador al equipo");
                        }else {
                            System.out.println("Algo ha ido mal, puede que el dni introducido de jugador existe, puede que el codigo de equipo no exista");
                        }
                    }else {
                        System.out.println("Aún no se ha creado una competicion");
                    }
                    break;
                case "G":
                    System.out.println("");
                    System.out.println("Eliminar un jugador de un equipo");
                    if(c != null){
                        System.out.println("");
                        System.out.println("Dar dni de jugador");
                        String dniJ = sc.nextLine();
                        
                        System.out.println("Dar codigo de Equipo");
                        String codigoE = sc.nextLine();
                        
                        if(c.darBajaJugador(codigoE, dniJ)){
                            System.out.println("Se ha eliminado un jugador del equipo");
                        }else{
                            System.out.println("Algo ha ido mal, puede que el dni introducido de jugador no existe, puede que ocurra lo mismo con el codigo de equipo");
                        }
                    }else {
                        System.out.println("Aún no se ha creado una competicion");
                    }
                    contador++;
                    break;
                case "H":
                    String dniJ, codigoE;
                    System.out.println("");
                    System.out.println("Cambiar estado o disponibilidad de un jugador del equipo");
                    if(c != null){
                        System.out.println("");
                        System.out.println("Elige el numero 1 para cambiar disponibilidad a true y 0 para false, si no eliges bien no se contará");
                        int eleccion = Integer.parseInt(sc.nextLine());
                        
                    switch (eleccion) {
                        case 1:
                            System.out.println("Disponibilidad a true");
                            System.out.println("Necesistamos el codigo del equipo y el dni del jugador");
                                System.out.println("");
                                System.out.println("Dar dni de jugador");
                                 dniJ = sc.nextLine();

                                System.out.println("Dar codigo de Equipo");
                                 codigoE = sc.nextLine();
                            if(c.jugadorDisponible(codigoE, dniJ)){
                                System.out.println("Se ha cambiado la disponibilidad correctamente");
                            }else {
                                System.out.println("Algo ha ido mal, quiza debido a los datos pasados por pantalla");
                            }
                            break;
                        case 0:
                            System.out.println("Disponibilidad a false");
                            System.out.println("Necesistamos el codigo del equipo y el dni del jugador");
                                System.out.println("");
                                System.out.println("Dar dni de jugador");
                                 dniJ = sc.nextLine();

                                System.out.println("Dar codigo de Equipo");
                                 codigoE = sc.nextLine();
                            if(c.jugadorNoDisponible(codigoE, dniJ)){
                                System.out.println("Se ha cambiado la disponibilidad correctamente");
                            }else{
                                System.out.println("Algo ha ido mal, quiza debido a los datos pasados por pantalla");
                            }
                            break;
                        default:
                            System.out.println("No has escrito correctamente");
                            break;
                    }
                    }else {
                        System.out.println("Aún no se ha creado una competicion");
                    }
                    contador++;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Pues te saco, escribe bien a la proxima");
                    //Aquí, antes de acabar el switch y el bucle, enviaremos los datos existentes y cambiados a un nuevo archivo llamado "Resguaro de datos"
                    //Crearemos el archivo y pediremos los datos de cada una de las clases por medio de un método para mostrar todos sus datos toString
                    if(contador < 1){
                        continuar = false;
                    }else {
                        //Crear archivo y enviar los datos de competición a este
                        try{
                            File myObj = new File(/*//home//mint//Descargas//*/"filename.txt");
                            if(myObj.createNewFile()){
                                System.out.println("Archivo creado: " + myObj.getName());
                            } else {
                                System.out.println("El archivo ya existe");
                            }
                            try{
                                FileWriter myWriter = new FileWriter(/*//home//mint//Descargas//*/"filename.txt");
                                myWriter.write(c.toString());
                                myWriter.close();
                                System.out.println("Successfully wrote to the file.");
                            } catch (IOException e){
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                            }
                        } catch (IOException e){
                            System.out.println("An error occurred");
                            e.printStackTrace();
                        }
                    }
                    continuar = false;
            }
        } 
    }
}
