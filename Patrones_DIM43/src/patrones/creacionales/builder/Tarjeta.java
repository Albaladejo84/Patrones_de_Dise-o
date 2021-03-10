package patrones.creacionales.builder;

public class Tarjeta {

	private final String tipoTarjeta;
	private final String numero;
	private final String nombre;
	private final String fechaFin;
	
	private Tarjeta (ConstructorTarjeta constructor) {
		this.tipoTarjeta = constructor.getTipoTarjeta();
		this.numero = constructor.getNumero();
		this.nombre = constructor.getNombre();
		this.fechaFin = constructor.getFechaFin();
										
	}
	
	public String getTipoTarjeta () {
		return this.tipoTarjeta;
	}
	
	@Override
	public String toString() {
		return "Tarjeta " + this.tipoTarjeta + " Número: " +
				this.numero + " Titular: " +
				this.nombre + " fechaFin: " +
				this.fechaFin;		
	}
	
	public static class ConstructorTarjeta{
		private String tipoTarjeta;
		private String numero;
		private String nombre;
		private String fechaFin;
		
		public ConstructorTarjeta (String tipoTarjeta, String numero) {
			this.tipoTarjeta = tipoTarjeta;
			this.numero = numero;
		}
		public ConstructorTarjeta setNombre (String nombre) {
			this.nombre = nombre;
			return this;
		}
		public ConstructorTarjeta setFechaFin (String fechaFin) {
			this.fechaFin = fechaFin;
			return this;
		}
		
		public String getTipoTarjeta() {
			return this.tipoTarjeta;
		}
	
		public String getNombre() {
			return this.nombre;
		}
		public String getNumero() {
			return this.numero;
		}
		public String getFechaFin() {
			return this.fechaFin;
		}
		
		public Tarjeta construye() {
			return new Tarjeta (this);
		}
	}
	
	
	
}
