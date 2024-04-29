package ejericicospropuestos10.pkg04.tres_1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mint
 */
public class Main3_2 {
    static Scanner sc = new Scanner(System.in);
    
    //Métodos para comparaciones pasadas por pantalla
    public static String leerPalabra(){
        boolean repetir;
        String n ="";
        do {
            repetir = false;
            try {
                System.out.println("Palabra o frase");
                n = sc.nextLine();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    
    public static char leerLetra(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        char n ='0';
        do {
            repetir = false;
            try {
                System.out.println("Letra");
                n = sc.nextLine().charAt(0);
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    
    //Metodos de las opciones
    public static List<String> convertirAList(String palabra){
        List<String> lista = new ArrayList<>();
        
        char[] caracteres = palabra.toCharArray();
        for(char c: caracteres) {
            lista.add(String.valueOf(c));
        }
        return lista;
    }
    
    public static int letraEnString(String palabra, char letra){
        int cantidad = 0;
        List<String> lista = convertirAList(palabra);
        
        for(String s: lista){
            if(s.equals(String.valueOf(letra))){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public static String eliminarEspacios(String palabra){
        String resultado = palabra.replaceAll(" ", "");
        return resultado;
    }
    
    public static String revertirString(String palabra){
        String reverse = "";
        
        for(int i = palabra.length() -1; i >= 0; i--){
            reverse = reverse + palabra.charAt(i);
        }
        return reverse;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         boolean continuar = true;
        String teclado;
        String s1, s2;
        char c1;
        

        while (continuar) {
            System.out.println("\n\n*****************************************************************");
            System.out.println("             MENÚ:\n");
            System.out.println("A. Numero de mayusculas");
            System.out.println("B. Repetición de letra en palabra");
            System.out.println("C. Eliminar espacios en blanco");
            System.out.println("D. String escrito al reves");
            System.out.println("Selecciona una opción: ");
            System.out.println("\n*****************************************************************\n");
            teclado = sc.nextLine();

            switch (teclado) {
                case "A":
                    int mayusculas = 0;

                    System.out.println("");
                    System.out.println("De una frase o palabra para saber sus mayusculas");
                    s1 = leerPalabra();

                    //Eliminar espacios en blanco a comienzo y final
                    String sinEspaciosPedido = eliminarEspacios(s1);

                    //Convertir en lista para recorrer la palabra
                    List<String> lista = convertirAList(sinEspaciosPedido);

                    for(String c: lista){
                        if(c.equals(c.toUpperCase())){
                            mayusculas++;
                        }
                    }

                    System.out.println("Mayusculas escritas: " + mayusculas);
                
                    break;
                case "B":
                    int total;

                    System.out.println("");
                    System.out.println("Programa para averiguar la repeticion de letras en una palabra");
                    s1 = leerPalabra();
                    System.out.println("Ingrese letra");
                    c1 = leerLetra();

                    System.out.println("Calculando..");
                    total = letraEnString(s1, c1);
                    System.out.println("Se ha encontrado la palabra " + total + " veces");

                    break;
                case "C":       
                    System.out.println("");
                    System.out.println("Programa para eliminar espacios de frases");
                    s1 = leerPalabra();
                    System.out.println("Resultado: ");
                    s2 = eliminarEspacios(s1);
                    System.out.println(s2);
                    
                    break;
                case "D":
                    System.out.println("");
                    System.out.println("Programa para dar la vuelta a palabra o frase");
                    s1 = leerPalabra();
                    System.out.println("Resultado: ");
                    s2 = revertirString(s1);
                    System.out.println(s2);
                    
                    break;
                default:
                    continuar = false;
            }
        }
    }
    
}
