package clases;

public class CuentaBancoBImpl implements ICuenta{

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double cantidad) {
		cuenta.setSaldo(cuenta.getSaldo()- cantidad);
		return cuenta;
	}

	@Override
	public Cuenta ingresarDinero(Cuenta cuenta, double cantidad) {
		cuenta.setSaldo(cuenta.getSaldo()+ cantidad);
		return cuenta;
	}

	@Override
	public void consultarSaldo(Cuenta cuenta) {
		System.out.println("Saldo cuenta: " + cuenta.getSaldo());
		
	}
}
