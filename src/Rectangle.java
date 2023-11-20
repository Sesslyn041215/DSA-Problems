
public class Rectangle extends Polygon {
	private double length;
	private double breadth;
	

	public Rectangle(double length, double breadth){
		super(4);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double calculateArea() {
		return length * breadth;
	}
	
	@Override
	public double circumference() {
		return 2*(length + breadth);
	}
}