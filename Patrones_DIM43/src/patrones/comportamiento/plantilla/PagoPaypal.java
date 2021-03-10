package patrones.comportamiento.plantilla;

public class PagoPaypal extends Pago{
		@Override
		void verificarCredenciales() {
			System.out.println ("Comprobar login y password");
		}
		
		@Override
		void comprobarSaldo() {
			System.out.println("Ver si hay saldo en el monedero PayPal");
		}
		
		@Override
		void cobrarImporte() {
			System.out.println ("Reducir saldo según importe");
		}

	}


