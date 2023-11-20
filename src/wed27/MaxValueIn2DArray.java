package wed27;

import java.util.Scanner;
class MaxValueIn2DArray
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      int[][] arr = new int[r][c];
      
      for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
          arr[i][j] = sc.nextInt();
        }
      }
    
      for(int i=0; i<r; i++){
        int max = arr[i][0];
        for(int j=0; j<c; j++){
          if(arr[i][j] > max){
            max = arr[i][j];
          }
        }
          System.out.println(max);
      }
    
	}
}
