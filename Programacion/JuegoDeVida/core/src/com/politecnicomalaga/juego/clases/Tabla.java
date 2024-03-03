package com.politecnicomalaga.juego.clases;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;

public class Tabla {
    //Atributos
    private Celula [][] misCelulas;
    private float numRandom, trozoX, trozoY, posX, posY, espacioLibreX, espacioLibreY;
    private boolean isAlive;
    private float ancho, alto;
    private Texture blanck, black;
    private int numVecinos, numCelulas;
    private int porcentaje;
    //Constructor
    public Tabla(float ancho, float alto, Texture blanck, Texture black, int numCelulas, int porcentaje){
            misCelulas = new Celula[numCelulas][numCelulas];
            this.ancho = ancho;
            this.alto = alto;
            this.black = black;
            this.blanck = blanck;
            this.numCelulas = numCelulas;
            if(porcentaje < 100 && porcentaje > 1){
                this.porcentaje = porcentaje;
            }else {
                this.porcentaje = 45;
            }

    }

    public void darVida() {
        //Atributos necesarios inicializados

        //Ancho para cada trozo
        trozoX = ancho / (numCelulas +8);
        espacioLibreX =(ancho/numCelulas) - trozoX ;
        posX = 10;

        //Alto para cada trozo
        trozoY = alto / (numCelulas +8);
        espacioLibreY = (alto/numCelulas) - trozoY ;
        posY = 10;

        //Dar vida
        for (int i = 0; i < misCelulas.length; i++) {
            for (int j = 0; j < misCelulas.length; j++) {

                numRandom = (int) (Math.random() * porcentaje) + 1;
                if (j < 49) {
                    if (numRandom == 1) {
                        this.isAlive = true;
                        misCelulas[i][j] = new Celula(posX, posY, black, blanck, trozoX, trozoY, isAlive, 0);
                    } else {
                        this.isAlive = false;
                        misCelulas[i][j] = new Celula(posX, posY, black, blanck, trozoX, trozoY, isAlive, 0);
                    }
                    posX += (trozoX + espacioLibreX);
                } else if (j == misCelulas.length - 1) {
                    if (numRandom == 1) {
                        this.isAlive = true;
                        misCelulas[i][j] = new Celula(posX, posY, black, blanck, trozoX, trozoY, isAlive, 0);
                    } else {
                        this.isAlive = false;
                        misCelulas[i][j] = new Celula(posX, posY, black, blanck, trozoX, trozoY, isAlive, 0);
                    }
                    posY += (trozoY + espacioLibreY);
                    posX = 10;
                }


            }

        }
    }

    public void contarVecinos(){
        for(int i = 0; i < misCelulas.length; i++){
            for(int j = 0; j < misCelulas.length; j++){
                numVecinos = 0;

                if(i == 0 && j == 0){
                //Estoy en la esquina izquierda abajo 3 vecinos
                    if(misCelulas[i][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j+1].isAlive()){
                        numVecinos++;
                    }

                }else if(i == misCelulas.length-1 && j == 0){
                //Estoy en la esquina izquierda arriba 3 vecinos
                    if(misCelulas[i][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j+1].isAlive()){
                        numVecinos++;
                    }

                }else if(i == 0 && j == misCelulas.length-1){
                //Estoy en la esquina derecha abajo 3 vecinos
                    if(misCelulas[i][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j-1].isAlive()){
                        numVecinos++;
                    }

                }else if(i == misCelulas.length-1 && j == misCelulas.length-1){
                //Estoy en la esquina derecha arriba 3 vecinos
                    if(misCelulas[i-1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j-1].isAlive()){
                        numVecinos++;
                    }

                } else if(j == 0){
                    //Estoy en la esquina izquierda 5 vecinos
                    if(misCelulas[i-1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j].isAlive()){
                        numVecinos++;
                    }

                }else if(j == misCelulas.length-1){
                    //Estoy en la esquina derecha 5 vecinos
                    if(misCelulas[i+1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j].isAlive()){
                        numVecinos++;
                    }

                }else if(i == misCelulas.length-1){
                    //Estoy abajo 5 vecinos
                    if(misCelulas[i][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j+1].isAlive()){
                        numVecinos++;
                    }

                }else if(i == 0){
                    //Estoy arriba 5 vecinos
                    if(misCelulas[i][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j+1].isAlive()){
                        numVecinos++;
                    }

                }else {
                    //Estoy alejado de las esquinas, all around me are neighbor
                    if(misCelulas[i+1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j-1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i-1][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i][j+1].isAlive()){
                        numVecinos++;
                    }
                    if(misCelulas[i+1][j+1].isAlive()){
                        numVecinos++;
                    }

                }
                //Asignamos los vecinos a la celula cuando hemos encontrado la apropiada
                misCelulas[i][j].setNumVecinos(numVecinos);
            }
        }

    }

    public void draw(SpriteBatch pantalla){
        for(int i = 0; i < misCelulas.length; i++){
            for(int j = 0; j < misCelulas.length; j++){
                    misCelulas[i][j].draw(pantalla);
            }
        }
    }
}
