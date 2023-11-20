import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGame {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the words");
	System.out.println("Type '###' to finish input.");

	List<String> arr = new ArrayList<>();
	while (true) {
		System.out.print("Input: ");
		String input = scanner.nextLine();
		if (input.equals("###")) {
			break;
		}
		arr.add(input);
	}
	
	  if (arr.isEmpty() || arr.size() == 1) {
          System.out.println("Please provide more than one word to play the game.");
          return;
      }

	String a = arr.get(0);
	System.out.println();
    System.out.println("Output :");
    System.out.println(a);
    
    for (int i = 1; i < arr.size(); i++) {
        String b = arr.get(i);
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            System.out.println(b);
        }
        a = b; 
    }
}
}
