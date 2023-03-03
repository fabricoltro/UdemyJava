package modulo2;


public class AJ_TestTipoEscritura {

	public static void main(String[] args) {
		AE_Empleado empleado;
		 
		empleado = new AJ_Escritor("Franco", 115000, AJ_TipoEscritura.CLASICO);
		//System.out.println("empleado = "+ empleado);
		
		
		
		//polimorfismo : esta llamando a atributo de la clase padre
		System.out.println(empleado.obtenerDetalles());
	

	
		AJ_Escritor escritor = (AJ_Escritor) empleado;
		escritor.getTipoEscritura();
		
		AJ_Escritor empleado2 = escritor;
		System.out.println(empleado.obtenerDetalles());
	}
}
