package patrones.estructurales.compuesto;

import java.util.ArrayList;
import java.util.List;

public class CuentaCompuesta implements Cuenta{

	private List<Cuenta> cuentasHija;
	
	public CuentaCompuesta() {
		this.cuentasHija = new ArrayList<>();
	}

	@Override 
	public void getNombreCuenta () {
		for (Cuenta unaCuenta : cuentasHija) {
			unaCuenta.getNombreCuenta();
		}
	}
	
	@Override
	public Double getSaldo () {
		Double saldoTotal = 0.0;
		for (Cuenta unaCuenta : cuentasHija) {
			saldoTotal += unaCuenta.getSaldo();
		}
		return saldoTotal;
	}
	
	public void addCuenta (Cuenta nuevaCuenta) {
		this.cuentasHija.add(nuevaCuenta);
	}
	
	public void eliminarCuenta (Cuenta cuentaVieja) {
		this.cuentasHija.remove(cuentaVieja);
	}
	
}
