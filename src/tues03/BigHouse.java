package tues03;

public class BigHouse {
	  public static void main(String[] args){
	        int n = 5;
	        int[] house = {5,1,6,3,2};
	        int[] sortedArr = new int[n];
	        int[] position = {9,12,6,5,25};
	        System.arraycopy(position, 0, sortedArr, 0, n);
	        
	         for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (sortedArr[j] < sortedArr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = sortedArr[i];
	            sortedArr[i] = sortedArr[minIndex];
	            sortedArr[minIndex] = temp;
	        }
	         
	        int dif = 0;
	        int start = 0;
	        int ans = 0;
	        int end = 0;
	        for(int i=0; i<n-1; i++){
	            dif = sortedArr[i+1] - sortedArr[i];
	            if(dif > ans){
	                ans = dif;
	                start = sortedArr[i];
	                end = sortedArr[i + 1];
	            }
	        }
	        
	      for (int i = 0; i < n; i++) {
	        if (position[i] == start || position[i] == end) {
	            System.out.println(house[i]);
	        }
	   }
}
}