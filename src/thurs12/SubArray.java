package thurs12;

//A sequence a = [a1, a2, a3, ....., am] of length m is called a good sequence if there exists a pair of
//indices i and j such that 0 <= i < j < m and a[i] < a[j].
//For example a = [62, 24, 39] is a good sequence since a[1] < a[2].
//The concatenation of two sequences p and q is denoted as p + q.
//For example p = [1, 5, 2], q = [3, 5, 6] then, p + q = [1, 5, 2, 3, 5, 6]
//You are given n sequences. Consider all n2 pairs of sequences sx and sy and look whether sx + sy is a
//good sequence or not.
//Sample Input1:
//5
//1 1
//
//1 1
//1 2
//1 4
//1 3
//Sample Output1:
//9
//Explanation:
//For the first example, the following
//9 sequences are good : [1,2],[1,2],[1,3],[1,3],[1,4],[1,4],[2,3],[2,4],[3,4]

import java.util.*;

public class SubArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long count = 0;

		ArrayList<Integer> min = new ArrayList<>();
		ArrayList<Integer> max = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			int s = in.nextInt();

			int minVal = Integer.MAX_VALUE;
			int maxVal = Integer.MIN_VALUE;

			int mask = 0;

			for (int j = 0; j < s; j++) {

				int num = in.nextInt();

				if (j > 0 && num > minVal && mask == 0) {
					count++;
					mask = 1;
				}

				minVal = Math.min(minVal, num);
				maxVal = Math.max(maxVal, num);

			}

			if (mask == 0) {
				min.add(minVal);
				max.add(maxVal);
			}
		}

		long sum = 0;
		sum += count * count;

		sum += count * 2 * (n - count);

		Collections.sort(min);
		Collections.sort(max);

		int j = 0;
		for (int i = 0; i < min.size(); i++) {
			while (j < min.size() && min.get(j) < max.get(i)) {

				j++;
			}
			sum += j;
		}
		System.out.println(sum);

	}
}