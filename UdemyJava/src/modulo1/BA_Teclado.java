package modulo1;

public class BA_Teclado extends BA_DispositivoEntrada{

	
	private final int idTeclado ;
	private static int contadorTeclados ;
	
	public BA_Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++BA_Teclado.contadorTeclados ;
		
	}

	@Override
	public String toString() {
		return "BA_Teclado [idTeclado=" + idTeclado + ", " + super.toString() + "]";
	}
}
