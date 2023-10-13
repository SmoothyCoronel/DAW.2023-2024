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
public class NotasFinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int isNum = 0;
        int numNotas = 5;
        int i = 0;
        double nota;
        
        do{
            System.out.println("Escribe cuál ha sido la nota");
            nota = Double.parseDouble(sc.nextLine());
            
            if(nota == 3.0){
                isNum++;
            }
            i++;
        }while(i < 5);
        
        System.out.println("Tenemos la nota 3.0 " + isNum + " veces.");
    }
    
}
