
public class InvertedPyramid {

	public static void main(String[] args) {
        //For inverted pyramid
		int row = 5;

		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
        }
}
