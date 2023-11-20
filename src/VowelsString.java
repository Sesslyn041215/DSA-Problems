import java.util.Scanner;

public class VowelsString {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        String word = sc.nextLine();
	        String vowels = "AEIOUaeiou";
	        int count = 0;
	        
	    for(int i=0; i<word.length(); i++){
	        if(vowels.contains(String.valueOf(word.charAt(i)))) {
	            count++;
	        }
	      
	    }
	
	  System.out.println("Number of vowels: "+ count);


}
}
