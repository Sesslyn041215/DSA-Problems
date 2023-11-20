package Recurison;

import java.util.Scanner;

public class RecursionFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = series(n);
		System.out.println(result);
	}
	 public static int series(int n) {
		 int a = 0;
		 int b = 1;
		 int result = 0;
		 if(n == 1) {
		   return 0;
		 }
		 else if(n == 2){
			 return 1;
			
		 }
		 else {
			 return series(n - 1) + series(n - 2);
		 }
	 }
}
