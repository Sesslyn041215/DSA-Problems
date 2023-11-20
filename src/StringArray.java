import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] arr = new String[3][3];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.next();
			}
		}

		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		in.close();

	}
}
