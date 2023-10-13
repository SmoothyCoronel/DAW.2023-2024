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
public class Divisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int end;
        
        System.out.println("De un número de divisiones");
        end = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        while(i < end){
            System.out.println(1 + "/" + i);
            i++;
        }
    }
    
}
