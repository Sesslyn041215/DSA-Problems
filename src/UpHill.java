import java.util.Scanner;

public class UpHill {

	  public static void main(String args[])
	  {
	      Scanner scanner = new Scanner(System.in);
	      int temp = scanner.nextInt();
	      int velocity = scanner.nextInt();
	      double input = 35.74 + (0.621*temp);
	      double input2 = input + ((0.4275*temp) - 35.75);
	    double result = (input2 * velocity);
	    double result1 = result * 0.16;
	    System.out.println(result1);
	  }
}
