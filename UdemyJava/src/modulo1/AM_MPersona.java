package modulo1;

public class AM_MPersona {

	private String nombre;

	public AM_MPersona(String nombre) {
		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AM_MPersona [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
