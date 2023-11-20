package Recurison;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
//		Using for loop
//		int hcf = 0;
//	    for (int i = 1; i <= n1 || i <= n2; i++)
//	      {
//	     if (n1 % i == 0 && n2 % i == 0)
//	        hcf = i;
//	      }
//	    System.out.println("The HCF: "+ hcf);
		
		int result = gcd(n1,n2);
		System.out.println(result);
	}
	 public static int gcd(int n1, int n2) {
		 if (n2 == 0) {
	            return n1;
	        } else {
	            return gcd(n2, n1 % n2);
	        }
  }
}
