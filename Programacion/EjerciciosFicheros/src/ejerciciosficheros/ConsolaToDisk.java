/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class ConsolaToDisk {

    /*
    Clase consola to disk que pida por consola la ruta completa del fichero de salida a grabar;
    Si el nombre de fichero se deja en blanco, se cierra el programa mostrando un mensaje.
    A continuación, que empiece a solicitar lineas de texto por teclado, y las vaya grabando en el
    fichero de salida, hasta que reciba una línea en blanco, momento en que se cerrará el fichero y 
    finalizará el programa. Realizar un método main en esa misma clase o en otra para probar el 
    funcionamiento.
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
    
    public static void escribeFichero(String ruta, ArrayList<String> texto) {
        PrintWriter out = null;
        try {
            //Abrir el fichero
            out = new PrintWriter(new FileWriter(ruta, true));
            //Escribe los datos en el fichero
            for(int i = 0; i < texto.size(); i++){
                out.println(texto.get(i));
            }
        } catch (IOException e){
            System.out.println("Algo salió mal");
            
        }finally {
            if(out != null){
                out.close();
            }
        }
    }
    
    public static void main(String[] args){
        // TODO code application logic here
        String texto, ruta;
        boolean dentro = true;
        ArrayList <String> textoTotal = new ArrayList<>();
        int i = 0;
        
        System.out.println("");
        System.out.println("Ruta de fichero de salida a grabar");
        ruta = leerPalabra()+".txt";
        
        //Tomar todo el texto para el archivo y cerrar 
        while(dentro == true){
            System.out.println("");
            System.out.println("Texto a meter en fichero (Escribe 'salir' para acabar de escribir");
            texto = leerPalabra();
            if(texto.equals("salir")){
                dentro = false;
            }else{
                i++;
                textoTotal.add(texto);
            }
        }
        
        escribeFichero(ruta, textoTotal);
        
    }
    
}
