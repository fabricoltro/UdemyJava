package modulo2;

public class AE_Grente  extends AE_Empleado{

	private String departamento;
	
	public AE_Grente(String nombre, double sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
				
	}
	@Override   
	public String obtenerDetalles () {
		return  super.obtenerDetalles() + ", departamento = "+ departamento  ;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	
	
	
	
}
