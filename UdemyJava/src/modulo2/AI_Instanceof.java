package modulo2;

public class AI_Instanceof {

	public static void main(String[] args) {
		
		 

		AE_Empleado empleado = new AE_Empleado("Carla", 100);  

		empleado = new AE_Grente("Sergio", 15.000, "piso1");
		
		determinarTipo(empleado);
	}

	 
	private static void determinarTipo(AE_Empleado empleado) {
		
		//instaceof pregunta si la variable pertenece a un objeto de clase tipo gerente
		
		if(empleado instanceof AE_Grente) {
			System.out.println("es de tipo gerente");
		}
		else if(empleado instanceof AE_Empleado) {
			System.out.println("es de tipo empleado");
			
		}else if(empleado instanceof Object) {
			System.out.println("es de topo Object");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
