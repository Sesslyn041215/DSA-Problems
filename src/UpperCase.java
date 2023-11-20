import java.util.Scanner;

public class UpperCase {
public static void main(String[] args) {
	//Uppercase
	   Scanner sc = new Scanner(System.in);
       String word = sc.nextLine();
     
       char[] chars = word.toCharArray();
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] >= 'a' && chars[i] <= 'z') {
               chars[i] = (char) (chars[i] - 'a' + 'A'); //chars[i] = (char) (chars[i] - 32); 
           }
           System.out.print(chars[i]); 
       }
      
       
//       Scanner sc = new Scanner(System.in);
//       String word = sc.nextLine();
//       String b = "";
//     
//      for(int i=0; i< word.length(); i++) {
//    	  int c = word.charAt(i);
//    	  if(c > 96 && c < 123) {
//    		  c -= 32;
//    	  }
//    	  b += (char)c;
//      }
//       System.out.println(b);
	
	//LowerCase
//	 Scanner sc = new Scanner(System.in);
//     String word = sc.nextLine();
//     String b = "";
//   
//    for(int i=0; i< word.length(); i++) {
//  	  int c = word.charAt(i);
//  	  if(c > 45 && c < 97) {
//  		  c += 32;
//  	  }
//  	  b += (char)c;
//    }
//     System.out.println(b);
     
     

}
}
