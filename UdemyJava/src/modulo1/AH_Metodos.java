package modulo1;

public class AH_Metodos {

	int numero1;
	int numero2;
	
	public void sumar() {
		int resultado = numero1+numero2;
		System.out.println("el resultado de el metodo ´Sumar´ es : " + resultado);		
	}
	
	public int sumarConRetorno() {
		int resultado2 = numero1 * numero2;
		System.out.println("el resultado de la multiplicacon con retorno es : " + resultado2);
		return resultado2; 
	}
	
	public int dividirConArgumentos (int arg1, int arg2) {
		int a = arg1;
		int b = arg2;
		int resultado = a/b;
		System.out.println("el resultado de dividirConArgumentos es: "+resultado);
		return resultado;
	}
	
	
}
