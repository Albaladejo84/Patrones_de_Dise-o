package Ejercicio2;

public class AlumnoET extends Alumno {
	
	public AlumnoET(String nombre, String rango, int participacion, float calificacion, int regalos) {
		super(nombre, rango, participacion, calificacion, regalos);

	}

	public float getCalificacion() {
		float notaCalificacion = 0.95f*calificacion;
			return notaCalificacion;
		
	}

	@Override
	public float getParticipacion() {
		float notaParticipacion = (float) (participacion*1.25);
		return notaParticipacion;
	}

	@Override
	public float getRegalos() {
		float notaRegalos = regalos*(nombre.length());
		return notaRegalos;
	}
}
