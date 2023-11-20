package fri06;

import java.util.Scanner;

//You are given an m x n integer matrix with the following two properties:
//a. Each row is sorted in non-decreasing order.
//b. The first integer of each row is greater than the last integer of the previous
//row.
//Given an integer, return true if the integer is in matrix or false otherwise.
public class CheckTheValuePresentIn2DArray {
	  public static void main(String[] args) {
		  //Getting Input
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
	      
	      //Logic starts here
	      int value = sc.nextInt();
	      int row = -1;
	      for(int i=0; i<r; i++){
	           if (value >= arr[i][0] && value <= arr[i][c - 1]) {
	              row = i;
	              break;
	          }
	      }
	      if(row == -1){
	          System.out.println("Not present");
	      }
	      boolean output = false;
	      for(int i=0; i<c; i++){
	          if(arr[row][i] == value){
	              output = true;
	          }
	      }
	      if(output){
	          System.out.println("Present"); 
	      }else{
	          System.out.println("Not Present");  
	      }
	    }
}
