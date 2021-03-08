package app;

import clases.DolarObservador;
import clases.PesoObservador;
import clases.SujetoObservado;

public class main {

	public static void main(String[] args) {
		
		SujetoObservado sujeto = new SujetoObservado();
		PesoObservador pesoObservador = new PesoObservador(sujeto);
		DolarObservador dolarObservador = new DolarObservador(sujeto);
		sujeto.setEstado(2);
	}

}
