/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class NumerosAmigos {

    /*
        Se quiere desarrollar un programa que determine si dos números son ami-
        gos. Dos números enteros positivos se consideran amigos si la suma de los
        divisores de uno es igual al otro número y viceversa.
        Por ejemplo, los números 220 y 284 son amigos. Los divisores del número 
        220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y suman 284. Los divi-
        sores de 284 son: 1, 2, 4, 71 y 142, que suman 220.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0; // Variable que sumará los divisiores de un número
        int numero1 = 220; // Definición del primer número
        int numero2 = 284; // Definición del segundo número
        
        for(int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                suma = suma + i;
            }
        }
        
        if (suma == numero2) {
        suma = 0;
        // Suma los divisores del número 2
            for(int i = 1; i < numero2; i++) {
                if (numero2 % i == 0){
                    suma= suma + i;
                }
            }
        }
        
        if (suma == numero1) {
            System.out.println(numero1 + " y " + numero2 + " son amigos");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son amigos");
        }
    }
    
}
