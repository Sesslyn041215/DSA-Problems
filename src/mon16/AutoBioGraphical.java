package mon16;

import java.util.Scanner;

//An Autobiographical Number is a number N such that the first digit of N
//represents the count of how many zeroes are there in N, the second digit
//represents the count of how many ones are there in N and so on. You are given a
//function, def FindAutoCount(n): The function accepts string "n" which is a number
//and checks whether the number is an autobiographical number or not. If it is, an
//integer is returned, i.e. the count of distinct numbers in 'n'. If not, it returns 0.
//Assumption: The input string will not be longer than 10 characters. Input string will
//consist of numeric characters. Note: If string is None return 0.
//Input
//1210
//Output:
//3
public class AutoBioGraphical {
	public static int findAutoCount(String n) {
		int[] valueCount = new int[10];
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			valueCount[n.charAt(i) - '0']++;
		}
		for (int i = 0; i < 10; i++) {
			if (valueCount[i] > 0)
				count++;
		}
		for (int i = 0; i < n.length(); i++) {
			valueCount[i] = valueCount[i] - (n.charAt(i) - '0');
		}
		for (int i = 0; i < 10; i++) {
			if (valueCount[i] != 0)
				return 0;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(findAutoCount(str));
	}
}

