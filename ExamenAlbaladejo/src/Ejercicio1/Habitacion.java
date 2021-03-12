package Ejercicio1;

import java.time.Instant;

public class Habitacion {
	private String numeroHabitacion;
	private String nombre;
	private String apellido;
	private String dni;
	private Instant fechaIngreso;
	private boolean covid;
	public String getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public void setNumeroHabitacion(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Instant getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Instant fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public boolean isCovid() {
		return covid;
	}
	public void setCovid(boolean covid) {
		this.covid = covid;
	}
	public Habitacion(String numeroHabitacion, String nombre, String apellido, String dni, Instant fechaIngreso,
			boolean covid) {
		super();
		this.numeroHabitacion = numeroHabitacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaIngreso = fechaIngreso;
		this.covid = covid;
	}
	
	
}
