package patrones.comportamiento.plantilla;

public class PagoTarjeta extends Pago{
	@Override
	void verificarCredenciales() {
		System.out.println ("Verificando número tarjeta y CRC");
	}
	
	@Override
	void comprobarSaldo() {
		System.out.println("Conectando al banco para ver si hay saldo");
	}
	
	@Override
	void cobrarImporte() {
		System.out.println ("Haciendo efectivo el cobro");
	}

}
