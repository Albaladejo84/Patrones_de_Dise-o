package patrones.creacionales.abstractfactory;

public class PagoDebito implements MetodoPago{
	@Override
	public String hacerPago() {
		return "Pagando a débito";
	}

}
