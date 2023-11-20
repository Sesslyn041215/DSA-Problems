package Recurison;

import java.util.Scanner;

public class StringNoRepeat {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String in = sc.nextLine();
//	int n = in.length();
//	char[] arr = new char[n];
//
//	for(int i=0; i<n; i++) {
//		arr[i] = in.charAt(i);
//	}
//
//	boolean isRepeated = false;
//    for (int i = 0; i < n; i++) {
//        isRepeated = false;
//        for (int j = 0; j < n; j++) {
//            if (i != j && arr[i] == arr[j]) {
//                isRepeated = true;
//                break;
//            }
//        }
//        if (!isRepeated) {
//            System.out.print(arr[i]);
//            break;
//        }
//    }
//    if(isRepeated == true) {
//    	System.out.print("All characters are repetive");
//    }
	
	int sum = 0;
	for(int i=0; i<in.length(); i++) {
		int count = 0;
		for(int j=0; j<in.length(); j++) {
			if(in.charAt(i) == in.charAt(j)) {
				count++;
			}	
		}
		if(count == 1) {
			System.out.println(in.charAt(i));
			break;
		}else {
			sum++;
		}
	}
	if(sum == in.length()) {
		System.out.println("All letters are repetitive");
	}
}
}
