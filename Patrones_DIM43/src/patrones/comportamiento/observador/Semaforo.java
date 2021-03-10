package patrones.comportamiento.observador;

public class Semaforo {
	public String estado;
	
	public Semaforo (String estadoInicial) {
		this.estado = estadoInicial;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado (String nuevoEstado) {
		this.estado = nuevoEstado;
	}
}
