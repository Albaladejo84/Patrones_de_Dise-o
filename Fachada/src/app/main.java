package app;

import clases.FachadaBanco;

public class main {

	public static void main(String[] args) {
		FachadaBanco miBanco = new FachadaBanco();
		miBanco.concedeHipoteca();
		miBanco.dimeCuentas();
		miBanco.pideTarjeta();
	}
}
