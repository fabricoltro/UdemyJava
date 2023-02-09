package modulo1;

public class BA_MainPC {

	public static void main(String[] args) {

		BA_Monitor monitorHP = new BA_Monitor("HP", 13);
		BA_Teclado tecladoHP = new BA_Teclado("Inalambrico", "HP");
		BA_Mouse   mouseHP   = new BA_Mouse("cCable", "HP");
		
		BA_Computadora computadoraHP = new BA_Computadora("computadoraHP", monitorHP, tecladoHP, mouseHP);
		
		BA_Monitor monitorLenovo = new BA_Monitor("Lenovo", 16);
		BA_Teclado tecladoLenovo = new BA_Teclado("Cableado", "Lenovo");
		BA_Mouse   mouseLenovo   = new BA_Mouse("inalambrico", "Razer");
		
		BA_Computadora computadoraLenovo = new BA_Computadora("computadoraLenovo", monitorLenovo, tecladoLenovo, mouseLenovo);
		
		BA_Orden orden1 = new BA_Orden();
		BA_Orden orden2 = new BA_Orden();
		orden1.agregarComputadora(computadoraLenovo);
		orden2.agregarComputadora(computadoraHP);
		orden1.mostrarOrden();
		orden2.mostrarOrden();
	}

}
