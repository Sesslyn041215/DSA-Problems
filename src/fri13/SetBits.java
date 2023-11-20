package fri13;

import java.util.Scanner;

//Given the number N, write a program to count the total set bits in all the numbers from 1 to N.
//Input :
//3
//Output:
//4

public class SetBits {
	public static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;

		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countSetBits(n));
	}
}
