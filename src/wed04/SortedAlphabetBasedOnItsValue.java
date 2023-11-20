package wed04;

import java.math.BigInteger;

//Every character has a weight. The weight of an English uppercase alphabet A-Z is A=1
//B=2*A+A C=3*B+B D=4*C+C . . . Y=25*X+X Z=26*Y+Y. The weight of any string made
//up of these characters is the summation of the weights of each character. Given a total string
//weight, determine the shortest string of that given weight. If there is more than one solution,
//return the lexicographically smallest of them. For example, given weight = 25, and the
//weights of the first few characters of the alphabets are A=1, B=3, C=12, D=60. It is certain
//that no letter larger than C is required. Some of the strings with total weight equal to the
//largest are ABBBBC, ACC, and AAAAAAABBBBBB. The shortest of these is ACC. While
//any permutation of these characters will have the same weight. This is the lexicographically
//smallest of them.

public class SortedAlphabetBasedOnItsValue {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] alphabet = str.split("");
		BigInteger[] value = new BigInteger[alphabet.length];
		value[0] = BigInteger.ONE;

		for (int i = 1; i < value.length; i++) {
			value[i] = value[i - 1].multiply(BigInteger.valueOf(i + 1)).add(value[i - 1]);
		}

		int n = 25;
		BigInteger num = new BigInteger(Integer.toString(n));
		String ans = "";

		while (num.compareTo(BigInteger.ZERO) > 0) {
			for (int i = value.length - 1; i >= 0; i--) {
				if (value[i].compareTo(num) <= 0) {
					num = num.subtract(value[i]);
					ans += alphabet[i];
					break;
				}
			}
		}

		System.out.println(ans);
	}
}

//public class Main {
//public static void main(String [] args)
//{
//int k = 20;
//int values[] = new int[26];
//int prev=1;
//values[0]=1;
//for(int i=1;i<values.length;i++)
//{
//values[i] = (i+1)*prev+prev;
//prev = values[i];
//}
//String result = "";
//int low =0;
//int high =25;
//while(k!=0)//8
//{
//int index = Binary(values,low,high,k);//k=20 -> 2//
//char ch = (char)(index+'A');2+A=C
//result = ch + result;//ABC
//k = k - values[index];//k=20-12=8
//}
//System.out.println(result);
//
//}
//
//	public static int findValue(int values[], int low, int high, int k) {
//		int ans = -1;
//		while (low <= high) {
//			int mid = (low + high) / 2;
//			if (values[mid] <= k) {
//				ans = mid;
//				low = mid + 1;
//			} else {
//				high = mid - 1;
//			}
//		}
//		return ans;
//	}
//}