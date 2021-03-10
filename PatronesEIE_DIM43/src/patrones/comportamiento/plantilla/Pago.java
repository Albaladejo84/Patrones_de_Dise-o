package patrones.comportamiento.plantilla;

public abstract class Pago {

	abstract void verificarCredenciales();
	abstract void comprobarSaldo();
	abstract void cobrarImporte();
	
	public final void hacerPago() {
		verificarCredenciales();
		comprobarSaldo();
		cobrarImporte();
	}
}
