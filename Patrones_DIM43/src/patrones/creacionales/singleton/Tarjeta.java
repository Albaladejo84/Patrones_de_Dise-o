package patrones.creacionales.singleton;

public class Tarjeta {

	private String numeroTarjeta;
	private static Tarjeta INSTANCIA_UNICA;
	
	private Tarjeta () {
		
	}
	
	public synchronized static Tarjeta getInstanciaUnica () {
		if (INSTANCIA_UNICA==null) {
			INSTANCIA_UNICA = new Tarjeta();
			return INSTANCIA_UNICA;
		}
		else return INSTANCIA_UNICA;
	}

	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}
	
	public void setNumeroTarjeta (String nuevoNumero) {
		this.numeroTarjeta = nuevoNumero;
	}
}
