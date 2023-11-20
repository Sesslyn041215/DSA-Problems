package mon16;

import java.util.Scanner;

//Alice and Bob are batch mates and Alice got placed in a well-reputed
//productbased company and his friend Bob is demanding a pizza party from him.
//Alice is ready for giving party and he ordered N pizzas from the nearest restaurant.
//Now pizzas can have at most K different flavors (It is not necessary that there
//should be one pizza of each flavor), numbered from 1 to K such that i^th pizza can
//have Ai flavor (1 <= Ai <=k). Bob is on dieting, and he can only eat pizza of at
//most k-1 flavors but he can eat as many pizzas of ith flavor and he wanted to
//choose maximum possible pizzas which are in contiguous sequence to one another
//such that all pizzas in sequence has atmost k-1 flavors. For example 6 2 -> here 6
//is the number pizzas of and 2 is number of distinct flavors 1 1 1 2 2 1 -> ith pizza
//has flavor ai Maximum length of subarray such that subarray has at most k-1
//distinct flavors is 3 and that subarray is 1 1 1
//Example 1:
//Input
//6 2 -> Size of input Array and K distinct flavors
//1 1 1 2 2 1 -> input array (N Different pizza flavors )
//
//Output
//3
//Explanation
//Maximum length subarray with at most k-1 distinct flavors is 3 and sub array is 1 1
//1

public class MaxFlavour {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxcount = 0;
        int startIndex = -1;
        int endIndex = -1;
        int currentCount = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;

        for (int i = 0; i < n; i++) { 
            if (arr[i] <= k-1) { 
                if (currentCount == 0) {
                    startIndex = i;
                }
                currentCount++;
                endIndex = i;
            } else {
                currentCount = 0;
                
            }

            if (currentCount > maxcount) {
                maxcount = currentCount;
                maxStartIndex = startIndex;
                maxEndIndex = endIndex;
            }
        }

        if (maxcount == 0) {
            System.out.println("There is no continuous subarray");
        } else {
            System.out.println(maxcount);


            // Print the subarray
            for (int i = maxStartIndex; i <= maxEndIndex; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
