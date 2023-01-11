package modulo1;

public class AP_Productos {

	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	private AP_Productos() {
		this.idProducto = ++AP_Productos.contadorProductos;
		
	}
	
	public AP_Productos (String nombre, double precio) {
		this();
		
		this.nombre = nombre;
		this.precio = precio;
	}	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AP_Productos [idProducto=");
		builder.append(idProducto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}

	 
	
	
	
	
	
	
	
	//public static void main(String[] args) {

		
		
	//}

}
