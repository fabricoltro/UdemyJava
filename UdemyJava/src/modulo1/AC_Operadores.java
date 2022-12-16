package modulo1;

import java.util.Scanner;

public class AC_Operadores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero1,numero2,numero3;
		int suma;
		
		System.out.println("Digite las 3 notas del Alumno");
		
		numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Ahora la Segunda :");
		numero2 = Integer.parseInt(scanner.nextLine());
		System.out.println("Ahora la Tercera :");
		numero3 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Las notas del Alumno son : "+numero1 +"|"+ numero2 +"|"+ numero3);
		suma = numero1 + numero2 + numero3;
		System.out.println("Para aprobar, el promedio debe ser mayor a 7, "
				+ "el de el alumno es : "+suma/3);
		
		
	}

}
