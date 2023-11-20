package thurs05;

public class DuplicateElementsInArray {
	//For all elements
	public static void main(String[] args) {
//	       int n = 4;
//	       int[] arr = {5,6,8,7};
//	       
//	       int count = 0;
//	       for(int i=0; i<n; i++){
//	           for(int j=i+1; j<n; j++){
//	               if(arr[i] == arr[j]){
//	                   System.out.println(arr[j]);
//	                   count++;
//	               }
//	           }
//	       }
//	       
//	       if(count == 0){
//	           System.out.println("No duplicate in the array");
//	       }
		
		//for only numbers from 0 to n
		int n = 8;
		int[] arr = {1,2,6,2,6,3,1,3};
		
		for(int i=0; i<n; i++) {
			
			int index = arr[i] % n;
			arr[index] = arr[index]+n;
			
		}
		
		for(int i=0; i<n; i++) {
			if((arr[i]-1) / n >= 2) {
				System.out.println(i);
			}
			
		}
	 }
	
	
}
