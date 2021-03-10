package patrones.creacionales.abstractfactory;

public class ProveedorDeFactorias {
	
	public static FactoriaAbstracta getFactoriaConcreta (String factoriaElegida) {
		if (("Tarjeta").equals(factoriaElegida)) {
			return new FactoriaTiposTarjeta();
		}
		else if (("M�todo de pago").equals(factoriaElegida)) {
			return new FactoriaMetodosPago();
		} 
		return null;
	}
}
