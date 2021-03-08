package app;

import clases.AparcamientoEIE;
import clases.ControlEntrada;
import clases.Vehiculo;

public class main {

	public static void main(String[] args) {
		Vehiculo coche = new Vehiculo("", "coche");
		Vehiculo camion = new Vehiculo("", "camion");
		AparcamientoEIE aparcamientoEIE = new AparcamientoEIE("AparcamientoEIE");
		ControlEntrada controlEntrada = new ControlEntrada();
		controlEntrada.getPermitidos().add(coche);
		controlEntrada.getProhibidos().add(camion);
		
		Vehiculo coche1 = new Vehiculo("3167GLL", "coche");
		Vehiculo camion1 = new Vehiculo("6666PTP", "camion");
		controlEntrada.accederAcademia(coche1, aparcamientoEIE);
		controlEntrada.accederAcademia(camion1, aparcamientoEIE);
	}

}
