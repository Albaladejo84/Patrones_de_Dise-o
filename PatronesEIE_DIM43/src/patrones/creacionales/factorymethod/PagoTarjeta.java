package patrones.creacionales.factorymethod;

public class PagoTarjeta implements Pago 
{
	@Override
	public void hacerPago() {
		System.out.println ("Pagando con tarjeta");
	}
}
