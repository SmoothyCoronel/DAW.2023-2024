package com.mycompany.clinicadentista_2;

public class Dentista {
	//Atributos de dentista
	protected String sDNI;
	protected String sNombre;
	protected String sApellidos;
	protected String sFechaAlta;
	protected float fPrecioHora;
	
	//Constructor de dentista
	public Dentista(String sDNI, String sNombre, String sApellidos, String sFecha, float fPrecio) {
		this.sDNI = sDNI;
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.sFechaAlta = sFecha;
		this.fPrecioHora = fPrecio;

	}
	
        //Getters y setters de dentista
	public String getsDNI() {
		return sDNI;
	}
	public void setsDNI(String sDNI) {
		this.sFechaAlta = sDNI;
	}

	public String getsNombre() {
		return sNombre;
	}
        public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
        
	public String getsApellidos() {
		return sApellidos;
	}
	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}

	public String getsFechaAlta() {
		return sFechaAlta;
	}
	public void setsFechaAlta(String sFecha) {
		if (sFecha.isEmpty()) {
			this.sFechaAlta = sFecha;
		}
	}

	public float getfPrecioHora() {
		return fPrecioHora;
	}
	public void setfPrecioHora(float fPrecio) {
		this.fPrecioHora = fPrecio;
	}
	
	//Realiza el cálculo de horas por el precioHora que cuesta el dentista
	//Por ejemplo, si horas vale 4, y precio es 20, debe devolver 80.0f
	//Si horas es negativo, devuelve 0
	
	public float calculaPresupuesto(int horas) {
		if (horas < 0) {
			return horas*fPrecioHora;
		} else return 0f;
	}

        //ToString de la cita del dentista?
	@Override
	public String toString() {
		return "{\"sDNI\":\"" + sDNI + "\", \"sNombre\":\"" + sNombre + "\", \"sApellidos\":\"" + sApellidos + "\", \"sFechaAlta\":\""
				+ sFechaAlta + "\", \"fPrecioHora\":" + fPrecioHora + "}";
	}

	

	
	

}
