/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototipodados;

/**
 *
 * @author mint
 */
public class PrototipoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui empieza a ejecutarse mi programa
        Jugador J1 = new Jugador(0, 2);
        Jugador J2 = new Jugador(0, 2);
        
        System.out.println("Empecamos el programa: Dos jugadores, dos tiradas cada");
        System.out.println("Jugador 1: ");
        /*
            El valor al empezar siempre será 1
            Ya que es el valor mínimo siempre
        */final int iValor = 1;
        
        /*
            El rango será el mismo en todos los dados
            En el caso de querer cambiarlo, se hará 
            Desde la variable iRango
        */int iRango = 6;
        
        //Tirando los dados 
       /* Dado DJ1 = new Dado(iValor, iRango);
        DJ1.lanzar();
        Dado DJ12 = new Dado(iValor, iRango);
        DJ12.lanzar();
        System.out.println("");
        */
        //Consiguiendo los resultados de tirada
       // Tirada TJ1 = new Tirada(DJ1.getValor(), DJ12.getValor());
       
       
       for(int i = 0; i < 5; i++){
        System.out.println("");
        System.out.println("Ronda" +i);
         
        Tirada TJ1 = new Tirada();
        System.out.println("Cantidad total J1: " + TJ1.Lanzar());


        Tirada TJ2 = new Tirada();
        System.out.println("Cantidad total J2: " + TJ2.Lanzar());


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
       
       /*
        System.out.println("Cantidad total: " + TJ1.Lanzar()); 
        System.out.println("Cantidad seises: " + TJ1.haySeis()); 
        System.out.println("");
        
        System.out.println("Jugador 2: ");
        //Tirando los dados
        Dado DJ2 = new Dado(iValor, iRango);
        DJ2.lanzar();
        Dado DJ22 = new Dado(iValor, iRango);
        DJ22.lanzar();
        System.out.println("");
        
        //Consiguiendo los resultados de tirada
        Tirada TJ2 = new Tirada(DJ2.getValor(), DJ22.getValor());
        System.out.println("Cantidad total: " + TJ2.Lanzar()); 
        System.out.println("Cantidad seises: " + TJ2.haySeis()); 
        System.out.println("");
        System.out.println("Resultado...");
        
        if(TJ1.haySeis() > TJ2.haySeis()){
            System.out.println("Ha ganado el jugador 1");
            J1.numVictorias++;
            
        } else if(TJ1.haySeis() < TJ2.haySeis()){
            System.out.println("Ha ganado el jugador 2");
            J2.numVictorias++;
            
        } else {
            if(TJ1.Lanzar() > TJ2.Lanzar()){
                System.out.println("Ha ganado el jugador 1");
                J1.numVictorias++;
            } else if(TJ1.Lanzar() < TJ2.Lanzar()){
                System.out.println("Ha ganado el jugador 2");
                J2.numVictorias++;
            } else {
                System.out.println("Han empatado");
            }
        }
        */
        
    }
    
}
