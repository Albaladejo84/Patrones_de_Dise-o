
public class App {

	public static void main(String[] args) {
		Shape forma = ShapeFactory.getShape("triagle");
		forma.draw();
	}

}
