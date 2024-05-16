/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicadentista_2;

import com.google.gson.Gson;

/**
 *
 * @author mint
 */
public class Tratamiento {
        //Enum con los atributos de tratamiento
	public enum AtributosTratamiento {CODIGO,DESCRIPCION,FECHA,PRECIO,COBRADO};
	
        //Atributos
	protected String sCodigo;
	protected String sDescripcion;
	protected String sFecha;
	protected float fPrecio;
	protected boolean bCobrado;
	
	//Constructor
	public Tratamiento(String sCodigo, String sDescripcion, String sFecha, float fPrecio) {
		this.sCodigo = sCodigo;
		this.sDescripcion = sDescripcion;
		this.sFecha = sFecha;
		this.fPrecio = fPrecio;
		
		bCobrado = (fPrecio==0f);
	}
	
        //No me acuerdo para que servía esto
        //Para escribir
	public Tratamiento(String sCSV) {
		String[] columnas = sCSV.split(";");
		
		if (columnas[0].equals("Tratamiento")) {
			this.sCodigo = columnas[1];
			this.sDescripcion = columnas[2];
			this.sFecha = columnas[3];
			this.fPrecio = Float.parseFloat(columnas[4]);
			this.bCobrado = Boolean.parseBoolean(columnas[5]);
		} else {
			this.sCodigo = "";
			this.sDescripcion = "";
			this.sFecha = "";
			this.fPrecio = 0f;
			
			bCobrado = true;
		}
	}

	//Getters y Setters
	public String getsCodigo() {
		return sCodigo;
	}
	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}
	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}

	public String getsFecha() {
		return sFecha;
	}
	public void setsFecha(String sFecha) {
		this.sFecha = sFecha;
	}

	public float getfPrecio() {
		return fPrecio;
	}
	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}
	
        //Métodos para comprobar si el tratamiento ha sido cobrado
	public float cobrar() {
		this.bCobrado = true;
		return fPrecio;
	}
	public boolean estaCobrado() {
		return bCobrado;
	}
	
	public boolean compara(String campo, AtributosTratamiento at) {
            //Un pelín rebuscado pero te compara los tratamientos pasados por los que existen
		char comparador;
		String dato;
		switch (at) {
		case CODIGO: return this.sCodigo.contains(campo);
		case DESCRIPCION: return this.sDescripcion.contains(campo);
		case FECHA: return this.sFecha.contains(campo);
		case COBRADO: if (campo.equals("true")) return bCobrado;
					  else return !bCobrado; 
		case PRECIO: comparador = campo.charAt(0);
		      if (comparador == '>') {
		    	  dato = campo.substring(1);
		    	  return Double.parseDouble(dato)<fPrecio;
		      } else if (comparador == '<'){
		    	  dato = campo.substring(1);
		    	  return Double.parseDouble(dato)>fPrecio;
		      } else {
		    	  return Double.parseDouble(campo)==fPrecio;
		      }
			
		}
		
	    return false;
	}
        
        //JSON para leer y escribir
        public String toJson(){
            Gson trabajador = new Gson();
            String resultado = trabajador.toJson(this);
            return resultado;
        }
        
        public static Tratamiento fromJson(String json){
            Gson trabajador = new Gson();
            Tratamiento t = trabajador.fromJson(json, Tratamiento.class);
            return t;
        }

    @Override
    public String toString() {
        return "Tratamiento{" + "sCodigo=" + sCodigo + ", sDescripcion=" + sDescripcion + ", sFecha=" + sFecha + ", fPrecio=" + fPrecio + ", bCobrado=" + bCobrado + '}';
    }


    
}