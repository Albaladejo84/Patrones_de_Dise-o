
public class FactoryOfFactories {
	public static AbstractFactory getFactory(String factoryType) {
		AbstractFactory factory = null;
		if (factoryType.equals("ShapeFactory")) {
			factory = new ShapeFactory();
		}else if (factoryType.equals("ColorFactory")) {
			factory = new ColorFactory();
		}
		return factory;
	}
}
