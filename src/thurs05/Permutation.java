package thurs05;

//Given two Strings, write a method to decide if one is a permutation of the other.

public class Permutation {
	public static void main(String[] args) {
		String s = "silent";
		String t = "listen";

		if (s.length() != t.length()) {
			System.out.println("Permutation");
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (c == t.charAt(j)) {
					sb.append(c);
				}
			}
		}
		String output = sb.toString();

		if (s.equals(output)) {
			System.out.println("Permutation");
		} else {
			System.out.println("Not Permutation");
		}
	}
}

//public class Main {
//	public static boolean isPermutation(String str1, String str2) {
//		if (str1.length() != str2.length()) {
//			return false;
//		}
//		int[] charCount = new int[128];
//
//		for (char c : str1.toCharArray()) {
//			charCount[c]++;
//		}
//
//		for (char c : str2.toCharArray()) {
//			charCount[c]--;
//			if (charCount[c] < 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//		String string1 = "abbd";
//		String string2 = "ddba";
//		if (isPermutation(string1, string2)) {
//			System.out.println(string1 + " and " + string2 + " are permutations of each other");
//		} else {
//			System.out.println(string1 + " and " + string2 + " are not permutations of each other");
//		}
//	}
//}
