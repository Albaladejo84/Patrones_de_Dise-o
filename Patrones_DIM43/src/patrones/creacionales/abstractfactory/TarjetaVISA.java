package patrones.creacionales.abstractfactory;

public class TarjetaVISA implements MarcaTarjeta{
	@Override
	public String getMarcaTarjeta() {
		return "VISA";
	}
	@Override
	public String getNumeroTarjeta() {
		return "0000 0000 0000 VISA";
	}
}
