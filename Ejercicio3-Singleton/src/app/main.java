package app;

import clases.Impresora;

public class main {

	public static void main(String[] args) {
		Impresora impresora1 = Impresora.crearImpresora();
		impresora1.Imprimir("Primer mensaje impresora1");
		impresora1.Imprimir("Segundo mensaje impresora1");
		
		Impresora impresora2 = Impresora.crearImpresora();
		impresora2.Imprimir("Primer mensaje impresora 2");
		impresora2.consultarColaImpresion();
	}
}
