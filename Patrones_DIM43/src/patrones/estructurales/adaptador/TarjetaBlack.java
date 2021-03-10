package patrones.estructurales.adaptador;

public class TarjetaBlack implements TarjetaSegura{
	@Override
	public void pagarConSeguridadNivelAlfa() {
		System.out.println ("Tarjeta Black: pagando con seguridad nivel ALFA");
	}
	
	@Override
	public void pagarConSeguridadNivelOmega() {
		System.out.println ("Tarjeta Black: pagando con seguridad nivel OMEGA");		
	}

}
