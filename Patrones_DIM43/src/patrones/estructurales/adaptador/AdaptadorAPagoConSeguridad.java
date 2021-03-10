package patrones.estructurales.adaptador;

public class AdaptadorAPagoConSeguridad implements Pago{

	TarjetaSegura tarjetaSegura;
	
	public AdaptadorAPagoConSeguridad (String tipoTarjeta) {
		
		if (tipoTarjeta.equals("Oro")) {
			this.tarjetaSegura = new TarjetaOro();
		}
		else if (tipoTarjeta.equals("Black")) {
			this.tarjetaSegura = new TarjetaBlack();
		}
	}
	
	@Override
	public void pagar(String tipoTarjeta) {
		if (tipoTarjeta.equals("Oro")) {
			this.tarjetaSegura.pagarConSeguridadNivelAlfa();
		}
		else if (tipoTarjeta.equals("Black")) {
			this.tarjetaSegura.pagarConSeguridadNivelOmega();
		}
	}
}
