package freshworksMockTest1;

//Write a program to find the number under 20,000 that generates the longest collatz sequence.
public class CollatzSequence {

	  static int collatz(int num){
	    int ans = 0;
	    int count = 0;
	    
	    for(int i = num ; i > 0;i--){	
	      int temp = i;
	      int x = 0;
	      while(temp != 1){
	        if(temp%2==0){
	          temp/=2;
	          continue;
	        }
	        temp = (3*temp)+1;

	        x++;
	      }
	      if(count < x){
	        ans = i;
	        count = x;
	      }
	    }
	    return ans;
	  }
	  
	  public static void main(String[] args) {
	      System.out.println(collatz(20000));
	  }
}