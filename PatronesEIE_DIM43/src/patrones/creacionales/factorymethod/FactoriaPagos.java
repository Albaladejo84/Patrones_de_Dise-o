package patrones.creacionales.factorymethod;

public class FactoriaPagos {

	public static Pago pagar (TipoPago tipoPago) {
		switch (tipoPago) {
		case TARJETA:
			return new PagoTarjeta();
		case PAYPAL:
			return new PagoPayPal();
		default:
			return new PagoTarjeta();
				
		}
	}
}
