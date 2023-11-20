package backtracking;

import java.util.Scanner;

public class KnightTour {
	  public static int count = 1;
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[][] arr = new int[n][n];
	        
	        boolean result = knightTour(n,0,0,arr);
	      
	        if(result){
	           System.out.println("yes");
	        }else{
	           System.out.println("no");
	        }
	       
	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	               System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	    }
	    public static boolean knightTour(int n,int i, int j, int[][] arr){
	        
	        if(i < 0 || j < 0 || i > n-1 || j > n-1 || arr[i][j] != 0 ){
	            return false;
	        }
	        
	        if(count == n * n){
	            arr[i][j] = count;
	            return true;
	        }
	        
	        if(arr[i][j] == 0){
	           arr[i][j] = count++;
	          if(knightTour(n, i-1, j-2, arr) ||
	            knightTour (n, i-1, j+2, arr) ||
	            knightTour (n, i+1, j-2, arr) ||
	            knightTour (n, i+1, j+2, arr) ||
	            knightTour (n, i-2, j-1, arr) ||
	            knightTour (n, i-2, j+1, arr) ||
	            knightTour (n, i+2, j-1, arr) ||
	            knightTour (n, i+2, j+1, arr) ){
	                 return true;
	            }
	           arr[i][j] = 0;
	           count--;
	        }
	        
	        return false;
	    }
}
