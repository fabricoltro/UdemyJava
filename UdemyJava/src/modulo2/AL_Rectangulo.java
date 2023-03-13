package modulo2;

public class AL_Rectangulo extends AL_FiguraGeometrica{
	
	//constructor de clase con variable de clase padre
	public AL_Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	@Override
	public void dibujar() {							//metodo que devuelve la clase del objeto + el nombre de la clase
		System.out.println("se imprime un : "+ this.getClass().getSimpleName());
		
		
		
	}

}
