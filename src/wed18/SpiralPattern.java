package wed18;

import java.util.Scanner;

//"The Duck and the golden egg" The duck has hidden its golden egg somewhere in the M x N
//grid, to seize the golden egg we need to traverse the board spirally starting with the index 0,0.
//The last index position in the spiral path is where the golden egg is hidden. Find the spiral path
//to reach the golden egg.
//Input: 3 4 1 2 3 4 6 7 0 9 11 2 1 6 Output: 1 2 3 4 9 6 1 2 11 6 7 0 Explanation: The first line of
//input will be the row size (M), column size(N) of an array and followed by the M x N array
//elements. The output is to print the M x N array spirally starting with the index 0,0.
public class SpiralPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row, col, i, j;
		row = sc.nextInt();
		col = sc.nextInt();
		
		int[][] a = new int[row][col];
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int k = 0, l = 0;
		int m = row, n = col;
		
		while (k < m && l < n) {
			
			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + " ");
			}
			k++;
			
			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;
			
			if (k < m) {
				
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
				
			}
			
			if (l < n) {
				
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
				
			}
		}
	}

}
