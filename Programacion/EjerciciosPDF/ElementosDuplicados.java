/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class ElementosDuplicados {

    /*
    Se desea desarrollar un programa que, dado un array de números enteros,
    determine cuáles son sus elementos que se encuentran duplicados.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1, 2, 3, 3, 4, 4, 5, 2}; 
        /* Definición de un array de datos int */
        System.out.println("Elementos del array");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array[i]);
        }
        
        for (int i = 0; i < array.length -1 ; i++) { 
            /* Primer ciclo que recorre el array */
            for (int j = i +1; j < array.length; j++) { 
                /* Segundo ciclo que recorre el array */

                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Elemento duplicado: " + array[j]);
                }
            }
        }
    }
    
}
