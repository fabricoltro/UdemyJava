package modulo2;


public class AB_TestEnumeraciones {

	public static void main(String[] args) {
				
		//System.out.println(" DIA 1: "+ AB_Enumeraciones1.LUNES);
		//	indicarDiaSemana(AB_Enumeraciones1.JUEVES);
	
	System.out.println("continente no. 1: " + AB_Continenes.AFRICA);
	System.out.println("numero de paises en el 4to contienente : " + AB_Continenes.AFRICA.getPaises());
	
	System.out.println("continente no. 4: " + AB_Continenes.AMERICA);
	System.out.println("numero de paises en el 4to contienente : " + AB_Continenes.AMERICA.getPaises());
	}
	
	private static void indicarDiaSemana(AB_Enumeraciones1 dias ) {
		switch(dias) {
		case LUNES:
			System.out.println("primer dia de la semana");
			break;
		case MARTES:
			System.out.println("segundo dia de la semana");
			break;
		case MIERCOLES:
			System.out.println("3er dia de la semana");
			break;
		case JUEVES:
			System.out.println("4to dia de la semana");
			break;
		case VIERNES:
			System.out.println("5to dia de la semana");
			break;
		case SABADO:
			System.out.println("6to dia de la semana");
			break;
		case DOMINGO:
			System.out.println("7mo dia de la semana");
			break;
		}
	}
	
}
