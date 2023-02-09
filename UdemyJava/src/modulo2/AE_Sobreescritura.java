package modulo2;

public class AE_Sobreescritura {

	public static void main(String[] args) {
		
		AE_Grente gerente1 = new AE_Grente("Roman", 100, "Sistemas");
	//	System.out.println("gerente 1 = "+ gerente1.obtenerDetalles());
		
		AE_Empleado empleado = new AE_Empleado("Carla", 100);  
		
		imprimir(gerente1);
		imprimir(empleado);
	}

	//polimorfismo : el padre pede obtener atributos de la clase hija
	private static void imprimir(AE_Empleado empleado) {
		System.out.println("empleado =" + empleado.obtenerDetalles());
		
		
	}
}
