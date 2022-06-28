package test.ejercicios.ej10;

import java.util.Calendar;

public class Movimiento {
	
	private String nombre = "";
	private Calendar fecha = Calendar.getInstance();
	private int valor = 0;
	
	public Movimiento(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
