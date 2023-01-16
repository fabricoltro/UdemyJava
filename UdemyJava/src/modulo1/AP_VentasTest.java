package modulo1;

public class AP_VentasTest {

	public static void main(String[] args) {
		
		AP_Productos producto1 = new AP_Productos("Remera", 100.00);
		AP_Productos producto2 = new AP_Productos("Pantalon", 120.00);
		AP_Productos producto3 = new AP_Productos("Campera", 180.50);
	
		AP_Orden orden1 = new AP_Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();
		AP_Orden orden3 = new AP_Orden();
		orden3.agregarProducto(producto3);
		orden3.mostrarOrden();
	}

}
