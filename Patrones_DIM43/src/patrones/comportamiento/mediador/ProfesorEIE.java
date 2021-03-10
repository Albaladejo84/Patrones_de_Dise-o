package patrones.comportamiento.mediador;

public class ProfesorEIE extends ParticipanteEIE{
	
	public ProfesorEIE (Mediador intermediario) {
		super(intermediario);
	}

	@Override 
	public void enviarMensaje (String mensaje) {
		intermediario.enviarMensaje(mensaje, this);
	}
	
	@Override 
	public void mostrarMensaje (String mensaje) {
		System.out.println ("El profesor ha recibido el mensaje: " + mensaje);
	}
}
