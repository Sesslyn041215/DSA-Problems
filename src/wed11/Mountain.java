package wed11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//There are n mountains with some holes in them. Each mountain has a size
//A mountain can hide into another mountain's hole if and only if the size of mountain
//who hide
//the another mountain is at least twice as large as the size of mountain who is
//hidden.
//Each mountain can hide at most one mountain, and the mountain who is hidden by
//another
//mountain cannot hide any mountain.
//The mountain who is hidden by another mountain cannot be visible from outside.
//Please, find a
//plan of hiding mountain with the minimal number of mountains who is visible.
//Input:
//82
//5 7 6 9 8 4 2
//Output:
//5

public class Mountain {
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

		int count = n;
		int mid = n / 2;
		for (int i = 0; i < mid; i++) {
			if (arr[mid + i] >= (arr[i] * 2)) {
				count--;
			}
		}
		System.out.print(count);

	}
}

//public class Main {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		ArrayList<Integer> vec = new ArrayList();
//		for (int i = 0; i < num; i++) {
//			int zan = sc.nextInt();
//			vec.add(zan);
//		}
//		Collections.sort(vec);
//		int pt = num / 2;
//		int ans = num;
//		for (int i = 0; i < num / 2; i++) {
//			for (;;) {
//				if (vec.get(i) * 2 <= vec.get(pt)) {
//					ans--;
//					pt++;
//					break;
//				} else {
//					pt++;
//				}
//
//				if (pt == num) {
//					break;
//				}
//			}
//			if (pt == num) {
//				break;
//			}
//		}
//		System.out.print(ans);
//	}
//}
