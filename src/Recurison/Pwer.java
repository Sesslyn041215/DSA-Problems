package Recurison;

import java.util.Scanner;

public class Pwer {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int p = sc.nextInt();
	int result = power(n,p);
	System.out.println(result);
}
 public static int power(int n, int p) {
	 if(p == 0) {
	   return 1;
	 }
	 else {
		 return n * power(n,p - 1);
	 }
 }
}
