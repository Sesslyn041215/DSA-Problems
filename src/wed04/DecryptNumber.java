package wed04;

import java.util.Scanner;

//A company transfers an encrypted code to one of its clients. The code needs to be decrypted
//so that it can be used for accessing all the required information. The code can be decrypted by
//interchanging each consecutive digit and once a digit has been interchanged then it cannot be
//used again. If at a certain point there is no digit to be interchanged with, then the single digit
//must be left as it is.
//Sample Input 0
//39631
//Sample Output 0
//93361

//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String s = scanner.nextLine();
//		int n = s.length();
//		StringBuilder result = new StringBuilder();
//		for (int i = 0; i < n - 1; i += 2) {
//			result.append(s.charAt(i + 1)).append(s.charAt(i));
//		}
//		if (n % 2 == 1)
//			result.append(s.charAt(n - 1));
//		System.out.println(result);
//	}
//}

public class DecryptNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int decryptedNumber = decryptNumber(number);
		System.out.println("Decrypted number: " + decryptedNumber);
		scanner.close();
	}

	public static int decryptNumber(int number) {

		String numberStr = Integer.toString(number);
		int length = numberStr.length();

		StringBuilder decryptedStr = new StringBuilder();

		for (int i = 0; i < length - 1; i += 2) {
			char currentChar = numberStr.charAt(i);
			char nextChar = numberStr.charAt(i + 1);
			decryptedStr.append(nextChar).append(currentChar);
		}
		if (length % 2 != 0) {
			decryptedStr.append(numberStr.charAt(length - 1));
		}
		int decryptedNumber = Integer.parseInt(decryptedStr.toString());

		return decryptedNumber;
	}
}
