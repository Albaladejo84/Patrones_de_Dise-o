package Ejercicio1;

import java.util.ArrayList;
import java.util.Collection;

public class UnidadHospitalaria implements IElemento{
	private String nombre;
	private Collection<UnidadHospitalaria> unidades;
	private Collection<Habitacion> habitaciones;
	
	@Override
	public int getHabitaciones() {
		int numeroHabitaciones = 0;
		for (Habitacion habitacion : habitaciones) {
			numeroHabitaciones = numeroHabitaciones + habitacion.getHabitaciones();
		}
		for (UnidadHospitalaria unidad : unidades) {
			numeroHabitaciones = numeroHabitaciones + unidad.getHabitaciones();
		}
		return numeroHabitaciones;
	}
	
	@Override
	public int getPacientesCovid() {
		int numeroCovid=0;
		for (Habitacion habitacion : habitaciones) {
				numeroCovid = numeroCovid + habitacion.getPacientesCovid();
			}
		for (UnidadHospitalaria unidad : unidades) {
			numeroCovid = numeroCovid + unidad.getPacientesCovid();
		}
		return numeroCovid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Collection<UnidadHospitalaria> getUnidades() {
		return unidades;
	}
	public void setUnidades(Collection<UnidadHospitalaria> unidades) {
		this.unidades = unidades;
	}
	public void setHabitaciones(Collection<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	public UnidadHospitalaria(String nombre) {
		super();
		this.nombre = nombre;
		unidades = new ArrayList<>();
		habitaciones = new ArrayList<>();
	
	}
	public void agragarHabitacion(Habitacion habitacion) {
		habitaciones.add(habitacion);
	}
}
