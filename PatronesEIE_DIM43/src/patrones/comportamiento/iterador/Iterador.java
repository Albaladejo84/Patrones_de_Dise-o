package patrones.comportamiento.iterador;

public interface Iterador {
	boolean tieneSiguiente();
	Object siguiente();
	Object itemActual();
}
