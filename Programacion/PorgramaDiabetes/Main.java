/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diabetes;

import java.util.Scanner;

public class Main {
   
    /*
    //Atributos
    int hipoCons;
    int hipoIncons;
    int hiper;
    
    //Constructor
    public Main(int hipoCons, int hipoIncons, int hiper){
        this.hipoCons = 0;
        this.hipoIncons = 0;
        this.hiper = 0;
    }
    */
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        int i = 0;
        
        System.out.println("Programa calculo diabetes");
        System.out.println("Presione cualquier teclar para comenzar el programa y 'salir' para acabar el mismo");
        
        while(opcion.compareTo("salir") != 0){
            i++;
            System.out.println(i + "º vuelta");
            opcion = sc.nextLine();
            if(opcion.compareTo("salir") != 0){
                glucemia();
            } else {
                break;
            }
            
            System.out.println("");
        }
    }
    
    private static void glucemia(){ 
        Scanner sc = new Scanner(System.in);
        int numGlucemia;
        String opcion = "";
        
        //Preguntamos su numero de glucemia
        System.out.println("¿Cual es su nivel de mg/dl de glucemia?");
         numGlucemia = Integer.parseInt(sc.nextLine());
        
        if(numGlucemia < 70){
            System.out.println("Hipoglucemia");
            
            //Preguntar si se encuentra consciente o inconsciente
            System.out.println("¿El paciente se encuentra 'consciente' o 'inconsciente'?");
            opcion = sc.nextLine();
            
            if (opcion.compareTo("consciente") == 0){
                System.out.println("Dar líquidos azucarados de absorción rápida (Zumos, glucosport, azucar...");
                System.out.println("Repetir glucemina 5-10 min después");
                System.out.println("Dar hidratos de carbono de absorción rápida (galletas, bocadillos...)");
                
            } else if (opcion.compareTo("inconsciente") == 0){
                System.out.println("No dar nada por boca");
                System.out.println("Administrar glucagón. Avisar a familia y a emergencias");
            } else {
                System.out.println("No ha escrito ninguna de las dos opciones, vuelva a intentarlo");
            }
            
        } else if (numGlucemia > 180){
            System.out.println("Hiperglucemia");
            System.out.println("Administrar agua y avisar a su familia");
            
        } else {
            System.out.println("Normal 70-110 mg/dl");
        }
    }
    
}
