package modulo1;

public class AK_Empleado extends AJ_HerenciaPersona {

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public AK_Empleado(double sueldo,  String nombre) {
		//usamos el atributo nombre de la clase padre
		super(nombre);
		this.idEmpleado = ++AK_Empleado.contadorEmpleado;
		this.sueldo = sueldo;
			
	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AK_Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(", persona=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
