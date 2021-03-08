package clases;

public abstract class Aparcamiento {
	
	private String nombreAparcamiento;

	public String getNombreAparcamiento() {
		return nombreAparcamiento;
	}

	public void setNombreAparcamiento(String nombreAparcamiento) {
		this.nombreAparcamiento = nombreAparcamiento;
	}
	public abstract void accederAcademia(Vehiculo vehiculo, Aparcamiento aparcamiento);
	
}
