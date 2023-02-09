package modulo2;

public class AD_Autoboxing {

	public static void main(String[] args) {

		//clases primitivas vs envolventes
		
		//int - integer ;
		//long - long
		//float - float
		//double - double
		
		Integer entero = 10;
		System.out.println("entero : "+ entero.intValue());
		System.out.println("entero double : " + entero.doubleValue());
		
		
		int entero2 = entero;
		System.out.println(" entero 2 :" + entero2);
	}

}
