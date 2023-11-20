package tues03;

import java.util.Scanner;

//In the city of Toyland, there are N houses. Noddy is looking for a piece of land in the city to
//build his house. All the houses in the city lie in a straight line and all of them are given a
//house number and position of the house from the entry point of the city. Noddy wants to
//find the house numbers between which he can build the largest house. Write an algorithm to
//help Noddy to find the house numbers between which he can build his house.


//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int[] h = new int[n];
//		int[] p = new int[n];
//		int[] c = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			h[i] = scanner.nextInt();
//			p[i] = scanner.nextInt();
//			c[i] = p[i];
//		}
//
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (c[i] > c[j]) {
//					int temp = c[i];
//					c[i] = c[j];
//					c[j] = temp;
//				}
//			}
//		}
//		int max = 0, x1 = 0, x2 = 0, pos1 = 0, pos2 = 0;
//
//		for (int i = 0; i < n - 1; i++) {
//			int temp = Math.abs(c[i + 1] - c[i]);
//			if (temp > max) {
//				max = temp;
//				x1 = c[i];
//				x2 = c[i + 1];
//			}
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (p[i] == x1)
//				pos1 = i;
//			else if (p[i] == x2)
//				pos2 = i;
//		}
//
//		if (h[pos1] > h[pos2])
//			System.out.println(h[pos2] + " " + h[pos1]);
//		else
//			System.out.println(h[pos1] + " " + h[pos2]);
//	}

public class BigHouseInSingleArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 0, 7, 0, 0, 8, 0, 0, 0, 9 };
		int n = arr.length;
		int position = -1;
		int count = 0;
		int endValue = -1;
		for (int i = 0; i < n; i++) {
			int j = i;
			int x = 0;
			int pos = 0;

			while (arr[j] == 0 && j < arr.length) {
				pos = i - 1;
				x++;
				j++;
			}
			if (x > count) {
				position = pos;
				endValue = i + x;
				count = x;
			}
		}
		if (position != -1) {
			System.out.println(position + " " + endValue);
		} else {
			System.out.println("No consecutive zeros found.");
		}
	}
}
