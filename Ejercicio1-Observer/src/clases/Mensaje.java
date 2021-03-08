package clases;

import java.time.Instant;

public class Mensaje {
	private UsuarioChat usuario;
	private String mensaje;
	Instant fecha;
	
	public Mensaje(UsuarioChat usuario, String mensaje) {
		super();
		this.usuario = usuario;
		this.mensaje = mensaje;
		this.fecha = Instant.now();
	}

	public UsuarioChat getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioChat usuario) {
		this.usuario = usuario;
	}

	public Instant getFecha() {
		return fecha;
	}

	public void setFecha(Instant fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return usuario + " ha dicho: " + mensaje + " con fecha: " + fecha + "\n";
	}
}
