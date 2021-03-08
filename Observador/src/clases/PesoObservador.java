package clases;

public class PesoObservador extends Observador{
	private double cambioEuro = 30;
	
	public  PesoObservador(SujetoObservado sujeto) {
		this.setSujeto(sujeto);
		this.getSujeto().agregarObservador(this);
	}
	
	
	@Override
	public void actualizar() {
		System.out.println(this.sujeto.getEstado()*cambioEuro);
		
	}
}
