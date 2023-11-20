package fri13;

//	Baby Ehab is known for his love for a certain operation. He has an array a of length n, and he decided
//	to keep doing the following operation on it:
//	he picks 2 adjacent elements; he then removes them and places a single integer in their place: their
//	bitwise XOR. Note that the length of the array decreases by one.
//	Now he asks you if he can make all elements of the array equal. Since babies like to make your life
//	harder, he requires that you leave at least 2 elements remaining.
//	input
//	2
//	3
//	0 2 2
//	4
//	2 3 1 10
//	output
//	YES
//	NO

import java.util.*;

class BabyEnabOperation {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int fc = 0; fc < t; fc++) {
			int n = s.nextInt();
			int a[] = new int[n];
			for (int m = 0; m < n; m++)
				a[m] = s.nextInt();
			int xor = 0;
			for (int i = 0; i < n; i++)
				xor ^= a[i];
			if (xor == 0)
				System.out.println("YES");
			else {
				int nx = 0, c = 0;
				for (int i = 0; i < n; i++) {
					nx ^= a[i];
					if (nx == xor) {
						c += 1;
						nx = 0;
					}
				}

				if (c >= 2)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}