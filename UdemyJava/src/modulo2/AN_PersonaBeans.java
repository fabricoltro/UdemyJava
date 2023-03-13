package modulo2;

import java.io.Serializable;

public class AN_PersonaBeans implements Serializable{

	private String nombre;	
	private String apellido;

	public AN_PersonaBeans() {} 

	public AN_PersonaBeans(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
}
