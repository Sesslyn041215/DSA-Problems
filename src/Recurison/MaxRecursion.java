package Recurison;

import java.util.Scanner;

public class MaxRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = max(n,arr);
		System.out.println(result);
	}
	 public static int max(int n, int[] arr) {
		 if (n == 0) {
	            return Integer.MIN_VALUE;
	        } else {
	            int currentMax = arr[n - 1];
	            int previousMax = max(n - 1, arr);
	            return Math.max(currentMax, previousMax);
	        }
	 }
}
