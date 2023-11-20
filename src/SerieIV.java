import java.util.Scanner;

public class SerieIV {
public static void main(String[] args) {
	//2 15 41 80 132
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int result = 2;
//	System.out.print(result + " ");
//	for(int i=1; i<n; i++) {
//		result +=  i * 13;
//		System.out.print(result + " ");
//	}
	
//	int a = 3;
//	int b = 8;
//	int result = 1;
//	System.out.print(a + " " + b + " ");
//	for(int i=2; i<n; i++) {
//		result  = a + b + i;
//		System.out.print(result + " ");
//		a = b;
//		b = result;
//	}
	
	// 2 3 8 63 3968
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int a = 2;
//	int result = 1;
//	System.out.print(a + " ");
//	for(int i=1; i<n; i++) {
//		result  = (a * a) - 1;
//		System.out.print(result + " ");
//		a = result;
//	}
	
	//4 5 9 18 34 59
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int result = 4;
	for(int i=1; i<=n; i++) {
		System.out.print(result + " ");
		result += i * i;
	}
	
			
	
	
	
	
	
}
}
