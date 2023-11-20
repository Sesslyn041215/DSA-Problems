package fri06;

import java.util.Scanner;

public class MaximumElementInThe2DArray {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int r = sc.nextInt();
	      int c = sc.nextInt();
	      if(r <= 0 || c <= 0){
	         System.out.println("Invalid Input");
	         return;
	      }
	      int[][] arr = new int[r][c];
	     
	      for(int i=0; i<r; i++){
	          for(int j=0; j<c; j++){
	              arr[i][j] = sc.nextInt();
	          }
	      }
	       int max = arr[0][0];
	       for(int i=0; i<r; i++){
	          for(int j=0; j<c; j++){
	              if(arr[i][j] > max){
	                  max = arr[i][j];
	              }
	          }
	      }
	      System.out.println(max);
	      
	    }
}
