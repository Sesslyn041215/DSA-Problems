package tues10;

import java.util.*;

//Write a program to find all subarrays of a string and print it in sorted order. In this
//program, all the subarrays of the string need to be printed. The subarray is a contiguous
//part of a string. All the possible subarrays for a string will be n(n+1)/2. For example, all
//possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
//Sample Input :
//java
//Output Format :
//a
//a
//av
//ava
//j
//ja
//jav
//java
//v
//va

public class AllSubarraysLexicographically{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       generateSubarrays(input);
	} //abcd

	
//	public static void generateSubarrays(String input){
//		int n = input.length();
//        List<String> subarrays = new ArrayList<>();
//        for(int i=0; i<n; i++){
//			for(int j=i; j<n; j++){
//				String subarray = input.substring(i, j+1);
//				subarrays.add(subarray);
//			}
//		}
//		Collections.sort(subarrays);
//		for(String subarray : subarrays){
//			System.out.println(subarray);
//		}
//	}
	
	public static void generateSubarrays(String input) {
        int n = input.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String subarray = customSubstring(input,i, j + 1);
                System.out.println(subarray);
            }
        }
    }
	
	 public static String customSubstring(String input, int beginIndex, int endIndex) {
	        int length = endIndex - beginIndex;
	        char[] subarrayChars = new char[length];
	        for (int i = 0; i < length; i++) {
	            subarrayChars[i] = input.charAt(beginIndex + i);
	        }
	        return new String(subarrayChars);
	    }
	
}