package tues17;

import java.util.Scanner;

//You have to encrypt a non-empty string phrase. The encryption adds a 'cyclic shift'
//to each letter where the value of this 'cyclic shift' is decided by the position of the
//letter from the end of its word. The shift value for each letter of a word is its index
//value (starting from 0) from the right-most character of the word.
//INPUT:
//yum feed
//OUTPUT:
//avm igfd

public class StringEncryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			int k = s.length() - 1;

			for (int j = 0; j <= s.length() - 1; j++) {
				char ch = s.charAt(j);

				if ((int) ch >= 65 && (int) ch <= 90) {
					upperCase(s.charAt(j), k--);
				} else {
					lowerCase(s.charAt(j), k--);
				}
			}
			System.out.print(" ");
		}

	}
	
	public static void upperCase(char ch, int k) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int index = ((int)upper.indexOf(ch) + k) % upper.length();
		System.out.print(upper.charAt(index));
		
	}
	
	public static void lowerCase(char ch, int k) {
		String lower = "abcdefghijklmnopqrstuvwxyz";
		
		int index = (lower.indexOf(ch) + k) % lower.length();
		System.out.print(lower.charAt(index));
	}

}
