package Recurison;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HosayaTriangle {
	public static void main(String[] args) {
		//1st method
		int n = 6;
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();

		arr.add(1);
		arr1.add(1);
		arr1.add(1);

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arr2 = new ArrayList<>();
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (i == 0) {
					System.out.print(arr.get(j) + " ");
				}
				if (i == 1) {
					System.out.print(arr1.get(j) + " ");
				}

				else if (i > 1) {

					if (j == i - 1) {
						int a = arr1.get(j);
						System.out.print(a + " ");
						arr2.add(a);

					} else if (j == i) {
						int a = arr2.get(0);

						System.out.print(a + " ");
						arr2.add(a);

						arr = arr1;
						arr1 = arr2;

					} else {
						int a = arr.get(j) + arr1.get(j);
						System.out.print(a + " ");
						arr2.add(a);
					}
				}
			}
			System.out.println();
		}
	}
	
	

}
