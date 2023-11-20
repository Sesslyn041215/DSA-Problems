package freshworksMockTest1;

public class MatrixMultiplication {
   public static void main(String[] args) {
        int[][] m1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] m2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] m3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum = sum + m1[i][k] * m2[k][j];
                }
                m3[i][j] = sum;
            }
        }

        // Print the result matrix m3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

