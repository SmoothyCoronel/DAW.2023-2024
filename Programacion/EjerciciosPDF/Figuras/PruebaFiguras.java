/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class PruebaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo(10, 8, 6);
        Trapecio figura6 = new Trapecio(10, 8, 8, 8, 7);
        
        //Escritura
        System.out.println("Area y perimetro del Circulo: 1_" + figura1.calcularArea() + "    2_" + figura1.calcularPerimetro());
        System.out.println("");
        System.out.println("Area y perimetro del Rectangulo: 1_" + figura2.calcularArea() + "    2_" + figura2.calcularPerímetro());
        System.out.println("");
        System.out.println("Area y perimetro del Cuadrado: 1_" + figura3.calcularArea() + "    2_" + figura3.calcularPerimetro());
        System.out.println("");
        System.out.println("Area y perimetro del TrianguloRectangulo: 1_" + figura4.calcularArea() + "    2_" + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
        System.out.println("");
        System.out.println("Area y perimetro de Rombo: 1_ " + figura5.calcularArea() + "    2_ " + figura5.calcularPerimetro());
        System.out.println("");
        System.out.println("Area y perímetro Tramepcio: 1_ " + figura6.calcularArea() + "   2_ " + figura6.calcularPerimetro());
    }
    
}
