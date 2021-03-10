package patrones.comportamiento.mediador;

public class MediadorConcreto implements Mediador{
	
	private EstudianteEIE estudiante;
	private ProfesorEIE profesor;
	
	public void setEstudiante (EstudianteEIE participante) {
		this.estudiante = participante;
	}

	public void setProfesor (ProfesorEIE participante) {
		this.profesor = participante;
	}
	
	@Override
	public void enviarMensaje(String mensaje, ParticipanteEIE emisor) {
		if (emisor == this.estudiante) {
			this.profesor.mostrarMensaje (mensaje);
		}
		else if (emisor == this.profesor)
			this.estudiante.mostrarMensaje (mensaje);
	}
}
