package patrones.comportamiento.observador;

import java.util.ArrayList;
import java.util.List;

public class NotificadorConcreto implements SistemaNotificacion{
	private List<Observador> suscriptores = new ArrayList<>();
	
	@Override 
	public void addObservador (Observador o) {
		this.suscriptores.add(o);
	}

	public void deleteObservador (Observador o) {
		this.suscriptores.remove(o);
	}
	
	@Override 
	public void notificarActualizacion (Semaforo semaforo) {
		for (Observador o: suscriptores) {
			o.actualizar(semaforo);
		}
	}
}
