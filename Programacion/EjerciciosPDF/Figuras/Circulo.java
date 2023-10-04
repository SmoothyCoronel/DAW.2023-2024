/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Circulo {

    /*
    Se requiere un programa que modele varias figuras geométricas: el círculo,
    el rectángulo, el cuadrado y el triángulo rectángulo.
     El círculo tiene como atributo su radio en centímetros.
     El rectángulo, su base y altura en centímetros.
     El cuadrado, la longitud de sus lados en centímetros.
     El triángulo, su base y altura en centímetros.
    
    Se requieren métodos para determinar el área y el perímetro de cada
    figura geométrica. Además, para el triángulo rectángulo se requiere:
     Un método que calcule la hipotenusa del rectángulo.
     Un método para determinar qué tipo de triángulo es:
    
    Equilátero: todos sus lados son iguales.
    Isósceles: tiene dos lados iguales.
    Escaleno: todos sus lados son diferentes.
    Se debe desarrollar una clase de prueba con un método main para
    crear las cuatro figuras y probar los métodos respectivos.
     */
    
    int radio;
    
    //Creacion de clase circulo
    Circulo (int radio){
        this.radio = radio;
    }
    
    //Método calcular Area
    double calcularArea(){
        double resultado = Math.PI*Math.pow(radio,2);
        return resultado;
    }
    
    //Método calcular perímetro
    double calcularPerimetro(){
        double resultado = 2*Math.PI*radio;
        return resultado;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Circulo redondo = new Circulo(23);
            System.out.println("El radio del circulo: " + redondo.radio);
            System.out.println("El area del circulo:  " + redondo.calcularArea());
            System.out.println("El perímetro del circulo: " + redondo.calcularPerimetro());
        */
    }
    
}
