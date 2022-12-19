package modulo1;

import java.util.Scanner;

public class AD_Condicionales {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		
		System.out.println("Digite la Calificacion del Alumno entre 0-10");
		
		numero1 = Integer.parseInt(scanner.nextLine());
			 if (numero1 >=0 && numero1 <=10) {
			 if (numero1 >=9 && numero1 <=10) {
				System.out.println("la nota es : A");
			}  else if (numero1 >=8 && numero1 <9) {
				System.out.println("la nota es : B");
			}else if (numero1 >=7 && numero1 <8) {
				System.out.println("la nota es : C");
			}else if (numero1 >=6 && numero1 <7) {
				System.out.println("la nota es : D");
			}else if (numero1 >=0 && numero1 <6) {
				System.out.println("la nota es : F");
			}			
			
		} else {
			System.out.println("El numero esta fuera del rango");
		}
		
		
	}

}
