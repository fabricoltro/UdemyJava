package modulo1;
import java.util.Scanner;

public class AA_Variables {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Proporciona el nombre del Libro");
		String titulo = scanner.nextLine();
		System.out.println("Proporciona el nombre del Autor");
		String autor = scanner.nextLine();
		System.out.println("Proporciona cantidad de Páginas");
		int cantidad = scanner.nextInt();
		
		System.out.println("El libro :" + titulo + " fue creado por el autor : " + autor
			+ " con :" + cantidad + "de paginas"	);
		
	}

}
