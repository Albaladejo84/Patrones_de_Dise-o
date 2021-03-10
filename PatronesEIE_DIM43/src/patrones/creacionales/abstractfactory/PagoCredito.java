package patrones.creacionales.abstractfactory;

public class PagoCredito implements MetodoPago{
	@Override
	public String hacerPago() {
		return "Pagando a crédito";
	}

}
