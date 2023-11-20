package fri29;
public class Anagram {
	 static boolean areAnagram(char[] str1, char[] str2) {
	        int n1 = str1.length;
	        int n2 = str2.length;

	        if (n1 != n2)
	            return false;
	 
	        int[] count = new int[256]; 
	
	        for (int i = 0; i < n1; i++) {
	            count[str1[i]]++;
	            count[str2[i]]--; 
	        }

	        for (int i = 0; i < 256; i++) {
	            if (count[i] != 0)
	                return false;
	        }
	 
	        return true;
	    }
	 
	    // Driver Code
	    public static void main(String args[]) {
	        char str1[] = { 'g', 'r', 'a' };
	        char str2[] = { 'g', 'r', 'a', 'm' };
	       
	        // Function Call
	        if (areAnagram(str1, str2))
	            System.out.println("The two strings are"
	                               + " anagrams of each other");
	        else
	            System.out.println("The two strings are not"
	                               + " anagrams of each other");
	    }
}
