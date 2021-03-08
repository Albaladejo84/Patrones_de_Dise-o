package clases;

public abstract class UsuarioChat {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void actualizar(ChatEIE chat) {
		System.out.println("Notificando cambios a " + getNombre() + " en el chat: " + chat);
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
