package modulo1;

import javax.management.monitor.Monitor;

public class BA_Monitor {

	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	private BA_Monitor() {
		
		this.idMonitor = ++BA_Monitor.contadorMonitores;
		
	}

	public BA_Monitor(String marca, double tamanio) {
		// el this inicializa el contructor privado
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public int getIdMonitor() {
		return idMonitor;
	} 
	
	
	
	
}
