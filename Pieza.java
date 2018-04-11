package ajedrez;

public abstract class Pieza {
	public boolean esBlanco;
	
	public Pieza(int jugador){
	}
	
	public boolean obtenerJugador(){
		return 1;
	}
	
	
	public abstract boolean posibleMovimiento(Coordenada a, Coordenada b);
	
}
