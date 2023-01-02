package modulo1;

import java.util.Date;

public class AK_Cliente extends AJ_HerenciaPersona {

	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	
	
	public AK_Cliente( Date fechaRegistro, boolean vip,
					  String nombre, int edad, char genero, String direccion) {
		//llamamos atributos del padre
		super(nombre,edad,genero,direccion);
		this.idCliente = ++contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}
	
	public AK_Cliente() {
		
	}
	
	
	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public boolean isVip() {
		return vip;
	}


	public void setVip(boolean vip) {
		this.vip = vip;
	}

//super va a mandar a llamar los atributos de la clase padre y imprimirlos
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AK_Cliente [idCliente=").append(idCliente);
		builder.append(", fechaRegistro=").append(fechaRegistro);
		builder.append(", vip=").append(vip);
		builder.append(", ").append(super.toString());	
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
