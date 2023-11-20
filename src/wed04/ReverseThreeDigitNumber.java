package wed04;

import java.util.Scanner;

//public class Main {
//	public static void main(String[] args) {
//		int n = 467, f, m, l;
//		f = n / 100;
//		m = (n % 100) / 10;
//		l = n % 10;
//		int rev = l * 100 + m * 10 + f;
//		System.out.print(rev);
//
//	}
//}

public class ReverseThreeDigitNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (number < 100 || number > 999) {
			System.out.println("Please enter a valid three-digit number.");
		} else {
			int reversedNumber = reverseNumber(number);
			System.out.println("Reversed number: " + reversedNumber);
		}

		scanner.close();
	}

	public static int reverseNumber(int number) {
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		return reversedNumber;
	}
}
