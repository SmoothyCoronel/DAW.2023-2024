/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicadentista_2;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
	
	//Atributos
	private String sNombre;
	private String sDireccion;
	private String sTelefono;
	private String sEmail;
	private String sCIF;
	private List<Paciente> misPacientes;
	
	//Constructor
	public Clinica(String sNombre, String sDireccion, String sTelefono, String sEmail, String sCIF) {
		this.sNombre = sNombre;
		this.sDireccion = sDireccion;
		this.sTelefono = sTelefono;
		this.sEmail = sEmail;
		this.sCIF = sCIF;
		this.misPacientes = new ArrayList<>();
	}

        //Getters y setters
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsDireccion() {
		return sDireccion;
	}
	public void setsDireccion(String sDireccion) {
		this.sDireccion = sDireccion;
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

	public String getsCIF() {
		return sCIF;
	}
	public void setsCIF(String sCIF) {
		this.sCIF = sCIF;
	}
	
	//CRUD de Pacientes
	public boolean nuevoPaciente(Paciente p) {
            //Método añadir un nuevo paciente si no existe. Debo cambiarlo para recibir un "Paciente" como parámetro
		if (this.buscaPacientes(p.getsDni(), Paciente.AtributosPaciente.DNI) == null) {
			misPacientes.add(p);
			return true;
		}
		return false;		
	}
	
	public boolean eliminaPaciente(String dni) {
            //Método eliminar paciente si no existe y si no tiene tratamientos pendientes (Método de paciente)
		Paciente[] p = this.buscaPacientes(dni, Paciente.AtributosPaciente.DNI);
                
		if (p != null && p.length == 1) {
			if (!p[0].tratamientosPendienteCobro()) {
				return (misPacientes.remove(p[0]));
			}
		}
		return false;
	}
	
	public Paciente[] buscaPacientes(String campoBusqueda, Paciente.AtributosPaciente atributoBusqueda) {
            //Método para buscar pacientes por un atributo pasado. Si este se repite la lista será más grande
            //Si el atributo es primary key, solo devolverá uno
            //Utiliza método compara de paciente para el campo de busqueda y los atributos de busqueda           
            ArrayList<Paciente> resultado = new ArrayList<>();
		for(Paciente p: misPacientes) {
			if (p.compara(campoBusqueda,atributoBusqueda)) {
				resultado.add(p);
			}
		}
		
                //Devolvemos una lista no arrayList para que no se pueda editar
		if (!resultado.isEmpty()) {
			Paciente[] listaP = new Paciente[resultado.size()]; 
			return resultado.toArray(listaP);
		}
		return null;
	}
	
	public Paciente buscaUnPaciente(String dni) {
            //Método que devuelve un paciente si o si basándose en dni
            //Es bastante rebundante, se podría usar el método buscarPacientes 
		for(Paciente p: misPacientes) {
			if (p.compara(dni,Paciente.AtributosPaciente.DNI)) {
				return p;
			}
		}
		
		return null;
	}
	
	
	public Paciente[] todosPacientes() {
            //Convertir el arrayList de pacientes en un array y devolverlo
		if (misPacientes.isEmpty()) return null;
		Paciente[] listaP = new Paciente[misPacientes.size()]; 
		return misPacientes.toArray(listaP);
	}
	
	public boolean actualizaPaciente(String dni, String campo, Paciente.AtributosPaciente atrActualizar) {
            //Método para actualizar solo un paciente con un método de paciente para cambiar solo el atributo a actualizar
		Paciente p = this.buscaUnPaciente(dni);
		if (p != null) {
			p.setValor(campo, atrActualizar);
			return true;
		}
		return false;
	}
                
        
    @Override
    public String toString() {
        String cadenaPacientes = "";
        String cadenaClinica = "Clinica{" + "sNombre=" + sNombre + ", sDireccion=" + sDireccion + ", sTelefono=" + sTelefono + 
                ", sEmail=" + sEmail + ", sCIF=" + sCIF + ", misPacientes=" + misPacientes + '}' +"\n";
        
        if(misPacientes.isEmpty()){
            return cadenaClinica;
        }else {
            for(int i = 0; i < misPacientes.size(); i++){
                cadenaPacientes += misPacientes.get(i).toString();
            }
            cadenaClinica += cadenaPacientes;
            return cadenaClinica;
        }
    }   

}