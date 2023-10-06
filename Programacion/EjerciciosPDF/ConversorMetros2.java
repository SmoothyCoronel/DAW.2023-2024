/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class ConversorMetros2 {
    //Atributos
    double metros2;
    final int metros_Areas = 100;
    final int metros_Hectareas = 10000;
    final int kilometros_metros = 1000000;
    final int fanegas_metros = 64640;
    final double acres_metros = 4046.85;
    
    //Constructor
     public ConversorMetros2(double metros2){
        this.metros2 = metros2;
    }
    
    //Resto de métodos
    public double convertirMetrosAreas(){
        return metros2 * metros_Areas;
    }
    
    public double convertirMetrosHectareas(){
        return metros2 * metros_Hectareas;
    }
    
    public double convertirKilometrosMetros(){
        return metros2 * kilometros_metros;
    }
    
    public double convertirFanegasMetros(){
        return metros2 * fanegas_metros;
    }
    
    public double convertirAcresMetros(){
        return metros2 * acres_metros;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorMetros2 conversor2 = new ConversorMetros2(5.5);
        System.out.println("Acres: " + conversor2.convertirAcresMetros());
        System.out.println("Fanegas: " + conversor2.convertirFanegasMetros());
        System.out.println("Kilometros cuadrados: " + conversor2.convertirKilometrosMetros());
        System.out.println("Areas: " + conversor2.convertirMetrosAreas());
        System.out.println("Hectareas: " + conversor2.convertirMetrosHectareas());
    }
    
}
