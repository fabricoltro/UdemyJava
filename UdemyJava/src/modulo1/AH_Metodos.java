package modulo1;

public class AH_Metodos {

	int a;
	int b;
	
	public void sumar() {
		int resultado = a+b;
		System.out.println("el resultado es : " + resultado);
		
	}
	
	public int sumarConRetorno() {
		int resultado2 = a + b;
		
		return resultado2; 
	}
	
}
