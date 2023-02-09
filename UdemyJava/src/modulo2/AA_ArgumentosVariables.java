package modulo2;

public class AA_ArgumentosVariables {

	public static void main(String[] args) {
		imprimirNumeros(3, 4, 5);
		imprimirNumeros(1 , 2);
		variosParametros("juan ", 8,9,10,11);
	}
	
	private static void variosParametros(String nombre, int... numeros) {
		System.out.println("nombre = "+ nombre);
			imprimirNumeros(numeros);
	}
	
	
	
		// argumentos que varian ( int...      )  :
	private static void imprimirNumeros(int... numeros) {
		 
		for(int i = 0 ; i<numeros.length ; i++) {
			System.out.println("elementos :" + numeros[i]);
			
		}
	
	}
	
}
