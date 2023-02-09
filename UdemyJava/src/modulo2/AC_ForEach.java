package modulo2;

public class AC_ForEach {
	
	private String nombre ;  

	public AC_ForEach(String nombre) {
		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AC_ForEach [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		
		int edades[] = {1,2,3,4,5,8};		
		for(int edad : edades ) {
			System.out.println(edad);
		}
	
		
		AC_ForEach personas[] = {new AC_ForEach("Carla"), new AC_ForEach("Riquelme"), (new AC_ForEach("julieta "))};
		for(AC_ForEach persona : personas ) {
			System.out.println(persona);
		}
	}

	
	
	
	
}
