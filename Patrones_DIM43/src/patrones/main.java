package patrones;
import patrones.creacionales.factorymethod.*;

import patrones.creacionales.abstractfactory.*;
import patrones.creacionales.builder.*;
import patrones.creacionales.builderCarroCombate.*;
import patrones.creacionales.singleton.*;
import patrones.creacionales.factorymethod.*;
import patrones.estructurales.adaptador.*;
import patrones.estructurales.compuesto.*;
import patrones.estructurales.compuesto.CuentaCorriente;
import patrones.estructurales.fachada.*;
import patrones.estructurales.proxy.Internet;
import patrones.estructurales.proxy.ProxyInternet;
import patrones.comportamiento.iterador.*;
import patrones.comportamiento.mediador.EstudianteEIE;
import patrones.comportamiento.mediador.MediadorConcreto;
import patrones.comportamiento.mediador.ProfesorEIE;
import patrones.comportamiento.observador.*;
import patrones.comportamiento.mediador.*;
import patrones.comportamiento.plantilla.*;
import patrones.comportamiento.plantilla.Pago;

public class main {
	public static void main(String[] args) {
		//probarFactoryMethod (TipoPago.PAYPAL);
		//probarFactoryMethod (TipoPago.TARJETA);
		probarAbstractFactory ();
		//probarBuilder();
		//probarBuilderVCR();
		//probarSingleton();
		//probarAdapter();
		//probarComposite();
		//probarFacade();
		//probarProxy();
		//probarIterator();
		//probarObserver();
		//probarMediator();
		
		//probarPlantilla();
	}
	private static void probarPlantilla() {
		patrones.comportamiento.plantilla.Pago metodoPago = new 
				patrones.comportamiento.plantilla.PagoTarjeta();
		metodoPago.hacerPago();
		
		metodoPago = new
				patrones.comportamiento.plantilla.PagoPaypal();
		metodoPago.hacerPago();
		
		
	}
	
	private static void probarMediator() {
		
		MediadorConcreto esclavo = new MediadorConcreto();
		EstudianteEIE nestor = new EstudianteEIE(esclavo);
		ProfesorEIE marcos = new ProfesorEIE(esclavo);
		
		esclavo.setEstudiante(nestor);
		esclavo.setProfesor(marcos);
		
		marcos.enviarMensaje("Has suspendido la asignatura");
		nestor.enviarMensaje("(llorando) Noooooooooo!");
		
	}
	
	private static void probarObserver() {
		// Suscriptores
		Soldado johnRambo = new Soldado();
		CarroCombate m1Abrahams = new CarroCombate();
		
		// Sistema de suscripci�n
		NotificadorConcreto alertasDGT = new NotificadorConcreto();
		
		// Elemento observable
		Semaforo miSemaforo= new Semaforo("ROJO_COCHE");
		
		alertasDGT.addObservador(johnRambo);
		alertasDGT.addObservador(m1Abrahams);
		
		// Cambios en el sem�foro
		
		alertasDGT.notificarActualizacion(miSemaforo);
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {}
		
		miSemaforo.setEstado("VERDE_COCHE");
		
		alertasDGT.notificarActualizacion(miSemaforo);
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {}
			
	}
	
	private static void probarIterator () {
// Creo los datos a cargar
		patrones.comportamiento.iterador.Tarjeta[] misTarjetas = new patrones.comportamiento.iterador.Tarjeta[5];
		
// Relleno los datos que hay que cargar
		misTarjetas[0] = new patrones.comportamiento.iterador.Tarjeta("VISA");
		misTarjetas[1] = new patrones.comportamiento.iterador.Tarjeta("American Express");
		misTarjetas[2] = new patrones.comportamiento.iterador.Tarjeta("ING");
		misTarjetas[3] = new patrones.comportamiento.iterador.Tarjeta("Black 1");
		misTarjetas[4] = new patrones.comportamiento.iterador.Tarjeta("Black B");
		
// Creo el agregado/colecci�n que contiene los datos a cargar
		patrones.comportamiento.iterador.Lista miLista = new patrones.comportamiento.iterador.ListaTarjetas(misTarjetas);
// Creo el iterador que permite recorrer la colecci�n con los datos cargados
		patrones.comportamiento.iterador.Iterador miIterador = miLista.getIterador();
		
// Recorro la colecci�n con los datos cargados usando el iterador apropiado
		while (miIterador.tieneSiguiente()) {
			// Creo un objeto del tipo concreto que contiene el agregado 
			patrones.comportamiento.iterador.Tarjeta miTarjeta = (patrones.comportamiento.iterador.Tarjeta)miIterador.siguiente();
			System.out.println(miTarjeta.getTipoTarjeta());
		}		
	}
	
	private static void probarProxy() {
		Internet routerMovistar = new ProxyInternet();
		try {
			routerMovistar.conectarA("google.es");
			routerMovistar.conectarA("mde.es");
			routerMovistar.conectarA("elitetorrent.org");
		}
		catch (Exception e){
			System.out.println("La excepci�n capturada es:" + e.getMessage());
		}
		System.out.println("Fin de la conexi�n");
	}
	
	private static void probarFacade() {
		FachadaBanco miBanco = new FachadaBanco();
		
		miBanco.concedeHipoteca();
		miBanco.dimeCuentas();
		miBanco.pideTarjeta();
	}
	
	private static void probarComposite () {
	
		CuentaCompuesta misCuentas = new CuentaCompuesta ();
		CuentaCorriente miCuentaNomina = new CuentaCorriente(2000.0, "Cuenta de gastos");
		CuentaCorriente miCuentaB = new CuentaCorriente (100000.0, "Cuenta para Dubai");
		CuentasJoven miCuentaPeque = new CuentasJoven(100.0, "Marquitos");
		
		misCuentas.addCuenta (miCuentaNomina);
		misCuentas.addCuenta(miCuentaB);
		misCuentas.addCuenta(miCuentaPeque);
		
/*		Otra forma de hacerlo: 
  		Cuenta misCuentas = new CuentaCompuesta ();
		Cuenta miCuentaNomina = new CuentaCorriente(2000.0, "Cuenta de gastos");
		Cuenta miCuentaB = new CuentaCorriente (100000.0, "Cuenta para Dubai");
		
		((CuentaCompuesta)misCuentas).addCuenta (miCuentaNomina);
		((CuentaCompuesta)misCuentas).addCuenta(miCuentaB);

	*/	
		misCuentas.getNombreCuenta();
		System.out.println("Saldo total:" + misCuentas.getSaldo());
		
		
	}
	
	private static void probarAdapter() {
		TarjetaClasica miTarjeta = new TarjetaClasica();
		miTarjeta.pagar("Cl�sica");
		miTarjeta.pagar("Oro");
		miTarjeta.pagar("Black");
		miTarjeta.pagar("Efectivo");
	}
	
	private static void probarSingleton () {
		System.out.println (patrones.creacionales.singleton.Tarjeta.getInstanciaUnica().getNumeroTarjeta());
		
		patrones.creacionales.singleton.Tarjeta.getInstanciaUnica().setNumeroTarjeta("0000 1111 2222 3333");

		System.out.println (patrones.creacionales.singleton.Tarjeta.getInstanciaUnica().getNumeroTarjeta());
		
		patrones.creacionales.singleton.Tarjeta.getInstanciaUnica().setNumeroTarjeta("0000");

		System.out.println (patrones.creacionales.singleton.Tarjeta.getInstanciaUnica().getNumeroTarjeta());

	}
	
	private static void probarBuilderVCR() {
		Director_MinisDef dptoIngenieriaMDef = new Director_MinisDef();
		
		BuilderVCR_UME constructorUME = new BuilderVCR_UME();
		VehiculoCombateRuedas VCRUME_Mando;
		VehiculoCombateRuedas VCRUME_Tte;
		VehiculoCombateRuedas VCRUME_Basico;

		VCRUME_Mando = dptoIngenieriaMDef.construirVCR(constructorUME, "Mando");
		VCRUME_Tte = dptoIngenieriaMDef.construirVCR(constructorUME, "Transporte");
		VCRUME_Basico = dptoIngenieriaMDef.construirVCR(constructorUME, "Basico");
		
		System.out.println("UME Mando con " + VCRUME_Mando.toString());
		System.out.println("UME Transporte con " + VCRUME_Tte.toString());
		System.out.println("UME B�sico con " + VCRUME_Basico.toString());
		
		BuilderVCR_Marina constructorMarina = new BuilderVCR_Marina();
		VehiculoCombateRuedas VCRMarina_Mando;
		VehiculoCombateRuedas VCRMarina_Tte;
		VehiculoCombateRuedas VCRMarina_Basico;		
		
		VCRMarina_Mando = dptoIngenieriaMDef.construirVCR(constructorMarina, "Mando");
		VCRMarina_Tte = dptoIngenieriaMDef.construirVCR(constructorMarina, "Transporte");
		VCRMarina_Basico = dptoIngenieriaMDef.construirVCR(constructorMarina, "Basico");
		
		System.out.println("Marina Mando con " + VCRMarina_Mando.toString());
		System.out.println("Marina Transporte con " + VCRMarina_Tte.toString());
		System.out.println("Marina B�sico con " + VCRMarina_Basico.toString());
		
	}
	private static void probarBuilder () {
		
		patrones.creacionales.builder.Tarjeta miTarjeta = new patrones.creacionales.builder.Tarjeta.ConstructorTarjeta("VISA", "1234 1239 3344 4495")
				.setFechaFin("16/02/2028")
				.setNombre("Marcos L�pez")
				.construye();
		System.out.println(miTarjeta);
		
	}
	
	private static void probarFactoryMethod (TipoPago formaDePagar) {
		Pago miPago = (Pago) FactoriaPagos.pagar(formaDePagar);
		miPago.hacerPago(); // <----------
		
//		miPago = FactoriaPagos.pagar(TipoPago.PAYPAL);
//		miPago.hacerPago(); // <----------
	}
	
	private static void probarAbstractFactory () {
		FactoriaAbstracta<MarcaTarjeta> miFactoriaDeTarjetas = ProveedorDeFactorias.getFactoriaConcreta("Tarjeta");
		MarcaTarjeta miTarjeta = miFactoriaDeTarjetas.create("VISA");
		
		FactoriaAbstracta<MetodoPago> miFactoriaDeMetodosPago = ProveedorDeFactorias.getFactoriaConcreta("M�todo de pago");
		MetodoPago miMetodoDePago = miFactoriaDeMetodosPago.create("CREDITO");
		System.out.println ("Una tarjeta de tipo: " + miTarjeta.getMarcaTarjeta() + " y m�todo de pago: " + miMetodoDePago.hacerPago());
		
		
	}

}
