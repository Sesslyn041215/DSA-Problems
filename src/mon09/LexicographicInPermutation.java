package mon09;

import java.util.Scanner;

//Given a sequence S = {1, 2, 3.... N} (2 <= N <= 11). Find the lexicographically smallest
//(earliest in dictionary order) derangement of S.
//A derangement of S is any permutation of S is such that, no two elements in S and its
//permutation occur in its same position.
//Input:
//3
//Output:
//2 3 1
public class LexicographicInPermutation {
	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		int n = value.nextInt();
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}

		int len = n / 2;
		int realLen = (len * 2);

		for (int k = 0; k < realLen - 1; k = k + 2) {
			int temp = arr[k + 1];
			arr[k + 1] = arr[k];
			arr[k] = temp;
		}

		if (n % 2 != 0) {
			int temp = arr[n - 1];
			arr[n - 1] = arr[n - 2];
			arr[n - 2] = temp;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
