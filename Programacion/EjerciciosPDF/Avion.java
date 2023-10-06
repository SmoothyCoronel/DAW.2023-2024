/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Avion {
    //Atributos
    private String fabricante;
    private int numMotores;
    
    //Constructor
    private Avion(String fabricante, int numMotores){
        this.fabricante = fabricante;
        this.numMotores = numMotores;
    }
    
    //Resto de métodos
    public void imprimirFabricante(){
        System.out.println("EL nombre del fabricante del avión es: " + fabricante);
    }
    
    public void cambiarFabricante(Avion avion1){
        avion1.setFabricante("Loockhead");
    }
    //Getteres y Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Avion a1 = new Avion("Airbus",4);
        Avion a2;
        Avion a3 = new Avion("Boeing",4);
        a2 = a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
        a3.imprimirFabricante();
    }
    
}
