
public class App {

	public static void main(String[] args) {
	AbstractFactory factoriaFormas = FactoryOfFactories.getFactory("ShapeFactory");
	Shape triangulo = factoriaFormas.getShape("triangle");
	triangulo.draw();

	}

}
