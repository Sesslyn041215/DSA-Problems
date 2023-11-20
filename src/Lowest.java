import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lowest {
public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String sent = sc.nextLine();
	    String[] a = sent.split(" ");
	   Arrays.sort(a , Comparator.comparingInt(String::length));
	   System.out.println("Smallest word: "+a[0]);
	    System.out.println("Largest word: "+a[a.length-1]);
	
}
}
