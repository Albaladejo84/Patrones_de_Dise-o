
public class ShapeFactory implements AbstractFactory{
	@Override
	public Shape getShape(String shape) {
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

	@Override
	public Color getColor(String color) {
	
		return null;
	}
}
