/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosficheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class CambiaLetras {

    /*
    Pida el nombre de un fichero existente en el disco (recordad que hay
    que especificar la ruta relativa o absoluta para que lo encuentre), 
    solicite un par de letras, letraOriginal y letraCambiada y busque y 
    reemplace la letraOriginal por la letraCambiada en el fichero proporcionado.
    */
    
    public static String leerPalabra(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        String n ="";
        do {
            repetir = false;
            try {
                System.out.println("Texto: ");
                n = sc.nextLine();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor insertado no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    
    
    public static void cambiaFichero(String fichero, char letraOriginal, char letraCambiada) throws IOException{
        PrintWriter out = null;
        
        try{
            //Abre el fichero
            out = new PrintWriter(new FileWriter(fichero));            
            //Lee el fichero palabra a palabra
            out.print(out.toString().replace(letraOriginal, letraCambiada));  
            
        }finally {
            if(out != null){
                out.close();
            }
        }        
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ruta;
        char letraA, letraB;
        
        System.out.println("");
        System.out.println("Ruta de fichero de salida a grabar");
        ruta = leerPalabra();
        
        System.out.println("");
        System.out.println("Letra a buscar");
        letraA = sc.next().charAt(0);
        
        System.out.println("");
        System.out.println("Letra a cambiar");
        letraB = sc.next().charAt(0);
        
        cambiaFichero(ruta, letraA, letraB);
    }
    
}
