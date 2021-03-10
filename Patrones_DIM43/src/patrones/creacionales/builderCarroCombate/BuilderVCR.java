package patrones.creacionales.builderCarroCombate;

public interface BuilderVCR {
	void nuevoVCR();
	void setSistemaComunicaciones();
	void setSistemaDefensa ();
	void setSistemaPropulsion ();
	void setBlindaje ();
	void setCapacidadTransporte (int numSoldados);
	VehiculoCombateRuedas getVCR();
}
