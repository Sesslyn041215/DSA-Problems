import java.lang.*;
import java.util.*;
public class Exception {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        try {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            int count = 0;
            for (int i = start; i <= end; i++) {
                String numString = String.valueOf(i);
                char[] digits = numString.toCharArray();
                boolean result = true;

                for (char digit : digits) {
                    if (digit >= '5') {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (InputMismatchException  e) {
        	 System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
