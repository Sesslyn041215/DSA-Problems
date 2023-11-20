import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		
		boolean[] alpha = new boolean[26];
		
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
				alpha[sentence.charAt(i) - 'a'] = true;
			}
		}
		
		boolean result = true;
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] == false) {
				result = false;
				break;
			}
		}
		if(result == true) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not a pangram");
		}
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		str=str.replaceAll("","").toLowerCase();
//		String s="";
//		for(char i='a';i<='z';i++){
//			if(str.indexOf(i)!=-1){
//					s=s+i;
//			}
//		}
//		
//		if(s.length()==26){
//			System.out.println("The string is a pangram");
//		}
//		else{
//			System.out.println("The string isn't a pangram");
//		}
	}
}
