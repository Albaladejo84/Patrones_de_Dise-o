
public class ColorFactory implements AbstractFactory{
	
	@Override
	public Color getColor(String colorP) {
		
		Color color = null;
		if (colorP.equals("Blue")) {
			color = new Blue();
		}else if (colorP.equals("Red")) {
			color = new Red();
		}else if (colorP.equals("Green")) {
			color = new Green();
		}
		return color;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
