class Sum {
	
	private int a;
	private int b;
	private int c;
	private int d;

	public Sum(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int totalSum() {
		return a + b + c + d;
	}
}

public class SumOfDigits {
	public static void main(String[] args) {
		Sum s = new Sum(10, 20, 30, 40);
		System.out.println(s.totalSum());
	}
}
