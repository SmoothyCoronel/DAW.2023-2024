/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class BuscarNumeroArray {

    /*
        Desarrollar un programa que, dado un número entero, busque dicho número en un array
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {23, 15, 48, 6, 78, 2};
        
        int buscado = 3;
        int posicion = 0;
        boolean comprobar = false;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array[i]);
        }
        
        for (int i = 0; i < array.length; i++) {
            posicion++;
            if (array[i] == buscado){
                comprobar = true;
            }
            
        }
        if (comprobar == true){
            System.out.println("El numero "+ buscado + " se encuentra en la posicion " + posicion);
        } else{
            System.out.print("El numero no se encuentra en el array");
        }
                
    }
    
}
