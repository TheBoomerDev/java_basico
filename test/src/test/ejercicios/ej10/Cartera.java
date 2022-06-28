package test.ejercicios.ej10;

import java.util.ArrayList;
import java.util.List;

public class Cartera {

	private static List<Movimiento> ingresos = new ArrayList<Movimiento>();
	private static List<Movimiento> gastos = new ArrayList<Movimiento>();
	
	private Cartera() {}
	
	
	public static void addIngreso(Movimiento mov) {
		ingresos.add(mov);
	}
	
	public static void addGasto(Movimiento mov) {
		gastos.add(mov);
	}
	
	
	
}
