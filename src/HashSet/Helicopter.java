package HashSet;

class Rotorcraft {
	protected final int height = 5;

	 int fly() {
		 return 1;
	 };
}

interface CanFly {
}

public class Helicopter extends Rotorcraft implements CanFly {
	private int height = 10;

	protected int fly() {
		return super.height;
	}

	public static void main(String[] args) {
		Helicopter h = (Helicopter) new Rotorcraft();
		System.out.println(h.fly());
	}
}