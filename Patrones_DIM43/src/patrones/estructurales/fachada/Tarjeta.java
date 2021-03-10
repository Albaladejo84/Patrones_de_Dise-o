package patrones.estructurales.fachada;

public class Tarjeta implements ProductoBancario{
	public void getDetalles () {
		System.out.println ("Tengo una tarjeta de débito");
	}
}
