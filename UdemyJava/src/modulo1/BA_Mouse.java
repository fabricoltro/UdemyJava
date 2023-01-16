package modulo1;

public class BA_Mouse extends BA_DispositivoEntrada{

	
	private final int idRaton;
	private static int contadorRatones ;
	
	public BA_Mouse(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++BA_Mouse.contadorRatones;
		
	}

	@Override
	public String toString() {
		return "BA_Mouse [idRaton=" + idRaton + "]" +", "+ super.toString();
	}
	
	
}
