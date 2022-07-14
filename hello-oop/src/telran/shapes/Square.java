package telran.shapes;

public class Square extends Rectangle {
	public Square(int width) {
		super(width, width);
	}
	
	@Override
	public void setWidth(int width) {
		setHeigtWidth(width);
	}
	
	@Override
	public void setHeight(int heigth) {
		setHeigtWidth(heigth);
	}

	private void setHeigtWidth(int length) {
		super.setHeight(length);
		super.setWidth(length);
	}	

}
