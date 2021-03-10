package patrones.estructurales.compuesto;

public class CuentasJoven implements Cuenta{

	private Double saldoCuenta;
	private String nombreCuenta;
	
	public CuentasJoven (Double saldo, String nombre) {
		this.saldoCuenta = saldo + 100;
		this.nombreCuenta = nombre;
	}
	
	@Override
	public void getNombreCuenta () {
		System.out.println ("Cuenta joven: " + this.nombreCuenta);
	}
	
	@Override
	public Double getSaldo () {
		return this.saldoCuenta;
	}
	
}

