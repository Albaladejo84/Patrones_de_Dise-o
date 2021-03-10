package patrones.comportamiento.mediador;

public class EstudianteEIE extends ParticipanteEIE{
	
	public EstudianteEIE (Mediador intermediario) {
		super(intermediario);
	}

	@Override 
	public void enviarMensaje (String mensaje) {
		intermediario.enviarMensaje(mensaje, this);
	}
	
	@Override 
	public void mostrarMensaje (String mensaje) {
		System.out.println ("El estudiante ha recibido el mensaje: " + mensaje);
	}
}
