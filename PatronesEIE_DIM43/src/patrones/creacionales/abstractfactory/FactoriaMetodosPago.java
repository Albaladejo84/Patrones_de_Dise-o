package patrones.creacionales.abstractfactory;

public class FactoriaMetodosPago implements FactoriaAbstracta<MetodoPago>{
	@Override
	public MetodoPago create (String tipoElemento) {
		if (("CREDITO").equals(tipoElemento)){
			return new PagoCredito();
		}
		else
			if (("DEBITO").equals(tipoElemento)){
				return new PagoDebito();
			}
			else return null;
	}

}
