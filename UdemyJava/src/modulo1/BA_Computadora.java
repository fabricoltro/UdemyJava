package modulo1;

public class BA_Computadora {

	private final int idComputadora;
	private String nombre;
	private BA_Monitor monitor;
	private BA_Teclado teclado;
	private BA_Mouse raton;
	private static int contadorComputadoras;
	
	private BA_Computadora() {
		this.idComputadora = ++BA_Computadora.contadorComputadoras;
		
	}

	public BA_Computadora( String nombre, BA_Monitor monitor, BA_Teclado teclado, BA_Mouse raton) {
		//this para inicializar constructor privado
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BA_Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(BA_Monitor monitor) {
		this.monitor = monitor;
	}

	public BA_Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(BA_Teclado teclado) {
		this.teclado = teclado;
	}

	public BA_Mouse getRaton() {
		return raton;
	}

	public void setRaton(BA_Mouse raton) {
		this.raton = raton;
	}

	public int getIdComputadora() {
		return idComputadora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BA_Computadora [idComputadora=");
		builder.append(idComputadora);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", raton=");
		builder.append(raton);
		builder.append("]");
		return builder.toString();
	}
	
	
}
