/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un año es bisiesto si es divisible entre 4 
        int year = 1687;
        boolean bisiesto;
        
        System.out.println("El año elegido: " + year + " es bisiesto?");
        
        if(year % 4 == 0){
            bisiesto = true;
        } else {
            bisiesto = false;
        }
        System.out.println(bisiesto);
    }
    
}
