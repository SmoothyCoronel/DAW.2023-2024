/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototipo3dados;

/**
 *
 * @author mint
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int iValor = 1;
        int iRango = 6;
        
        Jugador J1 = new Jugador(0);
        Jugador J2 = new Jugador(0);
        
        System.out.println("Empecamos el programa: Dos jugadores, tres tiradas cada");
        
        for(int i = 0; i < 5; i++){
            System.out.println("");
            System.out.println("Ronda" +i);
            
            Tirada3 TJ1 = new Tirada3();
            System.out.println("Cantidad total J1: " + TJ1.Lanzar(iValor, iRango));
        
            Tirada3 TJ2 = new Tirada3();
            System.out.println("Cantidad total J2: " + TJ2.Lanzar(iValor, iRango));
            
            System.out.println("");
            
            if(TJ1.haySeis() > TJ2.haySeis()){
                System.out.println("Ha ganado el jugador 1");
                J1.numVictorias++;
                
            } else if(TJ1.haySeis() < TJ2.haySeis()){
                System.out.println("Ha ganado el jugador 2");
                J2.numVictorias++;
                
            } else {
                if(TJ1.getDadoTotal() > TJ2.getDadoTotal()){
                    System.out.println("Ha ganado el jugador 1");
                    J1.numVictorias++;
                } else if(TJ1.getDadoTotal() < TJ2.getDadoTotal()){
                    System.out.println("Ha ganado el jugador 2");
                    J2.numVictorias++;
                } else {
                    System.out.println("Han empatado");
                }
            }
            
        }
       System.out.println("");
       System.out.println("Jugador1 total: " +J1.getNumVictorias());
       System.out.println("Jugador2 total: " +J2.getNumVictorias());
       
    }
    
}
