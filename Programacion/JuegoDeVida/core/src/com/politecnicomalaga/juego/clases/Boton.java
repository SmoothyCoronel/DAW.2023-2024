package com.politecnicomalaga.juego.clases;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Boton extends ObjetoVolador{
    //Atributos
    private float width, height;
    //Constructor
    public Boton(float posX, float posY, Texture imagen, float width, float height) {
        super(posX, posY, imagen);
        this.width = width;
        this.height = height;
    }
    //Preguntar si se ha pulsado
    public boolean isTouched(float tocadoX, float tocadoY){
        if(tocadoX >= posX && tocadoX <= (posX+width)){
            if(tocadoY >= posY && tocadoY <= (posY+height)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void draw(SpriteBatch pantalla){
        if(pantalla != null){
            pantalla.draw(imagen, posX, posY, width, height);
        }
    }

}
