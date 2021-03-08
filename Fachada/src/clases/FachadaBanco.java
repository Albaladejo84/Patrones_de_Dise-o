package clases;

public class FachadaBanco {
	private ProductoBancario unaCuenta;
	private ProductoBancario unaHipoteca;
	private ProductoBancario unaTarjeta;
	
	
	public FachadaBanco() {
		super();
		this.unaCuenta = new CuentaCorriente();
		this.unaHipoteca = new Hipoteca();
		this.unaTarjeta = new Tarjeta();
	}
	
	public void dimeCuentas() {
		this.unaCuenta.getDetalles();
	}
	
	public void concedeHipoteca() {
		this.unaHipoteca.getDetalles();
	}
	
	public void pideTarjeta() {
		this.unaTarjeta.getDetalles();
	}
}
