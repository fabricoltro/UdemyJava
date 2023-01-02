package modulo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AL_Arrays {

	public static void main(String[] args) {

		
		//array de numeros
		System.out.println("array de numeros");
		int edades[] = new int[5];
		edades[0] = 10;
		 
		for(int b=0;b<edades.length;b++) {
			
			System.out.println(edades[b]);
			
		}
		
		//array de objetos
		AJ_HerenciaPersona personas[] = new AJ_HerenciaPersona[2];
		personas[0] = new AJ_HerenciaPersona("juan");
		personas[1] = new AJ_HerenciaPersona("roman");
		
		System.out.println("array de personas:");
		for(int i=0 ;i<personas.length;i++) {
			System.out.println(personas[i] );
			
		}
		
		String frutas[] = {"naranja","manzana","anana","tomate"};
		
		int numeros[] = {1,2,3,4,5};
		
	}

}
