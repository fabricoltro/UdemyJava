package modulo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BA_TestColecciones {

	public static void main(String[] args) {
		
		List miLista = new ArrayList();
		miLista.add("edad1");
		miLista.add(15);
		miLista.add("edad2");
		miLista.add(21);
		miLista.add("edad3");
		miLista.add(10/2);
		
		//for(Object elementos : miLista) {
		//	System.out.println(elementos);
		//}
		
		
		// set no guarda el orden en la variable
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		imprimir(miSet);
		
		
	}
	
	public static void imprimir(Collection coleccion) {
		coleccion.forEach(elemento -> {
			System.out.println("elemento: " + elemento);
		});
	}
	
}
