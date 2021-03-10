package patrones.comportamiento.iterador;

public class Tarjeta {

	private String tipoTarjeta;
	
	public Tarjeta (String tipo) {
		this.tipoTarjeta = tipo;
	}
	
	public String getTipoTarjeta () {
		return this.tipoTarjeta;
	}
	
	public void setTipoTarjeta (String tipo) {
		this.tipoTarjeta = tipo;
	}
}
