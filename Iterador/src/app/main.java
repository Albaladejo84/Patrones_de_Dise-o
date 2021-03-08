package app;

import clases.Iterador;
import clases.IteradorTarjetas;
import clases.Lista;
import clases.ListaTarjetas;
import clases.Tarjeta;

public class main {

	public static void main(String[] args) {
		Tarjeta[] misTarjetas = new Tarjeta[5];
		misTarjetas[0] = new Tarjeta("Visa");
		misTarjetas[1] = new Tarjeta("American Express");
		misTarjetas[2] = new Tarjeta("ING");
		misTarjetas[3] = new Tarjeta("Black 1");
		misTarjetas[4] = new Tarjeta("Black 2");
		
		Lista miLista = new ListaTarjetas(misTarjetas);
		Iterador miIterador = miLista.getIterador();
		
		while (miIterador.tieneSiguiente()) {
			Tarjeta miTarjeta = (Tarjeta) miIterador.siguiente();
			System.out.println(miTarjeta.getTipoTarjeta());
		}
	}

}
