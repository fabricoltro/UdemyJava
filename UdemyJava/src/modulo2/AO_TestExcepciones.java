package modulo2;

import java.awt.SystemColor;

import javax.management.OperationsException;

public class AO_TestExcepciones{

	public static void main(String[] args) {
		
	int numero1,numero2 ;	
	//excepcion de tipo ARITMETICA	
	int resultado = 0;	
	try{
		resultado = 10/0;
	}catch(Exception e){
		e.printStackTrace(System.out);
	System.out.println(resultado);	
	System.out.println("excepcion de tipo aritmetica");
	}
	
	//excepcion de tipo ARITMETICA	
	try{
		 
		resultado = AO_OperacionExcepcion.division(10, 0);
	}catch(Exception e){
		e.printStackTrace(System.out);
	System.out.println(resultado);	
	System.out.println("excepcion de tipo Operacion");
	System.out.println(e.getMessage());
	}		

	try{		 
		resultado = AO_OperacionExcepcion.division(10, 0);
	}catch(OperationsException e){		
	System.out.println("ocurrio un error de tipo operacion");		
	}catch (Exception e) {
		System.out.println("ocurrio un error de tipo Excepcion");
		System.out.println(e.getMessage());
	}finally {
		System.out.println("se reviso la division entre cero");
	}	
	System.out.println(resultado);	
	
	
	
	
	}
		
}
