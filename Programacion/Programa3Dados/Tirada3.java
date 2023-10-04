/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo3dados;

/**
 *
 * @author mint
 */
public class Tirada3 {
    int Dado1;
    int Dado2;
    int Dado3;
    int DadoTotal;
    
    //Métodos
        //Constructor
    /*
        public Tirada(int Dado1, int Dado2){
            this.Dado1 = Dado1;
            this.Dado2 = Dado2;
        }
    */
         public Tirada3(){
         }
        
        //Otros métodos
        public int Lanzar(int minimo, int maximo){
            Dado D1 = new Dado(minimo, maximo);
            D1.lanzar();
            Dado1 = D1.iValor;
            Dado D2 = new Dado(minimo, maximo);
            D2.lanzar();
            Dado2 = D2.iValor;
            Dado D3 = new Dado(minimo, maximo);
            D3.lanzar();
            Dado3 = D3.iValor;
            
            //Calculo general
            DadoTotal = Dado1 + Dado2 + Dado3; 
            return DadoTotal;
        }
        
        public int haySeis(){
            int haySeis = 0;
            //Comprobar la existencia de 6
            if(Dado1 == 6 && Dado2 == 6 && Dado3 == 6){
                haySeis = 3;
                
            } else if (Dado1 == 6 && Dado2 == 6){
                haySeis = 2;
                
            } else if (Dado1 == 6 && Dado3 == 6){
                haySeis = 2;
                
            } else if (Dado2 == 6 && Dado3 == 6){
                haySeis = 2;
                
            } else if (Dado1 == 6 || Dado2 == 6 || Dado3 == 6){
                haySeis = 1;
                
            }
            return haySeis;
        }

        public int getDadoTotal() {
            return DadoTotal;
        } 
}
