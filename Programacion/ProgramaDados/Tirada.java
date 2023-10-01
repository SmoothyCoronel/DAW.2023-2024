/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipodados;

/**
 *
 * @author mint
 */
public class Tirada {
    int Dado1;
    int Dado2;
    int DadoTotal;
    
    //Métodos
        //Constructor
    /*
        public Tirada(int Dado1, int Dado2){
            this.Dado1 = Dado1;
            this.Dado2 = Dado2;
        }
    */
         public Tirada(){
         }
        
        //Otros métodos
        public int Lanzar(){
            Dado D1 = new Dado(1, 6);
            D1.lanzar();
            Dado1 = D1.iValor;
            Dado D2 = new Dado(1, 6);
            D2.lanzar();
            Dado2 = D2.iValor;
            
            //Calculo general
            DadoTotal = Dado1 + Dado2; 
            return DadoTotal;
        }
        
        public int haySeis(){
            int haySeis = 0;
            //Comprobar la existencia de 6
            if(Dado1 == 6 || Dado2 == 6){
                haySeis = 1;
            } else if (Dado1 == 6 && Dado2 == 6){
                haySeis = 2;
            }
            return haySeis;
        }

        public int getDadoTotal() {
            return DadoTotal;
        }
        
        
}
