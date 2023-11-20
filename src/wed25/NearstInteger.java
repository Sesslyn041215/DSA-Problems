package wed25;

//Implement the following function:
//int NearestInteger(int num, int m);
//The function accepts two positive integers ‘num’ and ‘m’ as its argument. Implement the function
//to find and return a number which satisfies the following the condition
//1. Number is divisible by ‘m’
//2.Number is nearest to ‘num’(have the least distance from num)
//Distance between two numbers is the number of integers between them
//Note:If there are two numbers with the least distance from ‘num’ which is divisible by ‘m’ then
//return the larger number
//Input:
//Num:67
//m:8
//Output:
//64
//Explanation:
//The nearest number greater than 67 which is divisible by 8 is 72.
//Nearest number less than 67 which is divisible by 64
//Since ,64 is nearest to 67.Thus,output is 64
//The custom input format for the above case :
//67
//8
//(The first line represent ‘num’,the second line represent ‘m’
		
import java.util.Scanner;

public class NearstInteger {
	public static int NearestInteger(int num, int m) {
		int lower = num - (num % m);
		int upper = lower + m;
		if (Math.abs(num - lower) <= Math.abs(num - upper)) {
			return lower;
		} else {
			return upper;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int m = scanner.nextInt();
		int result = NearestInteger(num, m);
		System.out.println(result);
	}

}
