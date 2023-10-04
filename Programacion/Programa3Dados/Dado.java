/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo3dados;

/**
 *
 * @author mint
 */
public class Dado {
    //Atributos
    int iValor;
    int iRango;
    
    //Metodos
        //Construcctor
        public Dado (int iValor, int iRango){
            this.iValor = iValor;
            this.iRango = iRango;
        }
        //Resto de metodos 
        public void lanzar(){
            iValor = (int)(Math.random()*iRango+1);
            System.out.println("El valor del dado es: " + iValor);
        }
        
        public int getValor(){
            return iValor;
        }
        /*
        public void setValor(int nuevoValor){
            iValor = nuevoValor;
        }
        */
}
