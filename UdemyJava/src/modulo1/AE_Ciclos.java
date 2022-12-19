package modulo1;

import java.util.Iterator;
import java.util.Scanner;

public class AE_Ciclos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int productos = 0 ;
		String manzanastotal = null;
		String perastotal = null ;
		String zanahoriastotal = null;
		int suma;
		System.out.println("Cuantas compras desea realizar?");
		productos = Integer.parseInt(entrada.nextLine());
		for (int i=0 ; i<=productos ;i++) {
			
			System.out.println("cuantas manzanas deseas comprar?");
			String manzanas = entrada.nextLine();
			System.out.println("cuantas peras deseas comprar?");
			String peras = entrada.nextLine();
			System.out.println("cuantas zanahorias deseas comprar?");
			String zanahorias = entrada.nextLine();						
			
			System.out.println("Has comprado :"+manzanas+ " Manzanas"+peras+ " peras, y "+zanahorias+ " zanahorias");
			System.out.println(" ");
			
			
			}
			
		System.out.println("gracias por comprar en nuestra tienda");
		
		}
		
	}



