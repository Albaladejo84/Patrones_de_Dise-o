package patrones.comportamiento.observador;

public class CarroCombate implements Observador{
	
	@Override
	public void actualizar (Semaforo semaforo) {
		if (semaforo.getEstado().equals("ROJO_COCHE")) {
			System.out.println("Carro de combate: sem�foro en rojo para coches. �NO PUEDO PASAR!");
		}
		else
			System.out.println ("Carro de combate: sem�foro en verde para coches. �PUEDO PASAR!");
	}
}