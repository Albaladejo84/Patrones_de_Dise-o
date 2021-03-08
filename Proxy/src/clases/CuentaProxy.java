package clases;

public class CuentaProxy implements ICuenta{
	
	private ICuenta cuentaReal;
	
	public CuentaProxy(ICuenta cuentaReal) {
		super();
		this.cuentaReal = cuentaReal;
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double cantidad) {
		return cuentaReal.retirarDinero(cuenta, cantidad);
	}

	@Override
	public Cuenta ingresarDinero(Cuenta cuenta, double cantidad) {
		return cuentaReal.ingresarDinero(cuenta, cantidad);
	}

	@Override
	public void consultarSaldo(Cuenta cuenta) {
		cuentaReal.consultarSaldo(cuenta);
	}

}
