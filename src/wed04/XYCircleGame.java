package wed04;

import java.util.ArrayList;
import java.util.List;

public class XYCircleGame {
	 public static void main(String[] args) {
	        int n = 6;
	        String song = "XXYYXYX";
	    
	       List<Integer> arr = new ArrayList<>();
	        for(int i=0;i<n;i++){
	            arr.add(i+1);
	        }
	        int i=0;
	        int j=song.length();
	        while(arr.size() > 1){
	            if(song.charAt(j%song.length()) == 'X'){
	                i++;
	            }
	            else{
	                arr.remove(i);
	            }
	            j++;
	            
	            if(i == arr.size()){
	                i=0;
	            }
	        }
	         System.out.println(arr.get(0));
	    }
}
