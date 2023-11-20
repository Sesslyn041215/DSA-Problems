package wed11;

//Given two numbers represented as strings, print multiplication of the numbers as
//a string
//Sample Input:
//456
//23
//Sample Output:
//10488

public class Multiplication {
	 public static void main(String[] args) {
	        String a = "456";
	        String b = "23";
	        int lenA = a.length();
	        int lenB = b.length();
	        int[] arr = new int[lenA + lenB];
	        
	        
	        for (int i = 0; i < lenB; i++) {
	            int digitB = b.charAt(lenB - 1 - i) - '0'; 
	            int carry = 0;
	            
	            for (int j = 0; j < lenA; j++) {
	                int digitA = a.charAt(lenA - 1 - j) - '0'; 
	                int product = digitA * digitB + arr[i + j] + carry;
	                carry = product / 10;
	                arr[i + j] = product % 10;
	            }
	            
	            if (carry > 0) {
	                arr[i + lenA] += carry;
	            }
	            
	        }

	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i]);
	        }
	    }
	 
//	 public static void main(String[] args) {
//	        String a = "456";
//	        String b = "23";
//	        int[] arr = new int[a.length() + b.length() - 1];
//	        
//	        for (int i = 0; i < b.length(); i++) {
//	            int n = Character.getNumericValue(b.charAt(i));
//	            
//	            for (int j = 0; j < a.length(); j++) {
//	                arr[i + j] += n * Character.getNumericValue(a.charAt(j)); 
//	            }
//	        }
//	        for(int i=0; i<arr.length; i++){
//	            System.out.print(arr[i] + " ");
//	        }
//	        int result = 0;
//	        for (int i = 0; i < arr.length; i++) {
//	            result = result * 10 + arr[i];
//	        }
//	        
//	        String r = Integer.toString(result);
//	        System.out.println(r);
//	    }
}
