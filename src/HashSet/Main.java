package HashSet;

import java.util.*;

class Main {
	static class Garden {
		public static void circle(int n) {
			double result = (double) 3.14 * n * n;
			System.out.println(result);
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		Garden.circle(r);
	}

}

