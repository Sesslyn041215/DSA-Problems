package wed11;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, print the array in such a way that the first element is
//first maximum
//and second element is first minimum and so on.
//Input:
//55
//1 4 7 9
//Output:
//9 1 7 4 5

public class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		int j = 0;
		int k = n - 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[k] + " ");
				k--;
			} else {
				System.out.print(arr[j] + " ");
				j++;
			}
		}

	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] ar = new int[n];
//		for (int i = 0; i < n; i++) {
//			ar[i] = sc.nextInt();
//		}
//		Arrays.sort(ar);
//		int i = 0, j = n - 1;
//		while (i < j) {
//			System.out.print(ar[j--] + " ");
//			System.out.print(ar[i++] + " ");
//		}
//		if (n % 2 != 0)
//			System.out.print(ar[i]);
//	}
}
