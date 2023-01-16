package modulo1;

public class BA_DispositivoEntrada {

	private String tipoEntrada ;
	private String marca ;
	
	
	public BA_DispositivoEntrada(String tipoEntrada, String marca) {
		
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "BA_DispositivoEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
	}


	public String getTipoEntrada() {
		return tipoEntrada;
	}


	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
}
