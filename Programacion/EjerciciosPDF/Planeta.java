/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Planeta {

    /*
    Se requiere un programa que modele el concepto de un planeta del sistema
    solar. 
    Un planeta tiene los siguientes atributos:
     Un nombre de tipo Sring con valor inicial de null.
     Cantidad de satélites de tipo int con valor inicial de cero.
     Masa en kilogramos de tipo double con valor inicial de cero.
    
    
    Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
    
    Diámetro en kilómetros de tipo int con valor inicial de cero.
    
    Distancia media al Sol en millones de kilómetros, de tipo int con
    valor inicial de cero.
    
    Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con
    los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
    
    Observable a simple vista, de tipo booleano con valor inicial false.
    
    La clase debe incluir los siguientes métodos:
     La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
     Definir un método que imprima en pantalla los valores de los atributos de un planeta.
     Calcular la densidad un planeta, como el cociente entre su masa y su volumen.
     Determinar si un planeta del sistema solar se considera exterior.
    
    Un planeta exterior está situado más allá del cinturón de asteroi-
    des. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una
    unidad astronómica (UA) es la distancia entre la Tierra y el Sol=
    149 597 870 Km.
     En un método main se deben crear dos planetas y mostrar los va-
    lores de sus atributos en pantalla. Además, se debe imprimir la
    densidad de cada planeta y si el planeta es un planeta exterior del
    sistema solar.
     */
    
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    boolean esObservable = false;
    
    enum tipoPlaneta {Gaseoso, Terrestre, Enano}
    tipoPlaneta tipo;
    
    
    
    Planeta(String nombre, int cantidadSatelites, double masa, double
            volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean
            esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
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
        Planeta p1 = new Planeta("Tierra", 1, 597200000000000000.00f, 100000000000000000000.00f, 
                12742,150000000, tipoPlaneta.Gaseoso, true);
        
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
    }
    
}
