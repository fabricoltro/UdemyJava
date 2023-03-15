package modulo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BD_ManejoArchivos {

	public static void crearArchivo(String archivoJava) {
		File archivo = new File(archivoJava);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("se creo el archivo");
		} catch (FileNotFoundException e) {
	
			e.printStackTrace(System.out);
		}
		
	}
	
	public static void escribirArchivo (String nombreArchivo, String contenido) {
		
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("se ha escrito el archivo");
		} catch (FileNotFoundException e) {
	
			e.printStackTrace(System.out);
		}
		
		
	}
	
	public static void anexarArchivo(String nombreArchivo, String contenido) {
		
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close();
			System.out.println("se ha anexado el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
			e.printStackTrace(System.out);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void leerArchivo(String nombreArchivo) {
		
		var archivo = new File(nombreArchivo);
		try {
			var entradas = new BufferedReader( new FileReader(archivo) );
			var lectura = entradas.readLine();
			while (lectura != null) {
				System.out.println("lectura = " + lectura);
				lectura = entradas.readLine();
				
			}
			entradas.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}		
		
	}
	
	public static void main(String[] args) {
		
       var nombreArchivo = "prueba.txt";
       
       crearArchivo(nombreArchivo);
		
	}
	
	
	
}
