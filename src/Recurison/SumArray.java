package Recurison;

import java.util.Scanner;

public class SumArray {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i=0; i<n; i++){
	       arr[i] = sc.nextInt();
	      }
		   int result = sum(n, arr);
		   System.out.println("The sum of digits in " + n + " is " + result);
	}
	 
public static int sum(int n, int[] arr) {
	  
		 if(n == 0) {
		    return 0;
		 }
		 else {
			 return arr[n - 1] + sum(n-1, arr) ;
		 }
	 
}
}
