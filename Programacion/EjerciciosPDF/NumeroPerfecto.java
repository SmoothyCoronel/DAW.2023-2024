/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class NumeroPerfecto {

    /*
    Se quiere desarrollar un programa que determine si un número es un número perfecto. 
    Un número perfecto es aquel que es igual a la suma de sus divisores positivos.
    Por ejemplo, el número 28 es un número perfecto ya que sus divisores son: 1, 2, 4, 7
    y 14, y la suma de estos números es 28
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int numero = 496;
        int i = 1;
        
        do{
            if (numero % i == 0){
                suma = suma + i;
            }
            i++;
        }while(i <= numero/2);
        /* No existen divisores mayores a la mitad del número */
        
        if (suma == numero) {
            System.out.println(numero + " es un número perfecto");
        } else {
            System.out.println(numero + " no es un número perfecto");
        }
    }
    
}
