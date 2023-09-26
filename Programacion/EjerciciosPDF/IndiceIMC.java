/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class IndiceIMC {

    /*
     Se desea desarrollar un programa que calcule el índice de masa corporal de
     una persona. Para ello, se requiere definir el peso de la persona (en kilogra-
     mos) y su estatura (en metros).
    
     Luego, a partir del IMC obtenido se pueden calcular si una persona tiene
     un peso normal, inferior o superior al normal u obesidad.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int peso = 80;
        double estatura = 1.72;
        double indice = peso / Math.pow(estatura, 2);
        
        System.out.println("Teniendo un peso de " + peso + ". Y una estatura de " 
                            + estatura + " la persona tiene: ");
        
        if (indice < 16) {
          System.out.println(" delgadez severa.");
          
        } else if (indice < 17 || indice == 16){
            System.out.println("delgadez moderada.");
            
        } else if (indice == 17 || indice < 18.5){
            System.out.println("delgadez leve");
            
        } else if (indice == 18.5 || indice < 25){
            System.out.println("peso normal");
            
        } else if (indice == 25 || indice < 30){
            System.out.println("Sobrepeso");
            
        } else if (indice == 30 || indice < 35){
            System.out.println("Obesidad leve");
            
        } else if (indice == 35 || indice < 40){
            System.out.println("Obesidad media");
            
        }else {
            System.out.println("Obesidad morbida");
        }
        
    }
    
}
