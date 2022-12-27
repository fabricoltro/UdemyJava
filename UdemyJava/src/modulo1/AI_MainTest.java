package modulo1;
//importamos la clase por si no se encuentra en el paquete

import modulo1.AI_Encapsulamiento;

public class AI_MainTest {

	public static void main(String [] args) {
		
		AI_Encapsulamiento persona = new AI_Encapsulamiento("Jorge", "bermudez", 151520, false); 
		System.out.println("nombre : "+persona.getNombre());
		System.out.println("apellido : "+persona.getApellido());
		System.out.println("precio : "+persona.getPrecio());
		System.out.println("condicion booleana : "+persona.isEliminado());
		
		persona.toString();
		persona.setNombre("Jorge2");
		persona.setApellido("Bermudez2");
		persona.setPrecio(333333);
		persona.setEliminado(true);
		
		System.out.println("nombre modificado : "+persona.getNombre());
		System.out.println("apellido modificado : "+persona.getApellido());
		System.out.println("precio modificado : "+persona.getPrecio());
		System.out.println("condicion booleana modificada : "+persona.isEliminado());

	}
	
}
