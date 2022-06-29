package snippets.ejemplos.juego3EnRaya;
 

public class Juego {
	
	private Jugada[][] tablero = {
			{null, null, null},
			{null, null, null},
			{null, null, null}
		}; 
	
	// Otra forma de hacer la matriz
	// private List<ArrayList<Jugada>> tablero = new ArrayList<ArrayList<Jugada>>();
	
	public boolean estaOcupada(int posX, int posY) {
		return (tablero[posX][posY] != null);
	}
	
	public boolean hayHuecos() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				Jugada jugada = tablero[i][j];
				if (jugada == null) return true;
			}
		}
		
		return false;
	}
	
	public boolean addJugada(Jugada jugada, int posX, int posY) {
		if ( ( (posY < 0) || posY > 2 ) || ( (posX < 0) || posX > 2 ) || jugada == null) {
			return false;
		} 
		
		// Comprobamos si hay una ficha
		if (tablero[posX][posY] != null) {
			Jugada previa = tablero[posX][posY];
			// Comprobamos si la puede comer o no
			boolean puedeComer = Ficha.meCome(previa.getFicha(), jugada.getFicha());
			if (!puedeComer) return false;
		}
		
		// Ponemos la Ficha
		tablero[posX][posY] = jugada; 
		
		return true;
	}
	
	public EstadoPartida comprobar() {
		
		Jugada anteriorX = tablero[0][0];
		Jugada anteriorY = tablero[0][0];
		int acumuladorX = 0;
		int acumuladorY = 0;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				// Comprobamos un Eje
				Jugada jugada = tablero[i][j];
				if (jugada.equals(anteriorX)) {
					acumuladorX++;
				}else {
					acumuladorX = 0;
				}
				
				// Comprobamos el Otro Eje
				if (jugada.equals(anteriorY)) {
					acumuladorY++;
				}else {
					acumuladorY = 0;
				}
				
				// ¿Hay Ganador?
				if (acumuladorX >= 3) {
					if (jugada.getnJugador() == 1) return EstadoPartida.GANA_1;
					else return EstadoPartida.GANA_2;
				}
				if (acumuladorY >= 3) {
					if (jugada.getnJugador() == 1) return EstadoPartida.GANA_1;
					else return EstadoPartida.GANA_2;
				}
			}
		} 
		 
		
		return EstadoPartida.EMPATE;
	}
	
	

}
