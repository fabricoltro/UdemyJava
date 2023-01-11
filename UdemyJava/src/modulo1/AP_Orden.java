package modulo1;

import java.util.Iterator;

public class AP_Orden {

	private int idOrden;
	private AP_Productos productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	//constante
	private static final int MAX_PRODUCTOS = 10;
	 
	public AP_Orden() {
		this.idOrden = ++AP_Orden.contadorOrdenes ;
		this.productos = new AP_Productos[ AP_Orden.MAX_PRODUCTOS]; 
	}
	
	public void agregarProducto (AP_Productos producto) {
		if(this.contadorProductos<AP_Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto ;
		}else {
			System.out.println("Se ha superado la cantidad maxima de productos: "+AP_Orden.MAX_PRODUCTOS);
		}
		
	}
	
	public double calcularTotal() {
		double total = 0;
		for(int i=0 ; i<contadorProductos ; i++) {
			
			total += this.productos[i].getPrecio();
		}
		return total ;
	}
	
	public void mostrarOrden() {
		System.out.println("id orden : " + idOrden );
	    double totalOrden = this.calcularTotal();
	    System.out.println("total de la orden : $ " + totalOrden);
	    System.out.println("productos de la Orden :");
	    for(int i=0 ; i<this.contadorProductos ; i++) {
	    	System.out.println(this.productos[i]);
	    	
	    }
		
	}
	
	
	
	
}

