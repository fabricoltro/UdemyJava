package modulo1;

public class AH_MetodosMain {

	public static void main(String [] args) {
		
		AH_Metodos persona = new AH_Metodos();
		int resultado1;
		persona.numero1 = 20;
		persona.numero2 = 10;
		
		persona.sumar();
		
		persona.sumarConRetorno();
		
		persona.dividirConArgumentos(30, 3);
		
 	}
	
}
