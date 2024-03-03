package com.politecnicomalaga.juego.clases;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Celula extends ObjetoVolador{
    //Atributos
    private boolean isAlive;
    private int numVecinos;
    private float width, height;
    private Texture imagenNegra, imagenVacia;
    private int contador = 0;
    //Constructor
    public Celula(float posX, float posY, Texture imagenNegra, Texture imagenVacia, float width, float height, boolean isAlive, int numVecinos) {
        super(posX, posY, imagenVacia);
        this.isAlive = isAlive;
        this.width = width;
        this.height = height;
        this.numVecinos = numVecinos;
        this.imagenVacia = imagenVacia;
        this.imagenNegra = imagenNegra;
    }

    //Métodos
    public void wereAliveMethod(){
        if(numVecinos >= 2 && numVecinos <= 3){
            //Estamos chill
            setAlive(true);
        }else if(numVecinos < 2){
            //Somos muy pocos
            setAlive(false);
        }else {
            //Somos demasiados
            setAlive(false);
        }
    }
    @Override
    public void draw(SpriteBatch pantalla) {
        if (pantalla != null) {
            if (contador <= 0) {
                if (isAlive) {
                    pantalla.draw(imagenNegra, posX, posY, width, height);
                } else {
                    pantalla.draw(imagenVacia, posX, posY, width, height);
                }
            } else {
                this.wereAliveMethod();
                if (isAlive) {
                    pantalla.draw(imagenNegra, posX, posY, width, height);
                } else {
                    pantalla.draw(imagenVacia, posX, posY, width, height);
                }
            }
        contador++;
        }
    }

    //Getters y setters
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public int getNumVecinos() {return numVecinos;}
    public void setNumVecinos(int numVecinos) {this.numVecinos = numVecinos;}
}
