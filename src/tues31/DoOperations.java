package tues31;

//John has two strings a and b, each of length n, and an integer k The strings only
//contain lowercase English letters. He wants to convert string a into string b by
//performing some (possibly zero) operations on a.
//In one move, he can either
//choose an index i (1≤i≤n−1) and swap a[i] and a[i+1] or
//choose an index i (1≤i≤n−k+1) and if a[i], a[i+1], ....., a[i+k-1] are all equal to
//some character c (c≠ 'z'), replace each one with the next character (c+1) i.e. 'a' is
//replaced by 'b', 'b' is replaced by 'c' and so on.
//Input Format:
//First line - n and k
//then two strings a and b each of length n.
//Output Format:
//For each test case, print "Yes" if John can convert a into b after some moves, else print
//"No".
//Sample Input:
//6 2
//aaabba
//ddddcc
//Sample Output:
//Yes

import java.util.*;

public class DoOperations {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		int[] have = new int[26];
		int[] need = new int[26];
		for (int j = 0; j < n; j++) {
			have[a.charAt(j) - 'a']++;
			need[b.charAt(j) - 'a']++;
		}
		boolean bad = false;
		for (int j = 25; j >= 0; j--) {
			have[j] += have[j + 1];
			need[j] += need[j + 1];
			if (have[j] > need[j] || (need[j] - have[j]) % k != 0)
				bad = true;

		}
		if (bad)
			System.out.println("No");
		else
			System.out.println("Yes");

	}
}
