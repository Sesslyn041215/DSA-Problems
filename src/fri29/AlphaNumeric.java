package fri29;

//A game has to be played by Varun whereas he is not supposed to take the characters into account.
//His task is to add the numbers given in a string containing alphanumeric characters. If he adds the
//character values he will die. Help him to win the game by writing a program to print the sum of
//numbers

public class AlphaNumeric {
	public static int sumOfDigits(String input) {
		int sum = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum += digit;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		String input = "a1b2c3d4e5";
		int result = sumOfDigits(input);
		System.out.println("Sum of numeric digits: " + result);
	}
}

//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.next();
//		String temp = "";
//		int sum = 0;
//
//		for (char ch : str.toCharArray()) {
//			if (Character.isDigit(ch)) {
//				temp += ch;
//			} else {
//				sum += Integer.parseInt(temp);
//				temp = "";
//			}
//		}
//
//		int result = sum + Integer.parseInt(temp);
//		System.out.println(result);
//	}
//}