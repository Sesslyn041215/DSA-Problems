import java.util.Scanner;

public class SeparteSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int originalNumber = n;
	int sum = 0;
	for(int i=n; i>0; i--) {
		sum += n % 10;
		n /= 10;
	}
	System.out.println(sum);
}

}
