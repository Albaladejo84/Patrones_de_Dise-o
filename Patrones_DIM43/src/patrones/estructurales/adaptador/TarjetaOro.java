package patrones.estructurales.adaptador;

public class TarjetaOro implements TarjetaSegura{

	@Override
	public void pagarConSeguridadNivelAlfa() {
		System.out.println ("Tarjeta Oro: pagando con seguridad nivel ALFA");
	}
	
	@Override
	public void pagarConSeguridadNivelOmega() {
		System.out.println ("Tarjeta Oro: pagando con seguridad nivel OMEGA");		
	}
}
