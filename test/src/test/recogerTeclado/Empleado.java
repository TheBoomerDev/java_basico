package test.recogerTeclado;

import java.util.Calendar;

public class Empleado {
	// nombre, edad, sueldoMes, antiguedad
	private String nombre;
	
	private int edad = 0;
	 
	private int sueldo = 1000;
	
	private Calendar antiguedad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public Calendar getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Calendar antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
}
