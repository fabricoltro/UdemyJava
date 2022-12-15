package modulo1;

import java.util.Scanner;

public class AB_Variables2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Proporciona el nombre ");
		String nombre = scanner.nextLine();
		System.out.println("Proporciona el Precio ");
		int precio = scanner.nextInt();
		System.out.println("Proporciona el id* de Articulo!!");
		int articulo = scanner.nextInt();
		System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
		System.out.println("El nombre es : "+nombre+", "+"El id : #"+articulo );
		System.out.println("El precio es : $"+precio);
		System.out.println("envio gratuito = "+envioGratuito);
	}
	

}
