package modulo1;

public class BA_Computadora {

	private int idComputadora;
	private String nombre;
	private BA_Monitor monitor;
	private BA_Teclado teclado;
	private BA_Mouse raton;
	private static int contadorComputadoras;
	
	private BA_Computadora() {
		this.idComputadora = ++BA_Computadora.contadorComputadoras;
		
	}

	public BA_Computadora(int idComputadora, String nombre, BA_Monitor monitor, BA_Teclado teclado, BA_Mouse raton) {
		//this para inicializar constructor privado
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	
}
