/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class ConversorMetros {
    //Atributos
    double metros;
    final int FACTOR_METROS_CM = 100;
    final int FACTOR_METROS_MILIM = 1000;
    final double FACTOR_METROS_PULGADAS = 39.37;
    final double FACTOR_METROS_PIES = 3.28;
    final double FACTOR_METROS_YARDAS = 1.09361;
    
    
    //Resto de métodos
    public ConversorMetros(double metros){
        this.metros = metros;
    }
    
    public double convertirMetrosToCentimetros(){
        double centimetros;
        centimetros = FACTOR_METROS_CM * metros;
        return centimetros;
    }
    
    public double convertirMetrosToMilimetros(){
        double pulgadas;
        pulgadas = FACTOR_METROS_PULGADAS * metros;
        return pulgadas;
    }
    
    public double convertirMetrosToPulgadas() {
        double pulgadas;
        pulgadas = FACTOR_METROS_PULGADAS * metros;
        return pulgadas;
    }
    
    public double convertirMetrosToPies(){
        double pies;
        pies = FACTOR_METROS_PIES * metros;
        return pies;
    }
    
    public double convertirMetrosToYardas() {
        double yardas;
        yardas = FACTOR_METROS_YARDAS * metros;
        return yardas;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
            ConversorMetros conversor = new ConversorMetros(3.5);
            System.out.println("Metros = " + conversor.metros);
            System.out.println("Metros a centímetros = " + conversor.convertirMetrosToCentimetros());
            System.out.println("Metros a milímetros = " + conversor.convertirMetrosToMilimetros());
            System.out.println("Metros a pulgadas = " + conversor.convertirMetrosToPulgadas());
            System.out.println("Metros a pies = " + conversor.convertirMetrosToPies());
            System.out.println("Metros a yardas = " + conversor.convertirMetrosToYardas());
    }
    
}
