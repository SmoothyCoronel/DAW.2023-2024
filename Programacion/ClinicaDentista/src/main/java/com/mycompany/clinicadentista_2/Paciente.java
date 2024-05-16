/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicadentista_2;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mint
 */
public class Paciente {
        //Enum con los atributos de paciente
	public enum AtributosPaciente {NOMBRE,APELLIDOS,DNI,FNAC,TFNO, EMAIL};
	
	//Atributos
	private String sNombre;
	private String sApellidos;
        private String sDni;
        private String sFNac;
	private String sTelefono;
	private String sEmail;	
	
	private List<Tratamiento> misTratamientos;
	
	//Constructor
	public Paciente(String sNombre, String sApellidos, String sDni,String sFNac, String sTelefono, String sEmail) {
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
                this.sDni = sDni;
                this.sFNac = sFNac;
		this.sTelefono = sTelefono;
		this.sEmail = sEmail;
				
		misTratamientos = new ArrayList<>();
	}

	//Getters y Setters
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

	public String getsTelefono() {
		return sTelefono;
	}
	public void setsTelefono(String sTelefono) {
		this.sTelefono = sTelefono;
	}

	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsDni() {
		return sDni;
	}
	public void setsDni(String sDni) {
		this.sDni = sDni;
	}

	public String getsFNac() {
		return sFNac;
	}
	public void setsFNac(String sFNac) {
		this.sFNac = sFNac;
	}
	
	//CRUD tratamientos del paciente
	public boolean nuevoTratamiento(Tratamiento t) {
            //Método para crear un nuevo tratamiento si este no existe, si su precio es mayor a 0 
            //Se utiliza método de buscaUnTratameinto normal

		if (this.buscaUnTratamiento(t.getsCodigo()) == null && t.getfPrecio() >= 0f) {
			misTratamientos.add(t);
			return true;
		}
		return false;
		
	}
	
	public boolean eliminaTratamiento(String codigo) {
            //Se elimina tratamiento si este ha sido cobrado y existe
            //Se usa método buscaUnTratamiento
		Tratamiento t = this.buscaUnTratamiento(codigo);
		if (t != null) {
			if (t.estaCobrado()) {
				return (misTratamientos.remove(t));
			}
		}
		return false;
	}
	
	public Tratamiento[] buscaTratamientos(String campoBusqueda, Tratamiento.AtributosTratamiento atributoBusqueda) {
            //Método buscar tratamientos, rebundante en esta clase
            //Funciona igual que el buscarPacientes
		ArrayList<Tratamiento> resultado = new ArrayList<>();
		
		for(Tratamiento t:misTratamientos) {
			if (t.compara(campoBusqueda,atributoBusqueda)) {
				resultado.add(t);
			}
		}
		
		if (!resultado.isEmpty()) {
			Tratamiento[] listaT = new Tratamiento[resultado.size()]; 
			return resultado.toArray(listaT);
		}
		return null;
	}
	
	public Tratamiento buscaUnTratamiento(String codigo) {
            //Método para buscar un tratamiento en la lista teniendo en cuenta su código
		for(Tratamiento t:misTratamientos) {
			if (t.getsCodigo().equals(codigo)) {
				return t;
			}
		}
		
		return null;
	}
	
	public Tratamiento[] todosTratamientos() {
            //Mëtodo que convierte el arraylist de tratamientos en un array a visualizar
		if (misTratamientos.isEmpty()) return null;
		Tratamiento[] listaT = new Tratamiento[misTratamientos.size()]; 
		return misTratamientos.toArray(listaT);
	}

	public float cobraTratamiento(String codigo) {
            //Método para cobrar un tratamiento buscandolo por su código
            //Hay que comprobar si ha sido cobrado y si existe
		Tratamiento t = this.buscaUnTratamiento(codigo);
		if (t != null) {
			if (!t.estaCobrado()) {
				t.cobrar();
				return t.getfPrecio();
			}
		}
		return -1f;
	}
	
	
	public boolean tratamientosPendienteCobro() {
            //No se cuando se usa este método
            //Debería mostrar si todos los tratamientos están cobrados
            //Supongo que para eliminar un Paciente
		for(Tratamiento t:misTratamientos) {
			if (!t.estaCobrado()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean compara(String campo, AtributosPaciente at) {
            //Método que se utiliza en clase clínica para comparar el si el campo dado
            //Siendo ese campo un nombre, existe entre todos los nombres de clínica
		switch (at) {
		case NOMBRE: return this.sNombre.contains(campo);
		case APELLIDOS: return this.sApellidos.contains(campo);
		case DNI: return this.sDni.contains(campo);
		case FNAC: return this.sFNac.contains(campo);
		case EMAIL: return this.sEmail.contains(campo);
		case TFNO: return this.sTelefono.contains(campo);	
		}
		
	    return false;
	}
	
	//Setter multi-campo. Se le da el valor y el atributo y se asigna el valor en el atributo designado
    public void setValor(String campo, AtributosPaciente at) {
            
		switch (at) {
		case NOMBRE: this.setsNombre(campo);
		break;
		case APELLIDOS:  this.setsApellidos(campo);
		break;
		case DNI:  this.setsDni(campo);
		break;
		case FNAC:  this.setsFNac(campo);
		break;
		case EMAIL:  this.setsEmail(campo);
		break;
		case TFNO: this.setsTelefono(campo);	
		}
		
	}
    
    
    
    //JSON para leer y escribir
    public String toJson(){
            Gson trabajador = new Gson();
            String resultado = trabajador.toJson(this);
            return resultado;
        }
        
        public static Paciente fromJson(String json){
            Gson trabajador = new Gson();
            Paciente p = trabajador.fromJson(json, Paciente.class);
            return p;
        }
    

    @Override
    public String toString() {
        String cadenaTratamientos = "";
        String cadenaPaciente = "Paciente{" + "sNombre=" + sNombre + ", sApellidos=" + sApellidos + ", sTelefono=" + sTelefono + ", sEmail=" + sEmail + ", sDni=" + 
                sDni + ", sFNac=" + sFNac + ", misTratamientos=" + misTratamientos + '}' +"\n";
        
        if(misTratamientos.isEmpty()){
            return cadenaPaciente;
        }else {
            //Se añaden los tratamientos al string
            for(int i = 0; i < misTratamientos.size(); i++){
                cadenaTratamientos += misTratamientos.get(i).toString();
            }
            cadenaPaciente += cadenaTratamientos;
            return cadenaPaciente;
        }        
    }
}
