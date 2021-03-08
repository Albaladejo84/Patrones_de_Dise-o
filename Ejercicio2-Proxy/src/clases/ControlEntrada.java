package clases;

import java.util.ArrayList;
import java.util.Collection;

public class ControlEntrada implements AccesoAcademia{
	
	private Collection<Vehiculo> permitidos;
	private Collection<Vehiculo> prohibidos;
	
	public Collection<Vehiculo> getPermitidos() {
		return permitidos;
	}
	public Collection<Vehiculo> getProhibidos() {
		return prohibidos;
	}
	
	
	
	public ControlEntrada() {
		super();
		permitidos = new ArrayList<Vehiculo>();
		prohibidos = new ArrayList<Vehiculo>();
	}
	@Override
	public void accederAcademia(Vehiculo vehiculo, Aparcamiento aparcamiento) {
		for (Vehiculo vehiculoPermitido : permitidos) {
			if (vehiculo.getTipo().equals(vehiculoPermitido.getTipo())) {
				aparcamiento.accederAcademia(vehiculo, aparcamiento);
			}
		}
		for (Vehiculo vehiculoProhibido : prohibidos) {
			if (vehiculo.getTipo().equals(vehiculoProhibido.getTipo())) {
				System.out.println("Acceso denegado");
			}
		}
	}
	
	
}
