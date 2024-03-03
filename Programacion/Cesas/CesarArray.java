/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cesas;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class CesarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char abecedario[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'
                            ,'Z'};
        String textoOriginal;
        int iLlave;
        
        System.out.println("**************************************************************");
        System.out.println("De una cadena de caracteres para hacer su codificación a cesar");
        textoOriginal = sc.next();
        System.out.println("Y su código, por el cual este va a cambiar");
        iLlave = Integer.valueOf(sc.next());
        System.out.println("");
        System.out.println("Texto original: " + textoOriginal);
        
        String cifrado = codificador(abecedario, textoOriginal, iLlave);
        
        System.out.println("Texto cifrado: " + cifrado);
        
        System.out.println("**************************************************************");
        System.out.println("De una cadena de caracteres para hacer su descodificación de cesar");
        textoOriginal = sc.next();
        System.out.println("Y su código, por el cual este va a cambiar");
        iLlave = Integer.valueOf(sc.next());
        System.out.println("");
        System.out.println("Texto original: " + textoOriginal);
        
        String descifrado = descodificador(abecedario, textoOriginal, iLlave);
        
        System.out.println("Texto cifrado: " + descifrado);
        
    }
    public static String codificador(char abecedario[], String textoOriginal, int iLlave){
        String textoEditado = "";
        textoOriginal = textoOriginal.toUpperCase();
        
        char caracter;  
        int posicion;
        
        for(int i = 0; i < textoOriginal.length(); i++){
            //Para dividir la palabra cada vez
            caracter = textoOriginal.charAt(i);
            posicion = 0;
            
            for(int j = 0; j < abecedario.length; j++){
                
                if(abecedario[j] == caracter){
                    if(posicion + iLlave > abecedario.length){
                        if(iLlave - (abecedario.length - posicion) < 0){
                            textoEditado += abecedario[(abecedario.length - posicion)- iLlave];
                        }else {
                            textoEditado += abecedario[iLlave -(abecedario.length - posicion)];
                        }
                    }else {
                        textoEditado += abecedario[posicion + iLlave];
                    }
                }
                posicion++;
            }
        }
        
        
        return textoEditado;
    }
    public static String descodificador(char abecedario[], String textoOriginal, int iLlave){
        String textoEditado = "";
        textoOriginal = textoOriginal.toUpperCase();
        
        char caracter;
        int posicion;
        for(int i = 0; i < textoOriginal.length(); i++){
            //Para dividir la palabra cada vez
            caracter = textoOriginal.charAt(i);
            posicion = 0;
            
            for(int j = 0; j < abecedario.length; j++){
                
                if(abecedario[j] == caracter){
                    if(posicion - iLlave < 0){
                        textoEditado += abecedario[abecedario.length - (iLlave - posicion)];
                    }else {
                        textoEditado += abecedario[posicion - iLlave];
                    }
                    
                }
                posicion++;
            }
        } 
        return textoEditado;
    }
}
