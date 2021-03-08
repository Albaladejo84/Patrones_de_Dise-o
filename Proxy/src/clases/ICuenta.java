package clases;

public interface ICuenta {
	public Cuenta retirarDinero(Cuenta cuenta, double cantidad);
	public Cuenta ingresarDinero(Cuenta cuenta, double cantidad);
	public void consultarSaldo(Cuenta cuenta);
}
