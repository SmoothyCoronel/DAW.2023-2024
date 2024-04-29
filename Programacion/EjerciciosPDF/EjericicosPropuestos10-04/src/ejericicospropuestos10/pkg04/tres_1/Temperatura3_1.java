/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicospropuestos10.pkg04.tres_1;

/**
 *
 * @author mint
 */
public class Temperatura3_1 {
    //Atributos
    private double gradosFahrenheit;

    //Controlador
    public Temperatura3_1(double gradosFahrenheit) {
        this.gradosFahrenheit = gradosFahrenheit;
    }

    public double getGradosFahrenheit() {
        return gradosFahrenheit;
    }
        
    
    public static double celsiusF(double Celsius){
        double Fahrenheit = 0.0f;
        return Fahrenheit = (Celsius * 9 /5) + 32;
    }
    
    public static double FahrenheitC(double Fahrenheit){
        double celsius = 0.0f;
        return celsius = (Fahrenheit - 32) * 5/9;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Temperatura3_1 t1 = new Temperatura3_1(68);
        Temperatura3_1 t2 = new Temperatura3_1(89.6);
        Temperatura3_1 t3 = new Temperatura3_1(46.4);
        
        System.out.println("");
        System.out.println("Grados Celsius transformados" + FahrenheitC(t1.getGradosFahrenheit()));
        System.out.println("Grados Fahrenheit transformados" + celsiusF(FahrenheitC(t1.getGradosFahrenheit())));

        System.out.println("");
        System.out.println("Grados Celsius transformados" + FahrenheitC(t2.getGradosFahrenheit()));
        System.out.println("Grados Fahrenheit transformados" + celsiusF(FahrenheitC(t2.getGradosFahrenheit())));

        System.out.println("");
        System.out.println("Grados Celsius transformados" + FahrenheitC(t3.getGradosFahrenheit()));
        System.out.println("Grados Fahrenheit transformados" + celsiusF(FahrenheitC(t3.getGradosFahrenheit())));

    }
    
}
