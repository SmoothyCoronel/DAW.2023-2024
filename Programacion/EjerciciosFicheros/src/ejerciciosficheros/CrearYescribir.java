/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mint
 */
public class CrearYescribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File myObj = new File("//home//mint//Descargas//filename.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File alredy exists");
            }
            try{
                FileWriter myWriter = new FileWriter("//home//mint//Descargas//filename.txt");
                myWriter.write("Files in java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
}
