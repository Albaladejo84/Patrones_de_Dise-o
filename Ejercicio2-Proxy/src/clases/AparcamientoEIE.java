package clases;

public class AparcamientoEIE extends Aparcamiento implements AccesoAcademia{
	
	private String nombreAparcamiento;
	
	
	public AparcamientoEIE(String nombreAparcamiento) {
		super();
		this.nombreAparcamiento = nombreAparcamiento;
	}

	@Override
	public void accederAcademia(Vehiculo vehiculo, Aparcamiento aparcamiento) {
		System.out.println(vehiculo.getMatricula() + " " + vehiculo.getTipo() + ". AUTORIZADO A APARCAR EN " + aparcamiento.getNombreAparcamiento());
		
	}

	public String getNombreAparcamiento() {
		return nombreAparcamiento;
	}

	public void setNombreAparcamiento(String nombreAparcamiento) {
		this.nombreAparcamiento = nombreAparcamiento;
	}
	

}
