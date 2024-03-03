package com.politecnicomalaga.juego.clases;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjetoVolador {
    //Atributos
    protected float posX, posY;
    protected Texture imagen;

    //Constructor
    public ObjetoVolador(float posX, float posY, Texture imagen){
        this.posX = posX;
        this.posY = posY;
        this.imagen = imagen;
    }

    //Métodos
    public void draw(SpriteBatch pantalla){
        pantalla.draw(imagen, posX, posY);
    }

    //Getters y setters
    public float getPosX(){return posX;}
    public float getPosY(){return posY;}
    public Texture getImagen() {return imagen;}
    public void setImagen(Texture imagen) {this.imagen = imagen;}
    public void setPosX(float posX){ this.posX = posX;}
    public void setPosY(float posY){ this.posY = posY;}

}
