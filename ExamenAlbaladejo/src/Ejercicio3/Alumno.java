package Ejercicio3;

public class Alumno {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
}
