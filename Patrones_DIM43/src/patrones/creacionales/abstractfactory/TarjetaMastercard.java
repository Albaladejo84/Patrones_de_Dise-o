package patrones.creacionales.abstractfactory;

public class TarjetaMastercard implements MarcaTarjeta{
	@Override
	public String getMarcaTarjeta() {
		return "MASTERCARD";
	}
	@Override
	public String getNumeroTarjeta() {
		return "0000 0000 MAST CARD";
	}

}
