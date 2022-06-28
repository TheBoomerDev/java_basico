package snippets.herencia;

public class Ejemplo {

	public static void main(String[] args) {
		
		// Clase padre
		Animal animal = new Animal();
		animal.come(100);
		animal.sacarVida(100);
		boolean estaVivo = animal.estaVivo();
		
		
		// Clase Hija - SubClass
		Ave ave = new Ave();
		ave.come(100);
		boolean pajaroVivo = ave.estaVivo();
		ave.sacarVida(100);
		ave.vuela();
		
		// Otra clase hija - SubClass
		Pez pez = new Pez();
		pez.come(100);
		boolean pezVivo = ave.estaVivo();
		pez.sacarVida(100);
		pez.nada();

		
		//  Polimorfismo
		Animal cosa = new Pez();
		Animal cosa2 = new Ave();
		
		// No Deja
		// Pez pezCosa = new Ave();
		// Ave aveCosa = new Pez();
		//Pez pezCosa2 = new Animal();
	}

}
