package modulo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AM_Matrices {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Matrices
		int indices ;
		String mensaje;
		
		indices = Integer.parseInt(JOptionPane.showInputDialog("Si deseas introducir una matriz, Marcar 1: "
				+ "| para utlizar matriz establecida, Marcar 2, matriz de furutas 3 y Matriz de objetos 4"));
		
		if (indices==2) {
			
			int edades[][] = new int[3][3] ;
			
			//columnas//filas
			
			System.out.println(edades);
			
			edades[0][0] = 10;
			edades[0][1] = 2;
			edades[0][2] = 3;
			edades[1][0] = 4;
			edades[1][1] = 5;
			edades[1][2] = 6;
			edades[2][0] = 7;
			edades[2][1] = 8;
			edades[2][2] = 9;
			
			for(int ren=0 ; ren < edades.length ; ren++) {
				for(int col=0 ; col < edades[ren].length ; col++) {
				
					System.out.println("edades "+ ren + "-" + col + ": " + edades[ren][col]);
				
				}
				
				
			}
			System.out.println("-----------------------------------------------------");
			
			//CREANDO LA MATRIZ POR EL USUARIO
			
		} else if(indices==1) {
			
			int matriz[][],filas,col;	
			
			filas = Integer.parseInt(JOptionPane.showInputDialog("Dijite el numero de Filas"));
			col = Integer.parseInt(JOptionPane.showInputDialog("Dijite el numero de Columnas"));
			
		    matriz = new int[filas][col];
		    
		    System.out.println("Digite la Matriz");
		    for(int i=0 ; i<filas ; i++) {
		    	for(int j=0 ; j<col ; j++) {
		    		System.out.println("Matriz ["+i+"] ["+j+"]: ");
		    		matriz[i][j] = entrada.nextInt();
		    	}
		    }
			System.out.println("la matriz es : ");
		    for(int i=0 ; i<filas ; i++) {
		    	for(int j=0 ; j<col ; j++) {
		    		System.out.print(matriz[i][j]);
		    		
		    	}
		    	System.out.println("");
		    }
		} else if(indices==3) {
			
			String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","tomates"}};
			for(int filas =0 ; filas<frutas.length ; filas++) {
		    	for(int col=0 ; col<frutas[filas].length ; col++) {
		    		System.out.println("frutas " + filas + "-"+ col + ": " + frutas[filas][col]);
		    		
		    	}
		    	System.out.println("");
		    }
			
		}else if(indices==4) {
			AM_MPersona personas[][] = new AM_MPersona[2][3];
			personas[0][0] = new AM_MPersona("Juan");
			personas[0][1] = new AM_MPersona("Carlos");
		} 
			
		
				
		else {
			 JOptionPane.showMessageDialog(null, "Numero fuera de Rango. Digitar numero Valido");
		}
		
		
				
		
		
		
		
	}

}
