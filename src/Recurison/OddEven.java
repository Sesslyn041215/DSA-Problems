package Recurison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		
		Collections.sort(odd);
		for (int o : odd) {
			System.out.print(o + " ");
		}
		
		Collections.sort(even, Collections.reverseOrder());
		for (int e : even) {
			System.out.print(e + " ");
		}
	}
}
