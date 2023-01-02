package modulo1;

public class AF_PersonaCOAM {
	
	//variables
	
	String nombre;
	String apellido;
	int edad = 0;
	int barrio;
	
	
	//metodos
	
	public void AF_PERSONACOAM(String nombre) {
		
	}
	
	public void primerMetodo() {
		System.out.println("el nombre es :"+nombre);
		System.out.println("el apellido es :"+apellido);
	}
	
	public int segundoMetodo() {
				
		return edad;
	}
	
	//objeto
	
	AF_PersonaCOAM persona = new AF_PersonaCOAM(); 
		
	
	
	
}
