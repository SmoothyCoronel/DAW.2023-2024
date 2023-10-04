/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class TrianguloRectangulo {

    /**
     * @param args the command line arguments
     */
    
    int base;
    int altura;
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return (base * altura / 2);
    }
    
    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa()); 
        /* Invoca al método calcular hipotenusa */
    }
    
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
          System.out.println("Es un triángulo equilátero"); 
          /* Todos sus lados son iguales */  
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
          System.out.println("Es un triángulo escaleno"); 
          /* Todos sus lados son diferentes */
        } else {
            System.out.println("Es un triángulo isósceles"); 
            /* De otra manera, es isósceles */
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
