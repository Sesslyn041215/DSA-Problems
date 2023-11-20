import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int originalNumber = n;
        int length = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, length);
            n /= 10;
        }

        System.out.println(sum);
    
//		int originalNumber = n;
//		int count = 0;
//
//		while (n > 0) {
//			n /= 10;
//			count++;
//		}
//
//		n = originalNumber;
//
//		while (n > 0) {
//			int digit = n % 10;
//			sum += Math.pow(digit, count);
//			n /= 10;
//		}
//		System.out.println(sum);
//
//		if (sum == originalNumber) {
//			System.out.println(originalNumber + " is an Armstrong number");
//		} else {
//			System.out.println(originalNumber + " is not an Armstrong number");
//		}
	}
}
