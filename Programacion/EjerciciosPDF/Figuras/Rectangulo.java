/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Rectangulo {

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
    
    int base;
    int altura;
    
    //Creación clase Rectangulo
    Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    //Método calcular Area
    double calcularArea() {
        return base * altura;
    }
    
    //Método calcular perímetro
    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Rectangulo recta = new Rectangulo(12, 15);
            System.out.println("La base del rectangulo " + recta.base + " y la altura del rectangulo " + recta.altura);
            System.out.println("Area del rectangulo: " + recta.calcularArea());
            System.out.println("Perimetro del rectangulo: " + recta.calcularPerímetro());
        */
    }
    
}
