package clases;

public class DolarObservador extends Observador{
	private double cambioDolar= 1.5;
	public DolarObservador(SujetoObservado sujeto) {
		this.setSujeto(sujeto);
		sujeto.agregarObservador(this);
	}
	@Override
	public void actualizar() {
		System.out.println(this.sujeto.getEstado()*cambioDolar);
		
	}

}
