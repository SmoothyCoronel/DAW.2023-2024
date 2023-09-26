/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class ElementosComunesArray {

    /*
    Desarrollar un programa que busque elementos comunes en dos arrays de enteros
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {23, 15, 48, 6, 78, 2, 4};
        int array2[] = {3, 15, 71, 6, 10, 4};
        
        System.out.println("Los numeros repetidos en los arrays: ");
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array[i] == array2[j]){
                    System.out.println("["+array[i]+"]");
                }
            }
        }
        
    }
    
}
