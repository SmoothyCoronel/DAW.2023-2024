/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Planeta1 {

    /*
    Agregar dos atributos a la clase Planeta. El primero debe represen-
    tar el periodo orbital del planeta (en años). El segundo atributo
    representa el periodo de rotación (en días).
    Modificar el constructor de la clase para que inicialice los valores
    de estos dos nuevos atributos.
    Modificar el método imprimir para que muestre en pantalla los
    valores de los nuevos atributos.
     */
    
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    boolean esObservable = false;
    
    enum tipoPlaneta1 {Gaseoso, Terrestre, Enano}
    tipoPlaneta1 tipo;
    
    int periodoOrbital = 0;
    int periodoRotacion = 0;
    
    Planeta1(String nombre, int cantidadSatelites, double masa, double
            volumen, int diametro, int distanciaSol, tipoPlaneta1 tipo, 
            boolean esObservable, int periodoOrbital, int periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }
    
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Periodo orbital = " + periodoOrbital);
        System.out.println("Periodo de rotacion = " + periodoRotacion);
    }
    
    double calcularDensidad() {
        return masa/volumen;
    }
    
    boolean esPlanetaExterior(){
        float límite = (float) (149597870 * 3.4);
        /* Un planeta exterior está situado más allá del cinturón de
        asteroides */
        /* El cinturón se encuentra entre 2,1 y 3,4 UA (UA =
        149.597.870 Km) */
        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Planeta1 p1 = new Planeta1("Tierra", 1, 597200000000000000.00f, 100000000000000000000.00f, 
                12742,150000000, tipoPlaneta1.Gaseoso, true, 1, 1);
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
    }
    
}
