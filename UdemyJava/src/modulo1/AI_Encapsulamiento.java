package modulo1;

public class AI_Encapsulamiento {

	private String nombre;
	private String apellido;
	private int precio;
	private boolean eliminado;
	
	
	public AI_Encapsulamiento(String nombre, String apellido, int precio, boolean eliminado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.precio = precio;
		this.eliminado = eliminado;
	}


	public String getNombre() {
		return this.nombre;
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


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public boolean isEliminado() {
		return eliminado;
	}


	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}


	@Override
	public String toString() {
		return "AI_Encapsulamiento [nombre=" + nombre + ", apellido=" + apellido + ", precio=" + precio + ", eliminado="
				+ eliminado + "]";
	}
	
	
	
	
}
