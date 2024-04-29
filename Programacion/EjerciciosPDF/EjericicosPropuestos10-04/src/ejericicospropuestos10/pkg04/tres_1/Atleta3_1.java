/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicospropuestos10.pkg04.tres_1;

import static java.lang.Double.parseDouble;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Atleta3_1 {
    private int identificador;
    private String nombre;
    private double tiempo;
    private static int contador = 0;
    private static String seleccion = "Colombia";
    private static double tiempoEquipo;

    public Atleta3_1(String nombre, double tiempo) {
        contador++;
        identificador = contador;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public void correr400metros(){
        tiempoEquipo = tiempoEquipo + tiempo;
    }
    
    public void imprimir(){
        System.out.println("Identificador del atleta = " + identificador);
        System.out.println("Nombre del atleta = " + nombre);
        System.out.println("Tiempo del atleta = " + tiempo + "segundos");
        System.out.println();
    }
    
    public static void imprimirSeleccion(){
        System.out.println("Seleccion = " + seleccion);
    }
    
    public static void imprimirTiempoEquipo(){
        System.out.println("Tiempo del equipo = "+ tiempoEquipo + " segundos");
    }
    
    public static String leerPalabra(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        String n ="";
        do {
            repetir = false;
            try {
                System.out.println("tiempo");
                n = sc.nextLine();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    
    public static double leerNumero(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        double t =0.0f;
        do {
            repetir = false;
            try {
                System.out.println("tiempo");
                t = parseDouble(sc.nextLine());
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return t;
    }
    
    
    public static void main (String args[]) {       
        String n;
        double t;

        System.out.println("");
        System.out.println("Proporcione el nombre y tiempo del atleta: ");
        //Nombre
        n = leerPalabra();
        //Tiempo
        t = leerNumero();

        Atleta3_1 atleta1 = new Atleta3_1(n,t);
        atleta1.correr400metros();
        
        System.out.println("");
        System.out.println("Proporcione el nombre y tiempo del atleta: ");
        //Nombre
        n = leerPalabra();
        //Tiempo
        t = leerNumero();
        
        Atleta3_1 atleta2 = new Atleta3_1("Anthony Zambrano",9.28);
        atleta1.correr400metros();
        
        System.out.println("");
        System.out.println("Proporcione el nombre y tiempo del atleta: ");
        //Nombre
        n = leerPalabra();
        //Tiempo
        t = leerNumero();
        
        Atleta3_1 atleta3 = new Atleta3_1("Diego Palomeque",9.53);
        atleta1.correr400metros();
        
        System.out.println("");
        System.out.println("Proporcione el nombre y tiempo del atleta: ");
        //Nombre
        n = leerPalabra();
        //Tiempo
        t = leerNumero();
        
        Atleta3_1 atleta4 = new Atleta3_1("Gilmar Herrera",9.29);
        atleta1.correr400metros();
        Atleta3_1.imprimirSeleccion();
        atleta1.imprimir();
        atleta2.imprimir();
        atleta3.imprimir();
        atleta4.imprimir();
        Atleta3_1.imprimirTiempoEquipo();
    }
    
}
