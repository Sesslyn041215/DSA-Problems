package tues10;

import java.util.Scanner;

//Given a set of non-negative integers, and a value sum, determine if there is a subset
//of the given set with sum equal to given sum.
//Sample Input 1 :
//5 5
//1 2 3 4 5
//Sample Output 1 :
//yes
//Explanation : 5 can be formed by the sum of 2 + 3 and 1 + 4.
public class TargetSum {
	public static boolean isSubsetSum(int set[], int n, int sum) {

		if (sum == 0)
			return true;
		if (n == 0)
			return false;
		if (set[n - 1] > sum)
			return isSubsetSum(set, n - 1, sum);
		return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int set[] = new int[n];
		for (int i = 0; i < n; i++)

		{
			set[i] = sc.nextInt();
		}
		if (isSubsetSum(set, n, sum) == true)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

//public class TargetSum {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		boolean[][] dp = new boolean[n + 1][m + 1];
//
//		for (int i = 0; i <= n; i++) {
//			dp[i][0] = true;
//		}
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= m; j++) {
//				if (j >= arr[i - 1]) {
//					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
//				} else {
//					dp[i][j] = dp[i - 1][j];
//				}
//			}
//		}
//
//		if (dp[n][m]) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
//	}
//}