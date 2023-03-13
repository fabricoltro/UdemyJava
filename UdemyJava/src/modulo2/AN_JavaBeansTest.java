package modulo2;

public class AN_JavaBeansTest {

	public static void main(String[] args) {
		//serializable convierte la persona en bits "1 y ceros para transportarlo por la red"
		AN_PersonaBeans persona = new AN_PersonaBeans();
		
		persona.setNombre("Roman");
		persona.setApellido("Messi");
		
		
		System.out.println(persona);
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		
		
	}
}
