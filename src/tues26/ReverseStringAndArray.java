package tues26;

public class ReverseStringAndArray {
	 public static void main(String []args){
	        String[] arr = {"Hello","there"};
	        int n = arr.length;
	        String[] rev = new String[n];
	        for (int i = 0; i < n; i++) {
	            String b = arr[n - 1 - i];
	            int s = b.length();
	            String c = ""; 
	            for (int j = 0; j < s; j++) { 
	                c += b.charAt(s - 1 - j); 
	            }
	            rev[i] = c;
	            System.out.print(rev[i] + " ");
	        }
	     }
}
