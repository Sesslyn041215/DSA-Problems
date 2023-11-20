package thurs12;

import java.util.Scanner;

//Write a program to implement a searching algorithm for searching an element in a sorted array.

public class SearchTheElement {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int s = sc.nextInt();
//		int result = 0;
//		for(int i=0; i<n; i++) {
//			if(arr[i] == s) {
//				result = 1;
//				break;
//			}
//		}
//		System.out.println(result);
//	}
	
	   public static int  Find(int a[],int x,int start,int end)
       {
          int mid = (start + end)/2;
          if(start<=end){
            if(x == a[mid]){
                 return 1;
            }else{
              if(a[mid] > x)
                  return Find(a, x , 0 , mid-1);
              else if(a[mid] < x )
                  return Find(a, x, mid+1, end);
            }
          }
             return 0;
       }
 
        public static void main(String[] args)  {
          Scanner s=new Scanner(System.in);
          
          int n=s.nextInt();
          int a[]=new int[n];
          
          int start = 0;
          int end = n-1;

          for(int i=0; i<n; i++){
             a[i]=s.nextInt();
          }
          
          int x=s.nextInt();
          
         if( Find(a,x,start,end)==1)
            System.out.print("1");
        else
           System.out.print("0");
  }
}
