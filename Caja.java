package ajedrez;

public class Caja {
	
	public int fila;
	public int columna;
	public Pieza pieza;
	
	//Este metodo sirve para ver si a la caja que va una ficha hay otra
	public static boolean misma(Caja c1, Caja c2){
		return ((c1.columna==c2.columna) && (c1.fila==c2.fila));  
	}  

	public Caja(int a, int b) { fila = a; columna = b; }

	  
	  

}
