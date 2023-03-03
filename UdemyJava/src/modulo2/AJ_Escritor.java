package modulo2;

public class AJ_Escritor extends AE_Empleado{

	final AJ_TipoEscritura tipoEscritura;
	
	public AJ_Escritor(String nombre, double sueldo, AJ_TipoEscritura tipoEscritura) {
		super(nombre, sueldo);
		this.tipoEscritura = tipoEscritura;
	
	}
	
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();  
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AJ_Escritor [tipoEscritura=");
		builder.append(tipoEscritura);
		builder.append("]");
		return builder.toString();
	}
	
	
	 public AJ_TipoEscritura getTipoEscritura() {
		 return this.tipoEscritura;
	 }
	
}
