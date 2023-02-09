package modulo2;

public class AE_Empleado {

	protected String nombre;
	protected double sueldo;
	
	public AE_Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String obtenerDetalles() {
		return "nombre = "+ this.nombre + " sueldo = " +this.sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
