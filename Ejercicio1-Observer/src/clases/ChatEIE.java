package clases;

import java.util.ArrayList;
import java.util.Collection;

public class ChatEIE {
	private String nombreChat;
	private Collection<UsuarioChat> observadores;
	private Collection<Mensaje> mensajes;
	
	
	public ChatEIE(String nombreChat) {
		super();
		this.nombreChat = nombreChat;
		observadores = new ArrayList<UsuarioChat>();
		mensajes = new ArrayList<Mensaje>();
	}
	
	public void enviarMensaje(UsuarioChat usuario, String contenidoMensaje) {
		mensajes.add(new Mensaje(usuario, contenidoMensaje));
		SistemaNotificacion.notificarCambio(this);
	}

	public Collection<UsuarioChat> getObservadores() {
		return observadores;
	}

	
	public Collection<Mensaje> getMensajes() {
		return mensajes;
	}
	

	@Override
	public String toString() {
		String salida;
		salida = nombreChat + "\n";
		for (Mensaje mensaje : mensajes) {
			salida +=mensaje.toString();
		}
		if (salida.equals(nombreChat + "\n")) {
			salida = "Chat vacio";
		}
		return salida;
	}
	
}
