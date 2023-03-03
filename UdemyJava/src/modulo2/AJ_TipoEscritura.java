package modulo2;

public enum AJ_TipoEscritura {
    // de tipo escritura
	
	CLASICO("Escritura a mano"),
	MODERNO("Escritura digital");
	
	private final String descripcion;
	
	private AJ_TipoEscritura(String descripcion) {
		this.descripcion = descripcion;
		
	}
	
	public String getDescripcion() {
		return this.descripcion;
		
	}
}
