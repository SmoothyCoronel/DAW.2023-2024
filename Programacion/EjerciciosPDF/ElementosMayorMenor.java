/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class ElementosMayorMenor {

    /*
    Desarrollar un programa que determine el elemento mayor y menor de un array de enteros.
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] array = {1, 2, 3, 3, 4, 4, 5, 2}; 
        /* Definición de un array de datos int */
        int menor = array[0];
        int mayor = array[0];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array[i]);
        }
        /*Array mostrado por pantalla*/
        
        for (int i = 0; i < array.length; i++){
            if (array[i] > mayor){
                mayor = array[i];
            }
            if (array[i] < menor){
                menor = array[i];
            }
        }
        
        System.out.println("El numero mayor en el array es: "+ mayor);
        System.out.println("El numero menor en el array es: "+ menor);
    }
    
}
