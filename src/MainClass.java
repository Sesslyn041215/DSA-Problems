import java.util.Scanner;
class Area {
	private int l;
	private int b;

	public Area(int l, int b) {
		if(l <= 0 || b <= 0) {
			this.l = 0;
			this.b = 0;
		}
		this.l = l;
		this.b = b;
	}

	public int calculateArea() {
		return l * b;
	}
}

class Cost {
	private int cost;

	public Cost(int cost) {
		if(cost <= 0) {
			this.cost = 0;
		}
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

}

class Calculate {
	private Area a;
	private Cost c;
	
	public Calculate(Area a, Cost c) {
		this.a = a;
		this.c = c;
	}
	
	public int totalCost(){
		return a.calculateArea() * c.getCost();
	}
	
}
public class MainClass {
	public static void main(String[] args) {
     Area a = new Area(3 , 2);
     Cost c = new Cost(10);
     Calculate cal = new Calculate(a, c);
     System.out.println(cal.totalCost());
	}
}
