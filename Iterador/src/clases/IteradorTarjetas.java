package clases;

public class IteradorTarjetas implements Iterador{
	private Tarjeta[] tarjetas;
	private int posicion;
	
	
	
	public IteradorTarjetas(Tarjeta[] tarjetas) {
		super();
		this.tarjetas = tarjetas;
		this.posicion = 0;
	}

	@Override
	public boolean tieneSiguiente() {
		boolean resultado = true;
		if (posicion >= this.tarjetas.length) {
			resultado = false;
		}
		return resultado;
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
