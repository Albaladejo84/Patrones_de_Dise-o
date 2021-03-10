package patrones.creacionales.builderCarroCombate;

public class BuilderVCR_UME implements BuilderVCR{
	
	VehiculoCombateRuedas VCR;
	
	public BuilderVCR_UME () {
	}
	
	public void nuevoVCR () {
		this.VCR = new VehiculoCombateRuedas();
	}
	public void setSistemaComunicaciones () {
		this.VCR.setSistemaComunicaciones ("Telecom satélite");
	}
	
	public void setSistemaDefensa () {
		this.VCR.setSistemaDefensa ("Torreta agua");
	}

	public void setSistemaPropulsion () {
		this.VCR.setSistemaPropulsion ("Orugas");
	}

	public void setBlindaje () {
		this.VCR.setBlindaje ("Básico");
	}
	public void setCapacidadTransporte (int numSoldados) {
		this.VCR.setCapacidadTransporte (numSoldados);
	}
	public VehiculoCombateRuedas getVCR() {
		return this.VCR;
	}


}
