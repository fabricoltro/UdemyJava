package modulo2;

public abstract class AL_FiguraGeometrica {
	
	protected String tipoFigura;
	
	protected AL_FiguraGeometrica (String tipoFigura) {
		this.tipoFigura = tipoFigura ;
	}
	
	public abstract void dibujar() ;

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	@Override
	public String toString() {
		return "AL_FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
	}
	


}

