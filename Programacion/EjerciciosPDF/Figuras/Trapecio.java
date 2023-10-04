/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Trapecio {

    /**
     * @param args the command line arguments
     */
    int baseA, baseB, altura;
    int ladoA, ladoB;
    
    //Constructor
    public Trapecio(int baseA, int baseB, int ladoA, int ladoB, int altura){
       this.baseA = baseA;
       this.baseB = baseB;
       this.ladoA = ladoA;
       this.ladoB = ladoB;
       this.altura = altura;
    }
    
    //Resto de métodos
    public double calcularArea(){
        return (baseA + baseB)*altura/2;
    }
    
    public double calcularPerimetro(){
        return baseA + baseB + ladoA + ladoB;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
