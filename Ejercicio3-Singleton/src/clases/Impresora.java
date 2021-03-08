package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Impresora {
	private List<String>colaImpresión;
	private static Impresora impresora;
	

	private Impresora() {
		super();
		colaImpresión = new ArrayList<String>();
	}
	public void Imprimir(String mensaje) {
		colaImpresión.add(mensaje);
	}
	public static Impresora crearImpresora() {
		if (impresora==null) {
			impresora = new Impresora();
		}
		return impresora;
	}
	public void consultarColaImpresion() {
		for (int i = 0; i < colaImpresión.size(); i++) {
			System.out.println("Posición nº" + (i+1) + ":" + colaImpresión.get(i));
		}
	}
	public List<String> getColaImpresión() {
		return colaImpresión;
	}
}
