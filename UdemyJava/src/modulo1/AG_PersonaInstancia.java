package modulo1;

public class AG_PersonaInstancia {

	public static void main(String[] args) {
		
		//instanceamos el objeto
		AF_PersonaCOAM persona1 = new AF_PersonaCOAM();

		persona1.nombre ="Juan";
		persona1.apellido="sete";
		
		//instanciamos segundo objeto:
		
		AF_PersonaCOAM persona2 = new AF_PersonaCOAM();
		
		
		persona1.primerMetodo();
		
		

	}
	
}
