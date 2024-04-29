/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicospropuestos10.pkg04.tres_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Main3_3 {
    static Scanner sc = new Scanner(System.in);
    
    public static String leerPalabra(){
        boolean repetir;
        String n ="";
        do {
            repetir = false;
            try {
                System.out.println("Palabra o frase");
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
    
    public static int leerNumero(){
        boolean repetir;
        int t = 0;
        do {
            repetir = false;
            try {
                System.out.println("Numero");
                t = Integer.parseInt(sc.nextLine());
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return t;
    }
    
    //Método orden alfabético
    public static String ordenString(List<String> lista){     
        String total = "";
        
        //Ordenamos la lista
        Collections.sort(lista);
        
        for(int i = 0; i < lista.size(); i++){
            if(i != lista.size()-1){
                total += i + ", ";
            }else {
                total += i;
            }
        }
        return total;
    }
    
    public static void conversorInt(int numero){
        
        //Convertir int a float
        float f = (float) numero;
        //Convertir int a long
        long l = (long) numero;
        
        System.out.println("Valor número: " + numero);
        System.out.println("Valor en float: " + f);
        System.out.println("Valor en long: " + l);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         boolean continuar = true;
        String teclado;
        int i1;
        

        while (continuar) {
            System.out.println("\n\n*****************************************************************");
            System.out.println("             MENÚ:\n");
            System.out.println("A. Orden aflabético de array");
            System.out.println("B. Valores minimos y maxims de int, long, float y double");
            System.out.println("C. Convertir int a long y float");
            System.out.println("Selecciona una opción: ");
            System.out.println("\n*****************************************************************\n");
            teclado = sc.nextLine();

            switch (teclado) {
                case "A":
                    List<String> palabra = new ArrayList<>();
                    
                    System.out.println("");
                    System.out.println("Orden alfabético");
                    System.out.println("");
                    System.out.println("¿Cuantas palabras quieres usar?");
                     i1 = leerNumero();
                    int i = 0;
                    
                    while(i < i1){
                        System.out.println("Palabra en string");
                        palabra.add(leerPalabra());
                        i++;
                    }
                    
                    System.out.println(ordenString(palabra));
                    break;
                case "B":
                    System.out.println("");
                    System.out.println("Valores mínimos y máximos");
                    System.out.println("Integer: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
                    System.out.println("Long: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
                    System.out.println("Float: " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
                    System.out.println("Double: " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
                    break;
                case "C":
                    System.out.println("");
                    System.out.println("Mínimos y máximos de valor dado");
                    System.out.println("");
                    i1 = leerNumero();
                    conversorInt(i1);
                    
                    break;
                default: 
                    continuar = false;
            }
        }
    }
    
}
