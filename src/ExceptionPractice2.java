import java.util.*;

public class ExceptionPractice2 {
public static void main(String[] args) {
	//1
//	  Scanner scanner = new Scanner(System.in);
//      try {
//          int start = scanner.nextInt();
//          int end = scanner.nextInt();
//          int count = 0;
//          for (int i = start; i <= end; i++) {
//              String numString = String.valueOf(i);
//              char[] digits = numString.toCharArray();
//              boolean result = true;
//              for (char digit : digits) {
//                  if (digit >= '5') {
//                      result = false;
//                      break;
//                  }
//              }
//              if (result) {
//                  count++;
//              }
//          }
//          System.out.println(count);
//      } catch (InputMismatchException  e) {
//      	 System.out.println("Invalid input. Please enter valid integers.");
//      } finally {
//          scanner.close();
//      }
	
	//2
//	 Scanner input = new Scanner(System.in);
//	    int n = input.nextInt();
//	    int m = input.nextInt();
//
//	    int count = 0;
//	    for (int i = n; i <= m; i++) {
//	      String a = i + "";
//	      if ((a.contains("5")) || (a.contains("6")) || (a.contains("7")) || (a.contains("8")) || (a.contains("9"))) {}
//	      else count++;
//	    }
//	    System.out.print(count);
	
	//3
	 Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int m = input.nextInt();
     int count = 0;

     for (int i = n; i <= m; i++) {
         int num = i;
         boolean hasDigitGreaterOrEqualToFive = false;

         while (num != 0) {
             int digit = num % 10;
             if (digit >= 5) {
                 hasDigitGreaterOrEqualToFive = true;
                 break;
             }
             num /= 10;
         }

         if (!hasDigitGreaterOrEqualToFive) {
             count++;
         }
     }

     System.out.print(count);
}
}
