package com.politecnicomalaga.juego;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.politecnicomalaga.juego.clases.Boton;
import com.politecnicomalaga.juego.clases.Tabla;


public class MainLife extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture imgWhite, imgBlack, skinStart, skinPause, skinReload;
	private Tabla misCelulas;
	private Boton play, reload;
	private float xPantalla, yPantalla;
	private int porcentaje;
	private boolean corriendo;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//Iniciar texturas
		imgWhite = new Texture("PanelBlanco.jpg");
		imgBlack = new Texture("PanelNegro.jpg");
		skinStart = new Texture("BotonesVida(2).png");
		skinPause = new Texture("BotonesVida(1).png");
		skinReload = new Texture("BotonesVida(3).png");

		//Crear objetos
		porcentaje = 65;
		corriendo = true;
		misCelulas = new Tabla(Gdx.graphics.getWidth()-150, Gdx.graphics.getHeight()-50, imgWhite, imgBlack, 50, porcentaje);
		misCelulas.darVida();
		play = new Boton(Gdx.graphics.getWidth()-90, Gdx.graphics.getHeight()-150, skinPause, 50, 50);
		reload = new Boton(Gdx.graphics.getWidth()-90, Gdx.graphics.getHeight()-350, skinReload, 50, 50);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();

		play.draw(batch);
		reload.draw(batch);

		//Comprobamos que lo toca
		if(Gdx.input.justTouched()){
			xPantalla = Gdx.input.getX();
			yPantalla = Gdx.graphics.getHeight() - Gdx.input.getY();

			//if para saber si ha pulsado el reset o el play
			if(play.isTouched(xPantalla, yPantalla) && corriendo){
				corriendo = false;
				play.setImagen(skinPause);
			}else if(play.isTouched(xPantalla, yPantalla) && !corriendo){
				corriendo = true;
				play.setImagen(skinStart);
			}

			if(reload.isTouched(xPantalla, yPantalla)){
				misCelulas = new Tabla(Gdx.graphics.getWidth()-150, Gdx.graphics.getHeight()-50, imgWhite, imgBlack, 50, porcentaje);
				misCelulas.darVida();
				corriendo = true;
				play.setImagen(skinStart);
			}

		}
		if(misCelulas != null) {
			if(corriendo == false){
				int h =0;
				misCelulas.draw(batch);
			}else{
				misCelulas.draw(batch);
				misCelulas.contarVecinos();
			}
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		imgWhite.dispose();
		imgBlack.dispose();
		skinPause.dispose();
		skinStart.dispose();
		skinReload.dispose();
	}


}
