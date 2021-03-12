package Ejercicio3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MasterSistemasInformacion {
	
	private Collection<String>quejas = new ArrayList<>();
	private Collection<Alumno>alumnosMaster = new ArrayList<>();
	public static MasterSistemasInformacion instanciaUnica;
	
	private MasterSistemasInformacion() {
		super();
	}
	
	public static MasterSistemasInformacion crearMaster() {
		if(instanciaUnica==null) {
			return new MasterSistemasInformacion();
		}else{
			return instanciaUnica;
		}
	}
	public void apuntarse(Alumno alumno) {
		alumnosMaster.add(alumno);
	}
	public Collection<Alumno> consultarAlumnos() {
		return alumnosMaster;
	}
	public void quejarse(Alumno alumno, String queja) {
		quejas.add("Alumno:" + alumno.toString()+ " - Queja: " + queja + "\n");
	}
	
	public Collection<String> consultarQuejas(){
		return quejas;
	}
}

