package tues26;

public class BinarySearch {
	  public static int fBinarySearch(int[] arr, int f, int start, int end) {
	        if (start <= end) {
	            int mid = (start + end) / 2;
	            if (f == arr[mid]) {
	                return mid; 
	            }
	            if (f < arr[mid]) {
	                return fBinarySearch(arr, f, start, mid - 1);
	            } else if (f > arr[mid]) {
	                return fBinarySearch(arr, f, mid + 1, end);
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int n = arr.length;
	        int f = 7;
	        int p = fBinarySearch(arr, f, 0, n - 1); 
	        System.out.println(p);
	    }
}
