package modulo1;

public class BA_Orden {

	private final int idOrden ;
	private BA_Computadora computadoras[] ;
	private static int contadorOrdenes ;
	private static final int MAX_COMPUTERS = 10;
	private int contadorComputadoras;
	
	
	
	public BA_Orden() {
		
		this.idOrden = ++BA_Orden.contadorOrdenes;
		this.computadoras = new BA_Computadora[BA_Orden.MAX_COMPUTERS] ;
	}
	
	 public void agregarComputadora(BA_Computadora computadora) {
		 if(this.contadorComputadoras < MAX_COMPUTERS) {
			 this.computadoras[this.contadorComputadoras++] = computadora ;
		 }else {
			 System.out.println("superaste el maximo de computadoras " + BA_Orden.MAX_COMPUTERS);
		 }
	 }
	
	public void mostrarOrden() {
		System.out.println("Orden = " + this.idOrden);
		System.out.println("Computadoras de la orden" + this.idOrden);
		for(int i = 0 ; i<this.contadorComputadoras ; i++) {
			System.out.println(this.computadoras[i]);
		}
		
	}
	
	
}
