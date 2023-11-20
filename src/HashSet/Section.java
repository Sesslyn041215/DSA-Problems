package HashSet;

import java.util.*;

public class Section {
	 public static void main(String args[])
	    {
	        // Creating an object of Set class 
	        // Declaring object of Integer type 
	        Set<Integer> a = new HashSet<Integer>();
	      
	        // Adding all elements to List 
	        a.addAll(Arrays.asList(
	            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
	        
	      // Again declaring object of Set class
	      // with reference to HashSet
	        Set<Integer> b = new HashSet<>(
	        	    List.of(1, 3, 7, 5, 4, 0, 7, 5)
	        	);
	          
	        // To find union
	        Set<Integer> union = new HashSet<Integer>(a);
	        union.addAll(b);
	        System.out.print("Union of the two Set : ");
	        System.out.println(union);
	  
	        // To find intersection
	        Set<Integer> intersection = new HashSet<Integer>(a);
	        intersection.retainAll(b);
	        System.out.print("Intersection of the two Set : ");
	        System.out.println(intersection);
	  
	        // To find the symmetric difference
	        Set<Integer> difference = new HashSet<Integer>(a);
	        difference.removeAll(b);
	        System.out.print("Difference of the two Set : ");
	        System.out.println(difference);
		 
	        
	        
	        ArrayList<String> flower_array = new ArrayList<>();
 
	        flower_array.add("tulip");
	        flower_array.add("rose");
	        flower_array.add("rose");
	        flower_array.add("orchid");
	        flower_array.add("marie-gold");
	        flower_array.add("marie-gold");
	        System.out.println(flower_array);
	        HashSet<String> flower_set = new HashSet<>(flower_array);
	        System.out.println("Elements of flower Arraylist are :");
	        System.out.println(flower_set);
	        System.out.print("Element at index 0 is : "
	                         + flower_array.get(0) + " ");
	    }
	}