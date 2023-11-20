package Sort;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int[] a, int start, int mid, int end) {
		int i = start, j = mid + 1, k = start;
		int[] array = new int[a.length];

		while (i <= mid && j <= end) {
			if (a[i] < a[j]) {
				array[k++] = a[i++];
			} else {
				array[k++] = a[j++];
			}
		}
		
		while (i <= mid) {
			array[k++] = a[i++];
		}
		while (j <= end) {
			array[k++] = a[j++];
		}

		for (int y = start; y <= end; y++) {
			a[y] = array[y];
		}
	}

	public static void merge_sort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, start, mid);
			merge_sort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();

		merge_sort(a, 0, n - 1); 

		for (int y = 0; y < n; y++) {
			System.out.print(a[y] + " "); 
		}
	}

}