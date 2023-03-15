package modulo2;

public class BB_GenericClass<T> {

	private T objeto;
	
	public BB_GenericClass(T objeto) {
		
		this.objeto = objeto;
		
	}
	
	public void obtenerTipo() {
		
		System.out.println("el tipo T es: " + objeto.getClass().getSimpleName());
		
	}
	
	public static void main(String[] args) {
		
		BB_GenericClass<Integer> objetoInt = new BB_GenericClass(15);
		objetoInt.obtenerTipo();
		
		BB_GenericClass<String> objetoString = new BB_GenericClass("Hola como te va?");
		objetoString.obtenerTipo();
	}
	
}
