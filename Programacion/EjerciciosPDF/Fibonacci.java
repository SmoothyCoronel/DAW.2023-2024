/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String opcion = "";
        
        System.out.println("Programa lista números de Fibonacci");
        System.out.println("Presione cualquier teclar para comenzar el programa y 'salir' para acabar el mismo");
        
        while(opcion.compareTo("salir") != 0){
            i++;
            System.out.println(i + "º vuelta");
            opcion = sc.nextLine();
            
            if(opcion.compareTo("salir") != 0){
                Calculo();
            } else {
                break;
            }
            System.out.println("");
        }
    }
    
    private static void Calculo(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num1 = 0;
        int num2 = 1;

        System.out.println("¿Cuantos números vamos a mostrar?");
        int opcion = Integer.parseInt(sc.nextLine());
        
        //Valores principales
        System.out.println("");
        System.out.println("Valores de Fibonacci");
        System.out.print(num1 + ", " + num2 + ", ");
        
        while( i < opcion -1){
            num2 = num1 + num2;
            num1 = num2 - num1;
            if (i == opcion -2){
               System.out.print(num2); 
            } else {
                System.out.print(num2 + ", ");
            }
            
            i++;
        }
    }
}