package patrones.comportamiento.iterador;

public class IteradorTarjetas implements Iterador {
	private Tarjeta[] tarjetas;
	private int posicion;
	
	public IteradorTarjetas (Tarjeta [] nuevasTarjetas) {
		this.tarjetas = nuevasTarjetas;
		this.posicion = 0;
	}
	@Override
	public boolean tieneSiguiente() {
		if (posicion >= this.tarjetas.length) {
			return false;
		}
		else 
			return true;
	}
	
	@Override
	public Object siguiente() {		
		return tarjetas[posicion++];
	}
	
	@Override
	public Object itemActual() {
		return tarjetas[posicion];
	}
}
