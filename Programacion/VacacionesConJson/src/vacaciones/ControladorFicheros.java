/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacaciones;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class ControladorFicheros {
    
    public static boolean writeText(String fileName, String data, boolean sobreescribe) {
            //Prueba de grabación en texto
		FileWriter fo = null;
		PrintWriter pw = null;
		boolean resultado = false;
		
                try {
                    if (sobreescribe) { //true
			fo = new FileWriter(fileName); 
                    } else { //False
			fo = new FileWriter(fileName,true); 
                    }
                    //Abrimos el fichero, modo append false
                    pw = new PrintWriter(fo); //Creamos el ayudante	
                    pw.print(data);
                    pw.flush();

                    fo.close();
                    fo = null;
                    resultado = true;

		} catch (IOException e) {
                    System.out.println(e.getMessage());

		} finally {
                    if (fo != null) {
			try {
                            fo.close();
			} catch (IOException ioe) {
                            System.out.println(ioe.getMessage());
			}
                    }
		}
		return resultado;

    

}

	public static String readText(String fileName) {  //Ineficiente
	    // lectura en texto
		String resultado = "";
		FileReader fi = null;
		Scanner sc = null;
		
		try {
                    fi = new FileReader(fileName);
                    sc = new Scanner(fi);
			
                    while (sc.hasNext()) {
                        resultado += sc.nextLine() + "\n";	
                    }
			fi.close();
			fi = null;
	
		} catch (IOException e) {
                    System.out.println(e.getMessage());
		} finally {
                    if (fi != null) {
			try {
                            fi.close();
			} catch (IOException ioe) {
                            System.out.println(ioe.getMessage());
			}
                    }
		}
		return resultado;
	
	}
}
