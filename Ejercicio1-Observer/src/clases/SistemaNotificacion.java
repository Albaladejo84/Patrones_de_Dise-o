package clases;

public abstract class SistemaNotificacion {

	public static void agregarSuscriptor(UsuarioChat usuario, ChatEIE chat) {
		chat.getObservadores().add(usuario);
	}
	public static void quitarSuscriptor(UsuarioChat usuario, ChatEIE chat) {
		for (UsuarioChat observador : chat.getObservadores()) {
			if (observador.getNombre().equals(usuario)) {
				chat.getObservadores().remove(observador);
			}
		}
	}
	public static void notificarCambio(ChatEIE chat) {
			for (UsuarioChat observador : chat.getObservadores()) {
				observador.actualizar(chat);
			}
	}
}
