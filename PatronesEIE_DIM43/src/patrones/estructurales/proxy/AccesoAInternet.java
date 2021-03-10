package patrones.estructurales.proxy;

public class AccesoAInternet implements Internet{
	@Override
	public void conectarA (String url) throws Exception{
		System.out.println("Me he conectado a " + url);
	}

}
