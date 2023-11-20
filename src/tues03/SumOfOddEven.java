package tues03;

public class SumOfOddEven {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9 };
		int n = arr.length;
		int odd = 0;
		int even = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		}
		System.out.println(odd);
		System.out.println(even);
	}
}
