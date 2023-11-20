package Sort;

import java.util.Scanner;

public class QuickSort {
	public static void change(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int pivott(int[] arr, int start, int end) {
		int i = start - 1;
		int pivot = arr[end];
		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				i++;
				change(arr, start, end);
			}
		}
		change(arr, i + 1, end);
		return (i + 1);
	}

	public static void q_s(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = pivott(arr, start, end);
			q_s(arr, start, pivot - 1);
			q_s(arr, pivot + 1, end);
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		q_s(a, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
