package modulo2;

public class AL_TestAbastracta {

	public static void main(String[] args) {
		//no se puede instanciar objetos de una clase abstracta(padre)
		// se crea una referencia del padre pero con objeto de tipo hijo, por que el hijo predomina 
		
	//	AL_FiguraGeometrica figura0 = new AL_FiguraGeometrica("Rectangulo");
		
		AL_FiguraGeometrica figura1 = new AL_Rectangulo("figura abastracta de rectangulo");
		
		figura1.dibujar();
		
		
		
	}

}
