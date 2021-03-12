package Ejercicio1;

import java.util.ArrayList;
import java.util.Collection;

public class Planta implements ICompuesto{
	private int numeroPlanta;
	private Collection<UnidadHospitalaria> unidades;
	private Collection<Habitacion> habitaciones;
	
	@Override
	public int getHabitaciones() {
		int numeroHabitaciones = habitaciones.size();
		for (UnidadHospitalaria unidad : unidades) {
			numeroHabitaciones = numeroHabitaciones + unidad.getHabitaciones();
		}
		return numeroHabitaciones;
	}
	@Override
	public int getPacientesCovid() {
		int numeroCovid=0;
		for (Habitacion habitacion : habitaciones) {
			if (habitacion.isCovid()) {
				numeroCovid++;
			}
		}
		for (UnidadHospitalaria unidad : unidades) {
			numeroCovid = numeroCovid + unidad.getPacientesCovid();
		}
		return numeroCovid;
	}
	public Planta(int numeroPlanta) {
		super();
		this.numeroPlanta = numeroPlanta;
		unidades = new ArrayList<>();
		habitaciones = new ArrayList<>();
	}
	public void agregarUnidad (UnidadHospitalaria unidad) {
		unidades.add(unidad);
	}
	
	
}
