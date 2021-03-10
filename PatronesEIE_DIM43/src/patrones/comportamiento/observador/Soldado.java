package patrones.comportamiento.observador;

public class Soldado implements Observador{
	
	@Override
	public void actualizar (Semaforo semaforo) {
		if (semaforo.getEstado().equals("ROJO_COCHE")) {
			System.out.println("Soldado: semáforo en rojo para coches. ¡PUEDO CRUZAR!");
		}
		else
			System.out.println ("Soldado: semáforo en verde para coches. ¡NO PUEDO CRUZAR!");
	}
}
