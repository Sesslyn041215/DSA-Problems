package thurs12;

import java.util.Scanner;

//Rohan needs x metres of wood. Rohan's cutting machine works as follows: Rohan sets a height
//parameter H (in metres), and the machine raises a giant sawblade to that height and cuts off all tree
//parts higher than H (of course, trees not higher than H meters remain intact). Rohan then takes the
//parts that were cut off. For example, if the tree row contains trees with heights of 10, 21, 4, and 15
//metres, and Rohan raises his sawblade to 12 metres, the remaining tree heights after cutting will be 10,
//12, 4, and 12 metres, respectively, while Rohan will take 9 metres off the second tree and 3 metres off
//the fourth tree (12 metres of wood in total).
//He wants to set his sawblade as high as possible. Help Rohan find the maximum integer height of the
//sawblade that still allows him to cut off at least x metres of wood.
//Note - The sum of all heights will exceed x, thus Rohan will always be able to obtain the required
//amount of wood.
//Input:
//5 20
//4 42 40 26 46
//Output:
//36

public class SawBladeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
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

        int low = 0;
        int high = arr[n - 1];
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int woodCollected = 0;

            for (int treeHeight : arr) {
                if (treeHeight > mid) {
                    woodCollected += treeHeight - mid;
                }
            }

            if (woodCollected >= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result);
    }
}


//public class Main {
//	public static Boolean f(int h, int a[], int x) {
//		int sum = 0;
//		for (int h1 : a) {
//			if (h1 > h)
//				sum += h1 - h;
//		}
//		if (sum >= x)
//			return true;
//		return false;
//	}
//
//	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		int n, x;
//		n = sc.nextInt();
//		x = sc.nextInt();
//		int a[] = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}
//
//		int i = -1;
//		for (int b = x; b >= 1; b /= 2) {
//			while (f(i + b, a, x))
//				i += b;
//		}
//		System.out.print(i);
//	}
//}
