package wed18;

import java.util.Scanner;

//Joe is throwing a party for his N friends. There is a cake store nearby, and he wants to buy a
//cake for his friends. Each cake has exactly K slices. Joe's friends get sad if one gets more slices
//than the other. Also, Joe gets sad if there are some cake slices left. More formally, suppose Joe
//buys P cakes, then everyone is happy if and only if there is a way to distribute K⋅P slices
//between N friends.
//You need to find the minimum number of cakes Joe has to buy to share all the slices among his
//friends so that none of them gets sad. Note that Joe hates cakes and doesn't take any slices.
//Input Format
//First line of input contains T, the number of test cases. Then the test cases follow.
//Each test case contains two space-separated integers N and K, where N is the number of
//friends of Joe and K is the number of slices in a cakes
//Output Format
//For each test case, print the minimum number of cakes Joe has to buy to share among his
//friends so that none of his friends gets sad.

public class CakesAndSlices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int result = -1;

			for (int j = 1; j <= n; j++) {
				int cake = j * k;

				if (cake % n == 0) {
					result = j;
					break;
				}
			}  

			System.out.println(result);
		}
	}

//	public static void main(String[] args) {
//		int x = 5;
//		int y = 3;
//		int z = y;
//		while(x > y || y % x != 0) { y += z };
//		System.out.println(y/z);
//	}
	
	
	
//	public static int hcf(int a, int b) {
//		if (b == 0)
//
//			return a;
//		return hcf(b, a % b);
//	}
//  public static void main(String args[]) {
//		Scanner s = new Scanner(System.in);
//		int t = s.nextInt();
//		for (int i = 0; i < t; i++) {
//			int a = s.nextInt();
//			int b = s.nextInt();
//			System.out.println(a / hcf(a, b));
//		}
//	}
}
