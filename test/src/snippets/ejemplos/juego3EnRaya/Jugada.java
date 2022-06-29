package snippets.ejemplos.juego3EnRaya;

public class Jugada {

	private Valor valor;
	private int nJugador;
	private Ficha ficha;
	
	public Jugada(Valor valor, int nJugador, Ficha ficha) {
		this.valor = valor;
		this.nJugador = nJugador;
		this.ficha = ficha;
	}
	
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	public int getnJugador() {
		return nJugador;
	}
	public void setnJugador(int nJugador) {
		this.nJugador = nJugador;
	}
	
	
	
	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	@Override
	public boolean equals(Object obj) {
		Jugada jugada = (Jugada) obj;
		
		if (this.valor != jugada.valor) return false;
		if (this.nJugador != jugada.nJugador) return false; 
		
		return true;
	}
	
	@Override
	public String toString() {
		return "PJ: %d - V: %s - T: %s".formatted(this.nJugador, this.valor, this.ficha);
	}
	
}
