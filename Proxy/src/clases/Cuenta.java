package clases;

public class Cuenta{
	
	private int id;
	private String usuario;
	private double saldo;
	
	
	
	public Cuenta(int id, String usuario, double saldo) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
