import java.util.*;
import java.lang.Exception;

public class Main {
	public static void main(String[] args) throws Exception   {
		Scanner sc = new Scanner(System.in);
		double sideOfSquare = sc.nextDouble();
		sc.close();

		// ADD Code here and Modify to validate sideOfSquare
		if (sideOfSquare <= 0.0) {
			System.out.println("Invalid side for a square");
		} else {
			Polygon pc = new Square(sideOfSquare);
			System.out.println("No of Sides in polygon:" + pc.getNoOfSides());
			System.out.println("Area of Square:" + pc.calculateArea());
			System.out.println("Circumference of Square:" + pc.circumference());
		}
		
	}
}