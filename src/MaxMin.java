
public class MaxMin {
	public static void main(String[] args) {

	    int[] numbers = { 85, 65, 75, 90, 70 };
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;

	    for (int number : numbers) {
	        max = Math.max(max, number);
	        min = Math.min(min, number);
	    }

	    System.out.println(max);
	    System.out.println(min);
	    
	    
	}
}
