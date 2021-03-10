package patrones.comportamiento.mediador;

public abstract class ParticipanteEIE {
	protected Mediador intermediario;
	
	public ParticipanteEIE(Mediador intermediario) {
		this.intermediario = intermediario;
	}
	
	public abstract void enviarMensaje (String mensaje);
	public abstract void mostrarMensaje (String mensaje);
}
