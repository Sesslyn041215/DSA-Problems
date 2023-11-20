import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	//Reverse With array
		 Scanner sc = new Scanner(System.in);
	     String word = sc.nextLine();
	     char[] chars = word.toCharArray();
	     String b = "";
	   
	    for(int i=chars.length - 1; i>=0; i--) {
	  	 b += chars[i];
	    }
	     System.out.println(b);
	     
	     //Without Array
//	     Scanner sc = new Scanner(System.in);
//	     String word = sc.nextLine();
//	   
//	     String b = "";
//	   
//	    for(int i=word.length()-1; i>=0; i--) {
//	  	 b += word.charAt(i);
//	    }
//	     System.out.println(b);
	
	
}
}
