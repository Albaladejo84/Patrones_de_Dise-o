package patrones.estructurales.adaptador;

public class TarjetaClasica implements Pago{
	
	AdaptadorAPagoConSeguridad adaptadorPagoSeguro;

	@Override
	public void pagar (String tipoTarjeta) {
		if (tipoTarjeta.equals("Clásica")) {
			System.out.println ("Tarjeta clásica: pagando sin ningún tipo de seguridad");
		}
		else if (tipoTarjeta.equals("Oro")) {
			adaptadorPagoSeguro = new AdaptadorAPagoConSeguridad("Oro");
			adaptadorPagoSeguro.pagar("Oro");
		}
		else if (tipoTarjeta.equals("Black")) {
			adaptadorPagoSeguro = new AdaptadorAPagoConSeguridad("Black");
			adaptadorPagoSeguro.pagar("Black");
		}
		else 
			System.out.println ("No se puede hacer el pago. Tarjeta no reconocida");
	}
}
