package modulo1;

public class AJ_HerenciaPersona {

	protected String nombre;
	protected int edad;
	public char genero;
	protected String direccion;		
	
	public AJ_HerenciaPersona() {
		
	}

	public AJ_HerenciaPersona(String nombre) {
		this.nombre = nombre;
	}


	public AJ_HerenciaPersona(String nombre, int edad, char genero, String direccion) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AJ_HerenciaPersona [nombre=").append(nombre);
		builder.append(", edad=").append(edad);
		builder.append(", genero=").append(genero);
		builder.append(", direccion=").append(direccion);
		builder.append(", ").append(super.toString());
		builder.append("]");
		return builder.toString();
	}


	
	
	
	
}
