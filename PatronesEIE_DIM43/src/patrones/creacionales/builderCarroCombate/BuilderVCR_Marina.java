package patrones.creacionales.builderCarroCombate;

public class BuilderVCR_Marina implements BuilderVCR{
	
	VehiculoCombateRuedas VCR;
	
	public BuilderVCR_Marina () {
	}
	
	public void nuevoVCR () {
		this.VCR = new VehiculoCombateRuedas();
	}
	public void setSistemaComunicaciones () {
		this.VCR.setSistemaComunicaciones ("Telecom encriptado");
	}
	
	public void setSistemaDefensa () {
		this.VCR.setSistemaDefensa ("Torreta láser + cañón 45mm");
	}

	public void setSistemaPropulsion () {
		this.VCR.setSistemaPropulsion ("8x8 reforzado");
	}

	public void setBlindaje () {
		this.VCR.setBlindaje ("Extra 35mm");
	}
	public void setCapacidadTransporte (int numSoldados) {
		this.VCR.setCapacidadTransporte (numSoldados);
	}
	public VehiculoCombateRuedas getVCR() {
		return this.VCR;
	}

}