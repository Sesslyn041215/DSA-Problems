
public class App {
	public static void main(String[] args) {
		 int n = 5678;
		    int[] arr = new int[String.valueOf(n).length()]; 

		    int index = arr.length - 1; 

		    while (n > 0) {
		        int digit = n % 10; 
		        arr[index] = digit; 
		        n /= 10; 
		        index--; 
		    }

		    for (int i = 0; i < arr.length; i++) {
		        System.out.print(arr[i] + " ");
		    }
	}
}
