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
public class CodificadorCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Instruccion de programa
        Lee un texto por consola (texto original)
        Lee un numero por consola (Llave)
        Muestre por pantalla un texto donde cada letra del texto original se haya cambiado
        por una letra del abecedario que ocupe una posición igual a la posición de la letra
        original más el número de posiciones indicadas en el número llave.
        
        Si se llega a la Z, se comenzaría de nuevo por la letra "A". Que está en la posición 1
        */
        Scanner sc = new Scanner(System.in);
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String textoOriginal, textoOriginal1;
        int iLlave, iLlave1;
        
        System.out.println("**************************************************************");
        System.out.println("De una cadena de caracteres para hacer su codificación a cesar");
        textoOriginal = sc.nextLine();
        System.out.println("Y su código, por el cual este va a cambiar");
        iLlave = Integer.valueOf(sc.nextLine());
        System.out.println("");
        System.out.println("Texto original: " + textoOriginal);
        
        String cifrado = codifica(abecedario, textoOriginal, iLlave);
        
        System.out.println("Texto cifrado: " + cifrado);
        
        System.out.println("**************************************************************");
        System.out.println("De una cadena de caracteres para hacer su descodificación de cesar");
        textoOriginal1 = sc.nextLine();
        System.out.println("Y su código, por el cual este va a cambiar");
        iLlave1 = Integer.valueOf(sc.nextLine());
        System.out.println("");
        System.out.println("Texto original: " + textoOriginal1);
        
        String descifrado = descodifica(abecedario, textoOriginal1, iLlave1);
        
        System.out.println("Texto cifrado: " + descifrado);
        
        
        
    }
    public static String codifica(String abecedario, String textoOriginal,int iLlave){
        //Hallar la posición de la letra en el array abecedario
        //Sumarle los puntos de iLlave a esa posición y llamar a 
        //la nueva posición en el array abecedario
        String textoCodificado = "";
        textoOriginal = textoOriginal.toUpperCase();
        
        char caracter;
        for (int i = 0; i < textoOriginal.length(); i++){
            caracter = textoOriginal.charAt(i);
            
            int pos = abecedario.indexOf(caracter);
            
            //En caso de que no nos den letra
            if(pos == -1){
                textoCodificado += caracter;
            }else {
                textoCodificado += abecedario.charAt((pos + iLlave) % abecedario.length());
            }
        }
        
        
        return textoCodificado;
    }
    
    public static String descodifica(String abecedario, String textoOriginal,int iLlave){
        String textoDescodificado = "";
        textoOriginal = textoOriginal.toUpperCase();
        
        char caracter;
        for (int i = 0; i < textoOriginal.length(); i++){
            caracter = textoOriginal.charAt(i);
            
            int pos = abecedario.indexOf(caracter);
            
            //En caso de que no nos den letra
            if(pos == -1){
                textoDescodificado += caracter;
            }else {
                if(pos - iLlave < 0){
                    textoDescodificado += abecedario.charAt(abecedario.length() + (pos - iLlave));
                }else {
                    textoDescodificado += abecedario.charAt((pos - iLlave) % abecedario.length());
                }
            }
        }
        
        
        return textoDescodificado;
    }
    
}
