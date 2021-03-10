package patrones.comportamiento.observador;

public interface SistemaNotificacion {

	void addObservador(Observador o);
	void deleteObservador (Observador o);
	void notificarActualizacion (Semaforo semaforo);
	
}
