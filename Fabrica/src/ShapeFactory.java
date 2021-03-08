
public class ShapeFactory {
	
	public static Shape getShape(String shape) {
		Shape miShape = null;
		if (shape.equals("circle")) {
			
			miShape = new Circle();
		}else if (shape.equals("triangle")) {
			miShape = new Triangle();
		}
		else if (shape.equals("square")) {
			miShape = new Square();
		}
		else {
			miShape = new SinForma();
		}
		return miShape;
	}
}
