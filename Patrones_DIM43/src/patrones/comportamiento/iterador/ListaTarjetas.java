package patrones.comportamiento.iterador;

public class ListaTarjetas implements Lista {
	private Tarjeta[] tarjetas;
	
	public ListaTarjetas (Tarjeta [] nuevasTarjetas) {
		this.tarjetas = nuevasTarjetas;
	}
	
	@Override
	public Iterador getIterador() {
		return new IteradorTarjetas(this.tarjetas);
	}

}
