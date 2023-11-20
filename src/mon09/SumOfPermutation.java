package mon09;

import java.util.Scanner;

//Given the size N of array A, followed by the line of array elements. Find the sum of all possible
//permutation values.
//
//Input:
//2
//1 2
//Output:
//33

public class SumOfPermutation {

	public static long fac(int n) {
		long f = 1;
		for (int i = n; i > 1; i--)
			f *= i;

		return f;
	}

	public static void main(String[] args) {
		int n, temp;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;

		long p = 1;
		int a, i, sum = 0;

		for (i = 0; i < n; i++) {
			a = sc.nextInt();
			sum += a;
		}
		while (--n != 0)
			p = p * 10 + 1;

		System.out.print(sum * fac(temp - 1) * p);
	}
}

//import java.util.Scanner;
//class SumOfPermutation{
//  public static void main(String args[]){
//   Scanner scanner = new Scanner(System.in);
//	 int a = scanner.nextInt();
//	  int [] arr = new int [a];
//	  int fac = 1 ;
//	  for (int i=0; i< arr.length; i++){
//		  arr[i]=scanner.nextInt();
//	  }
//	 for (int i=2; i<=a; i++){
//		 fac *= i;
//	 }
//	 int facCount = fac/a;
//	  int oneSum = 0;
//	  int count = 0;
//	  
//	  for (int i=0; i<a ; i++){
//		  oneSum +=arr[i];
//	  }
//	  oneSum *= facCount;
//	  
//	  
//	
//	  int output = 0;
//	  int times = 0 ;
//	  
//	  for (int i=1; i<1000000000; i*=10){
//		  if(times == a){
//		  break;
//		  } else {
//			  output+=oneSum*i;
//				  times++;
//		  }
//	  }
//	  System.out.println(output);
//  }
//}