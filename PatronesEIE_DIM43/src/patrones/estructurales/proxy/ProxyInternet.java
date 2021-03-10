package patrones.estructurales.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	private Internet laWeb = new AccesoAInternet();
	private static List<String> urlProhibidas;
	
	static {
		urlProhibidas = new ArrayList<>();
		urlProhibidas.add("mde.es");
		urlProhibidas.add("facebook.com");
		urlProhibidas.add("web.whatsapp.com");
	}
	
	@Override
	public void conectarA(String url) throws Exception {
		if (urlProhibidas.contains(url)) {
			throw new Exception ("DANGER! DANGER! ¡Está accediendo a una URL prohibida! ¡Se notificará a las autoridades!");
		}
		this.laWeb.conectarA(url);		
	}
	
}
