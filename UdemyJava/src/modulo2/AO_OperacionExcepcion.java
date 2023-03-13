package modulo2;

import javax.management.OperationsException;

public class AO_OperacionExcepcion extends Exception{

	public static int division(int numero1, int numero2)
			throws OperationsException {
		
		if(numero2 ==0) {
			throw new OperationsException("Division entre cero");
		}else {
			
		}
		return numero1 / numero2;
	
}
	
	
}
