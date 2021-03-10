package patrones.creacionales.builderCarroCombate;

public class Director_MinisDef {

	public VehiculoCombateRuedas construirVCR (BuilderVCR constructorVCR, String tipoVCR) {
		constructorVCR.nuevoVCR();
		if (tipoVCR.equals("Mando")) {
			constructorVCR.setBlindaje();
			constructorVCR.setCapacidadTransporte(4);
			constructorVCR.setSistemaComunicaciones();
		}
		else if (tipoVCR.equals("Transporte")) {
			constructorVCR.setBlindaje();
			constructorVCR.setCapacidadTransporte(12);
			constructorVCR.setSistemaDefensa();			
		}
		else { // Básico de unidad
			constructorVCR.setSistemaPropulsion();
			constructorVCR.setSistemaComunicaciones();
		}
		return constructorVCR.getVCR();
	}

}
