package patrones.estructurales.fachada;

public class CuentaCorriente implements ProductoBancario{
	public void getDetalles() {
		System.out.println("Tengo una cuenta corriente");
	}
}
