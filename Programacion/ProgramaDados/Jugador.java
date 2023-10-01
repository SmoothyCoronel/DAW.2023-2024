/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipodados;

/**
 *
 * @author mint
 */
public class Jugador {
    //Atributos
    int numVictorias;
    int tirada;
    
    //Métodos
        //Constructor
        public Jugador(int numVictorias, int tirada){
            this.numVictorias = numVictorias;
            this.tirada = tirada;
        }
        
        //Resto de metodos
        public int getNumVictorias() {
            return numVictorias;
        }
        
    
}
