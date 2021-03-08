package clases;

public class Vehiculo {
	private String matricula;
	private String tipo;
	
	
	public Vehiculo(String matricula, String tipo) {
		super();
		this.matricula = matricula;
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String modelo) {
		this.tipo = modelo;
	}
	
	
}
