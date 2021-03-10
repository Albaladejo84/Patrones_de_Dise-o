package patrones.creacionales.factorymethod;

public class PagoPayPal implements Pago{
	@Override
	public void hacerPago () {
		System.out.println ("Pagando vía PayPal");
	}

}
