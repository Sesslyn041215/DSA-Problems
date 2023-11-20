package thurs05;

//Given an Integer array, find three numbers whose product is maximum and print the maximum
//product.
public class MaximumThreeProduct {
	 public static void main(String[] args) {
	       int n = 5;
	       int[] arr = {-10,-9,0,-15,-3};
	       
	       for(int i=0; i<n; i++){
	           int max = i;
	           for(int j=i+1; j<n; j++){
	              if (arr[j] < arr[max]) {
	                    max = j;
	                }
	           }
	           int temp = arr[i];
	           arr[i] = arr[max];
	           arr[max] = temp;
	       }
	       
	       int product = arr[n-1] * arr[n-2] * arr[n-3];
	       int minusProduct = arr[0] * arr[1] * arr[n-1];
	       if(product > minusProduct){
	           System.out.println(product);
	       }else{
	           System.out.println(minusProduct);
	       }
	    }
}
