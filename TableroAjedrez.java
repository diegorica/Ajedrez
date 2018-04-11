package ajedrez;

public class TableroAjedrez {
	private Caja[][] tablero;
	private static TableroAjedrez miTableroAjedrez = new TableroAjedrez();
	
	private TableroAjedrez()
	{
		this.tablero = new Caja[8][8];
	}
	public TableroAjedrez getTablero()
	{
		return miTableroAjedrez;
	}
	public boolean validasCoordenadas(int x, int y){
		return true;
	}
	
	public void imprimirTableroAjedrez(){
	}
	

}
