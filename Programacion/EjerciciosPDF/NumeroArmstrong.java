/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class NumeroArmstrong {

    /*
        Se quiere desarrollar un programa que determine si un número es un nú-
        mero de Amstrong. Un número de Amstrong es aquel que es igual a la suma
        de sus dígitos elevados a la potencia de su número de cifras.
        Por ejemplo, el número 371 es un número que cumple dicha caracte-
        rística ya que tiene tres cifras y:
        371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        double digitos;
        double suma = 0;
        int numero = 371;
        int corte;
        
        String aux = Integer.toString(numero);
        digitos = aux.length();
        
        for (int i = 0; i < digitos; i++){
             corte = Integer.parseInt(aux.substring(i, i+1));
             suma += Math.pow(corte, digitos);
             
        }
        
        
        
        /* Verifica si es un número de Armstrong si la suma obtenida es
        igual al número */
        if (numero == suma) {
            System.out.println(numero + " es un número de Amstrong");
        } else {
            System.out.println(numero + " no es un número de Amstrong");
        }
    }
    
}
