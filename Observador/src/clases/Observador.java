package clases;

public abstract class Observador {
	
	public SujetoObservado sujeto;
	public abstract void actualizar();
	
	public SujetoObservado getSujeto() {
		return sujeto;
	}
	public void setSujeto(SujetoObservado sujeto) {
		this.sujeto = sujeto;
	}
}
