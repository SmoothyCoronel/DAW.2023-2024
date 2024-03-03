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
public class CesarArray2 {

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
        System.out.println("Y su código, por el cual este va a cambiar (+) codificar, (-) descodificar");
        iLlave = Integer.valueOf(sc.next());
        System.out.println("");
        System.out.println("Texto original: " + textoOriginal);
        
        String cifrado = codificaDescodifica(abecedario, textoOriginal, iLlave);
        
        System.out.println("Texto cifrado: " + cifrado);
    }
    
    public static String codificaDescodifica(char abecedario[], String textoOriginal, int iLlave){
        textoOriginal = textoOriginal.toUpperCase();
        String textoFinal = "";
        char caracter;  
        int posicion;
        
        //Si iLlave es positivo codifica y si es negativo descodifica
        if(iLlave < 0){
            textoFinal = "";
            //Descodifica
            for(int i = 0; i < textoOriginal.length(); i++){
            //Para dividir la palabra cada vez
            caracter = textoOriginal.charAt(i);
            posicion = 0;
            
                for(int j = 0; j < abecedario.length; j++){

                    if(abecedario[j] == caracter){
                        if(posicion + iLlave > abecedario.length){
                            if(iLlave - (abecedario.length - posicion) < 0){
                                textoFinal += abecedario[(abecedario.length - posicion)- iLlave];
                            }else {
                                textoFinal += abecedario[iLlave -(abecedario.length - posicion)];
                            }
                        }else {
                            textoFinal += abecedario[posicion + iLlave];
                        }
                    }
                    posicion++;
                }
            }
            return textoFinal;
            
        }else {
            textoFinal = "";
            //Codifica
            for(int i = 0; i < textoOriginal.length(); i++){
            //Para dividir la palabra cada vez
            caracter = textoOriginal.charAt(i);
            posicion = 0;
                
                for(int j = 0; j < abecedario.length; j++){

                    if(abecedario[j] == caracter){
                        if(posicion + iLlave < 0){
                            textoFinal += abecedario[abecedario.length + (posicion + iLlave)];
                        }else {
                            textoFinal += abecedario[posicion + iLlave];
                        }

                    }
                    posicion++;
                }
            } 
            return textoFinal;
        }
        
    }   
}
