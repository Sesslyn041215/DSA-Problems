import java.util.Scanner;

public class Base {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	int base = sc.nextInt();
	 String ans = "";
	 while(value >= base) {
		int a = value % base;
		ans = a + ans;
		value = value / base;
	 }
	 ans = value + ans;
	 System.out.println(ans);
}
}
