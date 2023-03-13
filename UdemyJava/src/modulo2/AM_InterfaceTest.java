package modulo2;

public class AM_InterfaceTest {

	public static void main(String[] args) {
		
		AM_InterfaceDataAcces datos1 = new AM_ImplementacionMySql();
		
		datos1.listar();

		imprimir(datos1);
		
	}

	public static void imprimir(AM_InterfaceDataAcces datos) {
		datos.listar();
	}
	
}
