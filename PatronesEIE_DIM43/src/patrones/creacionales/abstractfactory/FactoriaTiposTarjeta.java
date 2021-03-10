package patrones.creacionales.abstractfactory;

public class FactoriaTiposTarjeta implements FactoriaAbstracta<MarcaTarjeta>{
	@Override
	public MarcaTarjeta create (String tipoElemento) {
		if (("VISA").equals(tipoElemento)){
			return new TarjetaVISA();
		}
		else
			if (("MASTERCARD").equals(tipoElemento)){
				return new TarjetaMastercard();
			}
			else return null;
	}

}
