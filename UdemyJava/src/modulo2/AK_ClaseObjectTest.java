package modulo2;

public class AK_ClaseObjectTest {

	
	public static void main(String[] args) {
		AE_Empleado empleado1 = new AE_Empleado("Roman", 15000);
		AE_Empleado empleado2 = new AE_Empleado("Hernan", 18000);
		
		/*
		 	de esta manera no se debe hacer, ya que se equals compara contenido, no referencias,
		 	 aunque se tenga la misma variable contienen datos distintos
		  
		if(empleado1 == empleado2) {
			System.out.println("tienen la misma referencia en memoria");
		}
		else {
			System.out.println("tienen distina referencia en memoria");
		}
		*/
		
		if(empleado1.equals(empleado2)) {
			System.out.println("los objetos son iguales en contenido");
		}else {
			System.out.println("los objetos no son iguales en contenido");
		}
		
		if(empleado1.hashCode() == empleado2.hashCode()) {
			System.out.println("los objetos son iguales en content");
		}else {
			System.out.println("los objetos no son iguales en content");
		}
		
		
		
	} 
}
