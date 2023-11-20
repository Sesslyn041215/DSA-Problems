package wed25;

//Robert is an expert in strings where he challenges everyone to write a program for the below
//implementation.
//Two strings and comprising of lower case English letters are compatible if they are equal or can
//be made equal by following this step any number of times:
//Select a prefix from the string (possibly empty), and increase the alphabetical value of all the
//characters in the prefix by the same valid amount.
//For example if the string is abc and we select the prefix ab then we can convert it to bcc by
//increasing the alphabetical value by 1. But if we select the prefix as the complete string abc then
//we cannot increase the alphabetical value.
//Your task is to determine if given strings are compatible.
//Input format
//First line: String A
//Next line: String B
//Output format:
//For each test case, print YES if string can be converted to string , otherwise print NO.
//Constrain:
//1<=(len of A,B)<1000005
//Sample Input:
//abaca
//cdbda
//Sample Output:
//YES
//Explanation:
//The string abaca can be converted to bcbda in one move and to cdbda in the next move.

import java.util.Scanner;

public class StringPerfix {
	public static boolean areStringsCompatible(String a, String b) {
		int[] freqA = new int[26];
		int[] freqB = new int[26];
		for (char ch : a.toCharArray()) {
			freqA[ch - 'a']++;
		}
		for (char ch : b.toCharArray()) {
			freqB[ch - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (freqA[i] > 0 && freqB[i] == 0) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		if (areStringsCompatible(a, b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}