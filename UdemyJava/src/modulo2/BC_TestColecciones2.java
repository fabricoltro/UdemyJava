package modulo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BC_TestColecciones2 {

	public static void main(String[] args) {
		
		List<String> miLista = new ArrayList<String>();
		miLista.add("edad1");
		miLista.add("edad12");
		miLista.add("edad2");
		miLista.add("edad23");
		miLista.add("edad3");
		miLista.add("edad34");
		String elemento = miLista.get(0);
		
		//for(Object elementos : miLista) {
		//	System.out.println(elementos);
		//}
		
		
		// set no guarda el orden en la variable
		Set <String> miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		//imprimir(miSet);
		
		
		
		Map <String, String>miMapa = new HashMap();
		miMapa.put("jj", "jose");
		miMapa.put("cc", "carla");
		miMapa.put("aa", "agus");
		miMapa.put("ee", "emanuel");
		
		
		//String elementoMap = miMapa.get("jj");
		// System.out.println(elementoMap);
		
		//key set agrega un set en conjunto pero no garantiza un orden
		imprimir(miMapa.keySet());
		
		//en cambio values trae todos los valores
		imprimir(miMapa.values());
	
	
	}
	
	public static void imprimir(Collection<String> coleccion) {
		//coleccion.forEach(elemento -> {
		//	System.out.println("elemento: " + elemento);
		//});
	
		for(String elemento : coleccion) {
			System.out.println("elemento = " + elemento);
		}
	
	
	}
	
}
