package app;

import clases.Cuenta;
import clases.CuentaBancoAImpl;
import clases.CuentaBancoBImpl;
import clases.CuentaProxy;
import clases.ICuenta;

public class main {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(01, "Paco Perez", 100.0);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
		cuentaProxy.consultarSaldo(cuenta);
		cuentaProxy.ingresarDinero(cuenta, 50.5);
		cuentaProxy.consultarSaldo(cuenta);
	}

}
