package Ejercicio2;


public class AlumnoGC extends Alumno{

	public AlumnoGC(String nombre, String rango, int participacion, float calificacion, int regalos) {
		super(nombre, rango, participacion, calificacion, regalos);
		
	}

	@Override
	public float getCalificacion() {
		float notaCalificacion = 1.05f*calificacion;
		if (calificacion>10) {
			return 10.0f;
		}else {
			return calificacion;
		}	
	}

	@Override
	public float getParticipacion() {
		float notaParticipacion = participacion/2;
		return notaParticipacion;
	}

	@Override
	public float getRegalos() {
		float notaRegalos = regalos*(rango.length());
		return notaRegalos;
	}
	
}
