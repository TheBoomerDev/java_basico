package test;

public class Producto {
	float precio =  5.50f;
	String nombre = "Nombre Producto";
	int unidades = 100;
	
	public float valorTodos() {
		return this.precio * this.unidades;
	}
}
