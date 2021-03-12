package Ejercicio2;

public abstract class Alumno {
	public String nombre;
	public String rango;
	public int participacion;
	public float calificacion;
	public int regalos;
	public float notaFinal;
	
	public abstract float getCalificacion();
	public abstract float getParticipacion();
	public abstract float getRegalos();
	
	public float getNotaFinal() {
		notaFinal = (float) ((calificacion*0.25)+(participacion*0.3) + (regalos*0.45));
		return notaFinal;	
	}
	public Alumno(String nombre, String rango, int participacion, float calificacion, int regalos) {
		super();
		this.nombre = nombre;
		this.rango = rango;
		this.participacion = participacion;
		this.calificacion = calificacion;
		this.regalos = regalos;
	}
	
	
	
}
