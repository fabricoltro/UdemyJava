package modulo2;

import static modulo2.BD_ManejoArchivos.*;

public class BD_TestArchivos {

	public static void main(String[] args) {
		
		var nombreArchivo = "pruebaaa123.txt";
		
		// se debe usar solo 1 metodo al momento de ejecutarse
		crearArchivo(nombreArchivo);
		
		escribirArchivo(nombreArchivo, "hola desde java");
		
		anexarArchivo(nombreArchivo, "hola desde el anexo");
		
		leerArchivo(nombreArchivo);
	}

}
