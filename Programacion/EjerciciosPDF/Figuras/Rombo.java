/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Rombo {

    /**
     * @param args the command line arguments
     */
    int diagonalMay;
    int diagonalMen;
    int lado;
    
    //Constructor
    public Rombo (int diagonalMay, int diagonalMen, int lado){
        this.diagonalMay = diagonalMay;
        this.diagonalMen = diagonalMen;
        this.lado = lado;
    }
    
    //Resto de metodos
    double calcularArea(){
        return (diagonalMay * diagonalMen)/2;
    }
    
    double calcularPerimetro(){
        return lado * 4;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
