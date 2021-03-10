package patrones.estructurales.compuesto;

public class CuentaCorriente implements Cuenta {

	private Double saldoCuenta;
	private String nombreCuenta;
	
	public CuentaCorriente (Double saldo, String nombre) {
		this.saldoCuenta = saldo;
		this.nombreCuenta = nombre;
	}
	
	@Override
	public void getNombreCuenta () {
		System.out.println ("Cuenta corriente de " + this.nombreCuenta);
	}
	
	@Override
	public Double getSaldo () {
		return this.saldoCuenta;
	}
	
}
