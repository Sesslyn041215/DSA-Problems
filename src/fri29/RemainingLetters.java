package fri29;

import java.util.Scanner;

//An online test was conducted for the students for taking up a new course. In the test, the students
//will be provided with two words. They need to remove the characters in the second word which is
//present in the first word and have to type the rest. Write a program to remove all characters in the
//second string which are present in the first string
public class RemainingLetters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstWord = scanner.nextLine(); 
		String secondWord = scanner.nextLine(); 

		firstWord = firstWord.toLowerCase();
		secondWord = secondWord.toLowerCase();

		StringBuilder remainingLetters = new StringBuilder();

		for (int i = 0; i < secondWord.length(); i++) {
			char letter = secondWord.charAt(i);
			if (firstWord.indexOf(letter) == -1) {
				remainingLetters.append(letter);
			}
		}
		System.out.println("Remaining letters in the second word: " + remainingLetters.toString());
		scanner.close();
	}
}

//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String s1 = scanner.next();
//		String s2 = scanner.next();
//		int n = s1.length();
//		int m = s2.length();
//		for (int i = 0; i < m; i++) {
//			boolean flag = false;
//			for (int j = 0; j < n; j++) {
//				if (s1.charAt(j) == s2.charAt(i)) {
//					flag = true;
//					break;
//				}
//			}
//			if (!flag) {
//				System.out.print(s2.charAt(i));
//			}
//		}
//	}
//}