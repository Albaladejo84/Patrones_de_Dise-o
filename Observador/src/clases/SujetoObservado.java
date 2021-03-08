package clases;

import java.util.ArrayList;
import java.util.List;

public class SujetoObservado {
	private List<Observador>observadores = new ArrayList<Observador>();
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}
	public void agregarObservador(Observador observador) {
		observadores.add(observador);
	}
	public void notificarTodosObservadores() {
		for (Observador observador : observadores) {
			observador.actualizar();
		}
	}
}
