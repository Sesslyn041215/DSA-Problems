import java.util.Scanner;

public class TotalChar {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//    String s = sc.nextLine();
//    char[] ptn = s.toCharArray();
//     String[] sp = s.split("[ ]+");
//    int n = ptn.length;
//    int s1 = sp.length;
//    int result = (n - s1) + 1;
// 
//  System.out.println("Total number of characters in a string: " + result);
  
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
   String space = s.replaceAll(" ", "");
  System.out.println("Total number of characters in a string: " + space.length());
}
}
