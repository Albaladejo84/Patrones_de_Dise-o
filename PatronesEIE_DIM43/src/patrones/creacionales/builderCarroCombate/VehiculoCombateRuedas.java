package patrones.creacionales.builderCarroCombate;

public class VehiculoCombateRuedas {

	String sistemaPropulsion;
	String sistemaComunicaciones;
	String sistemaDefensa;
	String blindaje;
	int capacidadTransporte;
	
	public VehiculoCombateRuedas () {
		this.sistemaComunicaciones = "Telecomm básico";
		this.sistemaDefensa = "Torreta cañón 30mm";
		this.sistemaPropulsion = "Ruedas 8x8";
		this.blindaje = "Básico 20mm";
		this.capacidadTransporte = 4;
	}
	
	public void setSistemaComunicaciones (String sisCom) {
		this.sistemaComunicaciones = sisCom;
	}
	
	public void setSistemaDefensa (String sisDef) {
		this.sistemaDefensa = sisDef;
	}

	public void setSistemaPropulsion (String sisProp) {
		this.sistemaPropulsion = sisProp;
	}

	public void setBlindaje (String sisBlind) {
		this.blindaje = sisBlind;
	}
	public void setCapacidadTransporte (int numSoldados) {
		this.capacidadTransporte = numSoldados;
	}

	public String getSistemaComunicaciones () {
		return this.sistemaComunicaciones;
	}
	
	public String getSistemaDefensa () {
		return this.sistemaDefensa;
	}

	public String getSistemaPropulsion () {
		return this.sistemaPropulsion;
	}

	public String getBlindaje () {
		return this.blindaje;
	}
	public int getCapacidadTransporte () {
		return this.capacidadTransporte;
	}
	
	@Override
	public String toString() {
		return "configuración de VCR: " + 
				"\n - Sistema comunicaciones:" + this.sistemaComunicaciones +
				"\n - Sistema defensa: " + this.sistemaDefensa +
				"\n - Sistema propulsión: " + this.sistemaPropulsion +
				"\n - Blindaje: " + this.blindaje +
				"\n - Capacidad: " + this.capacidadTransporte;		
	}
}
